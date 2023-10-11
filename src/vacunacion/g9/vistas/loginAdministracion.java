package vacunacion.g9.vistas;

import java.awt.Point;
import javax.swing.JOptionPane;

public class loginAdministracion extends javax.swing.JFrame {
    
    private Point point;
    public loginAdministracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        jRadioButton1.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGLogin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTDocumento = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jLDocumento = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBIngresar = new javax.swing.JButton();
        jLRegistroDelPersonal = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 126, 167));

        jTDocumento.setBackground(new java.awt.Color(255, 255, 255));

        jTEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTEmail.setForeground(new java.awt.Color(0, 23, 31));

        jLEmail.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLEmail.setText("e-mail");

        jLDocumento.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLDocumento.setForeground(new java.awt.Color(255, 255, 255));
        jLDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLDocumento.setText("Documento");

        jBCancelar.setBackground(new java.awt.Color(0, 52, 89));
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBIngresar.setBackground(new java.awt.Color(0, 52, 89));
        jBIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresar.setText("Ingresar");
        jBIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jLRegistroDelPersonal.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLRegistroDelPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jLRegistroDelPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRegistroDelPersonal.setText("Registro del personal");

        bGLogin.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Personal de la salud");

        bGLogin.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Administracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLRegistroDelPersonal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(32, 32, 32)
                .addComponent(jRadioButton2)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLRegistroDelPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBIngresar))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
        VacunacionG9Vista v=new VacunacionG9Vista();
        v.setVisible(true);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        if (jTEmail.getText().equalsIgnoreCase("1234") && jTDocumento.getText().equalsIgnoreCase("1234")) {
            if (jRadioButton1.isSelected()) {
                vacunacionVista vacunacion = new vacunacionVista();
                vacunacion.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }else if(jRadioButton2.isSelected()){
                PersonalSaludYAdministrativoVista psa = new PersonalSaludYAdministrativoVista();
                psa.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "email o documento no aceptados");
        }
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_formMousePressed
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;
        
        int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);
        
        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;  
        
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGLogin;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLRegistroDelPersonal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTEmail;
    // End of variables declaration//GEN-END:variables
}
