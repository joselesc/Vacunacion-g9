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
import vacunacion.g9.accesoADatos.CiudadanoData;

/**
 *
 * @author josel
 */
public class CiudadanoPrevioVista extends javax.swing.JFrame {

   

    public CiudadanoPrevioVista() {
    
        initComponents();
        this.setLocationRelativeTo(null);
       
        ;

    }

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
        jMIRegistrarse = new javax.swing.JMenuItem();
        jMILoguearse = new javax.swing.JMenuItem();
        jMCambioFecha = new javax.swing.JMenu();
        jMIFechaVacunacion = new javax.swing.JMenuItem();
        jMICancelarCita = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jMIExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setMinimumSize(new java.awt.Dimension(1448, 966));

        EscritorioCiudadano.setMinimumSize(new java.awt.Dimension(1448, 966));

        javax.swing.GroupLayout EscritorioCiudadanoLayout = new javax.swing.GroupLayout(EscritorioCiudadano);
        EscritorioCiudadano.setLayout(EscritorioCiudadanoLayout);
        EscritorioCiudadanoLayout.setHorizontalGroup(
            EscritorioCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1448, Short.MAX_VALUE)
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

        jMIRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMIRegistrarse.setText("Registrarse");
        jMIRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegistrarseActionPerformed(evt);
            }
        });
        jMenu1.add(jMIRegistrarse);

        jMILoguearse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMILoguearse.setText("Logearse");
        jMILoguearse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILoguearseActionPerformed(evt);
            }
        });
        jMenu1.add(jMILoguearse);

        jMenuBar1.add(jMenu1);

        jMCambioFecha.setText("Consulta");
        jMCambioFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMIFechaVacunacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMIFechaVacunacion.setText("FechaVacunacion");
        jMIFechaVacunacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMIFechaVacunacionMouseClicked(evt);
            }
        });
        jMCambioFecha.add(jMIFechaVacunacion);

        jMICancelarCita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMICancelarCita.setText("CambioDeFecha");
        jMICancelarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMICancelarCitaMouseClicked(evt);
            }
        });
        jMCambioFecha.add(jMICancelarCita);

        jMenuBar1.add(jMCambioFecha);

        jMSalir.setText("Salir");
        jMSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMSalir.setMinimumSize(new java.awt.Dimension(49, 40));
        jMSalir.setPreferredSize(new java.awt.Dimension(49, 40));

        jMIExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMIExit.setText("Confirma Salida");
        jMIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExitActionPerformed(evt);
            }
        });
        jMSalir.add(jMIExit);

        jMenuBar1.add(jMSalir);

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

    private void jMIRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegistrarseActionPerformed

        EscritorioCiudadano.removeAll();
        EscritorioCiudadano.repaint();
        CiudadanoVista cv = new CiudadanoVista();
        setContentPane(EscritorioCiudadano);
        //setSize(1212, 966);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cv.setVisible(true);
        EscritorioCiudadano.add(cv);
        EscritorioCiudadano.moveToFront(cv);

    }//GEN-LAST:event_jMIRegistrarseActionPerformed

    private void jMIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExitActionPerformed
        this.dispose();
        VacunacionG9Vista v = new VacunacionG9Vista();
        v.setVisible(true);


    }//GEN-LAST:event_jMIExitActionPerformed

    private void jMILoguearseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILoguearseActionPerformed
        EscritorioCiudadano.removeAll();
        EscritorioCiudadano.repaint();
        LoguearseVista lv = new LoguearseVista();
        setContentPane(EscritorioCiudadano);
        //setSize(1212, 966);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lv.setVisible(true);
        EscritorioCiudadano.add(lv);
        EscritorioCiudadano.moveToFront(lv);
    }//GEN-LAST:event_jMILoguearseActionPerformed

    private void jMICancelarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMICancelarCitaMouseClicked

      CiudadanoData cd=new CiudadanoData();
      cd.cancelarCita();
       
    }//GEN-LAST:event_jMICancelarCitaMouseClicked

    private void jMIFechaVacunacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMIFechaVacunacionMouseClicked
      
      CiudadanoData cd=new CiudadanoData();
      cd.mostrarCita();
    }//GEN-LAST:event_jMIFechaVacunacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioCiudadano;
    private javax.swing.JMenu jMCambioFecha;
    private javax.swing.JMenuItem jMICancelarCita;
    private javax.swing.JMenuItem jMIExit;
    private javax.swing.JMenuItem jMIFechaVacunacion;
    private javax.swing.JMenuItem jMILoguearse;
    private javax.swing.JMenuItem jMIRegistrarse;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

  
}
