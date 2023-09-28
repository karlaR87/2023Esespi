package VIsta.Programa.Patrullajes;

import Modelo.ModeloPatrullajes;
import fonts.Fuentes;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class Patrullajes_AddActividades extends javax.swing.JFrame {

    ImageIcon iconoOriginalAdd;
    ImageIcon iconoOriginalAddCLARE;
    
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoOriginalCancelCLARE;
    
    ModeloPatrullajes mdl = new ModeloPatrullajes();
    Fuentes tipoFuentes;
    public Patrullajes_AddActividades() {
        initComponents();
        this.jLabel3.setVisible(false);
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnCheck1.png"); 
        iconoOriginalAddCLARE = new ImageIcon("src/VIsta/imagenes/btnCheck1CLARE.png");
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnX1.png"); 
        iconoOriginalCancelCLARE = new ImageIcon("src/VIsta/imagenes/btnX1CLARE.png"); 
        
         this.setBackground(new Color(0, 0, 0, 0));
         
          try {
            mdl.llenarCombo(cmbMedio1);
            mdl.llenarCombo(cmbMedio2);
            mdl.llenarCombo(cmbMedio3);
            mdl.llenarCombo(cmbMedio4);
            mdl.llenarCombo(cmbMedio5);

        } catch (SQLException e) {
             System.out.println("Error en cmb");
        }
          ImageIcon icono = new ImageIcon("src/VIsta/imagenes/R100.png"); this.setIconImage(icono.getImage());
          fontDesign();
    }

    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
         
       jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel12.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel13.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel6.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel7.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel14.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel15.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel19.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));
       jLabel20.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 16));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtAct1 = new javax.swing.JTextField();
        txtAct2 = new javax.swing.JTextField();
        txtAct3 = new javax.swing.JTextField();
        txtAct4 = new javax.swing.JTextField();
        txtAct5 = new javax.swing.JTextField();
        cmbMedio1 = new javax.swing.JComboBox<>();
        cmbMedio2 = new javax.swing.JComboBox<>();
        cmbMedio3 = new javax.swing.JComboBox<>();
        cmbMedio4 = new javax.swing.JComboBox<>();
        cmbMedio5 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnAcept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BlackTransparentADDPERSONAL.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 560));

        jScrollPane1.setBackground(new java.awt.Color(70, 70, 70));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(330, 390));

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAct1.setBackground(new java.awt.Color(255, 255, 255));
        txtAct1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAct1.setForeground(new java.awt.Color(0, 0, 0));
        txtAct1.setToolTipText("");
        txtAct1.setBorder(null);
        txtAct1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAct1KeyTyped(evt);
            }
        });
        jPanel1.add(txtAct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 290, 20));

        txtAct2.setBackground(new java.awt.Color(255, 255, 255));
        txtAct2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAct2.setForeground(new java.awt.Color(0, 0, 0));
        txtAct2.setToolTipText("");
        txtAct2.setBorder(null);
        txtAct2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAct2KeyTyped(evt);
            }
        });
        jPanel1.add(txtAct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 290, 20));

        txtAct3.setBackground(new java.awt.Color(255, 255, 255));
        txtAct3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAct3.setForeground(new java.awt.Color(0, 0, 0));
        txtAct3.setToolTipText("");
        txtAct3.setBorder(null);
        txtAct3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAct3KeyTyped(evt);
            }
        });
        jPanel1.add(txtAct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 20));

        txtAct4.setBackground(new java.awt.Color(255, 255, 255));
        txtAct4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAct4.setForeground(new java.awt.Color(0, 0, 0));
        txtAct4.setToolTipText("");
        txtAct4.setBorder(null);
        txtAct4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAct4KeyTyped(evt);
            }
        });
        jPanel1.add(txtAct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 540, 290, 20));

        txtAct5.setBackground(new java.awt.Color(255, 255, 255));
        txtAct5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAct5.setForeground(new java.awt.Color(0, 0, 0));
        txtAct5.setToolTipText("");
        txtAct5.setBorder(null);
        txtAct5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAct5KeyTyped(evt);
            }
        });
        jPanel1.add(txtAct5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 690, 290, 20));

        cmbMedio1.setBackground(new java.awt.Color(59, 126, 255));
        cmbMedio1.setForeground(new java.awt.Color(255, 255, 255));
        cmbMedio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedio1.setBorder(null);
        jPanel1.add(cmbMedio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 300, 25));

        cmbMedio2.setBackground(new java.awt.Color(59, 126, 255));
        cmbMedio2.setForeground(new java.awt.Color(255, 255, 255));
        cmbMedio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedio2.setBorder(null);
        jPanel1.add(cmbMedio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 25));

        cmbMedio3.setBackground(new java.awt.Color(59, 126, 255));
        cmbMedio3.setForeground(new java.awt.Color(255, 255, 255));
        cmbMedio3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedio3.setBorder(null);
        jPanel1.add(cmbMedio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 300, 25));

        cmbMedio4.setBackground(new java.awt.Color(59, 126, 255));
        cmbMedio4.setForeground(new java.awt.Color(255, 255, 255));
        cmbMedio4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedio4.setBorder(null);
        jPanel1.add(cmbMedio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 300, 25));

        cmbMedio5.setBackground(new java.awt.Color(59, 126, 255));
        cmbMedio5.setForeground(new java.awt.Color(255, 255, 255));
        cmbMedio5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMedio5.setBorder(null);
        jPanel1.add(cmbMedio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 300, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1° Actividad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Medio de asignación:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKTXTACTPATRU.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Line195.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 124, -1, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKTXTACTPATRU.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Medio de asignación:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2° Actividad:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Medio de asignación:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("3° Actividad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKTXTACTPATRU.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Line195.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 10));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Medio de asignación:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("4° Actividad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKTXTACTPATRU.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Line195.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKTXTACTPATRU.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("5° Actividad:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Medio de asignación:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Line195.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, 30));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 390));

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

    private void txtAct1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAct1KeyTyped
        if (txtAct1.getText().trim().length() >= 100) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtAct1KeyTyped

    private void txtAct2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAct2KeyTyped
         if (txtAct2.getText().trim().length() >= 100) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtAct2KeyTyped

    private void txtAct3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAct3KeyTyped
         if (txtAct3.getText().trim().length() >= 100) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtAct3KeyTyped

    private void txtAct4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAct4KeyTyped
         if (txtAct4.getText().trim().length() >= 100) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtAct4KeyTyped

    private void txtAct5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAct5KeyTyped
         if (txtAct5.getText().trim().length() >= 100) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtAct5KeyTyped

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
    public javax.swing.JComboBox<String> cmbMedio1;
    public javax.swing.JComboBox<String> cmbMedio2;
    public javax.swing.JComboBox<String> cmbMedio3;
    public javax.swing.JComboBox<String> cmbMedio4;
    public javax.swing.JComboBox<String> cmbMedio5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtAct1;
    public javax.swing.JTextField txtAct2;
    public javax.swing.JTextField txtAct3;
    public javax.swing.JTextField txtAct4;
    public javax.swing.JTextField txtAct5;
    // End of variables declaration//GEN-END:variables
}
