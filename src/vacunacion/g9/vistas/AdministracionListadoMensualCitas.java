package vacunacion.g9.vistas;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.CitaData;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.accesoADatos.VacunaData;
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.CitaVacunacion;
import vacunacion.g9.entidades.Ciudadano;
import vacunacion.g9.entidades.Vacuna;

public class AdministracionListadoMensualCitas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    CitaData citaData = new CitaData();
    CiudadanoData ciudadanoData = new CiudadanoData();
    CentroData centroData = new CentroData();
    VacunaData vacunaData = new VacunaData();
    public AdministracionListadoMensualCitas() {
        initComponents();
        armarCabecera();
        cargarDatosATabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListadoMensual = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMCListadoMensuales = new com.toedter.calendar.JMonthChooser();

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado Mensuales");

        jTListadoMensual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre", "Lote", "Marca", "Dosis", "Fecha y hora", "Centro", "Estado", "Cancelado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListadoMensual);
        if (jTListadoMensual.getColumnModel().getColumnCount() > 0) {
            jTListadoMensual.getColumnModel().getColumn(0).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTListadoMensual.getColumnModel().getColumn(1).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(1).setPreferredWidth(11);
            jTListadoMensual.getColumnModel().getColumn(2).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(3).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(4).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(4).setPreferredWidth(3);
            jTListadoMensual.getColumnModel().getColumn(5).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(6).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(6).setPreferredWidth(4);
            jTListadoMensual.getColumnModel().getColumn(7).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(8).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(9).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(9).setPreferredWidth(1);
            jTListadoMensual.getColumnModel().getColumn(10).setResizable(false);
            jTListadoMensual.getColumnModel().getColumn(10).setPreferredWidth(1);
        }

        jButton1.setBackground(new java.awt.Color(0, 52, 89));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMCListadoMensuales.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMCListadoMensualesPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1)
                        .addGap(0, 447, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMCListadoMensuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jMCListadoMensuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            this.dispose();
//            AdministracionVista volver = new AdministracionVista();
//            volver.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMCListadoMensualesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMCListadoMensualesPropertyChange
        cargarDatosATabla();
    }//GEN-LAST:event_jMCListadoMensualesPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JMonthChooser jMCListadoMensuales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListadoMensual;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        modelo = (DefaultTableModel) jTListadoMensual.getModel();
    }
    
    private void cargarDatosATabla(){
        modelo.setRowCount(0);
        Centro centro = new Centro();
        Ciudadano ciudadano = new Ciudadano();
        Vacuna vacuna = new Vacuna();
        int mes = jMCListadoMensuales.getMonth() + 1;
        System.out.println("mes: " + mes);
        for (CitaVacunacion cita : citaData.listarCitas(mes)) {
            DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm");
            centro = centroData.buscarCentros(cita.getId_centro());
            ciudadano = ciudadanoData.buscarCiudadano(cita.getDni());
            vacuna = vacunaData.buscarVacuna(cita.getLote());
            modelo.addRow(new Object[]{
                cita.getCodCita(),
                cita.getDni(),
                ciudadano.getApellido(),
                ciudadano.getNombre(),
                vacuna.getLote(),
                vacuna.getMarca(),
                vacuna.getMedida(),
                cita.getFechaHoraCita().format(fecha),
                centro.getNombre(),
                cita.isColocada(),
                cita.isCancelada()
            });

        }
    }
    
}
