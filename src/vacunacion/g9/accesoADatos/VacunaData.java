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

        String sql = "INSERT INTO vacuna (lote,cuit, marca, medida, fechaCaduca, stock) "
                + "VALUES ( ?,?, ?, ?, ?,?)";
        System.out.println("data");
        try {
//            

                PreparedStatement ps = con.prepareStatement(sql);
                
                ps.setInt(1, vacuna.getLote());
                ps.setLong(2, vacuna.getCuit());
                ps.setString(3, vacuna.getMarca());
                ps.setDouble(4, vacuna.getMedida());
                ps.setDate(5, Date.valueOf(vacuna.getFechaCaduca()));
                ps.setInt(6, vacuna.getStock());
                System.out.println( Date.valueOf(vacuna.getFechaCaduca()));
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                
                
                ps.close();
                rs.close();

            JOptionPane.showMessageDialog(null, "VACUNA CARGADA.");

        } catch (SQLException e) {
            System.err.println("Error al acceder a la tabla vacuna: " + e.getMessage());
        }
    }

    public List<Vacuna> obtenerVacunasDisponibles() {
        List<Vacuna> vacunas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM vacuna WHERE stock>0";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Vacuna vacuna = new Vacuna(
                        resultSet.getInt("Lote"),
                        resultSet.getLong("cuit"),
                        resultSet.getString("marca"),
                        resultSet.getDouble("medida"),
                        resultSet.getDate("fechaCaduca").toLocalDate(),
                        resultSet.getInt("stock"),
                        resultSet.getBoolean("colocada")
                );
                vacunas.add(vacuna);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al obtener vacunas disponibles: " + e.getMessage());
        }
        return vacunas;
    }

    public void actualizarEstadoVacuna(int nroSerieDosis, boolean colocada) {
        try {
            String sql = "UPDATE vacuna SET colocada = ? WHERE nroSerieDosis = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setBoolean(1, colocada);
            statement.setInt(2, nroSerieDosis);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al actualizar estado de la vacuna: " + e.getMessage());
        }
    }
}
