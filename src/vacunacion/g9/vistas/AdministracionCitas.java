package vacunacion.g9.vistas;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.CitaData;
import vacunacion.g9.entidades.Centro;

public class AdministracionCitas extends javax.swing.JInternalFrame {

    CentroData centroData = new CentroData();
    String zona;
    public AdministracionCitas() {      
        initComponents();
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLFechaCita = new javax.swing.JLabel();
        jDCFechaCita = new com.toedter.calendar.JDateChooser();
        jCCentrosDeVacunacion = new javax.swing.JComboBox<>();
        jLCentrosDeVacunacion = new javax.swing.JLabel();
        jTCantidadDeTurnosPorDia = new javax.swing.JTextField();
        jLCantidadDeTurnosPorDia = new javax.swing.JLabel();
        jCZonas = new javax.swing.JComboBox<>();
        jLCentrosDeVacunacion1 = new javax.swing.JLabel();
        jRDeRiesgo = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTCantidadDePersonas = new javax.swing.JTextField();
        jLCantidadDeTurnosPorDia1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jREsencial = new javax.swing.JRadioButton();
        jRMostrarTodosCiudadanos = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion Citas");
        jLabel1.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Lote", "Fecha hora", "Centro", "Dosis", "Colocada", "Cancelada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(5);
        }

