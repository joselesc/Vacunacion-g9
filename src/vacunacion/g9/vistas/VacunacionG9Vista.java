package vacunacion.g9.vistas;

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
        jBCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCiudadanoActionPerformed(evt);
            }
        });

        escritorio.setLayer(jBAdministracion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBPerosnalSalud, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jBCiudadano, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCiudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPerosnalSalud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAdministracion)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCiudadano, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPerosnalSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
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
        loginAdministracion ingresoPersonal = new loginAdministracion();
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
        loginAdministracion ingresoPersonal = new loginAdministracion();
        ingresoPersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBPerosnalSaludActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBAdministracion;
    private javax.swing.JButton jBCiudadano;
    private javax.swing.JButton jBPerosnalSalud;
    private javax.swing.JButton jBSalir;
    // End of variables declaration//GEN-END:variables
}
