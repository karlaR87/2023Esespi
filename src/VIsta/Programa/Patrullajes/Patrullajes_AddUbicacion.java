package VIsta.Programa.Patrullajes;

import java.awt.Color;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.viewer.*;
import org.jxmapviewer.viewer.Waypoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;

public class Patrullajes_AddUbicacion extends javax.swing.JFrame{


    ImageIcon iconoOriginalExport;
    ImageIcon iconoOriginalExportCLARE;
    
    
    public Patrullajes_AddUbicacion() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        
        iconoOriginalExport = new ImageIcon("src/VIsta/imagenes/btnEXPORTAR.png"); 
        iconoOriginalExportCLARE = new ImageIcon("src/VIsta/imagenes/btnEXPORTARCLARE.png");
        
    }

    public void OriginalIcon()
    {
        btnEXPORTAR.setIcon(iconoOriginalExport);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelMap = new javax.swing.JButton();
        btnEXPORTAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpnlMapContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCANCELMAP.png"))); // NOI18N
        btnCancelMap.setBorderPainted(false);
        btnCancelMap.setContentAreaFilled(false);
        btnCancelMap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMapMouseExited(evt);
            }
        });
        getContentPane().add(btnCancelMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        btnEXPORTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEXPORTAR.png"))); // NOI18N
        btnEXPORTAR.setBorderPainted(false);
        btnEXPORTAR.setContentAreaFilled(false);
        btnEXPORTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEXPORTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEXPORTARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEXPORTARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEXPORTARMouseExited(evt);
            }
        });
        getContentPane().add(btnEXPORTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 446, -1, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEXPORTARShadow.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 450, 180, 90));

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlMapContainer.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpnlMapContainerLayout = new javax.swing.GroupLayout(jpnlMapContainer);
        jpnlMapContainer.setLayout(jpnlMapContainerLayout);
        jpnlMapContainerLayout.setHorizontalGroup(
            jpnlMapContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jpnlMapContainerLayout.setVerticalGroup(
            jpnlMapContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jpnlMapContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXPORTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXPORTARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXPORTARMouseClicked

    private void btnEXPORTARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXPORTARMouseEntered
        OriginalIcon();
        btnEXPORTAR.setIcon(iconoOriginalExportCLARE);
    }//GEN-LAST:event_btnEXPORTARMouseEntered

    private void btnEXPORTARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXPORTARMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnEXPORTARMouseExited

    private void btnCancelMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMapMouseClicked

    private void btnCancelMapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMapMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMapMouseEntered

    private void btnCancelMapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMapMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMapMouseExited

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
            java.util.logging.Logger.getLogger(Patrullajes_AddUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patrullajes_AddUbicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelMap;
    public javax.swing.JButton btnEXPORTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jpnlMapContainer;
    // End of variables declaration//GEN-END:variables
}
