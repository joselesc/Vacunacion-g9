package vacunacion.g9.vistas;

import java.awt.Component;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.CitaData;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.accesoADatos.VacunaData;
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.Ciudadano;
import vacunacion.g9.entidades.Vacuna;

public class AdministracionCitas extends javax.swing.JInternalFrame {

    Calendar calendario = Calendar.getInstance();
    java.util.Date fechaMin = calendario.getTime();
 
    CentroData centroData = new CentroData();
    VacunaData vacunaData = new VacunaData();
    CitaData cd = new CitaData();
    CiudadanoData ciudadanoData = new CiudadanoData();
    String zona;

    public AdministracionCitas() {
        initComponents();
        cargarComboBoxCentros();
        cargarComboBoxVacunas();
        jDCFechaCita.setMinSelectableDate(fechaMin);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGZonas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLFechaCita = new javax.swing.JLabel();
        jDCFechaInscripcion = new com.toedter.calendar.JDateChooser();
        jCCentrosDeVacunacion = new javax.swing.JComboBox<>();
        jLCentrosDeVacunacion = new javax.swing.JLabel();
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
        jCTurnosPorDia = new javax.swing.JComboBox<>();
        jCVacunasPorLotes = new javax.swing.JComboBox<>();
        jDCFechaCita = new com.toedter.calendar.JDateChooser();
        jLFechaCita1 = new javax.swing.JLabel();
        jCPrimeraDosis = new javax.swing.JCheckBox();
        jCSegundaDosis = new javax.swing.JCheckBox();
        jCTerceraDosis = new javax.swing.JCheckBox();
        jLFechaCita2 = new javax.swing.JLabel();

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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLFechaCita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita.setText("Fecha incripcion");

        jDCFechaInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        jDCFechaInscripcion.setForeground(new java.awt.Color(0, 23, 31));
        jDCFechaInscripcion.setDateFormatString("yyyy-MM-dd");
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

        jRadioButton2.setBackground(new java.awt.Color(0, 52, 89));
        bGZonas.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Sur");

        jRadioButton3.setBackground(new java.awt.Color(0, 52, 89));
        bGZonas.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Este");

        jRadioButton4.setBackground(new java.awt.Color(0, 52, 89));
        bGZonas.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Oeste");

        jRadioButton5.setBackground(new java.awt.Color(0, 52, 89));
        bGZonas.add(jRadioButton5);
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
        bGZonas.add(jRadioButton6);
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

        jCTurnosPorDia.setBackground(new java.awt.Color(255, 255, 255));
        jCTurnosPorDia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCTurnosPorDia.setForeground(new java.awt.Color(0, 23, 31));
        jCTurnosPorDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30" }));

        jCVacunasPorLotes.setBackground(new java.awt.Color(255, 255, 255));
        jCVacunasPorLotes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCVacunasPorLotes.setForeground(new java.awt.Color(0, 23, 31));

        jDCFechaCita.setBackground(new java.awt.Color(255, 255, 255));
        jDCFechaCita.setForeground(new java.awt.Color(0, 23, 31));
        jDCFechaCita.setDateFormatString("yyyy-MM-dd");
        jDCFechaCita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jDCFechaCita.setMinSelectableDate(new java.util.Date(1696132867000L));

        jLFechaCita1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita1.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita1.setText("Fecha incripcion");

        jCPrimeraDosis.setBackground(new java.awt.Color(0, 52, 89));
        jCPrimeraDosis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCPrimeraDosis.setForeground(new java.awt.Color(255, 255, 255));
        jCPrimeraDosis.setText("0.3 ml");
        jCPrimeraDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPrimeraDosisActionPerformed(evt);
            }
        });

        jCSegundaDosis.setBackground(new java.awt.Color(0, 52, 89));
        jCSegundaDosis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCSegundaDosis.setForeground(new java.awt.Color(255, 255, 255));
        jCSegundaDosis.setText("0.5 ml");
        jCSegundaDosis.setEnabled(false);
        jCSegundaDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSegundaDosisActionPerformed(evt);
            }
        });

        jCTerceraDosis.setBackground(new java.awt.Color(0, 52, 89));
        jCTerceraDosis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCTerceraDosis.setForeground(new java.awt.Color(255, 255, 255));
        jCTerceraDosis.setText("0.9 ml");
        jCTerceraDosis.setEnabled(false);
        jCTerceraDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTerceraDosisActionPerformed(evt);
            }
        });

        jLFechaCita2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLFechaCita2.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaCita2.setText("Vacunas por lote");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(jCCentrosDeVacunacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaCita1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCPrimeraDosis)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLFechaCita2))
                                    .addComponent(jCTerceraDosis)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCSegundaDosis)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCVacunasPorLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLCantidadDeTurnosPorDia1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRDeRiesgo)
                                .addGap(76, 76, 76)
                                .addComponent(jREsencial)
                                .addGap(18, 18, 18)
                                .addComponent(jRMostrarTodosCiudadanos)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCantidadDeTurnosPorDia)
                                    .addComponent(jCTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel1)))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jRadioButton6)
                .addGap(120, 120, 120)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(216, 216, 216)
                .addComponent(jRadioButton4)
                .addGap(106, 106, 106)
                .addComponent(jRadioButton5)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
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
                    .addComponent(jLCantidadDeTurnosPorDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCantidadDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRDeRiesgo)
                    .addComponent(jREsencial)
                    .addComponent(jRMostrarTodosCiudadanos)
                    .addComponent(jCTurnosPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFechaCita1)
                            .addComponent(jCPrimeraDosis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLFechaCita2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCVacunasPorLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCSegundaDosis))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCTerceraDosis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_jCZonasActionPerformed

    private void jCPrimeraDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPrimeraDosisActionPerformed
        habilitarDosis();
    }//GEN-LAST:event_jCPrimeraDosisActionPerformed

    private void jCSegundaDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSegundaDosisActionPerformed
        habilitarDosis();
    }//GEN-LAST:event_jCSegundaDosisActionPerformed

    private void jCTerceraDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTerceraDosisActionPerformed
        habilitarDosis();
    }//GEN-LAST:event_jCTerceraDosisActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<Ciudadano> ciudadanos = new ArrayList<>();
        System.out.println("");
        ciudadanos = ciudadanoData.listarCiudadano2(jDCFechaInscripcion.getDate(), jREsencial.isSelected(), 
                jRDeRiesgo.isSelected(), (String) jCZonas.getSelectedItem());
        for (Ciudadano ciudadano : ciudadanos) {
            System.out.println(ciudadano);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGZonas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Centro> jCCentrosDeVacunacion;
    private javax.swing.JCheckBox jCPrimeraDosis;
    private javax.swing.JCheckBox jCSegundaDosis;
    private javax.swing.JCheckBox jCTerceraDosis;
    private javax.swing.JComboBox<String> jCTurnosPorDia;
    private javax.swing.JComboBox<Vacuna> jCVacunasPorLotes;
    private javax.swing.JComboBox<String> jCZonas;
    private com.toedter.calendar.JDateChooser jDCFechaCita;
    private com.toedter.calendar.JDateChooser jDCFechaInscripcion;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia;
    private javax.swing.JLabel jLCantidadDeTurnosPorDia1;
    private javax.swing.JLabel jLCentrosDeVacunacion;
    private javax.swing.JLabel jLCentrosDeVacunacion1;
    private javax.swing.JLabel jLFechaCita;
    private javax.swing.JLabel jLFechaCita1;
    private javax.swing.JLabel jLFechaCita2;
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
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
            System.out.println("Error " + ex);
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
        ArrayList<Vacuna> vacunas;
        vacunas = (ArrayList<Vacuna>) vacunaData.obtenerVacunasDisponiblesxLote();

        for (Vacuna vacuna : vacunas) {
            modeloCB.addElement(vacuna);
        }
        jCVacunasPorLotes.setModel(modeloCB);
        jCVacunasPorLotes.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Vacuna) {
                    Vacuna vacuna = (Vacuna) value;
                    String nombreCompleto = vacuna.getMarca() + " - " + vacuna.getLote();
                    value = nombreCompleto;
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }

    private void habilitarDosis() {
        if (jCPrimeraDosis.isSelected() && !jCSegundaDosis.isSelected()
                && !jCTerceraDosis.isSelected()) {
            jCSegundaDosis.setEnabled(true);
            jCPrimeraDosis.setEnabled(false);
        } else if (jCPrimeraDosis.isSelected() && jCSegundaDosis.isSelected()
                && !jCTerceraDosis.isSelected()) {
            jCTerceraDosis.setEnabled(true);
            jCSegundaDosis.setEnabled(false);
        } else if (jCTerceraDosis.isSelected()) {
            jCTerceraDosis.setEnabled(false);
        }
    }
    
    
    
    private void fechaMinCita(){}
    
    private void fechaMaxCita(){}
    
}
