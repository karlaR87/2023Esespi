package VIsta;

import fonts.Fuentes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class ReestablecerContra extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    ReestablecerContra Vista;
    RecuperarContra jFrame;
    
    public ReestablecerContra(RecuperarContra jFrame) {
        initComponents();
        this.Vista = this;
        this.jFrame = jFrame;
        jLabel6.setVisible(false);
        NOSPACE();
        fontDesign();
    }
    
    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
       
       JLabel jlbl1 = jLabel4;
       JLabel jlbl2 = jLabel5;
       
       jlbl1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       jlbl2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtContra2 = new javax.swing.JPasswordField();
        txtContra1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(870, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent870x700.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtContra2.setBackground(new java.awt.Color(255, 255, 255));
        txtContra2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContra2.setForeground(new java.awt.Color(0, 0, 0));
        txtContra2.setBorder(null);
        jPanel1.add(txtContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 438, 370, 30));

        txtContra1.setBackground(new java.awt.Color(255, 255, 255));
        txtContra1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContra1.setForeground(new java.awt.Color(0, 0, 0));
        txtContra1.setBorder(null);
        jPanel1.add(txtContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 370, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/conversationdrop.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/gmail.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 150, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Ingrese su nueva contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 430, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("<html>Por favor, ingrese una vez más su nueva contraseña </html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 430, 30));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnOrangeAceptar.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 520, 220, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnrangeAceptarBack.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 520, 220, 70));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnRegresar1.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 630, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G8.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/shielddrop.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RCBackIn.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 186, -1, -1));

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

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked

    }//GEN-LAST:event_lblBackMouseClicked

    public boolean AllisOk()
    {
        if(txtContra1.getText().isBlank() || txtContra2.getText().isBlank())
        {
            show("No se permiten campos vacíos", 17 , 1);
            close1();
            return false;
        }
        else
        {
            if (!txtContra1.getText().equals(txtContra2.getText()) || !txtContra2.getText().equals(txtContra1.getText()))
            {
               show("Ambas contraseñas deben coincidir", 17 , 1);
               close1();
               return false;
            }
            else
            {
                if(txtContra1.getText().length() <8 || txtContra2.getText().length() <8)
                {                 
                    show("La contraseña debe contener almenos 8 caracteres o más", 16 , 1);
                    close1();
                    return false;
                }
                else
                {
                    if(txtContra1.getText().length() > 15 || txtContra2.getText().length() > 15)
                    {
                        show("La contraseña no debe de superar los 15 caracteres", 16 , 1);
                        close1();
                        return false;
                    }
                    else
                    {
                        if (!txtContra1.getText().equals(txtContra2.getText()) || !txtContra2.getText().equals(txtContra1.getText()))
                        {
                            show("Ambas contraseñas deben coincidir", 17 , 1);
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
    
    public void NOSPACE()
    {
        PlainDocument document = new PlainDocument();
        PlainDocument document2 = new PlainDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Evitar la inserción de espacios en blanco
                if (!string.contains(" ")) {
                    super.insertString(fb, offset, string, attr);
                }
            }
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Evitar la sustitución de espacios en blanco
                if (!text.contains(" ")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
         document2.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Evitar la inserción de espacios en blanco
                if (!string.contains(" ")) {
                    super.insertString(fb, offset, string, attr);
                }
            }
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Evitar la sustitución de espacios en blanco
                if (!text.contains(" ")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        // Asignar el PlainDocument al JTextField
        txtContra1.setDocument(document);
        txtContra2.setDocument(document2);
    
    }
    
    JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        this.jLabel6.setVisible(true);     
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
            Vista.jLabel6.setVisible(false);
            jFrame.setEnabled(true);
        }
        });
    }
    
    public JLabel getlblBack() {
        return lblBack;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    public javax.swing.JPasswordField txtContra1;
    private javax.swing.JPasswordField txtContra2;
    // End of variables declaration//GEN-END:variables

    private String user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
