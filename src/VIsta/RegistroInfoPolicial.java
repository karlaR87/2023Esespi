package VIsta;

import Modelo.conexionSql;
import fonts.Fuentes;
import javax.swing.JButton;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroInfoPolicial extends javax.swing.JPanel {

     Fuentes tipoFuentes;
     Registro jFrame;
     RegistroInfoPolicial thisVista;
     
    public RegistroInfoPolicial(Registro jFrame) {
        initComponents();
        this.jFrame = jFrame;
        this.thisVista = this;
        jLabel3.setVisible(false);
        fontDesign();
    }

    private void fontDesign()
    { 
        tipoFuentes = new Fuentes();
        
         jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
         jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18)); 
    }
    
    private void caracBtn(JButton btn)
    {
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 1, 22)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtONI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1010, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent1027x720.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 720));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fast-forward.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        jPanel2.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 64, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerRegistroPoli.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 120));

        txtNumeroPlaca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNumeroPlaca.setToolTipText("");
        txtNumeroPlaca.setBorder(null);
        txtNumeroPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroPlacaKeyReleased(evt);
            }
        });
        jPanel2.add(txtNumeroPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 426, 410, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Número de placa");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 420, 30));

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
        jPanel2.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 220, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnnextDBack.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 220, 60));

        txtONI.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtONI.setToolTipText("");
        txtONI.setBorder(null);
        txtONI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtONIKeyReleased(evt);
            }
        });
        jPanel2.add(txtONI, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 314, 410, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("ONI");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 420, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backInfoPolicial.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

    }//GEN-LAST:event_lblRegresarMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
String oni = txtONI.getText();
    String numeroPlaca = txtNumeroPlaca.getText();
    

    // Realizar la consulta SQL para verificar la existencia de los datos
    String query = "SELECT COUNT(*) AS count FROM tbPolicias WHERE ONI = ? OR NumeroPlaca = ?";
    
    try {
        PreparedStatement pstmt = conexionSql.getConexion().prepareStatement(query);
        pstmt.setString(1, oni);
        pstmt.setString(2, numeroPlaca);
        
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt("count");
            if (count == 0) {
                
              
                
            } else {
                // Los datos ya existen en la base de datos, muestra un mensaje de error
                JOptionPane.showMessageDialog(null, "Los datos ya existen en la base de datos.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al realizar la consulta: " + e.toString());
}
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtONIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtONIKeyReleased
   String texto = txtONI.getText();

    // Eliminar todos los caracteres que no sean dígitos
    texto = texto.replaceAll("[^0-9]", "");

    // Limitar la longitud del texto a 8 caracteres
    if (texto.length() > 8) {
        // Si se ingresaron más de 8 caracteres, recortar el texto
        texto = texto.substring(0, 8);
    }

    // Actualizar el texto en el campo de texto
    txtONI.setText(texto);
        }//GEN-LAST:event_txtONIKeyReleased

    private void txtNumeroPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPlacaKeyReleased
  String texto = txtNumeroPlaca.getText();

    // Eliminar todos los caracteres que no sean dígitos
    texto = texto.replaceAll("[^0-9]", "");

    // Limitar la longitud del texto a 5 caracteres
    if (texto.length() > 5) {
        // Si se ingresaron más de 5 caracteres, recortar el texto
        texto = texto.substring(0, 5);
    }

    // Actualizar el texto en el campo de texto
    txtNumeroPlaca.setText(texto);    }//GEN-LAST:event_txtNumeroPlacaKeyReleased

    JoptionReplacemnt Jo;
    public boolean isOk()
    {
        if(txtONI.getText().isBlank() || txtNumeroPlaca.getText().isBlank())
        {
            this.jLabel3.setVisible(true);
            jFrame.setEnabled(false);
            Jo = new JoptionReplacemnt(0,1, "No se permiten campos vacíos", 17);
            Jo.setVisible(true);
            
             Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            thisVista.jLabel3.setVisible(false);
            jFrame.setEnabled(true);
        }
        });
            return false;
        }
        else
        {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblRegresar;
    public javax.swing.JTextField txtNumeroPlaca;
    public javax.swing.JTextField txtONI;
    // End of variables declaration//GEN-END:variables
}
