package vacunacion.g9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vacunacion.g9.entidades.Laboratorio;

public class LaboratorioData {

    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.getConexion();
    }

    public void guardarLaboratorio(Laboratorio laboratorio) {

        try {
            String sql = "INSERT INTO laboratorio(cuit, nombreLaboratorio, pais, domComercial) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNomLaboratorio());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getNomLaboratorio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                laboratorio.setCuit(rs.getLong(1));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Fallo la carga del laboratorio" + ex.getMessage());
        }
    }

    public List<Laboratorio> listarLaboratorio() {

        String sql = "SELECT cuit, nombreLaboratorio, pais, domComercial FROM laboratorio ";
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Laboratorio laboratorio = new Laboratorio();
                laboratorio.setCuit(rs.getLong("cuit"));
                laboratorio.setNomLaboratorio(rs.getString("nombreLaboratorio"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDomComercial(rs.getString("domComercial"));

                laboratorios.add(laboratorio);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLE LABORATORIO" + ex.getMessage());
        }
        return laboratorios;
    }

    public Laboratorio buscarLaboratorioxCuit(long cuit) {

        String sql = "SELECT nombreLaboratorio, pais, domComercial FROM laboratorio where cuit = ?";

        Laboratorio laboratorio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuit);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                laboratorio = new Laboratorio();
                laboratorio.setCuit(cuit);
                laboratorio.setDomComercial(rs.getString("domComercial"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setNomLaboratorio("nombreLaboratorio");
            } else {
                JOptionPane.showMessageDialog(null, "LABORATORIO INEXISTENTE!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLE LABORATORIO" + ex.getMessage());
        }
        return laboratorio;
    }

    public void eliminar(long cuit) {
//
//        String sql = "DELETE FROM laboratorio WHERE cuit=?";
//
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setLong(1, cuit);
//
//            int mod = ps.executeUpdate();
//
//            if (mod == 1) {
//                JOptionPane.showMessageDialog(null, "LABORATORIO ELIMINADO!!!.");
//
//            } else {
//                JOptionPane.showMessageDialog(null, "EL LABORATORIO NO EXISTE");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
//        }
try {
        // Antes de eliminar el laboratorio, verifica si se encuentra en uso (claves foráneas).
        VacunaData lb=new VacunaData();
        if (!lb.laboratorioTieneVacunas(cuit)) {
            String sql = "DELETE FROM laboratorio WHERE cuit=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuit);
            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "LABORATORIO ELIMINADO.");
            } else {
                JOptionPane.showMessageDialog(null, "EL LABORATORIO NO EXISTE.");
            }
            ps.close();
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el laboratorio, ya que está en uso (claves foráneas).");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error de conexión - " + ex.getMessage());
    }
    }

    public void modificar(Laboratorio laboratorio) {

        String sql = "UPDATE laboratorio SET nombreLaboratorio = ?,"
                + "pais = ?, domComercial= ? WHERE cuit = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, laboratorio.getNomLaboratorio());
            ps.setString(2, laboratorio.getPais());
            ps.setString(3, laboratorio.getDomComercial());
            ps.setLong(4, laboratorio.getCuit());
            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "laboratorio modificado con exito.");

            } else {
                JOptionPane.showMessageDialog(null, "El cuit del laboratorio no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    public boolean existeCuit(long cuit) {
        String sql = "SELECT COUNT(*) FROM laboratorio WHERE cuit = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuit);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int existe = rs.getInt(1);
                return existe > 0; 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR EL CUIT EN LA TABLA LABORATORIO: " + ex.getMessage());
        }
        return false; 
    }

}
