
package VIsta;


import Controlador.cntrlLogin;
import Modelo.mdlUsuarios;
import VIsta.Programa.JframePrincipal;
import VIsta.Registro;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        
        mdlUsuarios mdlUsuarios = new mdlUsuarios();
        cntrlLogin ctLg = new cntrlLogin(this, mdlUsuarios); 

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
        RecuperarContra = new javax.swing.JLabel();
        OlvidoContra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        redondo1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        redondo = new javax.swing.JLabel();
        fondoLogin = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(870, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrarse.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("REGISTRARSE");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        RecuperarContra.setBackground(new java.awt.Color(255, 255, 255));
        RecuperarContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RecuperarContra.setForeground(new java.awt.Color(59, 126, 255));
        RecuperarContra.setText("Recuperar Contraseña");
        RecuperarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecuperarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecuperarContraMouseClicked(evt);
            }
        });
        jPanel1.add(RecuperarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        OlvidoContra.setBackground(new java.awt.Color(255, 255, 255));
        OlvidoContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OlvidoContra.setForeground(new java.awt.Color(204, 204, 204));
        OlvidoContra.setText("¿Olvido su contraseña? ");
        jPanel1.add(OlvidoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, 20));

        btnIngresar.setBackground(new java.awt.Color(44, 104, 244));
        btnIngresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 100, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/boton.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 120, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar Sesión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        txtContraseña.setBorder(null);
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.setHighlighter(null);
        txtContraseña.setName(""); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 230, 30));

        redondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        jPanel1.add(redondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 280, 50));

        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setHighlighter(null);
        txtUsuario.setName(""); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 30));

        redondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        jPanel1.add(redondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 280, 50));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Log-in (1).png"))); // NOI18N
        jPanel1.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void RecuperarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecuperarContraMouseClicked
        RecuperarContra RC = new RecuperarContra();
        RC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RecuperarContraMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
         this.setVisible(false);
        Registro v = new Registro();
        v.setVisible(true);  
    }//GEN-LAST:event_RegistrarseMouseClicked

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
    private javax.swing.JLabel RecuperarContra;
    private javax.swing.JLabel Registrarse;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel redondo;
    private javax.swing.JLabel redondo1;
    private javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
