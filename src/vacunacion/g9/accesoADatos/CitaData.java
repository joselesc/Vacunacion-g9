package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    private java.util.Date globalFecha;

    public CitaData() {
        con = Conexion.getConexion();
    }

    public CitaData(int dniReg) {

        con = Conexion.getConexion();
        this.dniReg = dniReg;

    }

    public void mostrarCitaCiudadano() {

        CitaVacunacion cv = new CitaVacunacion();
        List<CitaVacunacion> citas = new ArrayList<>();
        int id = Integer.MAX_VALUE;
        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fechaVac.png"));

        if (dniReg == 0) {

            JOptionPane.showMessageDialog(null, "Debe loguearse primero");

        } else {

            Timestamp fh1;
            LocalDateTime fhc1 = null;

            String sql = "SELECT * FROM citavacunacion WHERE dni=? AND colocada=0 AND cancelado=0";

            try (PreparedStatement ps1 = con.prepareStatement(sql)) {
                ps1.setInt(1, dniReg);
                try (ResultSet rs1 = ps1.executeQuery()) {

                    while (rs1.next()) {

                        cv = new CitaVacunacion();
                        cv.setCodCita(rs1.getInt("codCita"));
                        cv.setDni(rs1.getInt("dni"));
                        cv.setLote(rs1.getInt("lote"));
                        fh1 = rs1.getTimestamp("fechaHoraCita");
                        cv.setFechaHoraCita(fhc1 = fh1.toLocalDateTime());
                        cv.setId_centro(rs1.getInt("id_centro"));
                        cv.setColocada(rs1.getBoolean("colocada"));
                        cv.setCancelada(rs1.getBoolean("cancelado"));
                        citas.add(cv);

                        for (CitaVacunacion cita : citas) {
                            if (cita.getCodCita() < id) {
                                id = cita.getCodCita();
                            }
                        }
                    }

                    String ciuNom = "", ape = "", cenNom = "", dire = "", zona = "";
                    Timestamp fh;
                    LocalDateTime fhc = null;

                    String query = " SELECT ciudadano.nombre, apellido, fechaHoraCita, centro.nombre,direccion,centro.zona "
                            + "FROM ciudadano JOIN citavacunacion ON (ciudadano.dni=citavacunacion.dni) JOIN centro ON (citavacunacion.id_centro=centro.id_centro) "
                            + "WHERE codCita=?";

                    try (PreparedStatement ps = con.prepareStatement(query)) {
                        ps.setInt(1, id);
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

                    }
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
                    + "WHERE ciudadano.dni=? and cancelado=0 and colocada=0";

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

                            citaCancelada();
                            nuevasFechas();

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
        String sql;

        sql = "SELECT * FROM citavacunacion";

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

    //Utilziado por AdministracionCita
    public List<CitaVacunacion> listarCitas(int mes) {

        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM citavacunacion "
                + "WHERE MONTH(fechaHoraCita) = ?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mes);
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

    //Utilizado por AdministracionCita
    public List<CitaVacunacion> listarCitas(String zona, Centro centro) {

        List<CitaVacunacion> citas = new ArrayList<>();
        String sql;
        if (zona.equals("Todos") && centro != null) {
            sql = "SELECT * "
                    + "FROM citavacunacion JOIN centro "
                    + "ON citavacunacion.id_centro = centro.id_centro "
                    + "AND centro.id_centro = ? ;";
        } else if (!zona.equals("Todos") && centro != null) {
            sql = "SELECT * "
                    + "FROM citavacunacion JOIN centro "
                    + "ON citavacunacion.id_centro = centro.id_centro "
                    + "AND centro.zona = ? AND centro.id_centro = ? ;";
        } else {
            sql = "SELECT * FROM citavacunacion ";
        }

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if (zona.equals("Todos") && centro != null) {
                ps.setInt(1, centro.getId());
            } else if (!zona.equals("Todos") && centro != null) {
                ps.setString(1, zona);
                ps.setInt(2, centro.getId());
            }

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

    //se usa en ciudadano x fecha vista
    public void modificarCita(int idCita, boolean aplicada, int lote) {

        String sqlActualizaCita = "UPDATE citavacunacion SET colocada = ? WHERE codCita = ?";
        String sqlActualizaStock = "UPDATE vacuna SET stock = stock - 1 WHERE lote = ?";

        try {
            PreparedStatement psUpdateCita = con.prepareStatement(sqlActualizaCita);
            psUpdateCita.setBoolean(1, aplicada);
            psUpdateCita.setInt(2, idCita);
            int rowsAffectedCita = psUpdateCita.executeUpdate();
            psUpdateCita.close();

            // Actualizar el stock 
            PreparedStatement psUpdateStock = con.prepareStatement(sqlActualizaStock);
            psUpdateStock.setInt(1, lote);
            int rowsAffectedStock = psUpdateStock.executeUpdate();
            psUpdateStock.close();

            if (rowsAffectedCita > 0 && rowsAffectedStock > 0) {
                JOptionPane.showMessageDialog(null, "VACUANA APLICADA.!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar la cita o el stock de vacunas.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión - " + ex.getMessage());
        }

    }

    //Utilizado por AdministracionCita    
    public void agregarCita(Ciudadano ciudadano, Vacuna vacuna, String zona, Centro centro, java.util.Date fecha) {
        int filasAfectadas = 0;

        // Verifica si ya existe un registro con el mismo DNI y lote
        if (!existeCitaDuplicada(ciudadano.getDni(), vacuna)) {
            String sql = "INSERT INTO citavacunacion (dni, lote, fechaHoraCita, id_centro, colocada, cancelado) "
                    + "VALUES (?, ?, ?, ?, false, false), (?, ?, ?, ?, false, false), (?, ?, ?, ?, false, false)";
            globalFecha = fecha;

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                List<Date> horariosTurnos = generarTurnosAutomaticamente(primeraFecha(ciudadano));
                int randon1 = (int) (Math.random() * horariosTurnos.size());
                List<Date> horariosTurnos2 = generarTurnosAutomaticamente(segundaFecha(primeraFecha(ciudadano)));
                int randon2 = (int) (Math.random() * horariosTurnos2.size());
                List<Date> horariosTurnos3 = generarTurnosAutomaticamente(terceraFecha(segundaFecha(primeraFecha(ciudadano))));
                int randon3 = (int) (Math.random() * horariosTurnos3.size());

                // Asigna los valores para el primer turno
                ps.setInt(1, ciudadano.getDni());
                ps.setInt(2, vacuna.getLote());
                ps.setTimestamp(3, new java.sql.Timestamp(horariosTurnos.get(randon1).getTime()));
                ps.setInt(4, centro.getId());

                // Asigna los valores para el segundo turno
                ps.setInt(5, ciudadano.getDni());
                int segundaDosisRamdon = ((int) (Math.random() * 4) + 4);
                ps.setInt(6, vacuna.getLote() + segundaDosisRamdon);
                ps.setTimestamp(7, new java.sql.Timestamp(horariosTurnos2.get(randon2).getTime()));
                ps.setInt(8, centro.getId());

                // Asigna los valores para el tercer turno
                ps.setInt(9, ciudadano.getDni());
                int terceraDosisRamdon = ((int) (Math.random() * 4) + 8);
                ps.setInt(10, (vacuna.getLote() + terceraDosisRamdon));
                ps.setTimestamp(11, new java.sql.Timestamp(horariosTurnos3.get(randon3).getTime()));
                ps.setInt(12, centro.getId());

                filasAfectadas = ps.executeUpdate();

                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Algo salió mal\n no hay conexión a la base de datos");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Algo salió mal\n no has cargado una fecha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una cita con el mismo DNI y lote.");
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
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
        return conteo;
    }

    public List<CitaVacunacion> listarCitasPorFechaYCentro(java.util.Date fecha, int idCentro) {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE DATE(fechaHoraCita) = ? AND id_centro = ? and colocada =0";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setTimestamp(1, new java.sql.Timestamp(fecha.getTime()));
            ps.setInt(2, idCentro);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    CitaVacunacion cita = new CitaVacunacion();

                    cita.setCodCita(rs.getInt("codCita"));
                    cita.setDni(rs.getInt("dni"));
                    cita.setLote(rs.getInt("lote"));
                    cita.setId_centro(rs.getInt("id_centro"));
                    Timestamp timestamp = rs.getTimestamp("fechaHoraCita");
                    LocalDateTime lc = timestamp.toLocalDateTime();
                    cita.setFechaHoraCita(lc);
                    cita.setColocada(rs.getBoolean("colocada"));
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

    //Utilizado po agregarCita()
    private java.util.Date primeraFecha(Ciudadano ciudadano) {
        java.util.Date primeraFecha;
        if (ciudadano.isAmbitoTrabajo() == true && ciudadano.isRiesgo() == true) {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(globalFecha);
            cal.add(java.util.Calendar.DATE, 14);
            primeraFecha = cal.getTime();
        } else if (ciudadano.isAmbitoTrabajo() == true && ciudadano.isRiesgo() == false) {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(globalFecha);
            cal.add(java.util.Calendar.DATE, 21);
            primeraFecha = cal.getTime();
        } else if (ciudadano.isAmbitoTrabajo() == false && ciudadano.isRiesgo() == true) {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(globalFecha);
            cal.add(java.util.Calendar.DATE, 28);
            primeraFecha = cal.getTime();
        } else {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(globalFecha);
            cal.add(java.util.Calendar.DATE, 28);
            primeraFecha = cal.getTime();
        }
        return primeraFecha;
    }

    //Utilizado po agregarCita()
    private java.util.Date segundaFecha(java.util.Date primera) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(primera);
        cal.add(java.util.Calendar.DATE, 28);
        java.util.Date segundaFecha = cal.getTime();
        return segundaFecha;
    }

    //Utilizado po agregarCita()
    private java.util.Date terceraFecha(java.util.Date segunda) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(segunda);
        cal.add(java.util.Calendar.DATE, 28);
        java.util.Date terceraFecha = cal.getTime();
        return terceraFecha;
    }

    //Utilizado po agregarCita()
    private List<Date> generarTurnosAutomaticamente(Date fecha) {
        //rango horario (de 08:00 AM a 18:00 PM)
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);

        int horaInicio = 8;  // Hora de inicio
        int horaFin = 18;   // Hora de finalización
        int intervaloMinutos = 15;  // Intervalo de generación de turnos (15 minutos)

        cal.set(Calendar.HOUR_OF_DAY, horaInicio);
        cal.set(Calendar.MINUTE, 0);
        //cal.set(Calendar.SECOND, 0);
        Date horaInicioDate = cal.getTime();

        cal.set(Calendar.HOUR_OF_DAY, horaFin);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date horaFinDate = cal.getTime();

        List<Date> turnos = new ArrayList<>();

        // Genera los turnos automáticamente en intervalos de 15 minutos
        while (horaInicioDate.before(horaFinDate)) {
            turnos.add(horaInicioDate);

            // Incrementa la hora actual en 15 minutos
            cal.setTime(horaInicioDate);
            cal.add(Calendar.MINUTE, intervaloMinutos);
            horaInicioDate = cal.getTime();
        }
        return turnos;
    }

    //Utilizado po agregarCita()
    private boolean existeCitaDuplicada(int dni, Vacuna vacuna) {
        String sql = "SELECT COUNT(*) FROM citavacunacion "
                + "INNER JOIN vacuna ON citavacunacion.lote = vacuna.lote "
                + "WHERE citavacunacion.dni = ? AND vacuna.medida = ? AND citavacunacion.cancelado = false";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setDouble(2, vacuna.getMedida());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

        return false;
    }

    private void nuevasFechas() {

        CitaVacunacion cv = new CitaVacunacion();
        List<CitaVacunacion> citas = new ArrayList<>();//este estaba dando el error -Xlint:unchecked dejarlo asi
        String sql1 = "SELECT * FROM citavacunacion where dni=? and cancelado=1 ";

        try (PreparedStatement ps2 = con.prepareStatement(sql1)) {
            ps2.setInt(1, dniReg);
            try (ResultSet rs1 = ps2.executeQuery()) {
                while (rs1.next()) {

                    cv = new CitaVacunacion();
                    cv.setCodCita(rs1.getInt("codCita"));
                    cv.setDni(rs1.getInt("dni"));
                    cv.setLote(rs1.getInt("lote"));
                    Timestamp fh2 = rs1.getTimestamp("fechaHoraCita");
                    LocalDateTime fhc2 = fh2.toLocalDateTime();
                    cv.setFechaHoraCita(fhc2);
                    cv.setId_centro(rs1.getInt("id_centro"));
                    cv.setColocada(rs1.getBoolean("colocada"));
                    cv.setCancelada(rs1.getBoolean("cancelado"));
                    System.out.println(cv);
                    citas.add(cv);

                }
                for (CitaVacunacion cita1 : citas) {
                    System.out.println("siguio");
                    String sql3 = "INSERT INTO citavacunacion (dni, lote, fechaHoraCita, id_centro, colocada, cancelado) "
                            + "VALUES (?, ?, ?, ?, false, false)";
                    try (PreparedStatement ps3 = con.prepareStatement(sql3)) {
                        System.out.println("llegofinal");
                        ps3.setInt(1, cita1.getDni());
                        System.out.println(cita1.getDni());
                        ps3.setInt(2, cita1.getLote());
                        System.out.println(cita1.getLote());
                        cita1.setFechaHoraCita(cita1.getFechaHoraCita().plusDays(14));
                        ps3.setTimestamp(3, Timestamp.valueOf(cita1.getFechaHoraCita()));
                        System.out.println(cita1.getFechaHoraCita());
                        ps3.setInt(4, cita1.getId_centro());
                        System.out.println(cita1.getId_centro());
                        System.out.println(ps3);
                        ps3.executeUpdate();
                    }

                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    private void citaCancelada() {

        Icon icono = new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fechaVac.png"));
        String sql = "UPDATE citavacunacion SET cancelado=1 WHERE dni=? and colocada=0";
        try (PreparedStatement ps1 = con.prepareStatement(sql)) {
            ps1.setInt(1, dniReg);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Su cita a sido cancelada", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }

    }
}
