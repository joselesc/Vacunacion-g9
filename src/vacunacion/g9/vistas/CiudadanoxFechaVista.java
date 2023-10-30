/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.CitaData;
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.CitaVacunacion;

public class CiudadanoxFechaVista extends javax.swing.JInternalFrame {

    private List<Centro> listaC;
    private CentroData cd;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public CiudadanoxFechaVista() {

        cd = new CentroData();
        listaC = cd.listarCentrosDepositoCentral();
        initComponents();
        cargarCentros();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDDesde = new com.toedter.calendar.JDateChooser();
        jBuscarxFecha = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBSalir2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaxFecha = new javax.swing.JTable();
        jCBoxCentros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBConfirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 255)));
        setForeground(new java.awt.Color(153, 255, 255));
        setAlignmentX(5.0F);
        setAlignmentY(5.0F);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VACUNAS POR DIA");

        jDDesde.setForeground(new java.awt.Color(255, 255, 255));
        jDDesde.setDateFormatString("dd-MM-yyyy");
        jDDesde.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jBuscarxFecha.setBackground(new java.awt.Color(0, 126, 167));
        jBuscarxFecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBuscarxFecha.setForeground(new java.awt.Color(255, 255, 255));
        jBuscarxFecha.setText("BUSCAR");
        jBuscarxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarxFechaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECCIONE DIA A CONSULTAR");

        jBSalir2.setBackground(new java.awt.Color(0, 126, 167));
        jBSalir2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBSalir2.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir2.setText("SALIR");
        jBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir2ActionPerformed(evt);
            }
        });

        jTablaxFecha.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTablaxFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "LOTE", "FECHA CITA", "APLICADA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaxFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTablaxFecha.getTableHeader().setReorderingAllowed(false);
        jTablaxFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaxFechaMouseClicked(evt);
            }
        });
        jTablaxFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTablaxFechaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaxFecha);

        jCBoxCentros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCBoxCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxCentrosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VACUNATORIOS DISPONIBLES");

        jBConfirmar.setBackground(new java.awt.Color(0, 126, 167));
        jBConfirmar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jBConfirmar.setText("CONFIRMAR");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBoxCentros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jBuscarxFecha)
                        .addGap(71, 71, 71)
                        .addComponent(jBConfirmar)
                        .addGap(96, 96, 96)
                        .addComponent(jBSalir2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jCBoxCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmar)
                    .addComponent(jBuscarxFecha)
                    .addComponent(jBSalir2))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBuscarxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarxFechaActionPerformed

        listarcitas();
    }//GEN-LAST:event_jBuscarxFechaActionPerformed

    private void jBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir2ActionPerformed

        this.dispose();
        VacunacionVista vV = new VacunacionVista();
        vV.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jBSalir2ActionPerformed

    private void jCBoxCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxCentrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxCentrosActionPerformed

    private void jTablaxFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaxFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaxFechaMouseClicked

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed

        int filaSeleccionada = jTablaxFecha.getSelectedRow();

        if (filaSeleccionada != -1) {
            DefaultTableModel model = (DefaultTableModel) jTablaxFecha.getModel();

            int codCita = (int) model.getValueAt(filaSeleccionada, 0);
            boolean aplicada = (boolean) model.getValueAt(filaSeleccionada, 4);
            int lote = (int) model.getValueAt(filaSeleccionada, 2);

            if (aplicada) {

                model.setValueAt(true, filaSeleccionada, 4);
                CitaData citaData = new CitaData();
                citaData.modificarCita(codCita, aplicada, lote);
            } else {
                JOptionPane.showMessageDialog(null, "Tilde la casilla de seleccion.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de modificar la base de datos.");
        }
        listarcitas();
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jTablaxFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTablaxFechaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaxFechaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBSalir2;
    private javax.swing.JButton jBuscarxFecha;
    private javax.swing.JComboBox<Centro> jCBoxCentros;
    private com.toedter.calendar.JDateChooser jDDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaxFecha;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo = (DefaultTableModel) jTablaxFecha.getModel();
    }

    private void cargarCentros() {

        for (Centro lista : listaC) {
            jCBoxCentros.addItem(lista);
        }
    }

    public void listarcitas() {
        CitaData cd = new CitaData();
        java.util.Date fecha = jDDesde.getDate();

        if (fecha != null) {
            Centro centroSeleccionado = (Centro) jCBoxCentros.getSelectedItem();

            if (centroSeleccionado != null) {
                int idCentro = centroSeleccionado.getId();
                List<CitaVacunacion> citas = cd.listarCitasPorFechaYCentro(fecha, idCentro);

                modelo.setRowCount(0);

                for (CitaVacunacion c : citas) {
                    modelo.addRow(new Object[]{
                        c.getCodCita(),
                        c.getDni(),
                        c.getLote(),
                        c.getFechaHoraCita(),
                        c.isColocada()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un centro primero.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha primero.");
        }
    }

}
