package vacunacion.g9.vistas;

import java.awt.Component;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
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

public class AdministracionCitas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    Calendar calendario = Calendar.getInstance();
    java.util.Date fechaMin = calendario.getTime();

    CentroData centroData = new CentroData();
    VacunaData vacunaData = new VacunaData();
    CitaData citaData = new CitaData();
    CiudadanoData ciudadanoData = new CiudadanoData();
    String zona;

    public AdministracionCitas() {
        initComponents();
        cabecera();
        cargarDatosTabla();
        cargarComboBoxCentros();
        cargarComboBoxVacunas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListadoDeCitas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jLFechaCita = new javax.swing.JLabel();
        jDCFechaInscripcion = new com.toedter.calendar.JDateChooser();
        jCCentrosDeVacunacion = new javax.swing.JComboBox<>();
        jLCentrosDeVacunacion = new javax.swing.JLabel();
        jLCantidadDeTurnosPorDia = new javax.swing.JLabel();
        jCZonas = new javax.swing.JComboBox<>();
        jLCentrosDeVacunacion1 = new javax.swing.JLabel();
        jRDeRiesgo = new javax.swing.JRadioButton();
        jTCantidadDePersonas = new javax.swing.JTextField();
        jLCantidadDeTurnosPorDia1 = new javax.swing.JLabel();
        jREsencial = new javax.swing.JRadioButton();
        jRMostrarTodosCiudadanos = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jCTurnosPorDia = new javax.swing.JComboBox<>();
        jCVacunasPorLotes = new javax.swing.JComboBox<>();
        jLFechaCita2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion Citas");
        jLabel1.setToolTipText("");

        jTListadoDeCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre", "Lote", "Marca", "Dosis", "Fecha y Hora", "Centro", "Colocada", "Cancelada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(jTListadoDeCitas);
        if (jTListadoDeCitas.getColumnModel().getColumnCount() > 0) {
            jTListadoDeCitas.getColumnModel().getColumn(0).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTListadoDeCitas.getColumnModel().getColumn(1).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTListadoDeCitas.getColumnModel().getColumn(2).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(3).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(4).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTListadoDeCitas.getColumnModel().getColumn(5).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(6).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(6).setPreferredWidth(5);
            jTListadoDeCitas.getColumnModel().getColumn(7).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(8).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(9).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(9).setPreferredWidth(10);
            jTListadoDeCitas.getColumnModel().getColumn(10).setResizable(false);
            jTListadoDeCitas.getColumnModel().getColumn(10).setPreferredWidth(10);
        }

        jButton1.setBackground(new java.awt.Color(0, 126, 167));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 126, 167));
        jBAgregar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLFechaCita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita.setText("Fecha incripcion");

        jDCFechaInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        jDCFechaInscripcion.setForeground(new java.awt.Color(0, 23, 31));
        jDCFechaInscripcion.setDateFormatString("dd/MM/yyyy");
        jDCFechaInscripcion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jDCFechaInscripcion.setMinSelectableDate(new java.util.Date(-62135755133000L));
        jDCFechaInscripcion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaInscripcionPropertyChange(evt);
            }
        });

        jCCentrosDeVacunacion.setBackground(new java.awt.Color(255, 255, 255));
        jCCentrosDeVacunacion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCCentrosDeVacunacion.setForeground(new java.awt.Color(0, 23, 31));

        jLCentrosDeVacunacion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCentrosDeVacunacion.setForeground(new java.awt.Color(255, 255, 255));
        jLCentrosDeVacunacion.setText("Centros de vacunacion");

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

        jTCantidadDePersonas.setEditable(false);
        jTCantidadDePersonas.setBackground(new java.awt.Color(255, 255, 255));
        jTCantidadDePersonas.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTCantidadDePersonas.setForeground(new java.awt.Color(0, 23, 31));

        jLCantidadDeTurnosPorDia1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLCantidadDeTurnosPorDia1.setForeground(new java.awt.Color(255, 255, 255));
        jLCantidadDeTurnosPorDia1.setText("Cantidad de personas");

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

        jCTurnosPorDia.setBackground(new java.awt.Color(255, 255, 255));
        jCTurnosPorDia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCTurnosPorDia.setForeground(new java.awt.Color(0, 23, 31));
        jCTurnosPorDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30" }));

        jCVacunasPorLotes.setBackground(new java.awt.Color(255, 255, 255));
        jCVacunasPorLotes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCVacunasPorLotes.setForeground(new java.awt.Color(0, 23, 31));

        jLFechaCita2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita2.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita2.setText("Vacunas por lote");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCFechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaCita))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCentrosDeVacunacion1)
                                    .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCentrosDeVacunacion)
                                    .addComponent(jCCentrosDeVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCantidadDeTurnosPorDia1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRDeRiesgo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jREsencial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRMostrarTodosCiudadanos)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCantidadDeTurnosPorDia)
                                    .addComponent(jCTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCVacunasPorLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaCita2))))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
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
                        .addComponent(jDCFechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLCentrosDeVacunacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCCentrosDeVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLCentrosDeVacunacion1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCantidadDeTurnosPorDia1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCantidadDeTurnosPorDia)
                        .addComponent(jLFechaCita2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCVacunasPorLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRDeRiesgo)
                        .addComponent(jREsencial)
                        .addComponent(jRMostrarTodosCiudadanos)
                        .addComponent(jCTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregar)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDCFechaInscripcionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFechaInscripcionPropertyChange
        jRMostrarTodosCiudadanos.setSelected(true);
        cargarCantidadDeCiudadanos();
    }//GEN-LAST:event_jDCFechaInscripcionPropertyChange

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
        cargarComboBoxCentros();
        cargarDatosTabla();
    }//GEN-LAST:event_jCZonasActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        List<Ciudadano> ciudadanos = new ArrayList<>();
        ciudadanos = ciudadanoData.listarCiudadano2(jDCFechaInscripcion.getDate(), jREsencial.isSelected(),
                jRDeRiesgo.isSelected(), (String) jCZonas.getSelectedItem(), jRMostrarTodosCiudadanos.isSelected());
        int selectedValue = Integer.parseInt((String) jCTurnosPorDia.getSelectedItem());
        Vacuna vacunaSeleccionada = (Vacuna) jCVacunasPorLotes.getSelectedItem();
        Centro centroSeleccionada = (Centro) jCCentrosDeVacunacion.getSelectedItem();
        int cantTurnos = selectedValue;
        int contador = 0;
        if (jCZonas.getSelectedItem().toString().equals("Todos")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una zona");
        } else {
            for (Ciudadano ciudadano : ciudadanos) {
                contador++;
                if (contador > cantTurnos) {
                    break;
                }
                citaData.agregarCita(ciudadano, vacunaSeleccionada, jCZonas.getSelectedItem().toString(), centroSeleccionada, jDCFechaInscripcion.getDate());
            }
        }
        cargarDatosTabla();
    }//GEN-LAST:event_jBAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Centro> jCCentrosDeVacunacion;
    private javax.swing.JComboBox<String> jCTurnosPorDia;
    private javax.swing.JComboBox<Vacuna> jCVacunasPorLotes;
    private javax.swing.JComboBox<String> jCZonas;
    private com.toedter.calendar.JDateChooser jDCFechaInscripcion;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia1;
    private javax.swing.JLabel jLCentrosDeVacunacion;
    private javax.swing.JLabel jLCentrosDeVacunacion1;
    private javax.swing.JLabel jLFechaCita;
    private javax.swing.JLabel jLFechaCita2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRDeRiesgo;
    private javax.swing.JRadioButton jREsencial;
    private javax.swing.JRadioButton jRMostrarTodosCiudadanos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCantidadDePersonas;
    private javax.swing.JTable jTListadoDeCitas;
    // End of variables declaration//GEN-END:variables
    private void cabecera() {
        modelo = (DefaultTableModel) jTListadoDeCitas.getModel();
    }
 
    private void cargarDatosTabla() {
        modelo.setRowCount(0);
        Centro centro = new Centro();
        Ciudadano ciudadano = new Ciudadano();
        Vacuna vacuna = new Vacuna();
        boolean bandera = false;
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

    private void cargarCantidadDeCiudadanos() {
        zona = (String) jCZonas.getSelectedItem();
        CitaData cd = new CitaData();
        java.util.Date fecha = jDCFechaInscripcion.getDate();//solo lo aceptaba de esta manera
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
            JOptionPane.showMessageDialog(null, "Error al cargar ciudadanos");
        }
    }

    private void cargarComboBoxCentros() {
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

    private void cargarComboBoxVacunas() {
        DefaultComboBoxModel<Vacuna> modeloCB = new DefaultComboBoxModel<>();
        ArrayList<Vacuna> vacunas = (ArrayList<Vacuna>) vacunaData.obtenerVacunasDisponiblesxLote();

        for (int i = 0; i < 4 && i < vacunas.size(); i++) {
            Vacuna vacuna = vacunas.get(i);
            modeloCB.addElement(vacuna);
        }
        jCVacunasPorLotes.setModel(modeloCB);
        jCVacunasPorLotes.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Vacuna) {
                    Vacuna vacuna = (Vacuna) value;
                    String nombreCompleto = vacuna.getLote() + ". " + vacuna.getMarca();
                    value = nombreCompleto;
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }

}
