/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Centro;
import java.time.LocalDateTime;
import vacunacion.g9.entidades.Vacuna;

/**
 *
 * @author josel
 */
public class CentroData {

    private Connection con = null;

    public CentroData() {
        con = Conexion.getConexion();
    }

    public void agregarCentro(Centro c){
        
         String query = "INSERT INTO centro(nombre, direccion, telefono, zona, activo) VALUES (?,?,?,?,?) ";

            try {

                PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, c.getNombre());
                ps.setString(2, c.getDireccion());
                ps.setInt(3, c.getTelefono());
                ps.setString(4, c.getZona());
                ps.setBoolean(3, c.isActivo());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                   c.setId(rs.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo recuperar el Id");
                }

                ps.close();
                rs.close();
                JOptionPane.showMessageDialog(null, "Centro añadida con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
            }
     
    }
    
    public void modificarCentro(Centro c){
        
        String query = "UPDATE centro SET nombre=?, direccion=?, telefono=?, zona=?, activo=? WHERE idCentro=? ";

            try {

                PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, c.getNombre());
                ps.setString(2, c.getDireccion());
                ps.setInt(3, c.getTelefono());
                ps.setString(4, c.getZona());
                ps.setBoolean(5, c.isActivo());
                ps.setInt(6, c.getId());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                   c.setId(rs.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo recuperar el Id");
                }

                ps.close();
                rs.close();
                JOptionPane.showMessageDialog(null, "Centro añadido con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
            }
     
        
    }
    
    public void eliminarCentro(int id){
        
          String query = "UPDATE materia SET estado = 0 WHERE idCentro = ?";
      
        try {

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Centro borrado.", "Mensaje", JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "El codigo del Centro no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
     
    }
    
     public List<Centro> listarCentros() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "select * from centro where activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                //c.setId(rs.getInt("idCentro"));
                c.setNombre(rs.getString("nombre"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setZona(rs.getString("zona"));
                c.setActivo(rs.getBoolean("activo"));
                centros.add(c);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Centro " + ex.getMessage());
        }

        return centros;

    }
     
      public List<Centro> listarCentrosNorte() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM centro WHERE zona = Norte AND activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                //c.setId(rs.getInt("idCentro"));
                c.setNombre(rs.getString("nombre"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setZona(rs.getString("zona"));
                c.setActivo(rs.getBoolean("activo"));
                centros.add(c);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Centro " + ex.getMessage());
        }

        return centros;

    }

    public void listarVacunasPorCentros(int idcentro, LocalDateTime fecha) {

        List<Vacuna> vac = new ArrayList<>();

        try {
            String sql = "select * "
                    + "FROM vacuna INNER JOIN citavacunacion ON citavacunacion.lote=vacuna.lote"
                    + "JOIN centro ON citavacunacion.id_centro=centro.id_centro"
                    + " where colocada=1 and id_centro=? and fechacolocada=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idcentro);
            ps.setTimestamp(2, Timestamp.valueOf(fecha));//
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vacuna v = new Vacuna();
                v.setLote(rs.getInt("lote"));
                v.setCuit(rs.getLong("cuit"));
                v.setMarca(rs.getString("marca"));
                v.setMedida(rs.getDouble("medida"));
                v.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vac.add(v);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Centro " + ex.getMessage());
        }
    }
    
    

}
