package VIsta;


import Controlador.cntrlLogin;
import Modelo.mdlUsuarios;
import VIsta.Programa.JframePrincipal;
import VIsta.Registro;
import Modelo.ModeloRegistro;
import Modelo.conexionSql;
import VIsta.Programa.Policias.Policias_Inicio;
import VIsta.Programa.Usuario.Usuario;
import fonts.Fuentes;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    Fuentes tipoFuentes;
    public int IdNivelUser;
    ModeloRegistro me = new ModeloRegistro();
    public String texto;
    
    public Login() {
        initComponents();
        ImageIcon icono = new ImageIcon("src/VIsta/imagenes/lgShieldChic1.png"); this.setIconImage(icono.getImage());
        jLabel1.setVisible(false);
        
        mdlUsuarios mdlUsuarios = new mdlUsuarios();
        
        cntrlLogin ctLg = new cntrlLogin(this, mdlUsuarios); 
       
       
        
        fontDesign();
    }
    
       
    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
         
       OlvidoContra.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
        OlvidoContra1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
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
        jLabel1 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1027, 752));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1027, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent1027x720.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

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
        OlvidoContra1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        OlvidoContra1.setForeground(new java.awt.Color(255, 255, 255));
        OlvidoContra1.setText("¿No tiene una cuenta? ");
        jPanel1.add(OlvidoContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 116, -1, -1));

        OlvidoContra.setBackground(new java.awt.Color(255, 255, 255));
        OlvidoContra.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
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

        txtContraseña.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
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

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1030, 38));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Minus-.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 11, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/XClose.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 4, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerMenuBar.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1027, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1027, 30));

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
           /*mdlUsuarios mi = new mdlJOptionPane.showMessageDialog(null, texto);Usuarios();
           mi.setmUsu(txtUsuario.getText());
           
           //String t = txtUsuario.getText();
           System.out.println("esto se va a la pantakka " + txtUsuario.getText());*/
           
         
           texto = txtUsuario.getText();
           
          
    }//GEN-LAST:event_btnIngresarMouseClicked

    
    
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
         if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
       if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_btnMinimizarMouseClicked

    int LayoutX;
    int LayoutY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
         if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
                Login lg = new Login();
                lg.setVisible(true);
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
    private javax.swing.JLabel btnCerrar;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel fondoLogin;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel redondo;
    private javax.swing.JLabel redondo1;
    private javax.swing.JLabel redondo2;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
