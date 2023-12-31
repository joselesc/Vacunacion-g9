package vacunacion.g9.vistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.LaboratorioData;
import vacunacion.g9.accesoADatos.VacunaData;
import vacunacion.g9.entidades.Vacuna;

public class AdministracionVacunasVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    LaboratorioData laboratorios = new LaboratorioData();
    VacunaData vd = new VacunaData();
//    private int lote;

    public AdministracionVacunasVista() {
        initComponents();
        armarCabecera();
        listarVacunas();
//        cargarComboBox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFMarca = new javax.swing.JTextField();
        jTFMedida = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jTFLote = new javax.swing.JTextField();
        jTFFechaVenc = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListarVac = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTFCuit = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setBackground(new java.awt.Color(0, 52, 89));
        setForeground(new java.awt.Color(255, 255, 255));
        setTitle("ADMINISTRACION DE VACUNAS");

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR VACUNA");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("LOTE");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CUIT");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MARCA");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("MEDIDA");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("FECHA DE VENC.");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("STOCK");

        jTFMarca.setForeground(new java.awt.Color(0, 23, 3));

        jTFMedida.setForeground(new java.awt.Color(0, 23, 3));

        jTFStock.setForeground(new java.awt.Color(0, 23, 3));

        jTFLote.setForeground(new java.awt.Color(0, 23, 3));
        jTFLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLoteActionPerformed(evt);
            }
        });

        jTFFechaVenc.setForeground(new java.awt.Color(0, 23, 3));

        jBModificar.setBackground(new java.awt.Color(0, 126, 167));
        jBModificar.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("MODIFICAR");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(0, 126, 167));
        jBEliminar.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTListarVac.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTListarVac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LOTE", "CUIT", "MARCA", "MEDIDA", "FEC DE VENC", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListarVac.setToolTipText("");
        jTListarVac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListarVacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTListarVac);

        jBAgregar.setBackground(new java.awt.Color(0, 126, 167));
        jBAgregar.setFont(new java.awt.Font("Consolas", 1, 21));
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("<html>A<br>G<br>R<br>E<br>G<br>A<br>R</html>");
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 126, 167));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALIR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTFCuit.setForeground(new java.awt.Color(0, 23, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFLote))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTFFechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jBModificar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBEliminar)))
                                            .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFFechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );

        jBAgregar.getAccessibleContext().setAccessibleName("");

        setJMenuBar(jMenuBar1);

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

    private void jTFLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLoteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        String loteText = jTFLote.getText().trim(); // Elimina espacios en blanco en el número de lote
        String cuitText = jTFCuit.getText().trim(); // Elimina espacios en blanco en el CUIT
        String marca = jTFMarca.getText();
        String medidaText = jTFMedida.getText();
        String fechaVenc = jTFFechaVenc.getText();
        String stockText = jTFStock.getText();
