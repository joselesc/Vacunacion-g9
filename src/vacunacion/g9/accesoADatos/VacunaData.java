package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Vacuna;

public class VacunaData {

    private Connection con = null;

    public VacunaData() {
        con = Conexion.getConexion();
    }

    public void insertarVacuna(Vacuna vacuna) {

        String sql = "INSERT INTO vacuna (lote, cuit, marca, medida, fechaCaduca, stock, colocada) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, vacuna.getLote());
            ps.setLong(2, vacuna.getCuit());
            ps.setString(3, vacuna.getMarca());
            ps.setDouble(4, vacuna.getMedida());
            ps.setDate(5, Date.valueOf(vacuna.getFechaCaduca()));
            ps.setInt(6, vacuna.getStock());
            ps.setBoolean(7, vacuna.isColocada());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    long primaryKey = rs.getLong(1); // Suponiendo que la clave generada es de tipo numérico.            
//                vacuna.setPrimaryKey(primaryKey); 
// Almacena la clave generada en la entidad Vacuna si es necesario.
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al acceder a la tabla vacuna: " + e.getMessage());
        }
    }

    public void modificarVacuna(Vacuna vacuna) {

        String sql = "UPDATE vacuna SET cuit=?, marca=?, medida=?, fechaCaduca=?, stock=? WHERE lote=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, vacuna.getCuit());
            ps.setString(2, vacuna.getMarca());
            ps.setDouble(3, vacuna.getMedida());
            ps.setDate(4, Date.valueOf(vacuna.getFechaCaduca()));
            ps.setInt(5, vacuna.getStock());
            ps.setInt(6, vacuna.getLote());
            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "VACUNA MODIFICADA CON EXITO.");

            } else {
                JOptionPane.showMessageDialog(null, "EL LOTE DE LA VACCUNA NO EXISTE!!!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    public void eliminarVacuna(int lote) {

        String sql = "DELETE FROM vacuna WHERE lote=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, lote);

            int mod = ps.executeUpdate();
            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "VACUNA ELIMINADA!!!.");

            } else {
                JOptionPane.showMessageDialog(null, "LA VACUNA NO EXISTE!!!!");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    public List<Vacuna> obtenerVacunasDisponibles() {
        List<Vacuna> vacunas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vacuna WHERE stock>0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vacuna vacuna = new Vacuna(
                        rs.getInt("Lote"),
                        rs.getLong("cuit"),
                        rs.getString("marca"),
                        rs.getDouble("medida"),
                        rs.getDate("fechaCaduca").toLocalDate(),
                        rs.getInt("stock"),
                        rs.getBoolean("colocada")
                );
                vacunas.add(vacuna);
            }
            ps.close();
        } catch (SQLException e) {
            System.err.println("ERROR AL OBTENER VACUNAS DISPONIBLES!!! " + e.getMessage());
        }
        return vacunas;
    }

    public void actualizarEstadoVacuna(int lote, boolean colocada) {
        try {
            String sql = "UPDATE vacuna SET colocada = ? WHERE lote = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, colocada);
            ps.setInt(2, lote);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.err.println("ERROR AL ACTUALIZAR: " + e.getMessage());
        }
    }

    public void buscarVacuna(long cuit) {

        String sql = "SELECT * FROM vacuna WHERE cuit = ?";

        Vacuna v = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuit);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                v = new Vacuna();
                v.setCuit(cuit);
                v.setMarca(rs.getString("marca"));
                v.setMedida(rs.getDouble("medida"));
                v.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                v.setStock(rs.getInt("stock"));
                v.setColocada(rs.getBoolean("colocada"));

            } else {
                JOptionPane.showMessageDialog(null, "LABORATORIO INEXISTENTE!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLE LABORATORIO" + ex.getMessage());
        }
    }

    public boolean existeLote(int lote) {
        String sql = "select count(*) from vacuna where lote=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, lote);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int cuenta = rs.getInt(1);
                return cuenta > 0;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR EL LOTE EN LA TABLA VACUNA: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean laboratorioTieneVacunas(long cuit) {
    try {
        // Realiza una consulta para verificar si existen vacunas relacionadas con el laboratorio.
        String sql = "SELECT COUNT(*) FROM vacuna WHERE cuit = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, cuit);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int tiene = rs.getInt(1);
            return tiene > 0; // Si "tiene" es mayor que 0, el laboratorio tiene vacunas relacionadas.
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar si el laboratorio tiene vacunas: " + ex.getMessage());
    }

    return false; // En caso de error o si el laboratorio no tiene vacunas relacionadas.
}    

    public List<Vacuna> obtenerVacunasDisponiblesxLote() {
        List<Vacuna> vacunas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vacuna WHERE lote>0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vacuna vacuna = new Vacuna(
                        rs.getInt("Lote"),
                        rs.getLong("cuit"),
                        rs.getString("marca"),
                        rs.getDouble("medida"),
                        rs.getDate("fechaCaduca").toLocalDate(),
                        rs.getInt("stock"),
                        rs.getBoolean("colocada")
                );
                vacunas.add(vacuna);
            }
            ps.close();
        } catch (SQLException e) {
            System.err.println("ERROR AL OBTENER VACUNAS DISPONIBLES!!! " + e.getMessage());
        }
        return vacunas;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////        
//        LaboratorioData laboratorioData = new LaboratorioData();
//        List<Vacuna> vacunasOrdenadasPorLote = laboratorioData.obtenerVacunasDisponiblesOrdenadasPorLote();
/////////////////////////copia y pega para utilizar el metodo/////////////////////////////////////////////////


        
}
    //Utilizado en AdministracionCita
    public Vacuna buscarVacuna(int lote) {

        String sql = "SELECT * FROM vacuna WHERE lote = ?";

        Vacuna v = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, lote);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                v = new Vacuna();
                v.setLote(lote);
                v.setMarca(rs.getString("marca"));
                v.setMedida(rs.getDouble("medida"));
                v.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                v.setStock(rs.getInt("stock"));
                v.setColocada(rs.getBoolean("colocada"));

            } else {
                JOptionPane.showMessageDialog(null, "LABORATORIO INEXISTENTE!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLE LABORATORIO" + ex.getMessage());
        }
        return v;
    }
}