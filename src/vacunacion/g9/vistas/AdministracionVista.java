package vacunacion.g9.vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdministracionVista extends javax.swing.JFrame {
    
    private Point point;
    
    public AdministracionVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageIcon icono=new ImageIcon(getClass().getResource("/vacunacion/g9/imagenes/bandera.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCentro = new javax.swing.JMenu();
        jMAdministrarCentros = new javax.swing.JMenuItem();
        jMManejoDeDosis = new javax.swing.JMenu();
        jMAdministracionVacunas = new javax.swing.JMenuItem();
        jMCitas = new javax.swing.JMenu();
        jMListadoMensual = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMCiudadano = new javax.swing.JMenu();
        jMListarCiudadanos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
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

        jPanel1.setBackground(new java.awt.Color(51, 51, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 23, 31));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N

        jMCentro.setText("Centros de vacunacion");
        jMCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMCentro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMAdministrarCentros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMAdministrarCentros.setText("Administrar centros");
        jMAdministrarCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAdministrarCentrosActionPerformed(evt);
            }
        });
        jMCentro.add(jMAdministrarCentros);

        jMenuBar1.add(jMCentro);

        jMManejoDeDosis.setText("Manejo de dosis");
        jMManejoDeDosis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMManejoDeDosis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMAdministracionVacunas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMAdministracionVacunas.setText("Administracion vacunas");
        jMAdministracionVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAdministracionVacunasActionPerformed(evt);
            }
        });
        jMManejoDeDosis.add(jMAdministracionVacunas);

        jMenuBar1.add(jMManejoDeDosis);

        jMCitas.setText("Citas");
        jMCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMCitas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMListadoMensual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMListadoMensual.setText("Listado mensual");
        jMListadoMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListadoMensualActionPerformed(evt);
            }
        });
        jMCitas.add(jMListadoMensual);

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem1.setText("Administrar citas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMCitas.add(jMenuItem1);

        jMenuBar1.add(jMCitas);

        jMCiudadano.setText("CIudadanos");
        jMCiudadano.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMListarCiudadanos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMListarCiudadanos.setText("Listar ciudadanos");
        jMListarCiudadanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarCiudadanosActionPerformed(evt);
            }
        });
        jMCiudadano.add(jMListarCiudadanos);

        jMenuBar1.add(jMCiudadano);

        jMenu1.setText("Laboratorio");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem2.setText("Aministar Laboratorio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Volver");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        try {
            int CurrentX = this.getLocation().x;
            int CurrentY = this.getLocation().y;
            
            int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
            int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);
            
            int x = CurrentX + MoveX;
            int y = CurrentY + MoveY;
            
            this.setLocation(x, y);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formMouseDragged

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente deseas salir?", "Selecciona una opcion ", JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            this.dispose();
            VacunacionG9Vista inicio = new VacunacionG9Vista();
            inicio.setVisible(true);
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMAdministrarCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAdministrarCentrosActionPerformed
        escritorioR();
        AdministracionCentrosVacunacion centro = new AdministracionCentrosVacunacion();
        centro.setVisible(true);
        escritorio.add(centro);
        escritorio.moveToFront(centro);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = centro.getSize();
        centro.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        centro.show();
    }//GEN-LAST:event_jMAdministrarCentrosActionPerformed

    private void jMAdministracionVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAdministracionVacunasActionPerformed
        escritorioR();
        AdministracionVacunasVista vacunas = new AdministracionVacunasVista();
        vacunas.setVisible(true);
        escritorio.add(vacunas);
        escritorio.moveToFront(vacunas);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vacunas.getSize();
        vacunas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        vacunas.show();
    }//GEN-LAST:event_jMAdministracionVacunasActionPerformed

    private void jMListadoMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListadoMensualActionPerformed
        escritorioR();
        AdministracionListadoMensualCitas citas = new AdministracionListadoMensualCitas();
        citas.setVisible(true);
        escritorio.add(citas);
        escritorio.moveToFront(citas);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = citas.getSize();
        citas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        citas.show();
    }//GEN-LAST:event_jMListadoMensualActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorioR();
        LaboratorioVista lb = new LaboratorioVista();
        lb.setVisible(true);
        escritorio.add(lb);
        escritorio.moveToFront(lb);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = lb.getSize();
        lb.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        lb.show();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMListarCiudadanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarCiudadanosActionPerformed
        
        escritorioR();
        AdministracionListarCiudadanos aec = new AdministracionListarCiudadanos();
        aec.setVisible(true);
        escritorio.add(aec);
        escritorio.moveToFront(aec);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = aec.getSize();
        aec.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        aec.show();
    }//GEN-LAST:event_jMListarCiudadanosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorioR();
        AdministracionCitas cita = new AdministracionCitas();
        cita.setVisible(true);
        escritorio.add(cita);
        escritorio.moveToFront(cita);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = cita.getSize();
        cita.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        cita.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMAdministracionVacunas;
    private javax.swing.JMenuItem jMAdministrarCentros;
    private javax.swing.JMenu jMCentro;
    private javax.swing.JMenu jMCitas;
    private javax.swing.JMenu jMCiudadano;
    private javax.swing.JMenuItem jMListadoMensual;
    private javax.swing.JMenuItem jMListarCiudadanos;
    private javax.swing.JMenu jMManejoDeDosis;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private void escritorioR() {
        escritorio.removeAll();
        escritorio.repaint();
    }
    
}
