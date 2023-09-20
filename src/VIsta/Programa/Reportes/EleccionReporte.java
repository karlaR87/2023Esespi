
package VIsta.Programa.Reportes;

import Modelo.conexionSql;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class EleccionReporte extends javax.swing.JFrame {
    VistaReportePatrullajeConParametos vp = new VistaReportePatrullajeConParametos();

    VistaReportrTransporteConParametros vpp = new VistaReportrTransporteConParametros();
    VistaReportePolPat vb = new VistaReportePolPat();
    
    public EleccionReporte() {
        initComponents();
    }
    
  private void mostrarReporte() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("/VIsta/ReporteTransportes.jasper"));
            System.out.println("ee");
            JasperPrint jprint = JasperFillManager.fillReport(report, null, conexionSql.getConexion());
                System.out.println("ee");
            JasperViewer view = new JasperViewer(jprint, false);
             System.out.println("ee");
            view.setTitle("Reporte de transporte");
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            ex.getMessage();
        }
        
    }
  
  private void mostrarReportePat() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("/VIsta/ReportePatrullaje.jasper"));
            System.out.println("ee");
            JasperPrint jprint = JasperFillManager.fillReport(report, null, conexionSql.getConexion());
                System.out.println("ee");
            JasperViewer view = new JasperViewer(jprint, false);
             System.out.println("ee");
            view.setTitle("Reporte de transporte");
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            ex.getMessage();
        }
        
    }
  private void mostrarReportePolPat() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("/VIsta/PoliciasPatrullajes.jasper"));
            System.out.println("ee");
            JasperPrint jprint = JasperFillManager.fillReport(report, null, conexionSql.getConexion());
                System.out.println("ee");
            JasperViewer view = new JasperViewer(jprint, false);
             System.out.println("ee");
            view.setTitle("Reporte de transporte");
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            ex.getMessage();
        }
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpciones = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte de patrullaje", "Reporte de patrullaje con parámetros", "Reporte de transporte", "Reporte de transporte con parámetros", "Reporte de policías en patrullaje", "Reporte de policías en patrullaje con parámetros"}));
        jPanel1.add(cmbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 77.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> En las secciones \"con parámetros\" usted podrá generar reportes a partir de datos específicos; en las secciones que no contengan parámetros, usted podrá generar un reporte completo de todos los datos ingresados</htm>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOTA:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 170, 180));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/ReporteGenerar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        String seleccion = (String) cmbOpciones.getSelectedItem();
        if (seleccion.equals("Reporte de patrullaje")) {
            
           
            mostrarReportePat();
        }
        
        
        String seleccion2 = (String) cmbOpciones.getSelectedItem();
        if (seleccion2.equals("Reporte de patrullaje con parámetros")) {
            
            vp.setVisible(true);
            this.dispose();
        }
        
         String seleccion3 = (String) cmbOpciones.getSelectedItem();
        if (seleccion3.equals("Reporte de transporte")) {
            
            
            
            mostrarReporte();
        }
                 String seleccion4 = (String) cmbOpciones.getSelectedItem();
        if (seleccion3.equals("Reporte de transporte con parámetros")) {
            
            vpp.setVisible(true);
            this.dispose();
        }
        
        if (seleccion3.equals("Reporte de policías en patrullaje")) {
            
            
            
            mostrarReportePolPat();
        }
        if (seleccion3.equals("Reporte de policías en patrullaje con parámetros")) {
            
            vb.setVisible(true);
            this.dispose();
        }
        
        

    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

        //Para cerrar la ventana con el botn de cancelar
        this.dispose();

    }//GEN-LAST:event_btnCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(EleccionReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleccionReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
