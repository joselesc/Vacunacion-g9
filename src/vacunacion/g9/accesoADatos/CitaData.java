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
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.CitaVacunacion;
import vacunacion.g9.entidades.Ciudadano;
import vacunacion.g9.entidades.Vacuna;

public class CitaData {

    Timestamp time;
    private Connection con = null;
    private static int dniReg;

    public CitaData() {
        con = Conexion.getConexion();
    }

    public CitaData(int dniReg) {
        System.out.println(dniReg);
        con = Conexion.getConexion();
        this.dniReg = dniReg;
        System.out.println(this.dniReg);
    }

    public void mostrarCitaCiudadano() {

        System.out.println(dniReg);
        if (dniReg == 0) {
            System.out.println(getDniReg() == 0);
            JOptionPane.showMessageDialog(null, "Debe loguearse primero");

        } else {

            Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fechaVac.png"));
            String ciuNom = "", ape = "", cenNom = "", dire = "", zona = "";
            Timestamp fh;
            LocalDateTime fhc = null;

            String query = " SELECT ciudadano.nombre, apellido, fechaHoraCita, centro.nombre,direccion,centro.zona "
                    + "FROM ciudadano JOIN citavacunacion ON (ciudadano.dni=citavacunacion.dni) JOIN centro ON (citavacunacion.id_centro=centro.id_centro) "
                    + "WHERE ciudadano.dni=?";

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, dniReg);
                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {
                        ciuNom = rs.getString("ciudadano.nombre");
                        ape = rs.getString("apellido");
                        fh = rs.getTimestamp("fechaHoraCita");
                        fhc = fh.toLocalDateTime();
                        cenNom = rs.getString("centro.nombre");
                        dire = rs.getString("direccion");
                        zona = rs.getString("zona");

                        String cita = " El señor/a " + ciuNom + " " + ape + " con dni " + dniReg + " tiene como fecha y horario de vacunacion el dia " + fhc + "\n en el centro de vacunacion "
                                + cenNom + " con domicilio " + dire + " en la zona " + zona;
                        JOptionPane.showMessageDialog(null, cita, "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario no tiene una cita o no esta logueado ");
                    };

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
            }
        }

    }

    public void cancelarCitaCiudadano() {

        if (dniReg == 0) {
            JOptionPane.showMessageDialog(null, "Debe loguearse primero");

        } else {

            Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fechaVac.png"));
            String ciuNom = "", ape = "", cenNom = "", dire = "", zona = "";
            Timestamp fh;
            LocalDateTime fhc = null;

            String query = " SELECT ciudadano.nombre, apellido, fechaHoraCita, centro.nombre,direccion,centro.zona "
                    + "FROM ciudadano JOIN citavacunacion ON (ciudadano.dni=citavacunacion.dni) JOIN centro ON (citavacunacion.id_centro=centro.id_centro) "
                    + "WHERE ciudadano.dni=?";

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, dniReg);
                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {
                        ciuNom = rs.getString("ciudadano.nombre");
                        ape = rs.getString("apellido");
                        fh = rs.getTimestamp("fechaHoraCita");
                        fhc = fh.toLocalDateTime();
                        cenNom = rs.getString("centro.nombre");
                        dire = rs.getString("direccion");
                        zona = rs.getString("zona");

                        String cita = " El señor/a " + ciuNom + " " + ape + " con dni " + dniReg + " tiene como fecha y horario de vacunacion el dia " + fhc + "\n  en el centro de vacunacion "
                                + cenNom + " con domicilio " + dire + " en la zona " + zona;
                        int conf = JOptionPane.showConfirmDialog(null, cita + "\n ¿Esta seguro que desea cancelar la cita?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icono);
                        if (conf == JOptionPane.YES_OPTION) {

                            String sql = "UPDATE citavacunacion SET cancelado=1 WHERE dni=?";
                            try (PreparedStatement ps1 = con.prepareStatement(sql)) {
                                ps1.setInt(1, dniReg);
                                ps1.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Su cita a sido cancelada", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

                            }

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "El usuario no tiene una cita o no esta logueado ");
                    }

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
            }
        }
    }
    //Utilizado por AdministracionCita
    public List<CitaVacunacion> listarCitas() {
    List<CitaVacunacion> citas = new ArrayList<>();
    String sql = "SELECT * FROM citavacunacion";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            CitaVacunacion cita = new CitaVacunacion();

            cita.setCodCita(rs.getInt("codCita"));
            cita.setDni(rs.getInt("dni"));
            cita.setLote(rs.getInt("lote"));
            Timestamp timestamp = rs.getTimestamp("fechaHoraCita");
            LocalDateTime lc = timestamp.toLocalDateTime();
            cita.setFechaHoraCita(lc);
            cita.setId_centro(rs.getInt("id_centro"));
            cita.setColocada(rs.getBoolean("colocada"));
            cita.setCancelada(rs.getBoolean("cancelado"));

            citas.add(cita);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla\n" + ex.getMessage());
    }
    return citas;
}

    public void modificarCita(int idCita) {
    }

    public void eliminarCita(int idCita) {
    }
    //Utilizado por AdministracionCita
    public void agregarCita(Ciudadano ciudadano, Vacuna vacuna, String zona, Centro centro, java.util.Date fecha) {

        
        String sql = "INSERT INTO `citavacunacion` (`dni`, `lote`, `fechaHoraCita`, `id_centro`, `colocada`, `cancelado`) "
                + "VALUES (?, ?, ?, ?, false, false)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDni());
            ps.setInt(2, vacuna.getLote());
            ps.setTimestamp(3, new java.sql.Timestamp(fecha.getTime()));
            ps.setInt(4, centro.getId());

            int rowsAffected = ps.executeUpdate();
            ps.close();

            if (rowsAffected > 0) {
                //JOptionPane.showMessageDialog(null, "Registro exitoso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal:\n" + ex);
        }
    }
    
    //Utilizado por AdministracionCita
    public int conteoCiudadanoPorDia(java.util.Date fecha, boolean esencial, boolean riesgo, String zona) {
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01' AND ambitoTrabajo = 0 AND deRiesgo = 0;
        String sql;
        if (!zona.equalsIgnoreCase("Todos")) {
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND ambitoTrabajo = ? AND deRiesgo = ? AND zona = ?;";
        } else {
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
    //Utilizado por AdministracionCita
    public int conteoTodosLosCiudadano(java.util.Date fecha, String zona) {
        //SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = '2023-10-01';
        String sql;
        if (!zona.equalsIgnoreCase("Todos")) {
            sql = "SELECT COUNT(*) FROM ciudadano WHERE FechaInscripcion = ? AND zona = ?;";
        } else {
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
    //Utilizado por AdministracionCita
    public List<CitaVacunacion> listarCitasPorFechaYCentro(java.util.Date fecha, int idCentro) {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE fechaHoraCita = ? AND id_centro = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

//            Timestamp fechaTimestamp = Timestamp.valueOf(fecha);
            ps.setTimestamp(1, new java.sql.Timestamp(fecha.getTime()));
            ps.setInt(2, idCentro);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    CitaVacunacion cita = new CitaVacunacion();

                    cita.setCodCita(rs.getInt("codCita"));
                    cita.setDni(rs.getInt("dni"));
                    cita.setLote(rs.getInt("lote"));
//                    cita.setId_centro(rs.getInt("id_centro"));
                    Timestamp timestamp = rs.getTimestamp("fechaHoraCita");
                    LocalDateTime lc = timestamp.toLocalDateTime();
                    cita.setFechaHoraCita(lc);
                    cita.setColocada(rs.getBoolean("colocada"));
//                    cita.setCancelada(rs.getBoolean("cancelada"));

                    citas.add(cita);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión - " + ex.getMessage());
        }

        return citas;
    }

    public static int getDniReg() {
        return dniReg;
    }

    public void setDniReg(int dniReg) {
        this.dniReg = dniReg;
    }

}
