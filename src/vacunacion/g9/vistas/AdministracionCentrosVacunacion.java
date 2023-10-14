package vacunacion.g9.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunacion.g9.accesoADatos.CentroData;
import vacunacion.g9.entidades.Centro;

public class AdministracionCentrosVacunacion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    CentroData centro = new CentroData();
    public AdministracionCentrosVacunacion() {
        initComponents();
        cabecera();
        cargarDatosATabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCentrosVacunacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRSur = new javax.swing.JRadioButton();
        jREste = new javax.swing.JRadioButton();
        jRNorte = new javax.swing.JRadioButton();
        jROeste = new javax.swing.JRadioButton();
        jRTodos = new javax.swing.JRadioButton();
        jRDepositoCentral = new javax.swing.JRadioButton();
        jBCerrar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jTCentrosVacunacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Telefono", "Zona", "Activo"
            }
        ));
        jScrollPane1.setViewportView(jTCentrosVacunacion);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Centros de vacunacion");

        buttonGroup1.add(jRSur);
        jRSur.setText("Sur");
        jRSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSurActionPerformed(evt);
            }
        });

        buttonGroup1.add(jREste);
        jREste.setText("Este");
        jREste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREsteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRNorte);
        jRNorte.setText("Norte");
        jRNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNorteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jROeste);
        jROeste.setText("Oeste");
        jROeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jROesteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRTodos);
        jRTodos.setText("Todos");
        jRTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRDepositoCentral);
        jRDepositoCentral.setText("Deposito central");
        jRDepositoCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDepositoCentralActionPerformed(evt);
            }
        });

        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jRDepositoCentral)
                                .addGap(18, 18, 18)
                                .addComponent(jRNorte)
                                .addGap(18, 18, 18)
                                .addComponent(jRSur)
                                .addGap(18, 18, 18)
                                .addComponent(jREste)
                                .addGap(18, 18, 18)
                                .addComponent(jROeste)
                                .addGap(18, 18, 18)
                                .addComponent(jRTodos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRSur)
                    .addComponent(jREste)
                    .addComponent(jRNorte)
                    .addComponent(jROeste)
                    .addComponent(jRTodos)
                    .addComponent(jRDepositoCentral))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCerrar)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jRNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNorteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRNorteActionPerformed

    private void jRSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSurActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRSurActionPerformed

    private void jREsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREsteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jREsteActionPerformed

    private void jROesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jROesteActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jROesteActionPerformed

    private void jRDepositoCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDepositoCentralActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRDepositoCentralActionPerformed

    private void jRTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodosActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jRTodosActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        //Crear un JFrame para cargar los datos
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try{
            int filaS = jTCentrosVacunacion.getSelectedRow();
            int id = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 0).toString());
            String nombre = jTCentrosVacunacion.getValueAt(filaS, 1).toString();
            String direccion = jTCentrosVacunacion.getValueAt(filaS, 2).toString();
            int telefono = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 3).toString());
            String zona = jTCentrosVacunacion.getValueAt(filaS, 4).toString();
            boolean activo = Boolean.parseBoolean(jTCentrosVacunacion.getValueAt(filaS, 5).toString());
            Centro c = new Centro(id, nombre, direccion, telefono, zona, activo);
            centro.modificarCentro(c);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Algo salio mal \n" + ex);
        }finally {
            cargarDatosATabla();
        }      
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try{
            int filaS = jTCentrosVacunacion.getSelectedRow();
            int id = Integer.parseInt(jTCentrosVacunacion.getValueAt(filaS, 0).toString());
            centro.eliminarCentro(id);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Algo salio mal \n" + ex);
        }finally {
            cargarDatosATabla();
        }  
    }//GEN-LAST:event_jBEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRDepositoCentral;
    private javax.swing.JRadioButton jREste;
    private javax.swing.JRadioButton jRNorte;
    private javax.swing.JRadioButton jROeste;
    private javax.swing.JRadioButton jRSur;
    private javax.swing.JRadioButton jRTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCentrosVacunacion;
    // End of variables declaration//GEN-END:variables
    private void cabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Zona");
        modelo.addColumn("activo");
        jTCentrosVacunacion.setModel(modelo);
    }
    
    private void cargarDatosATabla(){
        if (!jRTodos.isSelected() && !jRNorte.isSelected() && !jRSur.isSelected() 
        && !jREste.isSelected() && !jROeste.isSelected() && !jRDepositoCentral.isSelected()) {
            jRTodos.setSelected(true);  
        }              
        modelo.setRowCount(0);
        if (jRTodos.isSelected()) {
            for (Centro c : centro.listarCentros()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }else if(jRNorte.isSelected()){
            for (Centro c : centro.listarCentrosNorte()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }else if(jRSur.isSelected()){
            for (Centro c : centro.listarCentrosSur()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }else if(jREste.isSelected()){
            for (Centro c : centro.listarCentrosEste()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }else if(jROeste.isSelected()){
            for (Centro c : centro.listarCentrosOeste()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }else if(jRDepositoCentral.isSelected()){
            for (Centro c : centro.listarCentrosDepositoCentral()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDireccion(),
                c.getTelefono(),
                c.getZona(),
                c.isActivo()});
            }
        }
    }
}
