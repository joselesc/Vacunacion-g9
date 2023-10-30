/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.vistas;

import java.awt.Component;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.VacunaData;
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.Vacuna;

public class VacunaXCentro extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    AdministracionCitas ac = new AdministracionCitas();
    CentroData centroData;

    public VacunaXCentro() {
        centroData = new CentroData();
        initComponents();

        cargarComboBoxCentros();
        jCBCentros.setSelectedIndex(0);
        cabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDCDia = new com.toedter.calendar.JDateChooser();
        jCBCentros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBListar = new javax.swing.JButton();
        jBDisponible = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jDCDia.setBackground(new java.awt.Color(255, 255, 255));
        jDCDia.setForeground(new java.awt.Color(0, 23, 31));
        jDCDia.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jCBCentros.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCBCentros.setForeground(new java.awt.Color(0, 23, 31));

        jTable1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 23, 31));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "LOTE", "CUIT", "MARCA", "MEDIDA", "FECHA DE VENC.", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("CANTIDAD");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("LOTE");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("CUIT");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("MARCA");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("MEDIDA");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("FECHA DE VENC.");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("STOCK");
        }

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE VACUNAS POR CENTRO, DIA Y DISPONIBLES");

        jButton1.setBackground(new java.awt.Color(0, 126, 167));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBListar.setBackground(new java.awt.Color(0, 126, 167));
        jBListar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBListar.setForeground(new java.awt.Color(255, 255, 255));
        jBListar.setText("LISTAR");
        jBListar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jBDisponible.setBackground(new java.awt.Color(0, 126, 167));
        jBDisponible.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jBDisponible.setText("DISPONIBLES");
        jBDisponible.setPreferredSize(new java.awt.Dimension(150, 30));
        jBDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDisponibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDCDia, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jCBCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jBDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        listarVacunas();
    }//GEN-LAST:event_jBListarActionPerformed

    private void jBDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDisponibleActionPerformed
     listarVacunasDisponible();
    }//GEN-LAST:event_jBDisponibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDisponible;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Centro> jCBCentros;
    private com.toedter.calendar.JDateChooser jDCDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBoxCentros() {
        DefaultComboBoxModel<Centro> modeloCB = new DefaultComboBoxModel<>();
        ArrayList<Centro> centros;
        centros = (ArrayList<Centro>) centroData.listarCentros();

        for (Centro centro : centros) {
            modeloCB.addElement(centro);
        }
        jCBCentros.setModel(modeloCB);
        jCBCentros.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Centro) {
                    Centro centro = (Centro) value;
                    String nombreCompleto = centro.getId() + " - " + centro.getZona() + " - " + centro.getNombre() + ", " + centro.getDireccion();
                    value = nombreCompleto;
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }

    private void cabecera() {
        modelo = (DefaultTableModel) jTable1.getModel();
    }

    private void listarVacunas() {
        VacunaData vD = new VacunaData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {

            java.util.Date f = jDCDia.getDate();
            Instant fe = f.toInstant();
            LocalDateTime fecha = fe.atZone(ZoneId.systemDefault()).toLocalDateTime();
            Centro c = (Centro) jCBCentros.getSelectedItem();

            // Obtener las vacunas disponibles y agregarlas a la tabla
            for (Vacuna v : centroData.listarVacunasPorCentros(c.getId(),fecha)) {
               
                model.addRow(new Object[]{
                    v.getStock(),
                    v.getLote(),
                    v.getCuit(),
                    v.getMarca(),
                    v.getMedida(),
                    v.getFechaCaduca(),});
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe indicar la fecha." + ex.getMessage());
        }
    }
    
    private void listarVacunasDisponible() {
        VacunaData vD = new VacunaData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        String vacia="";
        try {
       
            for (Vacuna v : vD.obtenerVacunasDisponibles()) {
    
                model.addRow(new Object[]{
                    vacia,
                    v.getLote(),
                    v.getCuit(),
                    v.getMarca(),
                    v.getMedida(),
                    v.getFechaCaduca(),
                    v.getStock(),});
                  }
        
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe indicar la fecha." + ex.getMessage());
        }
    }
}

