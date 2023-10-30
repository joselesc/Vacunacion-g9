package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.entidades.Ciudadano;

public class CiudadanoVista extends javax.swing.JInternalFrame {

    public CiudadanoVista() {
        initComponents();
        jCPatologia.setVisible(false);
        jLDescripcion.setVisible(false);
        jTDescripcion.setVisible(false);
       
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTCelular = new javax.swing.JTextField();
        jTDni = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jCBZona = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCPatologia = new javax.swing.JComboBox<>();
        jLDescripcion = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jBRegistrarse = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRBOcupacion = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRBRiesgo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 52, 89));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(new java.awt.Color(0, 52, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS PERSONALES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("EM@IL:");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ZONA:");
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("CELULAR:");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PATOLOGIA PREEXISTENTE:");

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBZona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NORTE", "SUR", "ESTE", "OESTE" }));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCPatologia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCPatologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOBREPESO", "HIPERTENSO", "DIABETES", "ASMA", "OTROS.." }));

        jLDescripcion.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDescripcion.setText("DESCRIBA SU ENFERMEDAD BASE:");

        jTDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBRegistrarse.setBackground(new java.awt.Color(0, 126, 167));
        jBRegistrarse.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrarse.setText("Registrarse");
        jBRegistrarse.setMaximumSize(new java.awt.Dimension(150, 30));
        jBRegistrarse.setMinimumSize(new java.awt.Dimension(150, 30));
        jBRegistrarse.setPreferredSize(new java.awt.Dimension(150, 30));
        jBRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarseActionPerformed(evt);
            }
        });

        jBCerrar.setBackground(new java.awt.Color(0, 126, 167));
        jBCerrar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jBCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jBCerrar.setText("Cerrar");
        jBCerrar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBCerrar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBCerrar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PERSONAL ESCENCIAL");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DE RIESGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBZona, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBOcupacion)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBRiesgo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2)
                                        .addGap(47, 47, 47)
                                        .addComponent(jCPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(362, 362, 362)
                                            .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBRiesgo)
                    .addComponent(jRBOcupacion))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLDescripcion)
                .addGap(18, 18, 18)
                .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(622, 622, 622)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarseActionPerformed

        try {
            if (jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty() || jTDni.getText().isEmpty() || jTEmail.getText().isEmpty()
                    || jTCelular.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Error: Uno o más campos están vacíos");

            } else {

                String apellido = jTApellido.getText();
                String nombre = jTNombre.getText();
                int dni = Integer.parseInt(jTDni.getText());
                String email = jTEmail.getText();
                int celular = Integer.parseInt(jTCelular.getText());
                String zona = (String) jCBZona.getSelectedItem();
                boolean ocupacion = jRBOcupacion.isSelected();
                boolean riesgo = jRBRiesgo.isSelected();
                String patologia = null;

                if (jCheckBox2.isSelected()) {

                    patologia = jCPatologia.getSelectedItem().toString();
                    if (patologia.equals("OTROS..")) {
                        patologia = jTDescripcion.getText();
                    }
                }

                Ciudadano c = new Ciudadano(dni, nombre, apellido, email, celular, zona, patologia, ocupacion, riesgo);
                CiudadanoData cd = new CiudadanoData();
                cd.registrarCiudadano(c);
                limpiar();
                this.dispose();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en campo numerico -" + ex.getMessage());
        }
    }//GEN-LAST:event_jBRegistrarseActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jCPatologia.setVisible(true);
            jLDescripcion.setVisible(true);
            jTDescripcion.setVisible(true);
        } else {
            jCPatologia.setVisible(false);
            jLDescripcion.setVisible(false);
            jTDescripcion.setVisible(false);
        }


    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBRegistrarse;
    private javax.swing.JComboBox<String> jCBZona;
    private javax.swing.JComboBox<String> jCPatologia;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBOcupacion;
    private javax.swing.JRadioButton jRBRiesgo;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTApellido.setText("");
        jTNombre.setText("");
        jTDni.setText("");
        jTEmail.setText("");
        jTCelular.setText("");
        jRBOcupacion.setSelected(false);
        jRBRiesgo.setSelected(false);
        jCheckBox2.setSelected(false);
    }
}
