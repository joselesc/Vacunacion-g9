/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunacion.g9.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author josel
 */
public class CiudadanoPrevioVista extends javax.swing.JInternalFrame {

    public CiudadanoPrevioVista() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize
     * the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        ImageIcon icono=new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/vacunacion-covid-fullhd.png"));
        Image miImagen=icono.getImage();
        EscritorioCiudadano = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setMinimumSize(new java.awt.Dimension(1212, 966));
        setPreferredSize(new java.awt.Dimension(1212, 966));

        EscritorioCiudadano.setMinimumSize(new java.awt.Dimension(1196, 880));

        javax.swing.GroupLayout EscritorioCiudadanoLayout = new javax.swing.GroupLayout(EscritorioCiudadano);
        EscritorioCiudadano.setLayout(EscritorioCiudadanoLayout);
        EscritorioCiudadanoLayout.setHorizontalGroup(
            EscritorioCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        EscritorioCiudadanoLayout.setVerticalGroup(
            EscritorioCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(204, 50));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(204, 50));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/ciudadano.png"))); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setHideActionText(true);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem2.setText("Registrarse");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem3.setText("Logearse");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem5.setText("FechaVacunacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem6.setText("CambioDeFecha");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setMinimumSize(new java.awt.Dimension(49, 40));
        jMenu4.setPreferredSize(new java.awt.Dimension(49, 40));
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioCiudadano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioCiudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        EscritorioCiudadano.removeAll();
        EscritorioCiudadano.repaint();
        CiudadanoVista cv = new CiudadanoVista();
        setContentPane(EscritorioCiudadano);
        setSize(1212, 966);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cv.setVisible(true);
        EscritorioCiudadano.add(cv);
        EscritorioCiudadano.moveToFront(cv);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.dispose();
        VacunacionG9Vista v = new VacunacionG9Vista();
        v.setVisible(true);


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

//        EscritorioCiudadano.removeAll();
//        EscritorioCiudadano.repaint();
//        CiudadanoxFechaVista lv = new CiudadanoxFechaVista();
//        setContentPane(EscritorioCiudadano);
//        setSize(1212, 966);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        lv.setVisible(true);
//        EscritorioCiudadano.add(lv);
//        EscritorioCiudadano.moveToFront(lv);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        EscritorioCiudadano.removeAll();
        EscritorioCiudadano.repaint();
        CiudadanoxFechaVista lv = new CiudadanoxFechaVista();
        setContentPane(EscritorioCiudadano);
        setSize(1212, 966);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lv.setVisible(true);
        EscritorioCiudadano.add(lv);
        EscritorioCiudadano.moveToFront(lv);

    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioCiudadano;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
