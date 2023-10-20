package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void agregarCita(int dni, int lote, String zona, int idCentro, LocalDateTime fecha){
        String sql;
        sql = "INSERT INTO `citavacunacion`(`dni`, `lote`, `fechaHoraCita`, `id_centro`, `colocada`, `cancelado`) "
                + "VALUES (?, ?, ?, ?, ?, false, false)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setInt(2, lote);
            ps.setInt(3, idCentro);
            ps.setTimestamp(4, Timestamp.valueOf(fecha));
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso!!!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "    Algo salio mal\n   " + ex);
        } 
        
    }
    
    public int conteoCiudadanoPorDia(java.util.Date fecha, boolean esencial, boolean riesgo, String zona){
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01' AND ambitoTrabajo = 0 AND deRiesgo = 0;
        String sql;
        if (!zona.equalsIgnoreCase("Todos")) {
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ? AND zona = ?;";  
        }else {
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ?;";        
        }
        int conteo = 0;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSql);
            ps.setBoolean(2, esencial);
            ps.setBoolean(3, riesgo);
            ps.setString(4, zona);

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
    
    public int conteoTodosLosCiudadano(java.util.Date fecha, String zona){
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01';
        String sql;
        if (!zona.equalsIgnoreCase("Todos")) {
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND zona = ?;";   
        }else{
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ?;";  
        }
        int conteo = 0;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSql);
            ps.setString(2, zona);

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
