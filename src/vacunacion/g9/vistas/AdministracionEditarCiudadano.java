package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.entidades.Ciudadano;

public class AdministracionEditarCiudadano extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public AdministracionEditarCiudadano() {
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

        jLDni.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLDni.setText("Buscar por DNI");

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

        jBCerrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDni))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
            AdministracionVista volver = new AdministracionVista();
            volver.setVisible(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JLabel jLDni;
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
