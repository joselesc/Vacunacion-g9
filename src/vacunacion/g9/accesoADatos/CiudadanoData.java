package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Ciudadano;

public class CiudadanoData {

    private Connection con = null;
    private int dniReg = 0;
    public CiudadanoData() {
        con = Conexion.getConexion();
    }

    public void registrarCiudadano(Ciudadano ciudadano) {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/Inscripcion.png"));

        String sql = "INSERT INTO ciudadano(dni, apellido, nombre, email, celular, zona, patologia, ambitoTrabajo, deRiesgo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?,? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getApellido());
            ps.setString(3, ciudadano.getNombre());
            ps.setString(4, ciudadano.getEmail());
            ps.setInt(5, ciudadano.getCelular());
            ps.setString(6, ciudadano.getZona());
            ps.setString(7, ciudadano.getPatologia());
            ps.setBoolean(8, ciudadano.isAmbitoTrabajo());
            ps.setBoolean(9, ciudadano.isRiesgo());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso!!!", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar database " + ex);
        }
    }

    public void modificarInfo(Ciudadano ciudadano) {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/actualizar.png"));

        String sql = "UPDATE ciudadano SET apellido=?, nombre=? , email=? , celular=? , zona=? , patologia=? , ambitoTrabajo=? , deRiesgo=?  WHERE dni=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, ciudadano.getApellido());
            ps.setString(2, ciudadano.getNombre());
            ps.setString(3, ciudadano.getEmail());
            ps.setInt(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getZona());
            ps.setString(6, ciudadano.getPatologia());
            ps.setBoolean(7, ciudadano.isAmbitoTrabajo());
            ps.setBoolean(8, ciudadano.isRiesgo());
            ps.setInt(9, ciudadano.getDni());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Actualizacion  exitosa!!!", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

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
                    c.setAmbitoTrabajo(rs.getBoolean("ambitoTrabajo"));
                    c.setRiesgo(rs.getBoolean("deRiesgo"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return c;
    }

    //para la Clase AdministracionListarCiudadano()
    public List<Ciudadano> listarCiudadano() {

        List<Ciudadano> ciu = new ArrayList<>();

        try {

            String sql = "SELECT * FROM ciudadano";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudadano c = new Ciudadano();

                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setEmail(rs.getString("email"));
                c.setCelular(rs.getInt("celular"));
                c.setZona(rs.getString("zona"));
                c.setPatologia(rs.getString("patologia"));
                c.setAmbitoTrabajo(rs.getBoolean("ambitoTrabajo"));
                c.setRiesgo(rs.getBoolean("deRiesgo"));
                ciu.add(c);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ciudadano" + ex.getMessage());
        }

        return ciu;
    }

    //para la Clase AdministrarCitas()
    public List<Ciudadano> listarCiudadano2(java.util.Date fecha, boolean esencial, boolean riesgo, String zona, boolean todos) {

        List<Ciudadano> ciu = new ArrayList<>();
        String sql;
        try {
            if (todos == true && zona.equals("Todos")) {
                    sql = "SELECT * FROM ciudadano WHERE fechaInscripcion = ?";
            }else if(todos == false && zona.equals("Todos")){
                    sql = "SELECT * FROM ciudadano WHERE fechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ?";
            }else if(todos == true && !zona.equals("Todos")){
                    sql = "SELECT * FROM ciudadano WHERE fechaInscripcion = ? AND zona = ?";
            }else{
                if (zona.equals("Todos")) {
                    sql = "SELECT * FROM ciudadano WHERE fechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ?";
                }else{
                    sql = "SELECT * FROM ciudadano WHERE fechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ? AND zona = ?";
                }
            }

            PreparedStatement ps = con.prepareStatement(sql);
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSql);
            if (todos == true && !zona.equals("Todos")) {
                ps.setString(2, zona);
            }else{
                ps.setBoolean(2, esencial);
            }
            ps.setBoolean(3, riesgo);
            if (!zona.equals("Todos")) {
                ps.setString(4, zona);
            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudadano c = new Ciudadano();

                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setEmail(rs.getString("email"));
                c.setCelular(rs.getInt("celular"));
                c.setZona(rs.getString("zona"));
                c.setPatologia(rs.getString("patologia"));
                c.setAmbitoTrabajo(rs.getBoolean("ambitoTrabajo"));
                c.setRiesgo(rs.getBoolean("deRiesgo"));
                ciu.add(c);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ciudadano \n" + ex.getMessage());
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, " Debe seleccionar una fecha \n" + ex.getMessage());
        }

        return ciu;
    }

    public void eliminarCiudadano(int dni) {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/ciudadano.png"));

        String sql = "DELETE FROM ciudadano WHERE dni=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Ciudadano borrado.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

            } else {
                JOptionPane.showMessageDialog(null, "El dni del ciudadano no existe", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    public int loguearse(int dni) {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/login.png"));
        int c = 0;
        String sql = "SELECT dni FROM ciudadano WHERE dni = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Ingreso exitoso", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                    c = rs.getInt("dni");

                } else {
                    JOptionPane.showMessageDialog(null, "No hay ninguna cuenta co esta dni, debe registrarse primero");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        dniReg = c;

        return c;

    }

    public int dniReg() {
        
       return dniReg;

    }

    public void cancelarCita() {

    }

    public boolean validarInfo(int dni, String apellido, String email) {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/validar.png"));
        boolean validar = false;
        int d = 0;
        String ape = "";
        String em = "";

        String sql = "SELECT dni, apellido, email FROM ciudadano where dni=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                d = (rs.getInt("dni"));
                ape = (rs.getString("apellido"));
                em = (rs.getString("email"));

            }

            if (dni == d && apellido.equalsIgnoreCase(ape) && email.equalsIgnoreCase(em)) {

                validar = true;
                JOptionPane.showMessageDialog(null, "Validacion exitosa!!!", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

            } else {

                JOptionPane.showMessageDialog(null, "No se puedo validar los datos");
            }

            ps.close();
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar database " + ex);
        }

        return validar;
    }

    public int getDniReg() {
        return dniReg;
    }

    public void setDniReg(int dniReg) {
        this.dniReg = dniReg;
    }

}
