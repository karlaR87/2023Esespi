
package VIsta;

import Controlador.ControladorTransporte;
import Modelo.ModeloDatosTransporte;
import Modelo.ModeloTransporte;
import Modelo.TextPrompt;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import javax.swing.*;

public class VistaAgregarTransporte extends javax.swing.JFrame {

    public VistaAgregarTransporte() throws SQLException {
        initComponents();
        
        //Agregar un placeholder
        TextPrompt placeholder = new TextPrompt("Buscar", txtBusqueda);
        
        ModeloTransporte m = new ModeloTransporte();
        ModeloDatosTransporte mn = new ModeloDatosTransporte();
        m.llenarCombo(cmbTipos);
        
       
        m.llenarComboMarcas(cmbMarcas);
        m.llenarComboGrupos(cmbGrupos);
        
        /*SpinnerNumberModel snm = new SpinnerNumberModel();
        snm.setMaximum(10);
        snm.setMinimum(0);
        snm.setStepSize(1);
        spNumeros.setModel(snm);*/
        
        mn.mostrar(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        cmbTipos = new javax.swing.JComboBox<>();
        cmbMarcas = new javax.swing.JComboBox<>();
        cmbGrupos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDetalles = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosTransporte = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTiposActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 189, 30));

        cmbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 189, 30));

        cmbGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 189, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalles:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Núm. Placa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel1.add(txtDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 188, 75));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, 44));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca del transporte");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 153, 20));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de transporte");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 153, 20));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Grupo de patrullaje");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 153, 20));

        btnModificar.setBackground(new java.awt.Color(68, 68, 68));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(68, 68, 68));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(68, 68, 68));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnDeletePolicia.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        tbDatosTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDatosTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosTransporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatosTransporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 550, 320));

        txtBusqueda.setBorder(null);
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 270, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/searchBack.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRegresar1.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Vista_Transporte3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     ModeloDatosTransporte men = new ModeloDatosTransporte();
    
    private void cmbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposActionPerformed
        
    }//GEN-LAST:event_cmbTiposActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
       String texto1 = txtDetalles.getText();
        String texto2 = txtPlaca.getText();
        
        if(texto1.isBlank()||texto2.isBlank())
        {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        }
        else if(texto2.length()< 8)
        {
            JOptionPane.showMessageDialog(null, "No se permiten menos de 8 digitos para la placa");
        }
        else if(texto2.length()>8)
        {
            JOptionPane.showMessageDialog(null, "No se permiten más de 8 digitos para la placa");
        }
        else
        {
            ModeloTransporte n = new ModeloTransporte();
        ModeloDatosTransporte m = new ModeloDatosTransporte();
        
        //
        String variable = (String) cmbTipos.getSelectedItem();
        String variable2 = (String) cmbMarcas.getSelectedItem();
         String variable3 = (String) cmbGrupos.getSelectedItem();
            int v = -1;
            int v2 = -1;
            int v3 = -1;
            try {
                v = n.IdRetorno(variable);
                System.out.println(v);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            try {
                v2 = n.IdRetorno2(variable2);
                System.out.println(v2);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
             try {
                v3= n.IdRetorno3(variable3);
                System.out.println(v3);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
             
            m.setDetalles(txtDetalles.getText());
             m.setPlaca(txtPlaca.getText());
            n.setTipotransporte(variable);
             n.setMarcas(variable2);
             
             
             n.setId(v);
             n.setId2(v2);
             n.setId3(v3);
    
        try {
            men.actualizar(this);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            men.mostrar(this);
        
        
        }  
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        
        String texto1 = txtDetalles.getText();
        String texto2 = txtPlaca.getText();
        
        if(texto1.isBlank()||texto2.isBlank())
        {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        }
        else if(texto2.length()< 8)
        {
            JOptionPane.showMessageDialog(null, "No se permiten menos de 8 digitos para la placa");
        }
        else if(texto2.length()>8)
        {
            JOptionPane.showMessageDialog(null, "No se permiten más de 8 digitos para la placa");
        }
        else
        {
            ModeloTransporte n = new ModeloTransporte();
        ModeloDatosTransporte m = new ModeloDatosTransporte();
        
        //
        String variable = (String) cmbTipos.getSelectedItem();
        String variable2 = (String) cmbMarcas.getSelectedItem();
         String variable3 = (String) cmbGrupos.getSelectedItem();
            int v = -1;
            int v2 = -1;
            int v3 = -1;
            try {
                v = n.IdRetorno(variable);
                System.out.println(v);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            try {
                v2 = n.IdRetorno2(variable2);
                System.out.println(v2);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
             try {
                v3= n.IdRetorno3(variable3);
                System.out.println(v3);
            } catch (SQLException ex) {
                System.out.println("ee");
                java.util.logging.Logger.getLogger(ControladorTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
             
            m.setDetalles(txtDetalles.getText());
             m.setPlaca(txtPlaca.getText());
            n.setTipotransporte(variable);
             n.setMarcas(variable2);
             
             
             n.setId(v);
             n.setId2(v2);
             n.setId3(v3);
    
             m.agregar(n, m);
             m.mostrar(this);
        }
        
        
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       men.eliminar(this);
        men.mostrar(this);
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void tbDatosTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosTransporteMouseClicked
        ModeloDatosTransporte modelo = new ModeloDatosTransporte();
        modelo.SeleccionarDato(tbDatosTransporte, txtDetalles, txtPlaca, cmbTipos, cmbMarcas, cmbGrupos);
    }//GEN-LAST:event_tbDatosTransporteMouseClicked

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed

    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        ModeloDatosTransporte modDtaos = new ModeloDatosTransporte();
        modDtaos.mostrarDatos(this);
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    
   
  
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
            java.util.logging.Logger.getLogger(VistaAgregarTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ModeloTransporte modelo = new ModeloTransporte();
                    ModeloDatosTransporte modDtaos = new ModeloDatosTransporte();
                    VistaAgregarTransporte vista = new VistaAgregarTransporte();
                    ControladorTransporte ny = new ControladorTransporte(modelo, modDtaos, vista);
                    
                    
                    vista.setVisible(true);
                } catch (SQLException ex) {
                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cmbGrupos;
    public javax.swing.JComboBox<String> cmbMarcas;
    public javax.swing.JComboBox<String> cmbTipos;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbDatosTransporte;
    public javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtDetalles;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