//        boolean colocada = jRColocada.isSelected();

        // Validación de entrada
        if (loteText.isEmpty() || cuitText.isEmpty() || marca.isEmpty() || medidaText.isEmpty() || fechaVenc.isEmpty() || stockText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "POR FAVOR, COMPLETE TODOS LOS CAMPOS!!!.");
        } else {
            try {
                int lote = Integer.parseInt(loteText);
                Long cuit = Long.parseLong(cuitText);
                double medida = Double.parseDouble(medidaText);
                LocalDate fechaCaduca = LocalDate.parse(fechaVenc, DateTimeFormatter.ISO_DATE);
                int stock = Integer.parseInt(stockText);

                // Verificar si el lote y el CUIT existen en la tabla de vacunas antes de insertar.
                if (laboratorios.existeCuit(cuit) && !vd.existeLote(lote)) {
                    Vacuna nuevaVacuna = new Vacuna(lote, cuit, marca, medida, fechaCaduca, stock);
                    vd.insertarVacuna(nuevaVacuna);
                    JOptionPane.showMessageDialog(this, "VACUNA AGREGADA CON ÉXITO.");
                    listarVacunas();
                    limpiarcampos();
                } else {
                    if (vd.existeLote(lote)) {
                        JOptionPane.showMessageDialog(this, "EL NÚMERO DE LOTE ESTÁ EN USO.");
                    } else {
                        JOptionPane.showMessageDialog(this, "EL CUIT NO CORRESPONDE A UN LABORATORIO EXISTENTE.");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en los campos numéricos.");
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Error en el formato de fecha.");
            }
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        String loteText = jTFLote.getText().trim();//elimina espacios cargados accidentalmente        
        if (loteText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NUMERO DE LOTE VACIO Y/O INVALIDO");
            return; // Detener la operación si el campo está vacío.
        }
        // Convertir el valor del campo a un número de lote.
        int lote = 0;
        try {
            lote = Integer.parseInt(loteText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "NUMERO DE LOTE VACIO Y/O INVALIDO");
            return; // Detener la operación si el número de lote no es válido.
        }
        // Confirmar la eliminación con el usuario.
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA ELIMINAR LA VACUNA DEL LOTE  " + lote + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {//CONFIRMA EL MSJ DE SI ELIMINAR
            // Llamar al método para eliminar la vacuna en VacunaData.
            VacunaData vd = new VacunaData();
            vd.eliminarVacuna(lote);
            // Actualizar la lista de vacunas.
            listarVacunas();
            limpiarcampos();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTListarVacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListarVacMouseClicked
        int filaS = jTListarVac.getSelectedRow();
        int lote = Integer.parseInt(jTListarVac.getValueAt(filaS, 0).toString());
        long cuit = Long.parseLong(jTListarVac.getValueAt(filaS, 1).toString());
        String marca = jTListarVac.getValueAt(filaS, 2).toString();
        double medida = Double.parseDouble(jTListarVac.getValueAt(filaS, 3).toString());
        LocalDate fechaDeVen = LocalDate.parse(jTListarVac.getValueAt(filaS, 4).toString());
        int stock = Integer.parseInt(jTListarVac.getValueAt(filaS, 5).toString());
//        boolean activo = Boolean.parseBoolean(jTListarVac.getValueAt(filaS, 6).toString());
        jTFLote.setText(Integer.toString(lote));
        jTFCuit.setText(Long.toString(cuit));
        jTFMarca.setText(marca);
        jTFMedida.setText(Double.toString(medida));
        jTFFechaVenc.setText(fechaDeVen.toString());
        jTFStock.setText(Integer.toString(stock));
//        jRColocada.setSelected(activo);
    }//GEN-LAST:event_jTListarVacMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        int filaS = jTListarVac.getSelectedRow();
        if (filaS == -1) {
            // No se ha seleccionado ninguna fila para modificar.
            JOptionPane.showMessageDialog(this, "VACUNA SE MODIFICA SOLO POR SELECCION DE TABLA .");
            return;
        }

        long cuit = Long.parseLong(jTFCuit.getText());
        String marca = jTFMarca.getText();
        double medida = Double.parseDouble(jTFMedida.getText());
        LocalDate fechaCaduca = LocalDate.parse(jTFFechaVenc.getText(), DateTimeFormatter.ISO_DATE);
        int stock = Integer.parseInt(jTFStock.getText());
//        boolean colocada = jRColocada.isSelected();

        // Validación de entrada
        if (cuit > 0 && !marca.isEmpty() && medida > 0 && stock >= 0) {
            // Obtén el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) jTListarVac.getModel();

            // Modifica los valores de la fila seleccionada
            model.setValueAt(cuit, filaS, 1);
            model.setValueAt(marca, filaS, 2);
            model.setValueAt(medida, filaS, 3);
            model.setValueAt(fechaCaduca, filaS, 4);
            model.setValueAt(stock, filaS, 5);
//            model.setValueAt(colocada, filaS, 6);

            // Actualiza la vista de la tabla
            jTListarVac.setModel(model);

            JOptionPane.showMessageDialog(this, "VACUNA MODIFICADA EXITOSAMENTE!!!.");
            limpiarcampos();
        } else {
            JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE DATOS VALIDOS EN TODOS LOS CAMPOS!!!.");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCuit;
    private javax.swing.JTextField jTFFechaVenc;
    private javax.swing.JTextField jTFLote;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFStock;
    private javax.swing.JTable jTListarVac;
    // End of variables declaration//GEN-END:variables

    private void listarVacunas() {
        VacunaData vD = new VacunaData();
        DefaultTableModel model = (DefaultTableModel) jTListarVac.getModel();

        // Eliminar todas las filas existentes en la tabla
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        // Obtener las vacunas disponibles y agregarlas a la tabla
        for (Vacuna v : vD.obtenerVacunasDisponibles()) {
            model.addRow(new Object[]{
                v.getLote(),
                v.getCuit(),
                v.getMarca(),
                v.getMedida(),
                v.getFechaCaduca(),
                v.getStock(),
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("LOTE");
        modelo.addColumn("CUIT");
        modelo.addColumn("MARCA");
        modelo.addColumn("MEDIDA");
        modelo.addColumn("FEC DE VENC");
        modelo.addColumn("STOCK");
//        modelo.addColumn("COLOCADA");
        jTListarVac.setModel(modelo);
    }

    public void limpiarcampos() {
        jTFCuit.setText("");
        jTFFechaVenc.setText("");
        jTFLote.setText("");
        jTFMarca.setText("");
        jTFMedida.setText("");
        jTFStock.setText("");
//        jRColocada.setSelected(false);
    }

////    private void cargarComboBox() {
//        DefaultComboBoxModel<Laboratorio> modeloL = new DefaultComboBoxModel<>();
//
//        List<Laboratorio> laboratorios = this.laboratorios.listarLaboratorio();
//        for (Laboratorio laboratorio : laboratorios) {
//            modeloL.addElement(laboratorio);
//        }
//        jCCuit.setModel(modeloL);
//        jCCuit.setRenderer(new DefaultListCellRenderer() {
//
//            @Override
//            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
//                if (value instanceof Laboratorio) {
//                    Laboratorio laboratorio = (Laboratorio) value;
//                    long nombreCompleto = laboratorio.getCuit();
//                    value = nombreCompleto;
//                    System.out.println(nombreCompleto);
//                }
//                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
//            }
//        });
//    }
}
