package VIsta;

import fonts.Fuentes;
import javax.swing.JLabel;

import javax.swing.JButton;

import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Session;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class PorCorreo extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    
    public PorCorreo() {
        initComponents();      
        visibleinCode(false);      
        fontDesign();
    }

    public void visibleinCode( boolean a)
    {
        jLabel5.setVisible(a);
        txtCode.setVisible(a);
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
    
     String CorreoA;
     public int numeroAleatorio;
      public final void EnviarCorreo(){        
        try{
            CorreoA = txtMail.getText().trim();
            
            Properties props = new Properties();
            props.setProperty("mail.smtp.ssl.trust", "*");
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
             
            Session session = Session.getDefaultInstance(props);
            
            String CorreoRemitente = "esespi.system@gmail.com";
            String PassRemitente = "jikc dpbp mnxd doyx";
            
            String CorreoReceptor = CorreoA;
            
            String Asunto = "Recuperacion de Contraseña";
            
            //CodigoNumericoRandom
            Random random = new Random();
            numeroAleatorio = random.nextInt(23543);
            
            String Mensaje = "Ingresa el siguiente codigo para reestablecer tu Contraseña: " + numeroAleatorio;
           
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(CorreoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(CorreoReceptor));
            message.setSubject(Asunto);
            message.setText(Mensaje);
            
            Transport t = session.getTransport("smtp");
            t.connect(CorreoRemitente, PassRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            
            t.close();
            JOptionPane.showMessageDialog(this, "Correo Enviado");
            visibleinCode(true);          
        }catch(Exception ex){
            System.out.println("Error fatal: " + ex.toString());
        }    
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEnviarCode = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(870, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMail.setBackground(new java.awt.Color(51, 51, 51));
        txtMail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMail.setForeground(new java.awt.Color(255, 255, 255));
        txtMail.setToolTipText("");
        txtMail.setBorder(null);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 380, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/gmail1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 30, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 430, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> Ingrese el correo electrónico con el cual registró <br> su cuenta. </html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 430, 70));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> Ingrese el código enviado a su correo electrónico <br> para reestablecer su contraseña. </html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 430, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/cls1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 30, 50));

        txtCode.setBackground(new java.awt.Color(51, 51, 51));
        txtCode.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setToolTipText("");
        txtCode.setBorder(null);
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 380, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 430, 70));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 360, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 360, 80));

        btnEnviarCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnEnviarCode.setBorderPainted(false);
        btnEnviarCode.setContentAreaFilled(false);
        btnEnviarCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarCodeMouseClicked(evt);
            }
        });
        jPanel1.add(btnEnviarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 360, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 370, 60));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/gmail.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R5.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked

    }//GEN-LAST:event_lblBackMouseClicked

    private void btnEnviarCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarCodeMouseClicked

    }//GEN-LAST:event_btnEnviarCodeMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
    }//GEN-LAST:event_btnAceptarMouseClicked

    
    public void showDialog(String message){
    JOptionPane.showMessageDialog(this, message);
    }
    
    public JButton getbtnAceptar() {
        return btnAceptar;
    }

    public JLabel getlblBack() {
        return lblBack;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnEnviarCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    public javax.swing.JTextField txtCode;
    public javax.swing.JTextField txtMail;
    // End of variables declaration//GEN-END:variables
}
