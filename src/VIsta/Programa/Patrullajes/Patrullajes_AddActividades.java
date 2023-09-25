package VIsta.Programa.Patrullajes;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Patrullajes_AddActividades extends javax.swing.JFrame {

    ImageIcon iconoOriginalAdd;
    ImageIcon iconoOriginalAddCLARE;
    
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoOriginalCancelCLARE;
    
    public Patrullajes_AddActividades() {
        initComponents();
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnAcept.png"); 
        iconoOriginalAddCLARE = new ImageIcon("src/VIsta/imagenes/btnCheck1CLARE.png");
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnX1.png"); 
        iconoOriginalCancelCLARE = new ImageIcon("src/VIsta/imagenes/btnX1CLARE.png"); 
        
         this.setBackground(new Color(0, 0, 0, 0));
    }

   public void OriginalIcon()
    {
        btnCancel.setIcon(iconoOriginalCancel);
        btnAcept.setIcon(iconoOriginalAdd);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnAcept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BlackTransparentADDPERSONAL.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 560));

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
        getContentPane().add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 500, -1, 50));

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
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 500, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/actPatruBACK.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, -1, -1));

        pack();
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
            java.util.logging.Logger.getLogger(Patrullajes_AddActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patrullajes_AddActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcept;
    public javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
