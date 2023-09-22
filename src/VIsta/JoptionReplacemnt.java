package VIsta;

import fonts.Fuentes;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Pao
 */
public class JoptionReplacemnt extends javax.swing.JFrame {

    //type = "Mensaje/OK" (0)/ "Pregunta/Si/No" (1)
    //img = "Info" (0)/ "Warning" (1)
    //msg = "el mensaje"
    //FSize = "el tamaño de las font"
    
    private int type;
    private int img;
    private String msg;
    private int FSize;
    public boolean isOpen = false;
    public JButton OKbutton;
    public JButton SIbutton;
    public JButton NObutton;
    Fuentes tipoFuentes;
    
    public JoptionReplacemnt(int type, int img, String msg, int FSize) {
        initComponents();
        ImageIcon icono = new ImageIcon("src/VIsta/imagenes/R100.png"); this.setIconImage(icono.getImage());
        isOpen = true;
        //Transparente
        this.setBackground(new Color(0, 0, 0, 0));
        //Parametros que necesitamos para poder cambiar el mismo dependiendo de la situacion
        this.type = type;
        this.img = img;
        this.msg = msg;
        this.FSize = FSize;
        
        Color clr = new Color( 0, 0, 0,0);
        Color clrBlue = new Color( 2, 68, 194);
        Color clrOrang = new Color( 243, 167, 18);
        
        lblMsg.setText(this.msg);
        
        tipoFuentes = new Fuentes();
        lblMsg.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, this.FSize));
        
        Icon iconOriginal = new ImageIcon("src/VIsta/imagenes/VectorCheckOk.png");
        Icon iconWhite = new ImageIcon("src/VIsta/imagenes/VectorCheckOkWhite.png");   
        
        Icon iconOriginalNO = new ImageIcon("src/VIsta/imagenes/VectorExNo.png");
        Icon iconWhiteNO = new ImageIcon("src/VIsta/imagenes/VectorExNoWhite.png");   
        
        switch (this.type) {
            case 0://1 btn de OK
                jPanel2.setVisible(false);
                jPanel3.setVisible(false);
                OKbutton = new JButton("OK");
                OKbutton.setBounds(-2, -2, 395, 47); // Coordenadas (x, y) y tamaño (ancho, alto)
                OKbutton.setBackground(clr);
                OKbutton.setFocusPainted(false);
                OKbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                OKbutton.setBorderPainted(false);
                OKbutton.setForeground(Color.WHITE);
                OKbutton.setBorder(null);
                OKbutton.setIcon(iconOriginal);
                OKbutton.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
                                
                // Agregar evento MouseEntered
                OKbutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    OKbutton.setBackground(clrBlue); // Cambia el color cuando el mouse entra
                    OKbutton.setIcon(iconWhite);
                }
                });

                // Agregar evento MouseExited
                OKbutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    OKbutton.setBackground(clr); // Restaura el color cuando el mouse sale
                    OKbutton.setIcon(iconOriginal);
                }
                });
                
                jPanel1.add(OKbutton);
                break;
                
            case 1: //Botones si/no
                jPanel1.setVisible(false);
                jPanel2.setVisible(true);
                jPanel3.setVisible(true);
                
                SIbutton = new JButton("SI");
                SIbutton.setBounds(0, -2, 195, 47); // Coordenadas (x, y) y tamaño (ancho, alto)
                SIbutton.setBackground(clr);
                SIbutton.setFocusPainted(false);
                SIbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                SIbutton.setBorderPainted(false);
                SIbutton.setForeground(Color.WHITE);
                SIbutton.setBorder(null);
                SIbutton.setIcon(iconOriginal);
                SIbutton.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
                                
                // Agregar evento MouseEntered
                SIbutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    SIbutton.setBackground(clrBlue); // Cambia el color cuando el mouse entra
                    SIbutton.setIcon(iconWhite);
                }
                });

                // Agregar evento MouseExited
                SIbutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    SIbutton.setBackground(clr); // Restaura el color cuando el mouse sale
                    SIbutton.setIcon(iconOriginal);
                }
                });
                
                //---------------------------------------NO BUTTON---------------------------------------
                NObutton = new JButton("NO");
                NObutton.setBounds(0, -2, 195, 47); // Coordenadas (x, y) y tamaño (ancho, alto)
                NObutton.setBackground(clr);
                NObutton.setFocusPainted(false);
                NObutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                NObutton.setBorderPainted(false);
                NObutton.setForeground(Color.WHITE);
                NObutton.setBorder(null);
                NObutton.setIcon(iconOriginalNO);
                NObutton.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
                                
                // Agregar evento MouseEntered
                NObutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    NObutton.setBackground(clrBlue); // Cambia el color cuando el mouse entra
                    NObutton.setIcon(iconWhiteNO);
                }
                });

                // Agregar evento MouseExited
                NObutton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    NObutton.setBackground(clr); // Restaura el color cuando el mouse sale
                     NObutton.setIcon(iconOriginalNO);
                }
                });
                
                jPanel2.add(SIbutton);
                jPanel3.add(NObutton);
                break;
        }
        
        switch (this.img) {
            case 0:
                ImageIcon icon = new ImageIcon("src/VIsta/imagenes/infoIcon.png");
                lblImg.setIcon(icon);
                break;
            case 1:
                ImageIcon icon2 = new ImageIcon("src/VIsta/imagenes/warningIcon.png");
                lblImg.setIcon(icon2);
                break;
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 70, 70));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 6, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(195, 44));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 44));

        jPanel2.setBackground(new java.awt.Color(70, 70, 70));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 6, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(195, 44));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 140, 195, 44));

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 6, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(348, 49));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 140, 390, 44));

        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg.setText("Aqui va el mensaje");
        lblMsg.setToolTipText("");
        lblMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 110, 375, -1));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/infoIcon.png"))); // NOI18N
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BckGNoti.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 187));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JoptionReplacemnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoptionReplacemnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoptionReplacemnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoptionReplacemnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables
}
