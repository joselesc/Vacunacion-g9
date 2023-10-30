package vacunacion.g9.vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VacunacionG9Vista extends javax.swing.JFrame {

    private Point point;
    public VacunacionG9Vista() {
        initComponents();
        transparencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fondo.png"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jBAdministracion = new javax.swing.JButton();
        jBPerosnalSalud = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBCiudadano = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jBAdministracion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jBAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/minimizar.png"))); // NOI18N
        jBAdministracion.setText("ADMINISTRACION");
        jBAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAdministracion.setOpaque(false);
        jBAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdministracionActionPerformed(evt);
            }
        });

        jBPerosnalSalud.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBPerosnalSalud.setForeground(new java.awt.Color(255, 255, 255));
        jBPerosnalSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/vacunacion13.png"))); // NOI18N
        jBPerosnalSalud.setText("VACUNATORIO");
        jBPerosnalSalud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPerosnalSalud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBPerosnalSalud.setOpaque(false);
        jBPerosnalSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPerosnalSaludActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/exit.png"))); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSalir.setOpaque(false);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBCiudadano.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBCiudadano.setForeground(new java.awt.Color(255, 255, 255));
        jBCiudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/familia.png"))); // NOI18N
        jBCiudadano.setText("CIUDADANO");
        jBCiudadano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCiudadano.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jBCiudadano.setOpaque(false);
        jBCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCiudadanoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Contacto");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Institucional");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE GESTION COVID -G9");

        escritorio.setLayer(jBAdministracion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBPerosnalSalud, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBCiudadano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCiudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBPerosnalSalud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAdministracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1443, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPerosnalSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        public void transparencia(){
            jBAdministracion.setOpaque(false);
            jBAdministracion.setContentAreaFilled(false);
            jBAdministracion.setBorderPainted(false);
            jBPerosnalSalud.setOpaque(false);
            jBPerosnalSalud.setContentAreaFilled(false);
            jBPerosnalSalud.setBorderPainted(false);
            jBSalir.setOpaque(false);
            jBSalir.setContentAreaFilled(false);
            jBSalir.setBorderPainted(false);
            jBCiudadano.setOpaque(false);
            jBCiudadano.setContentAreaFilled(false);
            jBCiudadano.setBorderPainted(false);
        
        }
    private void jBCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCiudadanoActionPerformed

        
        CiudadanoPrevioVista cv = new CiudadanoPrevioVista();
        setContentPane(escritorio);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cv.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jBCiudadanoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            System.exit(0); 
        }
    }//GEN-LAST:event_jBSalirActionPerformed
    /*metodo al apretar el jbuttomAdministracion() 
    llama al loginAdministracionVista()*/
    private void jBAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdministracionActionPerformed
        dispose();
        LoginAdministracion ingresoPersonal = new LoginAdministracion();
        ingresoPersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBAdministracionActionPerformed
    /*metodo para detectar cuando se sostiene el click del mouse*/
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_formMousePressed
    /*metodo para localizar las cordenadas para donde se mueve los jframe*/
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;
        
        int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);
        
        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;  
        
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void jBPerosnalSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPerosnalSaludActionPerformed
        LoginAdministracion ingresoPersonal = new LoginAdministracion();
        ingresoPersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBPerosnalSaludActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String contacto="                    MINISTERIO DE SALUD DE LA NACION\n"
                       +"Dirección: Av. 9 de Julio 1925 - Ciudad Autónoma de Buenos Aires\n" +
                        "        Código postal: C1073ABA - Teléfono: (54-11) 4379-9000\n" +
                        "             Correo electrónico: mesadeentradas@msal.gov.ar          ";
         JOptionPane.showMessageDialog(null, contacto );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        
        
       InstitucionalVista iv=new InstitucionalVista();
        setContentPane(escritorio);
        //setSize(1212, 966);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iv.setVisible(true);
        escritorio.add(iv);
        escritorio.moveToFront(iv);

        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = iv.getSize();
        iv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        iv.show();

     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VacunacionG9Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacunacionG9Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacunacionG9Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacunacionG9Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacunacionG9Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBAdministracion;
    private javax.swing.JButton jBCiudadano;
    private javax.swing.JButton jBPerosnalSalud;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
