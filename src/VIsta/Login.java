
package VIsta;


import Controlador.cntrlLogin;
import Modelo.mdlUsuarios;
import VIsta.Programa.JframePrincipal;
import VIsta.Registro;
import fonts.Fuentes;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Login extends javax.swing.JFrame {

  
    Fuentes tipoFuentes;
    public Login() {
        initComponents();
        
        mdlUsuarios mdlUsuarios = new mdlUsuarios();
        cntrlLogin ctLg = new cntrlLogin(this, mdlUsuarios); 
       
        fontDesign();

    }
    
       
    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
         
       OlvidoContra.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 17));
        OlvidoContra1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 17));
    }
    
   

     public String convertirSHA256(String password) {
	MessageDigest md = null;

	try {
            md = MessageDigest.getInstance("SHA-256");
	}
	catch (NoSuchAlgorithmException e) {
		System.out.println(e.toString());
		return null;
	}

	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();

	for(byte b : hash) {
		sb.append(String.format("%02x", b));
	}

	return sb.toString();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Registrarse = new javax.swing.JLabel();
        back13 = new javax.swing.JLabel();
        RecuperarContra = new javax.swing.JLabel();
        back12 = new javax.swing.JLabel();
        OlvidoContra1 = new javax.swing.JLabel();
        OlvidoContra = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        redondo1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        redondo = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();
        redondo2 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1027, 720));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1027, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrarse.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRegistrarse.png"))); // NOI18N
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 140, 140, -1));

        back13.setBackground(new java.awt.Color(255, 255, 255));
        back13.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        back13.setForeground(new java.awt.Color(255, 255, 255));
        back13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRegistrarseBack.png"))); // NOI18N
        jPanel1.add(back13, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 140, -1, -1));

        RecuperarContra.setBackground(new java.awt.Color(255, 255, 255));
        RecuperarContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RecuperarContra.setForeground(new java.awt.Color(59, 126, 255));
        RecuperarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRC.png"))); // NOI18N
        RecuperarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecuperarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecuperarContraMouseClicked(evt);
            }
        });
        jPanel1.add(RecuperarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 50, -1, -1));

        back12.setBackground(new java.awt.Color(255, 255, 255));
        back12.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        back12.setForeground(new java.awt.Color(255, 255, 255));
        back12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRCBack.png"))); // NOI18N
        jPanel1.add(back12, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 50, 250, -1));

        OlvidoContra1.setBackground(new java.awt.Color(255, 255, 255));
        OlvidoContra1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        OlvidoContra1.setForeground(new java.awt.Color(255, 255, 255));
        OlvidoContra1.setText("¿No tiene una cuenta? ");
        jPanel1.add(OlvidoContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 116, -1, -1));

        OlvidoContra.setBackground(new java.awt.Color(255, 255, 255));
        OlvidoContra.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        OlvidoContra.setForeground(new java.awt.Color(255, 255, 255));
        OlvidoContra.setText("¿Olvidó su contraseña? ");
        jPanel1.add(OlvidoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 26, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(44, 104, 244));
        btnIngresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnIngresarBA.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 490, 220, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/ttlIniciarSesion.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 175, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorder(null);
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.setHighlighter(null);
        txtContraseña.setName(""); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 390, 390, 45));

        redondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/contraBack.png"))); // NOI18N
        jPanel1.add(redondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 420, 80));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setHighlighter(null);
        txtUsuario.setName(""); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, 390, 45));

        redondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnIngresarBABACK.png"))); // NOI18N
        jPanel1.add(redondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 490, 220, -1));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/wave.png"))); // NOI18N
        jPanel1.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 720));

        redondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/userBack.png"))); // NOI18N
        jPanel1.add(redondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 420, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
         
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
         this.setVisible(false);
        Registro v = new Registro();
        v.setVisible(true);  
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void RecuperarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecuperarContraMouseClicked
        RecuperarContra RC = new RecuperarContra();
        RC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RecuperarContraMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OlvidoContra;
    private javax.swing.JLabel OlvidoContra1;
    private javax.swing.JLabel RecuperarContra;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel back12;
    private javax.swing.JLabel back13;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel redondo;
    private javax.swing.JLabel redondo1;
    private javax.swing.JLabel redondo2;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
