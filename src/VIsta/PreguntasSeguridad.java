/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta;

import fonts.Fuentes;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Paola Mejia
 */
public class PreguntasSeguridad extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    public PreguntasSeguridad() {
        initComponents();
        fontDesign();
    }
      private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
       
       jLabel3.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 14));
       jLabel5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
       jLabel4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
       jLabel11.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
       jLabel9.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
       jLabel15.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
       lblR3.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 17));
        
        btnAceptar.setText("<html><font color='white'> Aceptar </font></html>");
        caracBtn(btnAceptar);
    }
    
    private void caracBtn(JButton btn)
    {
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 1, 22)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt3Respuesta = new javax.swing.JTextField();
        txt3Pregunta = new javax.swing.JTextField();
        txt2Respuesta = new javax.swing.JTextField();
        txt2Pregunta = new javax.swing.JTextField();
        txt1Respuesta = new javax.swing.JTextField();
        txt1Pregunta = new javax.swing.JTextField();
        lblR3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RegresarImg.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 50));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R11.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 190, 70));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1111.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 210, 120));

        txt3Respuesta.setBackground(new java.awt.Color(70, 70, 70));
        txt3Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt3Respuesta.setForeground(new java.awt.Color(255, 255, 255));
        txt3Respuesta.setToolTipText("");
        txt3Respuesta.setBorder(null);
        jPanel1.add(txt3Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 410, 30));

        txt3Pregunta.setBackground(new java.awt.Color(70, 70, 70));
        txt3Pregunta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt3Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        txt3Pregunta.setToolTipText("");
        txt3Pregunta.setBorder(null);
        jPanel1.add(txt3Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 410, 30));

        txt2Respuesta.setBackground(new java.awt.Color(70, 70, 70));
        txt2Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt2Respuesta.setForeground(new java.awt.Color(255, 255, 255));
        txt2Respuesta.setToolTipText("");
        txt2Respuesta.setBorder(null);
        jPanel1.add(txt2Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 410, 30));

        txt2Pregunta.setBackground(new java.awt.Color(70, 70, 70));
        txt2Pregunta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt2Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        txt2Pregunta.setToolTipText("");
        txt2Pregunta.setBorder(null);
        jPanel1.add(txt2Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 410, 30));

        txt1Respuesta.setBackground(new java.awt.Color(70, 70, 70));
        txt1Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt1Respuesta.setForeground(new java.awt.Color(255, 255, 255));
        txt1Respuesta.setToolTipText("");
        txt1Respuesta.setBorder(null);
        jPanel1.add(txt1Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 410, 30));

        txt1Pregunta.setBackground(new java.awt.Color(70, 70, 70));
        txt1Pregunta.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt1Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        txt1Pregunta.setToolTipText("");
        txt1Pregunta.setBorder(null);
        jPanel1.add(txt1Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, 30));

        lblR3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblR3.setForeground(new java.awt.Color(255, 255, 255));
        lblR3.setText("Respuesta:");
        jPanel1.add(lblR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 220, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 430, 50));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 430, 50));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tercera Pregunta:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 220, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 430, 50));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Respuesta:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 220, 60));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 430, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Segunda Pregunta:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 60));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primera Pregunta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, 80));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 430, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R1212.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 430, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Respuesta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Por favor, formule preguntas de seguridad en caso de que olvide su contraseña. Procure que las respuestas sean difíciles de adivinar para terceros.  <br> <br> Aquí tienes un ejemplo:  <br> <br> Pregunta: <br> \"¿Cuántos perfiles reprobé en el módulo 03 de Bryan?\"  <br> <br>  Respuesta: <br> \"No reprobé ninguno porque las clases de Bryan son las mejores y entregué todo a tiempo.\"</htm>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 210, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G_PGDS2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerRegistroPreguntas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 90));

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
        if (txt1Pregunta.getText().isBlank() || txt2Pregunta.getText().isBlank() || txt3Pregunta.getText().isBlank() || txt1Respuesta.getText().isBlank()|| txt2Respuesta.getText().isBlank() || txt3Respuesta.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "No se permite ningún campo vacío");
        }
        else
        {
//         CntrlRC insertPreguntasS = new CntrlRC();
         
//         insertPreguntasS.idPersona = 1;        
//         insertPreguntasS.pregunta = txt1Pregunta.getText();   
//         insertPreguntasS.respuesta = txt1Respuesta.getText();           
//         insertPreguntasS.insertPreguntasS();
//          
//         insertPreguntasS.pregunta = txt2Pregunta.getText();   
//         insertPreguntasS.respuesta = txt2Respuesta.getText();           
//         insertPreguntasS.insertPreguntasS();
//         
//         insertPreguntasS.pregunta = txt3Pregunta.getText();   
//         insertPreguntasS.respuesta = txt3Respuesta.getText();           
//         insertPreguntasS.insertPreguntasS();

         JOptionPane.showMessageDialog(this, "Insertado");
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

    }//GEN-LAST:event_lblRegresarMouseClicked

     public JLabel getlblBack()
    {
        return lblRegresar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblR3;
    private javax.swing.JLabel lblRegresar;
    public javax.swing.JTextField txt1Pregunta;
    public javax.swing.JTextField txt1Respuesta;
    public javax.swing.JTextField txt2Pregunta;
    public javax.swing.JTextField txt2Respuesta;
    public javax.swing.JTextField txt3Pregunta;
    public javax.swing.JTextField txt3Respuesta;
    // End of variables declaration//GEN-END:variables
}
