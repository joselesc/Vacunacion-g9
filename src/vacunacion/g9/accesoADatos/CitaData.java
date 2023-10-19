package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Ciudadano;

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
    
    public int conteoCiudadanoPorDia(java.util.Date fecha, boolean esencial, boolean riesgo){
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01' AND ambitoTrabajo = 0 AND deRiesgo = 0;
        String sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ?;";
        int conteo = 0;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSql);
            ps.setBoolean(2, esencial);
            ps.setBoolean(3, riesgo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    conteo = rs.getInt(1);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return conteo;
    }
    
    public int conteoTodosLosCiudadano(java.util.Date fecha){
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01';
        String sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ?;";
        int conteo = 0;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSql);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    conteo = rs.getInt(1);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return conteo;
    }
}
