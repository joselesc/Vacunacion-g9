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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Aplicado");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("No aplicado");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Cancelado");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                        .addGap(296, 296, 296)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1)))
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
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
        for (CitaVacunacion cita : citaData.listarCitas()) {
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
