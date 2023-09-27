
package VIsta.Programa.Patrullajes;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Pao
 */
public class Patrullajes_AddEquipamiento extends javax.swing.JFrame {

    ImageIcon iconoOriginalAdd;
    ImageIcon iconoOriginalAddCLARE;
    
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoOriginalCancelCLARE;
    
    public Patrullajes_AddEquipamiento() {
        initComponents();
        this.jLabel5.setVisible(false);
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnCheck1.png"); 
        iconoOriginalAddCLARE = new ImageIcon("src/VIsta/imagenes/btnCheck1CLARE.png");
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnX1.png"); 
        iconoOriginalCancelCLARE = new ImageIcon("src/VIsta/imagenes/btnX1CLARE.png"); 
        
         this.setBackground(new Color(0, 0, 0, 0));
         ImageIcon icono = new ImageIcon("src/VIsta/imagenes/R100.png"); this.setIconImage(icono.getImage());

    }

     public void OriginalIcon()
    {
        btnCancel.setIcon(iconoOriginalCancel);
        btnAcept.setIcon(iconoOriginalAdd);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnAcept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollBastones = new javax.swing.JScrollPane();
        jScrollEsposas = new javax.swing.JScrollPane();
        jScrollTaser = new javax.swing.JScrollPane();
        jScrollRadios = new javax.swing.JScrollPane();
        jScrollEscudos = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollVisores = new javax.swing.JScrollPane();
        jScrollChalecos = new javax.swing.JScrollPane();
        jScrollGeolocalizacion = new javax.swing.JScrollPane();
        jScrollTactico = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BLACKTRANSPARENT910X536.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAcept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCheck1.png"))); // NOI18N
        btnAcept.setBorderPainted(false);
        btnAcept.setContentAreaFilled(false);
        btnAcept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptMouseExited(evt);
            }
        });
        getContentPane().add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, 50));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnX1.png"))); // NOI18N
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, 50));

        jScrollPane5.setBackground(new java.awt.Color(70, 70, 70));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollBastones.setBackground(new java.awt.Color(70, 70, 70));
        jScrollBastones.setBorder(null);
        jPanel1.add(jScrollBastones, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 34, 195, 130));

        jScrollEsposas.setBackground(new java.awt.Color(70, 70, 70));
        jScrollEsposas.setBorder(null);
        jPanel1.add(jScrollEsposas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 34, 195, 130));

        jScrollTaser.setBackground(new java.awt.Color(70, 70, 70));
        jScrollTaser.setBorder(null);
        jPanel1.add(jScrollTaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 197, 195, 130));

        jScrollRadios.setBackground(new java.awt.Color(70, 70, 70));
        jScrollRadios.setBorder(null);
        jPanel1.add(jScrollRadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 197, 195, 130));

        jScrollEscudos.setBackground(new java.awt.Color(70, 70, 70));
        jScrollEscudos.setBorder(null);
        jPanel1.add(jScrollEscudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 195, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKSEGURIDADELEMENTOS.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 420, 520));

        jScrollPane5.setViewportView(jPanel1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 130, 430, 360));

        jScrollVisores.setBackground(new java.awt.Color(70, 70, 70));
        jScrollVisores.setBorder(null);
        getContentPane().add(jScrollVisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 164, 195, 130));

        jScrollChalecos.setBackground(new java.awt.Color(70, 70, 70));
        jScrollChalecos.setBorder(null);
        getContentPane().add(jScrollChalecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 164, 195, 130));

        jScrollGeolocalizacion.setBackground(new java.awt.Color(70, 70, 70));
        jScrollGeolocalizacion.setBorder(null);
        getContentPane().add(jScrollGeolocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 337, 195, 130));

        jScrollTactico.setBackground(new java.awt.Color(70, 70, 70));
        jScrollTactico.setBorder(null);
        getContentPane().add(jScrollTactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 337, 195, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKSEGURIDAD.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKESPECIALIZADOS.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKEQUIPOAGREGAR.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptMouseClicked

    private void btnAceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptMouseEntered
        OriginalIcon();
        btnAcept.setIcon(iconoOriginalAddCLARE);
    }//GEN-LAST:event_btnAceptMouseEntered

    private void btnAceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAceptMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        OriginalIcon();
        btnCancel.setIcon(iconoOriginalCancelCLARE);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnCancelMouseExited

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
            java.util.logging.Logger.getLogger(Patrullajes_AddEquipamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddEquipamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddEquipamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddEquipamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patrullajes_AddEquipamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcept;
    public javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollBastones;
    public javax.swing.JScrollPane jScrollChalecos;
    public javax.swing.JScrollPane jScrollEscudos;
    public javax.swing.JScrollPane jScrollEsposas;
    public javax.swing.JScrollPane jScrollGeolocalizacion;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollRadios;
    public javax.swing.JScrollPane jScrollTactico;
    public javax.swing.JScrollPane jScrollTaser;
    public javax.swing.JScrollPane jScrollVisores;
    // End of variables declaration//GEN-END:variables
}
