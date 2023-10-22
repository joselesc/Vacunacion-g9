/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.LaboratorioData;
import vacunacion.g9.entidades.Laboratorio;

/**
 *
 * @author jfaja
 */
public class LaboratorioVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public LaboratorioVista() {
        initComponents();
        armarCabecera();
        listarLaboratorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTlistarLab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCuit = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFnomComercial = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTlistarLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CUIT", "NOM LAB", "PAIS", "DOM COMERCIAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTlistarLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTlistarLabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTlistarLab);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADMINISTRAR LABORATORIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CUIT:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PAIS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOM. COMERCIAL");

        jTFCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCuitActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(255, 255, 204));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBAgregar.setText("<html>A<br>G<br>R<br>E<br>G<br>A<br>R</html>");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(255, 255, 204));
        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(255, 255, 204));
        jBModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBModificar.setText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 204));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 51, 51));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jBEliminar)
                .addGap(94, 94, 94)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpiar)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCuit)
                            .addComponent(jTFNombre)
                            .addComponent(jTFPais)
                            .addComponent(jTFnomComercial, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addComponent(jTFnomComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCuitActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        long cuit = 0;
        String NomLaboratorio = jTFNombre.getText();
        String pais = jTFPais.getText();
        String DomComercial = jTFnomComercial.getText();

        try {
            cuit = Long.parseLong(jTFCuit.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El CUIT DEBE SER UN NUMERO VALIDO!!.");
            return;
        }

        if (NomLaboratorio.isEmpty() || pais.isEmpty() || DomComercial.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados.");
            return;

        } else {
            // Realiza la validación del CUIT en la base de datos
            LaboratorioData ld = new LaboratorioData();
            if (ld.existeCuit(cuit)) {
                JOptionPane.showMessageDialog(this, "LABORATORIO INEXISTENTE!!!");
                return;// Si llegamos aquí, todos los valores son válidos
            }
            Laboratorio nl = new Laboratorio(cuit, NomLaboratorio, pais, DomComercial);
            ld.guardarLaboratorio(nl);
            JOptionPane.showMessageDialog(this, "LABORATORIO AGREGADO!!!");
            limpiar();
//            listarLaboratorio();
            limpiartablaLaboratorio();

    }//GEN-LAST:event_jBAgregarActionPerformed
    }
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        long cuit = 0;
        String NomLaboratorio = jTFNombre.getText();
        String pais = jTFPais.getText();
        String DomComercial = jTFnomComercial.getText();

        try {
            cuit = Long.parseLong(jTFCuit.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El CUIT DEBE SER UN NUMERO VALIDO!!."+e.getMessage());
            return;
        }

        if (NomLaboratorio.isEmpty() || pais.isEmpty() || DomComercial.isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN SER COMPLETADOS!!.");
            return;
        } else {
//            // Realiza la validación del CUIT en la base de datos
            LaboratorioData ld = new LaboratorioData();
//            if (ld.existeCuit(cuit)) {
//                JOptionPane.showMessageDialog(this, "El CUIT ya existe en la base de datos. No se puede modificar.");
//                return;
//            }

            // Si el CUIT no existe en la base de datos, continúa con la modificación
            Laboratorio nl = new Laboratorio(cuit, NomLaboratorio, pais, DomComercial);
            ld.modificar(nl);
            JOptionPane.showMessageDialog(this, "LABORATORIO MODIFICADO!!!");
            limpiar();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        long cuit = 0;

        try {
            cuit = Long.parseLong(jTFCuit.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El CUIT DEBE SER UN NUMERO VALIDO!!.");
            return;
        }

        LaboratorioData ld = new LaboratorioData();
        Laboratorio laboratorio = ld.buscarLaboratorioxCuit(cuit);

        if (laboratorio != null) {
            ld.eliminar(cuit); // Llama al método

            limpiar();
//        listarLaboratorio();
            limpiartablaLaboratorio();
        } else {
            JOptionPane.showMessageDialog(this, "LABORATORIO INEXISTENTE!!!");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTlistarLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTlistarLabMouseClicked
//           @Override

        int filaSeleccionada = jTlistarLab.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
            Object cuit = jTlistarLab.getValueAt(filaSeleccionada, 0);
            Object nombre = jTlistarLab.getValueAt(filaSeleccionada, 1);
            Object pais = jTlistarLab.getValueAt(filaSeleccionada, 2);
            Object domComercial = jTlistarLab.getValueAt(filaSeleccionada, 3);

            // Establecer los datos en los campos de texto
            jTFCuit.setText(cuit.toString());
            jTFNombre.setText(nombre.toString());
            jTFPais.setText(pais.toString());
            jTFnomComercial.setText(domComercial.toString());
        }
    }//GEN-LAST:event_jTlistarLabMouseClicked

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCuit;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFnomComercial;
    private javax.swing.JTable jTlistarLab;
    // End of variables declaration//GEN-END:variables

    private void listarLaboratorio() {
        LaboratorioData ld = new LaboratorioData();
        for (Laboratorio v : ld.listarLaboratorio()) {
            modelo.addRow(new Object[]{
                v.getCuit(),
                v.getNomLaboratorio(),
                v.getPais(),
                v.getDomComercial()
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("CUIT");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PAIS");
        modelo.addColumn("DOM. COMERCIAL");
        jTlistarLab.setModel(modelo);
    }

    private void limpiar() {
        jTFCuit.setText("");
        jTFNombre.setText("");
        jTFPais.setText("");
        jTFnomComercial.setText("");
    }

    private void limpiartablaLaboratorio() {
        // Limpia la tabla
        modelo.setRowCount(0);
        LaboratorioData ld = new LaboratorioData();
        for (Laboratorio v : ld.listarLaboratorio()) {
            modelo.addRow(new Object[]{
                v.getCuit(),
                v.getNomLaboratorio(),
                v.getPais(),
                v.getDomComercial()
            });
        }
    }
}
