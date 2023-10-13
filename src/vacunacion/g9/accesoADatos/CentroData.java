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

    public List<Centro> listarCentros() {

        List<Centro> centros = new ArrayList<>();

        try {
            String sql = "select * from centro where estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Centro c = new Centro();

                c.setId(rs.getInt("idCentro"));
                c.setNombre(rs.getString("nombre"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelular(rs.getInt("celular"));
                c.setZona(rs.getString("zona"));
                c.setActivo(rs.getBoolean("activo"));
                centros.add(c);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return centros;

    }

    public void listarVacunasPorCentros(int idcentro, LocalDateTime fecha) {

        List<Vacuna> vac = new ArrayList<>();

        try {
            String sql = "select * "
                    + "FROM vacuna INNER JOIN citavacunacion ON cita.lote=vacuna.lote"
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

}
