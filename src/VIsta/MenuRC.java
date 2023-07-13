package VIsta;
import fonts.Fuentes;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MenuRC extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    public MenuRC() {
        initComponents();
        fontDesign();  
    }
    
    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));

       jLabel6.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       jLabel7.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       
        btnCorreo.setText("<html><font color='white'>Por correo electrónico </font></html>");
        caracBtn(btnCorreo);
        
        btnSMS.setText("<html><font color='white'>Por número telefónico </font></html>");
        caracBtn(btnSMS);
        
        btnSeguridad.setText("<html><font color='white'>Por preguntas de seguridad </font></html>");
        caracBtn(btnSeguridad);
    }
    
     private void caracBtn(JButton btn)
    {
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 0, 24)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCorreo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSMS = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSeguridad = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R4.png"))); // NOI18N
        btnCorreo.setBorderPainted(false);
        btnCorreo.setContentAreaFilled(false);
        btnCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorreoMouseClicked(evt);
            }
        });
        jPanel2.add(btnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 210, 360, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle3.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 370, 70));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fast-forward.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel2.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/gmail.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/conversationdrop.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/shielddrop.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, 130));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>Se necesita el correo electrónico con el cual <br>vinculó su cuenta.</html>");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 272, -1, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>Se necesita el número telefónico con el cual <br>vinculó su cuenta.</html>");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 412, -1, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Se le harán algunas preguntas sobre su <br> información personal para confirmar <br> que usted es el propietario de la cuenta.</html>");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, 80));

        btnSMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R4.png"))); // NOI18N
        btnSMS.setBorderPainted(false);
        btnSMS.setContentAreaFilled(false);
        btnSMS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSMSMouseClicked(evt);
            }
        });
        jPanel2.add(btnSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 360, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle3.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 370, 160));

        btnSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R4.png"))); // NOI18N
        btnSeguridad.setBorderPainted(false);
        btnSeguridad.setContentAreaFilled(false);
        btnSeguridad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeguridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeguridadMouseClicked(evt);
            }
        });
        jPanel2.add(btnSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 360, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle3.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 370, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group53.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorreoMouseClicked

    }//GEN-LAST:event_btnCorreoMouseClicked

    private void btnSMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMSMouseClicked

    }//GEN-LAST:event_btnSMSMouseClicked

    private void btnSeguridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeguridadMouseClicked

    }//GEN-LAST:event_btnSeguridadMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked

    }//GEN-LAST:event_lblBackMouseClicked

    public JLabel getlblBack() {
        return lblBack;
    }
    
      public JButton getbtnCorreo() {
        return btnCorreo;
    }
    
    public JButton getbtnSMS() {
        return btnSMS;
    }
    
    public JButton getbtnSeguridad() {
        return btnSeguridad;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorreo;
    private javax.swing.JButton btnSMS;
    private javax.swing.JButton btnSeguridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    // End of variables declaration//GEN-END:variables
}
