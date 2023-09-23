package VIsta.Programa.Patrullajes;

import fonts.Fuentes;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Pao
 */
public class Patrullajes_Agregar extends javax.swing.JPanel {

    ImageIcon iconoOriginalAdd;
    ImageIcon iconoOriginalAddCLARE;
     
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoOriginalCancelCLARE;
     
    ImageIcon iconoOriginalAddPerson;
    ImageIcon iconoOriginalAddPersonCLARE;
    
    ImageIcon iconoOriginalAddMap;
    ImageIcon iconoOriginalAddMapCLARE;
    
    ImageIcon iconoOriginalAddActPatru;
    ImageIcon iconoOriginalAddActPatruCLARE;
    
    
    Fuentes tipoFuentes;
   
    public Patrullajes_Agregar() {
        initComponents();
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnAdd.png"); 
        iconoOriginalAddCLARE = new ImageIcon("src/VIsta/imagenes/btnAddCLARE.png");
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnCancel21.png"); 
        iconoOriginalCancelCLARE = new ImageIcon("src/VIsta/imagenes/btnCancel21CLARE.png"); 
        
        iconoOriginalAddPerson = new ImageIcon("src/VIsta/imagenes/agregar 16.png"); 
        iconoOriginalAddPersonCLARE = new ImageIcon("src/VIsta/imagenes/agregar 16CLARE.png");
        
        iconoOriginalAddMap = new ImageIcon("src/VIsta/imagenes/btnEditMap.png"); 
        iconoOriginalAddMapCLARE = new ImageIcon("src/VIsta/imagenes/btnEditMapCLARE.png");
        
        iconoOriginalAddActPatru = new ImageIcon("src/VIsta/imagenes/btnAddActPatru.png"); 
        iconoOriginalAddActPatruCLARE = new ImageIcon("src/VIsta/imagenes/btnAddActPatruCLARE.png");
        
        fontDesign();
    }

    public void OriginalIcon()
    {
        btnAddPatrullaje.setIcon(iconoOriginalAdd);
        btnCancelPatrullaje.setIcon(iconoOriginalCancel);
        btnAddPersonal.setIcon(iconoOriginalAddPerson);
        btnAddUbi.setIcon(iconoOriginalAddMap);
        btnAddActPatru.setIcon(iconoOriginalAddActPatru);
    }
    
   private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
        // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddUbi = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddPersonal = new javax.swing.JButton();
        lblMAPImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddActPatru = new javax.swing.JButton();
        pnlPersonal = new javax.swing.JPanel();
        btnCancelPatrullaje = new javax.swing.JButton();
        btnAddPatrullaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddUbi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditMap.png"))); // NOI18N
        btnAddUbi.setBorderPainted(false);
        btnAddUbi.setContentAreaFilled(false);
        btnAddUbi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseExited(evt);
            }
        });
        add(btnAddUbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 215, 40, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        btnAddPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/agregar 16.png"))); // NOI18N
        btnAddPersonal.setBorderPainted(false);
        btnAddPersonal.setContentAreaFilled(false);
        btnAddPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseExited(evt);
            }
        });
        add(btnAddPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 15, 30, 31));

        lblMAPImage.setBackground(new java.awt.Color(70, 70, 70));
        lblMAPImage.setForeground(new java.awt.Color(70, 70, 70));
        lblMAPImage.setText("jLabel12");
        add(lblMAPImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 400, 200));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> NO EXISTE <br> PERSONAL <br> ASIGNADO </html>");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 145, 130, -1));

        btnAddActPatru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddActPatru.png"))); // NOI18N
        btnAddActPatru.setBorderPainted(false);
        btnAddActPatru.setContentAreaFilled(false);
        btnAddActPatru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddActPatru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseExited(evt);
            }
        });
        add(btnAddActPatru, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 250, -1));

        pnlPersonal.setBackground(new java.awt.Color(70, 70, 70));
        pnlPersonal.setLayout(new java.awt.BorderLayout());
        add(pnlPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 230, 200));

        btnCancelPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancel21.png"))); // NOI18N
        btnCancelPatrullaje.setBorderPainted(false);
        btnCancelPatrullaje.setContentAreaFilled(false);
        btnCancelPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseExited(evt);
            }
        });
        add(btnCancelPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 518, 250, -1));

        btnAddPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAdd.png"))); // NOI18N
        btnAddPatrullaje.setBorderPainted(false);
        btnAddPatrullaje.setContentAreaFilled(false);
        btnAddPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseExited(evt);
            }
        });
        add(btnAddPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 436, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddShadow.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 436, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancel21Shadow.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 518, -1, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/PersonaleBack.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backFinishPatrullaje.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 440, -1, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RBACKAddUbi.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 10, -1, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backInitPatrullaje.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 265, -1, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseClicked

    }//GEN-LAST:event_btnCancelPatrullajeMouseClicked

    private void btnAddPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatrullajeMouseClicked

    private void btnAddPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPersonalMouseClicked

    private void btnAddUbiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUbiMouseClicked

    private void btnAddPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseEntered
        OriginalIcon();
        btnAddPersonal.setIcon(iconoOriginalAddPersonCLARE);
    }//GEN-LAST:event_btnAddPersonalMouseEntered

    private void btnAddPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseEntered
        OriginalIcon();
        btnAddPatrullaje.setIcon(iconoOriginalAddCLARE);
    }//GEN-LAST:event_btnAddPatrullajeMouseEntered

    private void btnCancelPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseEntered
        OriginalIcon();
        btnCancelPatrullaje.setIcon(iconoOriginalCancelCLARE);
    }//GEN-LAST:event_btnCancelPatrullajeMouseEntered

    private void btnAddUbiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseEntered
      OriginalIcon();
      btnAddUbi.setIcon(iconoOriginalAddMapCLARE);
    }//GEN-LAST:event_btnAddUbiMouseEntered

    private void btnAddPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddPersonalMouseExited

    private void btnAddPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddPatrullajeMouseExited

    private void btnCancelPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnCancelPatrullajeMouseExited

    private void btnAddUbiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddUbiMouseExited

    private void btnAddActPatruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActPatruMouseClicked

    private void btnAddActPatruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseEntered
        OriginalIcon();
        btnAddActPatru.setIcon(iconoOriginalAddActPatruCLARE);
    }//GEN-LAST:event_btnAddActPatruMouseEntered

    private void btnAddActPatruMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddActPatruMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddActPatru;
    public javax.swing.JButton btnAddPatrullaje;
    public javax.swing.JButton btnAddPersonal;
    public javax.swing.JButton btnAddUbi;
    public javax.swing.JButton btnCancelPatrullaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMAPImage;
    public javax.swing.JPanel pnlPersonal;
    // End of variables declaration//GEN-END:variables
}
