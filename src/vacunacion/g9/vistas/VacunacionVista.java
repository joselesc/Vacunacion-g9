package vacunacion.g9.vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VacunacionVista extends javax.swing.JFrame {

    public VacunacionVista() {
        initComponents();
        transparencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/fondo.png"));
        Image miImagen=icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }};
            jBSalir = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setLocation(new java.awt.Point(50, 50));
            setUndecorated(true);

            jDesktopPane1.setMaximumSize(new java.awt.Dimension(1443, 1000));
            jDesktopPane1.setMinimumSize(new java.awt.Dimension(1443, 1000));

            jBSalir.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
            jBSalir.setForeground(new java.awt.Color(255, 102, 102));
            jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/exit.png"))); // NOI18N
            jBSalir.setText("SALIR");
            jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jBSalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBSalirActionPerformed(evt);
                }
            });

            jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 102, 102));
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/calendario.png"))); // NOI18N
            jButton1.setText("VACUNATORIOS");
            jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jDesktopPane1.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSalir)
                    .addGap(220, 220, 220))
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jButton1)
                    .addContainerGap(490, Short.MAX_VALUE))
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                    .addComponent(jBSalir)
                    .addGap(41, 41, 41))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
public void transparencia() {
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);

        jBSalir.setOpaque(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.setBorderPainted(false);

    }
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
        VacunacionG9Vista v = new VacunacionG9Vista();
        v.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jBSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CiudadanoxFechaVista cxF = new CiudadanoxFechaVista();
        setContentPane(jDesktopPane1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cxF.setVisible(true);
        jDesktopPane1.add(cxF);
        jDesktopPane1.moveToFront(cxF);      
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = cxF.getSize();
        cxF.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        //cxF.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables

}
