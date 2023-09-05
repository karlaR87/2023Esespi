package VIsta;

import fonts.Fuentes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RegistroUsuario extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    Registro jFrame;
    RegistroUsuario thisVista;
    public RegistroUsuario(Registro jFrame) {
        initComponents();
        this.jFrame = jFrame;
        this.thisVista = this;
        jLabel3.setVisible(false);
        fontDesign();
    }

     public String convertirSHA256(String password) {
	MessageDigest md = null;

	try {
            md = MessageDigest.getInstance("SHA-256");
	}
	catch (NoSuchAlgorithmException e) {
		
                JOptionPane.showMessageDialog(null, e.toString());
		return null;
	}

	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();

	for(byte b : hash) {
		sb.append(String.format("%02x", b));
	}

	return sb.toString();
}
    
    private void fontDesign()
    { 
        tipoFuentes = new Fuentes();
        
        jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        jLabel6.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18)); 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtContrasena2 = new javax.swing.JPasswordField();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent1010x700.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContrasena2.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContrasena2.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena2.setToolTipText("");
        txtContrasena2.setBorder(null);
        txtContrasena2.setPreferredSize(new java.awt.Dimension(90, 18));
        jPanel1.add(txtContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 462, 410, 30));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena.setToolTipText("");
        txtContrasena.setBorder(null);
        txtContrasena.setPreferredSize(new java.awt.Dimension(90, 18));
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 387, 410, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmación de contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 428, 420, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 354, 420, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 276, 420, 30));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 310, 410, 30));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 538, 220, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnnextDBack.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 538, 220, 60));

        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fast-forward.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 64, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerRegistroUser.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backRegistroUserAAA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));
    }// </editor-fold>//GEN-END:initComponents

    public boolean isOK()
    {
        if(txtUsuario.getText().isBlank() || txtContrasena.getText().isBlank() || txtContrasena2.getText().isBlank())
        {
            show("No se permiten campos vacíos", 17, 1);
            close1();           
            return false;
        }
        else
        {
            if(txtUsuario.getText().length() > 20)
            {
                 show("El usuario no debe exceder los 20 caracteres", 16, 1);
                 close1(); 
              return false;
            }
            else{
                if (!txtContrasena.getText().equals(txtContrasena2.getText()) || !txtContrasena2.getText().equals(txtContrasena.getText()))
               {
                   show("Ambas contraseñas deben coincidir", 17, 1);
                   close1(); 
                   return false;
               }
                else
                {
                    if(txtContrasena.getText().length() <8 || txtContrasena2.getText().length() <8)
                   {
                        show("La contraseña debe contener almenos 8 caracteres", 15, 1);
                        close1();  
                        return false;
                   }
                   else
                   {
                        if(txtContrasena.getText().length() > 15 || txtContrasena.getText().length() > 15)
                       {
                           show("La contraseña no debe exceder los 15 caracteres", 16, 1);
                           close1();
                           return false;
                       }
                       else
                       {
                            if (!txtContrasena.getText().equals(txtContrasena2.getText()) || !txtContrasena2.getText().equals(txtContrasena.getText()))
                           {
                                show("Ambas contraseñas deben coincidir", 17, 1);
                                close1(); 
                               return false;
                           }
                           else
                           {   
                               return true;
                           }
                       }
                   }
                }
            }
             
        }

    }
    
    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

    }//GEN-LAST:event_lblRegresarMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    
     JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        this.jLabel3.setVisible(true);
        jFrame.setEnabled(false);
        Jo = new JoptionReplacemnt(0,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            thisVista.jLabel3.setVisible(false);
            jFrame.setEnabled(true);
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblRegresar;
    public javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContrasena2;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
