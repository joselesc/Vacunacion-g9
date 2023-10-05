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
    
    public void registrarCiudadano(){
       
    }
    
    public Ciudadano buscarCiudadano(int dni){
        Ciudadano c = null;
        String sql = "SELECT * FROM ciudadano WHERE dni = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c = new Ciudadano();
                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setEmail("email");
                c.setCelular(rs.getInt("celular"));
                c.setZona("zona");
                c.setPatologia("patologia");
                c.setAmbitoTrabajo("ambitoTrabajo");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return c;
    }
    
}
