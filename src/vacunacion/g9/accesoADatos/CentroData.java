package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Centro;
import java.time.LocalDateTime;
import vacunacion.g9.entidades.Vacuna;

public class CentroData {

    private Connection con = null;

    public CentroData() {
        con = Conexion.getConexion();
    }

    public void agregarCentro(Centro c) {

        String query = "INSERT INTO centro(nombre, direccion, telefono, zona, activo) VALUES (?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDireccion());
            ps.setInt(3, c.getTelefono());
            ps.setString(4, c.getZona());
            ps.setBoolean(5, c.isActivo());
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

    public void modificarCentro(Centro c) {

        String query = "UPDATE centro SET nombre=?, direccion=?, telefono=?, zona=?, activo=? WHERE id_centro=? ";

        try {

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDireccion());
            ps.setInt(3, c.getTelefono());
            ps.setString(4, c.getZona());
            ps.setBoolean(5, c.isActivo());
            ps.setInt(6, c.getId());

            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Centro modificado con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "El codigo del Centro no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }

    }

    public void eliminarCentro(int id) {

        String query = "UPDATE centro SET activo = 0 WHERE id_centro = ?";

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
    //Utilizado por AdministracionCitas
    public Centro buscarCentros(int id) {
            Centro c = null;
            PreparedStatement ps = null;
            String sql = "SELECT * FROM centro WHERE activo = 1 AND id_centro = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                c = new Centro();
                c.setId(rs.getInt("id_centro"));
                c.setNombre(rs.getString("nombre"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setZona(rs.getString("zona"));
                c.setActivo(rs.getBoolean("activo"));
            }else{
                ps.close();
                rs.close();
            }

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Centro " + ex.getMessage());
        }
        return c;
    }
    
    public List<Centro> listarCentros(String zona) {

        List<Centro> centros = new ArrayList<>();
        String sql;

        try {
            if (zona == null) {
                sql = "SELECT * FROM centro WHERE activo = 1";
            } else {
                sql = "SELECT * FROM centro WHERE activo = 1 AND zona = ?";
            }
            PreparedStatement ps = con.prepareStatement(sql);
            if (zona != null) {
                ps.setString(1, zona);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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
            String sql = "SELECT * FROM centro WHERE zona = 'Norte' AND activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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

    public List<Centro> listarCentrosSur() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM centro WHERE zona = 'Sur' AND activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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

    public List<Centro> listarCentrosEste() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM centro WHERE zona = 'Este' AND activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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
    public List<Centro> listarCentros() {

        List<Centro> centros = new ArrayList<>();
        String sql;

        try {           
                sql = "SELECT * FROM centro WHERE activo = 1";          
            
            PreparedStatement ps = con.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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

    public List<Centro> listarCentrosOeste() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM centro WHERE zona = 'Oeste' AND activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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

    public List<Centro> listarCentrosDepositoCentral() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM centro where activo = true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("id_centro"));
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

    public  List<Vacuna> listarVacunasPorCentros(int idcentro, LocalDateTime fecha) {

        java.sql.Date fec=java.sql.Date.valueOf(fecha.toLocalDate());
        List<Vacuna> vac = new ArrayList<>();

        try {
            String sql = "SELECT vacuna.*"
                    + "FROM vacuna INNER JOIN citavacunacion ON citavacunacion.lote=vacuna.lote "
                    + "JOIN centro ON citavacunacion.id_centro=centro.id_centro "
                    + "where colocada=1 and centro.id_centro=? and DATE(fechaHoraCita)=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idcentro);
            ps.setDate(2, fec);
            ResultSet rs = ps.executeQuery();
            int conteo = 0;
            while (rs.next()) {
                Vacuna v = new Vacuna();
                conteo ++;
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
        return vac;
    }

}