        jButton1.setBackground(new java.awt.Color(0, 52, 89));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 52, 89));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");

        jButton3.setBackground(new java.awt.Color(0, 52, 89));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modificar");

        jButton4.setBackground(new java.awt.Color(0, 52, 89));
        jButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Agregar");

        jLFechaCita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita.setText("Fecha de cita");

        jDCFechaCita.setBackground(new java.awt.Color(255, 255, 255));
        jDCFechaCita.setForeground(new java.awt.Color(0, 23, 31));
        jDCFechaCita.setDateFormatString("yyyy-MM-dd");
        jDCFechaCita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jDCFechaCita.setMinSelectableDate(new java.util.Date(-62135755133000L));
        jDCFechaCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaCitaPropertyChange(evt);
            }
        });

        jCCentrosDeVacunacion.setBackground(new java.awt.Color(255, 255, 255));
        jCCentrosDeVacunacion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCCentrosDeVacunacion.setForeground(new java.awt.Color(0, 23, 31));

        jLCentrosDeVacunacion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCentrosDeVacunacion.setForeground(new java.awt.Color(255, 255, 255));
        jLCentrosDeVacunacion.setText("Centros de vacunacion");

        jTCantidadDeTurnosPorDia.setBackground(new java.awt.Color(255, 255, 255));
        jTCantidadDeTurnosPorDia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTCantidadDeTurnosPorDia.setForeground(new java.awt.Color(0, 23, 31));

        jLCantidadDeTurnosPorDia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCantidadDeTurnosPorDia.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidadDeTurnosPorDia.setText("Turnos por dia");

        jCZonas.setBackground(new java.awt.Color(255, 255, 255));
        jCZonas.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCZonas.setForeground(new java.awt.Color(0, 23, 31));
        jCZonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Norte", "Sur", "Este", "Oeste" }));
        jCZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCZonasActionPerformed(evt);
            }
        });

        jLCentrosDeVacunacion1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCentrosDeVacunacion1.setForeground(new java.awt.Color(255, 255, 255));
        jLCentrosDeVacunacion1.setText("Zona");

        jRDeRiesgo.setBackground(new java.awt.Color(0, 52, 89));
        jRDeRiesgo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRDeRiesgo.setForeground(new java.awt.Color(255, 255, 255));
        jRDeRiesgo.setText("De riesgo");
        jRDeRiesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDeRiesgoActionPerformed(evt);
            }
        });
        jRDeRiesgo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jRDeRiesgoPropertyChange(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 52, 89));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Sur");

        jRadioButton3.setBackground(new java.awt.Color(0, 52, 89));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Este");

        jRadioButton4.setBackground(new java.awt.Color(0, 52, 89));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Oeste");

        jRadioButton5.setBackground(new java.awt.Color(0, 52, 89));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Todos");

        jTCantidadDePersonas.setEditable(false);
        jTCantidadDePersonas.setBackground(new java.awt.Color(255, 255, 255));
        jTCantidadDePersonas.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTCantidadDePersonas.setForeground(new java.awt.Color(0, 23, 31));

        jLCantidadDeTurnosPorDia1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCantidadDeTurnosPorDia1.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidadDeTurnosPorDia1.setText("Cantidad de personas");

        jRadioButton6.setBackground(new java.awt.Color(0, 52, 89));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Norte");

        jREsencial.setBackground(new java.awt.Color(0, 52, 89));
        jREsencial.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jREsencial.setForeground(new java.awt.Color(255, 255, 255));
        jREsencial.setText("Esencial");
        jREsencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREsencialActionPerformed(evt);
            }
        });
        jREsencial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jREsencialPropertyChange(evt);
            }
        });

        jRMostrarTodosCiudadanos.setBackground(new java.awt.Color(0, 52, 89));
        jRMostrarTodosCiudadanos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRMostrarTodosCiudadanos.setForeground(new java.awt.Color(255, 255, 255));
        jRMostrarTodosCiudadanos.setText("Todos");
        jRMostrarTodosCiudadanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMostrarTodosCiudadanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCantidadDeTurnosPorDia1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRDeRiesgo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jREsencial)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRMostrarTodosCiudadanos))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCantidadDeTurnosPorDia)
                            .addComponent(jTCantidadDeTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaCita))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCentrosDeVacunacion1)
                                    .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCentrosDeVacunacion)
                                    .addComponent(jCCentrosDeVacunacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jRadioButton6)
                        .addGap(142, 142, 142)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4)
                        .addGap(126, 126, 126)
                        .addComponent(jRadioButton5)
                        .addGap(45, 45, 45))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLFechaCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLCentrosDeVacunacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCCentrosDeVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLCentrosDeVacunacion1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantidadDeTurnosPorDia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRDeRiesgo)
                            .addComponent(jREsencial)
                            .addComponent(jRMostrarTodosCiudadanos)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantidadDeTurnosPorDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCantidadDeTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton6)
                        .addComponent(jRadioButton5)
                        .addComponent(jRadioButton4)
                        .addComponent(jRadioButton2))
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void jDCFechaCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFechaCitaPropertyChange
        jRMostrarTodosCiudadanos.setSelected(true);
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jDCFechaCitaPropertyChange

    private void jRDeRiesgoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jRDeRiesgoPropertyChange
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jRDeRiesgoPropertyChange

    private void jREsencialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jREsencialPropertyChange
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jREsencialPropertyChange

    private void jRDeRiesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDeRiesgoActionPerformed
        if (jRDeRiesgo.isSelected()) {
            jRMostrarTodosCiudadanos.setSelected(false);
        }
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jRDeRiesgoActionPerformed

    private void jREsencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREsencialActionPerformed
        if (jREsencial.isSelected()) {
            jRMostrarTodosCiudadanos.setSelected(false);
        }
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jREsencialActionPerformed

    private void jRMostrarTodosCiudadanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMostrarTodosCiudadanosActionPerformed
        if (jRMostrarTodosCiudadanos.isSelected()) {
            jRDeRiesgo.setSelected(false);
            jREsencial.setSelected(false);
        }
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jRMostrarTodosCiudadanosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            this.dispose();
//            AdministracionVista volver = new AdministracionVista();
//            volver.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCZonasActionPerformed
        cargarCantidadDeCiudadanos();
        cargarComboBox();
    }//GEN-LAST:event_jCZonasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Centro> jCCentrosDeVacunacion;
    private javax.swing.JComboBox<String> jCZonas;
    private com.toedter.calendar.JDateChooser jDCFechaCita;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia1;
    private javax.swing.JLabel jLCentrosDeVacunacion;
    private javax.swing.JLabel jLCentrosDeVacunacion1;
    private javax.swing.JLabel jLFechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRDeRiesgo;
    private javax.swing.JRadioButton jREsencial;
    private javax.swing.JRadioButton jRMostrarTodosCiudadanos;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCantidadDePersonas;
    private javax.swing.JTextField jTCantidadDeTurnosPorDia;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private void cargarCantidadDeCiudadanos() {
        zona = (String) jCZonas.getSelectedItem();
        CitaData cd = new CitaData();
        java.util.Date fecha = jDCFechaCita.getDate();//solo lo aceptaba de esta manera
        try {
            if (fecha != null) {
                if (!jRMostrarTodosCiudadanos.isSelected()) {
                    if (jREsencial.isSelected() && jRDeRiesgo.isSelected()) {
                        jTCantidadDePersonas.setText(Integer.toString(cd.conteoCiudadanoPorDia(fecha, true, true, zona)));
                    } else if (!jREsencial.isSelected() && !jRDeRiesgo.isSelected()) {
                        jTCantidadDePersonas.setText(Integer.toString(cd.conteoCiudadanoPorDia(fecha, false, false, zona)));
                    } else if (jREsencial.isSelected() && !jRDeRiesgo.isSelected()) {
                        jTCantidadDePersonas.setText(Integer.toString(cd.conteoCiudadanoPorDia(fecha, true, false, zona)));
                    } else if (!jREsencial.isSelected() && jRDeRiesgo.isSelected()) {
                        jTCantidadDePersonas.setText(Integer.toString(cd.conteoCiudadanoPorDia(fecha, false, true, zona)));
                    }
                } else {
                    jTCantidadDePersonas.setText(Integer.toString(cd.conteoTodosLosCiudadano(fecha, zona)));
                }
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    private void cargarComboBox() {
        DefaultComboBoxModel<Centro> modeloCB = new DefaultComboBoxModel<>();
        ArrayList<Centro> centros;
        centros = (ArrayList<Centro>) centroData.listarCentros(zona);
        
        for (Centro centro : centros) {
            modeloCB.addElement(centro);
        }
        jCCentrosDeVacunacion.setModel(modeloCB);
        jCCentrosDeVacunacion.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Centro) {
                    Centro centro = (Centro) value;
                    String nombreCompleto = centro.getZona() + " - " + centro.getNombre() + ", " + centro.getDireccion();
                    value = nombreCompleto;
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }

}
