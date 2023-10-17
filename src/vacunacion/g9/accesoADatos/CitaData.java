package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CitaData {

    private Connection con = null;
    private int dniReg;
    public CitaData() {
        con = Conexion.getConexion();
    }
    
    public void mostrarCitaCiudadano( int dni){
        
        if(dniReg==0){
            JOptionPane.showMessageDialog(null, "Debe loguearse primero");
            
        }else{
            
            String sql="SELECT * FROM `citavacunacion` WHERE dni=?";
              try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dniReg);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
//                    c = new Ciudadano();
//                    c.setDni(rs.getInt("dni"));
//                    c.setApellido(rs.getString("apellido"));
//                    c.setNombre(rs.getString("nombre"));
//                    c.setEmail(rs.getString("email"));
//                    c.setCelular(rs.getInt("celular"));
//                    c.setZona(rs.getString("zona"));
//                    c.setPatologia(rs.getString("patologia"));
//                    c.setAmbitoTrabajo(rs.getBoolean("ambitoTrabajo"));
//                    c.setRiesgo(rs.getBoolean("deRiesgo"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
         
        }
        
    }
    
    public void cancelarCitaCiudadano(int dni){
        
        if(dniReg==0){
            JOptionPane.showMessageDialog(null, "Debe loguearse primero");
            
        }else{
            
            String sql="SELECT * FROM `citavacunacion` WHERE dni=?";
              try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dniReg);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
//                    c = new Ciudadano();
//                    c.setDni(rs.getInt("dni"));
//                    c.setApellido(rs.getString("apellido"));
//                    c.setNombre(rs.getString("nombre"));
//                    c.setEmail(rs.getString("email"));
//                    c.setCelular(rs.getInt("celular"));
//                    c.setZona(rs.getString("zona"));
//                    c.setPatologia(rs.getString("patologia"));
//                    c.setAmbitoTrabajo(rs.getBoolean("ambitoTrabajo"));
//                    c.setRiesgo(rs.getBoolean("deRiesgo"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
         
        }
    }
    
    public void listarCitas(int idCita){}
    
    public void modificarCita(int idCita){}
    
    public void eliminarCita(int idCita){}
    
    public void agregarCita(int idCita){}
}
