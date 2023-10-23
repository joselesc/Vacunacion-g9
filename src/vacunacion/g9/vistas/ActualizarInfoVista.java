
package vacunacion.g9.vistas;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vacunacion.g9.accesoADatos.CiudadanoData;
import vacunacion.g9.entidades.Ciudadano;


public class ActualizarInfoVista extends javax.swing.JInternalFrame {

  
    private int dniAct;
    
    public ActualizarInfoVista() {
        initComponents();
        jBModificar.setEnabled(false);
        jLabel8.setEnabled(false);jTNombre.setEnabled(false);jLabel9.setEnabled(false); jTApellido1.setEnabled(false); jLabel10.setEnabled(false);
        jTDni1.setEnabled(false); jLabel11.setEnabled(false); jTEmail1.setEnabled(false); jLabel12.setEnabled(false); jTCelular.setEnabled(false);
        jLabel13.setEnabled(false); jCBZona.setEnabled(false); jLabel14.setEnabled(false); jRBOcupacion.setEnabled(false); jLabel15.setEnabled(false);
        jRBOcupacion.setEnabled(false); jRBRiesgo.setEnabled(false); jLabel16.setEnabled(false); jCheckBox2.setEnabled(false);  jCPatologia.setVisible(false); 
        jLDescripcion.setVisible(false); jTDescripcion.setVisible(false);jBActualizar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBEnviar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTApellido1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTDni1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTEmail1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCBZona = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jRBOcupacion = new javax.swing.JRadioButton();
        jRBRiesgo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCPatologia = new javax.swing.JComboBox<>();
        jLDescripcion = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jBActualizar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 328));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALIDACION DE DATOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Para poder actualizar sus datos llene los siguientes campos:");

        jTDni.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTApellido.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Los datos ingresados deben coincidir con los registrados. Una vez chequeados se habilitara el boton modificar.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("APELLIDO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("EMAIL");

        jBEnviar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEnviar.setText("Enviar");
        jBEnviar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBEnviar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBEnviar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jBModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBModificar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBModificar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("NOMBRE:");

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNombre.setMinimumSize(new java.awt.Dimension(574, 28));
        jTNombre.setPreferredSize(new java.awt.Dimension(574, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("APELLIDO:");

        jTApellido1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("DNI:");

        jTDni1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("EM@IL:");

        jTEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("CELULAR:");

        jTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("ZONA:");
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 22));

        jCBZona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NORTE", "SUR", "ESTE", "OESTE" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("PERSONAL ESCENCIAL");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("DE RIESGO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("PATOLOGIA PREEXISTENTE:");

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCPatologia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCPatologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOBREPESO", "HIPERTENSO", "DIABETES", "ASMA", "OTROS.." }));

        jLDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDescripcion.setText("DESCRIBA SU ENFERMEDAD BASE:");

        jTDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jBActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBActualizar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBActualizar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTDni1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEmail1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTApellido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(47, 47, 47)
                        .addComponent(jCPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBZona, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRBOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jRBRiesgo)
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRBOcupacion)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRBRiesgo)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLDescripcion)
                .addGap(18, 18, 18)
                .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed

      
        
                
        try {
            if (jTApellido.getText().isEmpty() || jTDni.getText().isEmpty() || jTEmail.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Error: Uno o más campos están vacíos");

            } else {

                String apellido = jTApellido.getText();
                dniAct = Integer.parseInt(jTDni.getText());
                String email = jTEmail.getText();

                CiudadanoData cd = new CiudadanoData();
                boolean validar = cd.validarInfo(dniAct, apellido, email);
               
             
                if (validar == true) {
                  jBModificar.setEnabled(validar);  
                 
                                    
                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en campo numerico -" + ex.getMessage());
        }

    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        
        jLabel8.setEnabled(true);jTNombre.setEnabled(true);jLabel9.setEnabled(true); jTApellido1.setEnabled(true); jLabel10.setEnabled(true);
        jTDni1.setEnabled(false); jLabel11.setEnabled(true); jTEmail1.setEnabled(true); jLabel12.setEnabled(true); jTCelular.setEnabled(true);
        jLabel13.setEnabled(true); jCBZona.setEnabled(true); jLabel14.setEnabled(true); jRBOcupacion.setEnabled(true); jLabel15.setEnabled(true);
        jRBOcupacion.setEnabled(true); jRBRiesgo.setEnabled(true); jLabel16.setEnabled(true); jCheckBox2.setEnabled(true);  jCPatologia.setVisible(false); 
        jLDescripcion.setVisible(false); jTDescripcion.setVisible(false);jBActualizar.setEnabled(true);
        
         CiudadanoData cd = new CiudadanoData();
         Ciudadano info=cd.buscarCiudadano(dniAct);
         jTNombre.setText(info.getNombre());
         jTApellido1.setText(info.getApellido());
         jTDni1.setText(info.getDni()+"");
         jTEmail1.setText(info.getEmail());
         jTCelular.setText(info.getCelular()+"");
         jCBZona.setSelectedItem(info.getZona());
         jRBOcupacion.setSelected(info.isAmbitoTrabajo());
         jRBRiesgo.setSelected(info.isRiesgo());
         if(info.getPatologia()!=null){
          jCheckBox2.setSelected(true);
                     
        }
          
        if (jCheckBox2.isSelected()) {
            jCPatologia.setVisible(true);
            jLDescripcion.setVisible(true);
            jTDescripcion.setVisible(true);

            int total = jCPatologia.getItemCount();
            for (int i = 0; i < total; i++) {
               
                if (jCPatologia.getItemAt(i).equalsIgnoreCase(info.getPatologia())) {
                   
                    jCPatologia.setSelectedIndex(i);
                    jTDescripcion.setText("");
                    break;

                } else {
                  jCPatologia.setSelectedIndex(total-1);
                  jTDescripcion.setText(info.getPatologia());

                }
            }
        }

    }//GEN-LAST:event_jBModificarActionPerformed

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

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
       
         try {
            if (jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty() || jTDni.getText().isEmpty() || jTEmail.getText().isEmpty()
                    || jTCelular.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Error: Uno o más campos están vacíos");

            } else {

                String apellido = jTApellido1.getText();
                String nombre = jTNombre.getText();
                int dni = Integer.parseInt(jTDni.getText());
                String email = jTEmail1.getText();
                int celular = Integer.parseInt(jTCelular.getText());
                String zona = (String) jCBZona.getSelectedItem();
                boolean ocupacion = jRBOcupacion.isSelected();
                boolean riesgo = jRBRiesgo.isSelected();
                String patologia = null;

                if (jCheckBox2.isSelected()) {

                    patologia = (String) jCPatologia.getSelectedItem();
                    if (patologia.equals("otros")) {
                        patologia = jTDescripcion.getText();
                    }
                }

                Ciudadano c = new Ciudadano(dni, nombre, apellido, email, celular, zona, patologia, ocupacion, riesgo);
                CiudadanoData cd = new CiudadanoData();
                cd.modificarInfo(c);
                this.dispose();
             
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en campo numerico -" + ex.getMessage());
        }
    }//GEN-LAST:event_jBActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCBZona;
    private javax.swing.JComboBox<String> jCPatologia;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBOcupacion;
    private javax.swing.JRadioButton jRBRiesgo;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTApellido1;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDni1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEmail1;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
