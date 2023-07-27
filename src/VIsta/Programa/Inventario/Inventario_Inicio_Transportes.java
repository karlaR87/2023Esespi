
package VIsta.Programa.Inventario;

import Controlador.ControladorTransporte;
import Controlador.ControladorTransporteEAB;
import Modelo.ModeloDatosTransporte;
import Modelo.ModeloTransporte;
import VIsta.VistaAgregarTransporte;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inventario_Inicio_Transportes extends javax.swing.JFrame {

   
    public Inventario_Inicio_Transportes() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosTransporte = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNuevoDetalle = new javax.swing.JTextField();
        txtNuevaPLaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 68, 68));
        jPanel1.setForeground(new java.awt.Color(68, 68, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tbDatosTransporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 580, 370));

        btnModificar.setBackground(new java.awt.Color(68, 68, 68));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditarTransporte.png"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        jButton2.setBackground(new java.awt.Color(68, 68, 68));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAgregarArticulo.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(68, 68, 68));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEliminarArticulo.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 310, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Vista de detalles de transporte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 520, 70));
        jPanel1.add(txtNuevoDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 230, -1));
        jPanel1.add(txtNuevaPLaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            VistaAgregarTransporte vb = new VistaAgregarTransporte();
            vb.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario_Inicio_Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        ModeloDatosTransporte modDtaos = new ModeloDatosTransporte();
        modDtaos.mostrarDatos(this);
    }//GEN-LAST:event_txtBusquedaKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inventario_Inicio_Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario_Inicio_Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario_Inicio_Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario_Inicio_Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModeloTransporte modelo = new ModeloTransporte();
                    ModeloDatosTransporte modDtaos = new ModeloDatosTransporte();
                    Inventario_Inicio_Transportes me = new Inventario_Inicio_Transportes();
                    ControladorTransporteEAB ny = new ControladorTransporteEAB(modelo, modDtaos, me);
                    
                    
                    me.setVisible(true);
                     modDtaos.mostrar(me);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbDatosTransporte;
    public javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtNuevaPLaca;
    public javax.swing.JTextField txtNuevoDetalle;
    // End of variables declaration//GEN-END:variables
}
