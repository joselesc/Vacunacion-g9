package vacunacion.g9.vistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.VacunaData;
import vacunacion.g9.entidades.Vacuna;

public class AdministracionVacunasVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f,int c){
        return false;
        }};

    public AdministracionVacunasVista() {
        initComponents();
        armarCabecera();
        listarVacunas();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRColocada = new javax.swing.JRadioButton();
        jTFCuit = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFMedida = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jTFNDeSerie = new javax.swing.JTextField();
        jTFFechaVenc = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListarVac = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setTitle("ADMINISTRACION DE VACUNAS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR VACUNA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("LOTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CUIT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MARCA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("MEDIDA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("FECHA DE VENC.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("STOCK");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("COLOCADA");

        jTFNDeSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNDeSerieActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBModificar.setText("MODIFICAR");

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBEliminar.setText("ELIMINAR");

        jBListar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBListar.setText("LISTAR");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jTListarVac.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTListarVac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "LOTE", "CUIT", "MARCA", "MEDIDA", "FEC DE VENC", "STOCK", "COLOCADA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListarVac.setToolTipText("");
        jScrollPane1.setViewportView(jTListarVac);

        jBAgregar.setBackground(new java.awt.Color(255, 255, 102));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 21));
        jBAgregar.setText("<html>A<br>G<br>R<br>E<br>G<br>A<br>R</html>");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(28, 28, 28)
                                        .addComponent(jRColocada))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFNDeSerie))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(19, 19, 19)
                                            .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(19, 19, 19)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTFFechaVenc)
                                                .addComponent(jTFMedida)
                                                .addComponent(jTFMarca)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jBModificar)
                                                    .addGap(44, 44, 44)
                                                    .addComponent(jBEliminar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBListar))))))
                                .addGap(27, 27, 27)
                                .addComponent(jBAgregar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFFechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jRColocada)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBModificar)
                                    .addComponent(jBEliminar)
                                    .addComponent(jBListar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                    .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        jBAgregar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNDeSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNDeSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNDeSerieActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        try {
            long cuit = Long.parseLong(jTFCuit.getText());
            String marca = jTFMarca.getText();
            double medida = Double.parseDouble(jTFMedida.getText());
            LocalDate fechaCaduca = LocalDate.parse(jTFFechaVenc.getText(), DateTimeFormatter.ISO_DATE);
            int stock = Integer.parseInt(jTFStock.getText());

            // Validación de entrada
            if (cuit > 0 && !marca.isEmpty() && medida > 0 && stock >= 0) {
                boolean colocada = false;
                Vacuna nuevaVacuna = new Vacuna(cuit, marca, medida, fechaCaduca, stock);
                VacunaData vacunaData = new VacunaData();
                vacunaData.insertarVacuna(nuevaVacuna);
                JOptionPane.showMessageDialog(this, "Vacuna agregada exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos en todos los campos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en los campos numéricos");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Error en el formato de fecha");


    }//GEN-LAST:event_jBAgregarActionPerformed
    }
    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed


    }//GEN-LAST:event_jBListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRColocada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCuit;
    private javax.swing.JTextField jTFFechaVenc;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFNDeSerie;
    private javax.swing.JTextField jTFStock;
    private javax.swing.JTable jTListarVac;
    // End of variables declaration//GEN-END:variables

    private void listarVacunas() {
        VacunaData vD = new VacunaData();
        for (Vacuna v : vD.obtenerVacunasDisponibles()) {
            modelo.addRow(new Object[]{
                v.getLote(),
                v.getCuit(),
                v.getMarca(),
                v.getMedida(),
                v.getFechaCaduca(),
                v.getStock(),
                v.isColocada()
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("LOTE");
        modelo.addColumn("CUIT");
        modelo.addColumn("MARCA");
        modelo.addColumn("MEDIDA");
        modelo.addColumn("fEC DE VENC");
        modelo.addColumn("STOCK");
        modelo.addColumn("COLOCADA");
        jTListarVac.setModel(modelo);
    }

}
