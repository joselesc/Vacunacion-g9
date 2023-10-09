package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Ciudadano;

public class CiudadanoData {

    private Connection con = null;

    public CiudadanoData() {
        con = Conexion.getConexion();
    }

    public void registrarCiudadano(Ciudadano ciudadano) {

        String sql = "INSERT INTO ciudadano(dni, apellido, nombre, email, celular, zona, patologia, ambitoTrabajo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getApellido());
            ps.setString(3, ciudadano.getNombre());
            ps.setString(4, ciudadano.getEmail());
            ps.setInt(5, ciudadano.getCelular());
            ps.setString(6, ciudadano.getZona());
            ps.setString(7, ciudadano.getPatologia());
            ps.setString(8, ciudadano.getAmbitoTrabajo());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso!!!te van a vacunar");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar database " + ex);
        }
    }

    public Ciudadano buscarCiudadano(int dni) {
        Ciudadano c = null;
        String sql = "SELECT * FROM ciudadano WHERE dni = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    c = new Ciudadano();
                    c.setDni(rs.getInt("dni"));
                    c.setApellido(rs.getString("apellido"));
                    c.setNombre(rs.getString("nombre"));
                    c.setEmail(rs.getString("email"));
                    c.setCelular(rs.getInt("celular"));
                    c.setZona(rs.getString("zona"));
                    c.setPatologia(rs.getString("patologia"));
                    c.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return c;
    }

    public boolean loguearse(int dni) {
        boolean ok = false;
        Ciudadano c = null;
        String sql = "SELECT dni FROM ciudadano WHERE dni = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, dni);
        try( ResultSet rs = ps.executeQuery()){   
            while (rs.next()) {
                c = new Ciudadano();
                c.setDni(rs.getInt("dni"));
                if (c.getDni() == dni) {
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                    ok = true;
                }
                JOptionPane.showMessageDialog(null, "No hay ninguna cuenta co esta dni, debe registrarse primero");
            }
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return ok;

    }
}
