/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.vistas;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.accesoADatos.CitaData;
import vacunacion.g9.entidades.Centro;
import vacunacion.g9.entidades.CitaVacunacion;


/**
 *
 * @author jfaja
 */
public class CiudadanoxFechaVista extends javax.swing.JInternalFrame {    
    
    private List<Centro>listaC;
    private CentroData cd;
    
        private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
        
        
        
    public CiudadanoxFechaVista() {
        
        cd = new CentroData();
        listaC = cd.listarCentrosDepositoCentral();
        System.out.println("Número de elementos en listaC: " + listaC.size());

        initComponents();
        cargarCentros();
        armarcabecera();
        listarcitas();
//        listarVacunas();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDDesde = new com.toedter.calendar.JDateChooser();
        jBuscarxFecha = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRBVacunado = new javax.swing.JRadioButton();
        jRBNoVacunado = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaxFecha = new javax.swing.JTable();
        jCBoxCentros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 255)));
        setForeground(new java.awt.Color(153, 255, 255));
        setAlignmentX(5.0F);
        setAlignmentY(5.0F);
        setVisible(true);

        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VACUNAS POR DIA");

        jBuscarxFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBuscarxFecha.setText("BUSCAR");
        jBuscarxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarxFechaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DESDE");

        jRBVacunado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBVacunado.setText("vacunado");

        jRBNoVacunado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRBNoVacunado.setText("no vacunado");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTablaxFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaxFecha);

        jCBoxCentros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("VACUNATORIOS DISPONIBLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jBuscarxFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(156, 156, 156))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jRBVacunado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBNoVacunado)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jCBoxCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jCBoxCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBNoVacunado)
                            .addComponent(jRBVacunado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBuscarxFecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    private void jBuscarxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarxFechaActionPerformed
        String desde=jDDesde.getDateFormatString();            
            boolean vacunado=jRBVacunado.isSelected();
            boolean noVacu=jRBNoVacunado.isSelected();
            
    }//GEN-LAST:event_jBuscarxFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        dispose();
        VacunacionVista vV=new VacunacionVista();
        vV.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarxFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Centro> jCBoxCentros;
    private com.toedter.calendar.JDateChooser jDDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBNoVacunado;
    private javax.swing.JRadioButton jRBVacunado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaxFecha;
    // End of variables declaration//GEN-END:variables

    private void armarcabecera(){
        modelo.addColumn("CITA");
        modelo.addColumn("DNI");
        modelo.addColumn("LOTE");
        modelo.addColumn("FECHA");
        modelo.addColumn("COLOCADA");
        modelo.addColumn("CANCELADA");
//        modelo.addColumn("COLOCADA");
        jTablaxFecha.setModel(modelo);
        
    }
//       public void listarVacunas() {
//        VacunaData vD = new VacunaData();
//        for (Vacuna v : vD.obtenerVacunasDisponibles()) {
//            modelo.addRow(new Object[]{
//                v.getLote(),
//                v.getCuit(),
//                v.getMarca(),
//                v.getMedida(),
//                v.getFechaCaduca(),
//                v.getStock(),
//                v.isColocada()
//            });
//        }
//    }
       
       private void cargarCentros(){
       
           for (Centro lista : listaC) {
               jCBoxCentros.addItem(lista);
               
           }
       }
public void listarcitas() {
    CitaData cd = new CitaData();
    
    // Obtén la fecha seleccionada del JDateChooser
    Date selectedDate = (Date) jDDesde.getDate();
    
    if (selectedDate != null) {
        // Convierte la fecha seleccionada a un LocalDateTime
        LocalDateTime fecha = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        
        // Obtén el objeto Centro seleccionado en el JComboBox
        Centro centroSeleccionado = (Centro) jCBoxCentros.getSelectedItem();
        
        if (centroSeleccionado != null) {
            int idCentro = centroSeleccionado.getId();

            List<CitaVacunacion> citas = cd.listarCitasPorFechaYCentro(fecha, idCentro);

            DefaultTableModel modelo = (DefaultTableModel) jTablaxFecha.getModel();
            modelo.setRowCount(0); // Limpia las filas existentes en la tabla

            for (CitaVacunacion c : citas) {
                modelo.addRow(new Object[]{
                    c.getCodCita(),
                    c.getDni(),
                    c.getLote(),
                    c.getFechaHoraCita(),
                    c.isColocada(),
                    c.isCancelada()
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un centro primero.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fecha primero.");
    }
}

}
