package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.entidades.Ciudadano;

public class AdministracionListarCiudadanos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public AdministracionListarCiudadanos() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLDni = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLDni.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLDni.setText("Buscar por DNI");

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });
        jTDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDniKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido", "Nombre", "email", "Celular", "Zona", "Patologia", "Esencial", "Riesgo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBCerrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBCerrar.setText("Cerrar");
        jBCerrar.setMaximumSize(new java.awt.Dimension(150, 50));
        jBCerrar.setMinimumSize(new java.awt.Dimension(150, 50));
        jBCerrar.setPreferredSize(new java.awt.Dimension(150, 50));
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE CIUDADANOS REGISTRADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDni)
                    .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            this.dispose();
//            AdministracionVista volver = new AdministracionVista();
//            volver.setVisible(true);
        }
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jTDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDniKeyPressed

        borrarFilas();
      
        CiudadanoData cd = new CiudadanoData();

        for (Ciudadano c : cd.listarCiudadano()) {

            String dni = Integer.toString(c.getDni());
            System.out.println(dni + "");

            if (dni.startsWith(jTDni.getText())) {

                modelo.addRow(new Object[]{
                    c.getDni(),
                    c.getApellido(),
                    c.getNombre(),
                    c.getEmail(),
                    c.getCelular(),
                    c.getZona(),
                    c.getPatologia(),
                    c.isAmbitoTrabajo(),
                    c.isRiesgo(),}
                );
            }
        }
    }//GEN-LAST:event_jTDniKeyPressed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        CiudadanoData cd = new CiudadanoData();

        for (Ciudadano c : cd.listarCiudadano()) {

            modelo.addRow(new Object[]{
                c.getDni(),
                c.getApellido(),
                c.getNombre(),
                c.getEmail(),
                c.getCelular(),
                c.getZona(),
                c.getPatologia(),
                c.isAmbitoTrabajo(),
                c.isRiesgo(),});
        }

    }

    private void borrarFilas() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
