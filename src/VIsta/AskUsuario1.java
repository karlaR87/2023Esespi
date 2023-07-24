package VIsta;

import Controlador.cntrlUsuarios;
import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlUsuarios;
import fonts.Fuentes;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class AskUsuario1 extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    
    public AskUsuario1() {
        initComponents();
        fontDesign();
    }
   private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
       
       jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 380, 30));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 360, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 360, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/miniUser1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 30, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 430, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> Ingrese el usuario con el cual registró su cuenta. </html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 430, 70));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/shield.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/miniCuadro1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
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

    public JButton getbtnAceptar() {
        return btnAceptar;
    }
    
   public JLabel getlblBack() {
        return lblBack;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
