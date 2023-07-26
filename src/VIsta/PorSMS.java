package VIsta;

import fonts.Fuentes;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;
import java.util.Random;
import javax.swing.JOptionPane;

public class PorSMS extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    public PorSMS() {
        initComponents();
        visibleinCode(false); 
        fontDesign();
    }
    
    public void visibleinCode( boolean a)
    {
        jLabel5.setVisible(a);
        jLabel13.setVisible(a);
        jLabel11.setVisible(a);
        txtCodeN.setVisible(a);
        jLabel6.setVisible(a);
        jLabel7.setVisible(a);
        jLabel12.setVisible(a);
        btnAceptar.setVisible(a);
    }

     private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
       
       jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       
        btnEnviarCode.setText("<html><font color='white'> Enviar </font></html>");
        caracBtn(btnEnviarCode);
        
        btnAceptar.setText("<html><font color='white'> Aceptar </font></html>");
        caracBtn(btnAceptar);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodeN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEnviarCode = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("Volver a enviar");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("¿No has recibido nada?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        txtNumero.setBackground(new java.awt.Color(51, 51, 51));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setToolTipText("");
        txtNumero.setBorder(null);
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 380, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/cellphone.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 430, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> Ingrese el número telefónico con el cual registró <br> su cuenta. </html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 430, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> Ingrese el código enviado a su número telefónico  <br> para reestablecer su contraseña. </html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 430, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/cls1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 30, 50));

        txtCodeN.setBackground(new java.awt.Color(51, 51, 51));
        txtCodeN.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtCodeN.setForeground(new java.awt.Color(255, 255, 255));
        txtCodeN.setToolTipText("");
        txtCodeN.setBorder(null);
        jPanel1.add(txtCodeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 380, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 430, 70));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 360, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 390, 100));

        btnEnviarCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnEnviarCode.setBorderPainted(false);
        btnEnviarCode.setContentAreaFilled(false);
        btnEnviarCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarCodeMouseClicked(evt);
            }
        });
        jPanel1.add(btnEnviarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 360, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 370, 60));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fast-forward.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G8.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/conversationdrop.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R5.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnEnviarCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarCodeMouseClicked

    }//GEN-LAST:event_btnEnviarCodeMouseClicked

    public int numeroAleatorio;
    public String numberString;
    public String numeroReceptor;
    public void sendSMS()
    {  
        try{
           String ACCOUNT_SID = "ACd88cf77d417af40bf11c6f7e800d6d35";
           String AUTH_TOKEN = "64b25b80a598d3c7ea319a58a31cbc98";

        //CodigoNumericoRandom
        Random random = new Random();
        numeroAleatorio = random.nextInt(23543);
            
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
         Message message = Message.creator(
        new com.twilio.type.PhoneNumber("+50369983522"),
        new com.twilio.type.PhoneNumber("+15738892923"),
        numberString)
          .create();

        System.out.println(message.getSid());
        JOptionPane.showMessageDialog(this, "Mensaje Enviado");
        visibleinCode(true); 
    }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this, "Hubo un error en el envio");
        }
    }
    
    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        visibleinCode(false); 
        txtNumero.setText("");
        txtCodeN.setText("");
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        sendSMS();
    }//GEN-LAST:event_jLabel13MouseClicked

       public JLabel getlblBack() {
        return lblBack;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnEnviarCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    public javax.swing.JTextField txtCodeN;
    public javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
