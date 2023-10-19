package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.entidades.Centro;

public class AdministracionCentrosVacunacion extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    CentroData centro = new CentroData();

    public AdministracionCentrosVacunacion() {
        initComponents();
        cabecera();
        cargarDatosATabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCentrosVacunacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRSur = new javax.swing.JRadioButton();
        jREste = new javax.swing.JRadioButton();
        jRNorte = new javax.swing.JRadioButton();
        jROeste = new javax.swing.JRadioButton();
        jRTodos = new javax.swing.JRadioButton();
        jRDepositoCentral = new javax.swing.JRadioButton();
        jBCerrar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLDireccion = new javax.swing.JLabel();
        jTDireccion = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jCZona = new javax.swing.JComboBox<>();
        jCEstado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jTCentrosVacunacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono", "Zona", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCentrosVacunacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCentrosVacunacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCentrosVacunacion);
        if (jTCentrosVacunacion.getColumnModel().getColumnCount() > 0) {
            jTCentrosVacunacion.getColumnModel().getColumn(0).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTCentrosVacunacion.getColumnModel().getColumn(1).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(2).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(3).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(4).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(5).setResizable(false);
            jTCentrosVacunacion.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Centros de vacunacion");

        buttonGroup1.add(jRSur);
        jRSur.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRSur.setForeground(new java.awt.Color(255, 255, 255));
        jRSur.setText("Sur");
        jRSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSurActionPerformed(evt);
            }
        });

        buttonGroup1.add(jREste);
        jREste.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jREste.setForeground(new java.awt.Color(255, 255, 255));
        jREste.setText("Este");
        jREste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREsteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRNorte);
        jRNorte.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRNorte.setForeground(new java.awt.Color(255, 255, 255));
        jRNorte.setText("Norte");
        jRNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNorteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jROeste);
        jROeste.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jROeste.setForeground(new java.awt.Color(255, 255, 255));
        jROeste.setText("Oeste");
        jROeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jROesteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRTodos);
        jRTodos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRTodos.setForeground(new java.awt.Color(255, 255, 255));
        jRTodos.setText("Todos");
        jRTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRDepositoCentral);
        jRDepositoCentral.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRDepositoCentral.setForeground(new java.awt.Color(255, 255, 255));
        jRDepositoCentral.setText("Deposito central");
        jRDepositoCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDepositoCentralActionPerformed(evt);
            }
        });

        jBCerrar.setBackground(new java.awt.Color(0, 126, 167));
        jBCerrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(0, 126, 167));
        jBAgregar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 126, 167));
        jBModificar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(0, 126, 167));
        jBEliminar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("Nombre *");

        jTNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTNombre.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(0, 23, 31));

        jLDireccion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLDireccion.setText("Direcion *");

        jTDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jTDireccion.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(0, 23, 31));

        jLTelefono.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLTelefono.setText("Telefono *");

        jTTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTTelefono.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTTelefono.setForeground(new java.awt.Color(0, 23, 31));

        jCZona.setBackground(new java.awt.Color(255, 255, 255));
        jCZona.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCZona.setForeground(new java.awt.Color(0, 23, 31));
        jCZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito Central", "Norte", "Sur", "Este", "Oeste" }));
        jCZona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCEstado.setForeground(new java.awt.Color(255, 255, 255));
        jCEstado.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zona *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDireccion)
                                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jCZona, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jRDepositoCentral)
                .addGap(18, 18, 18)
                .addComponent(jRNorte)
                .addGap(18, 18, 18)
                .addComponent(jRSur)
                .addGap(18, 18, 18)
                .addComponent(jREste)
                .addGap(18, 18, 18)
                .addComponent(jROeste)
                .addGap(18, 18, 18)
                .addComponent(jRTodos)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLDireccion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCEstado)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBAgregar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRSur)
                    .addComponent(jREste)
                    .addComponent(jRNorte)
                    .addComponent(jROeste)
                    .addComponent(jRTodos)
                    .addComponent(jRDepositoCentral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBCerrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            this.dispose();
//            AdministracionVista volver = new AdministracionVista();
//            volver.setVisible(true);
        }
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jRNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNorteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRNorteActionPerformed

    private void jRSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSurActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRSurActionPerformed

    private void jREsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREsteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jREsteActionPerformed

    private void jROesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jROesteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jROesteActionPerformed

    private void jRDepositoCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDepositoCentralActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRDepositoCentralActionPerformed

    private void jRTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodosActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRTodosActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        try {
            String nombre = jTNombre.getText();
            String direccion = jTDireccion.getText();
            int telefono = Integer.parseInt(jTTelefono.getText());
            String zona = (String) jCZona.getSelectedItem();
            Boolean estado = jCEstado.isSelected();
            if (jTNombre.getText().isEmpty() || jTDireccion.getText().isEmpty() || jTTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay campos vacios");
            } else {
                Centro c = new Centro(nombre, direccion, telefono, zona, estado);
                CentroData cd = new CentroData();
                cd.agregarCentro(c);
                limpiar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Formato no valido \n" + ex);
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try {
            int filaS = jTCentrosVacunacion.getSelectedRow();   
            int id = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 0).toString());
            String nombre = jTNombre.getText();//jTCentrosVacunacion.getValueAt(filaS, 1).toString();
            String direccion = jTDireccion.getText();//jTCentrosVacunacion.getValueAt(filaS, 2).toString();
            int telefono = Integer.parseInt(jTTelefono.getText());//Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 3).toString());
            String zona = (String) jCZona.getSelectedItem();//jTCentrosVacunacion.getValueAt(filaS, 4).toString();
            boolean activo = jCEstado.isSelected();//Boolean.parseBoolean(jTCentrosVacunacion.getValueAt(filaS, 5).toString());
            Centro c = new Centro(id, nombre, direccion, telefono, zona, activo);
            centro.modificarCentro(c);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal \n" + ex);
        } finally {
            cargarDatosATabla();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "Realmente quieres eliminar el centro?", "Selecciona una opcion ", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == 0) {
                int filaS = jTCentrosVacunacion.getSelectedRow();
                int id = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 0).toString());
                centro.eliminarCentro(id);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal \n" + ex);
        } finally {
            cargarDatosATabla();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTCentrosVacunacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCentrosVacunacionMouseClicked
        int filaS = jTCentrosVacunacion.getSelectedRow();
           String nombre = jTCentrosVacunacion.getValueAt(filaS, 1).toString();
        String direccion = jTCentrosVacunacion.getValueAt(filaS, 2).toString();
        int telefono = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 3).toString());
        String zona = jTCentrosVacunacion.getValueAt(filaS, 4).toString();
        boolean activo = Boolean.parseBoolean(jTCentrosVacunacion.getValueAt(filaS, 5).toString());
        jTNombre.setText(nombre);
        jTDireccion.setText(direccion);
        jTTelefono.setText(Integer.toString(telefono));
        jCZona.setSelectedItem(zona);
        jCEstado.setSelected(activo);
    }//GEN-LAST:event_jTCentrosVacunacionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JCheckBox jCEstado;
    private javax.swing.JComboBox<String> jCZona;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRDepositoCentral;
    private javax.swing.JRadioButton jREste;
    private javax.swing.JRadioButton jRNorte;
    private javax.swing.JRadioButton jROeste;
    private javax.swing.JRadioButton jRSur;
    private javax.swing.JRadioButton jRTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTCentrosVacunacion;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
    private void cabecera() {
        modelo = (DefaultTableModel) jTCentrosVacunacion.getModel();
    }

    private void limpiar() {
        jTNombre.setText("");
        jTDireccion.setText("");
        jTTelefono.setText("");
    }

    private void cargarDatosATabla() {
        if (!jRTodos.isSelected() && !jRNorte.isSelected() && !jRSur.isSelected()
                && !jREste.isSelected() && !jROeste.isSelected() && !jRDepositoCentral.isSelected()) {
            jRTodos.setSelected(true);
        }
        modelo.setRowCount(0);
        if (jRTodos.isSelected()) {
            for (Centro c : centro.listarCentros()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        } else if (jRNorte.isSelected()) {
            for (Centro c : centro.listarCentrosNorte()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        } else if (jRSur.isSelected()) {
            for (Centro c : centro.listarCentrosSur()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        } else if (jREste.isSelected()) {
            for (Centro c : centro.listarCentrosEste()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        } else if (jROeste.isSelected()) {
            for (Centro c : centro.listarCentrosOeste()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        } else if (jRDepositoCentral.isSelected()) {
            for (Centro c : centro.listarCentrosDepositoCentral()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNombre(),
                    c.getDireccion(),
                    c.getTelefono(),
                    c.getZona(),
                    c.isActivo()});
            }
        }
    }

}
