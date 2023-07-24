
package VIsta;

import Controlador.CntrlRC;
import fonts.Fuentes;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paola Mejia
 */
public class PorPreguntasS extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    public PorPreguntasS() {
        initComponents();
        initPreguntas();
         fontDesign();
         
    }
    CntrlRC CntrlreadPreguntasS = new CntrlRC();
    
    private void initPreguntas()
    {
//        try {
//            ResultSet rs = CntrlreadPreguntasS.readPreguntasS();            
//            List<String> listaPreguntas = new ArrayList<>();
//
//            while (rs.next()) {
//                String pregunta = rs.getString("Pregunta");
//                listaPreguntas.add(pregunta);
//            }
//
//            lblPregunta1.setText(listaPreguntas.get(0));
//            lblPregunta2.setText(listaPreguntas.get(1));
//            lblPregunta3.setText(listaPreguntas.get(2));
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(PorPreguntasS.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
       // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
       
       lblPregunta1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       lblPregunta2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
       lblPregunta3.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        
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
        txtR2 = new javax.swing.JTextField();
        txtR3 = new javax.swing.JTextField();
        txtR1 = new javax.swing.JTextField();
        lblPregunta3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPregunta1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR2.setBackground(new java.awt.Color(51, 51, 51));
        txtR2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtR2.setForeground(new java.awt.Color(255, 255, 255));
        txtR2.setToolTipText("");
        txtR2.setBorder(null);
        jPanel1.add(txtR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 400, 30));

        txtR3.setBackground(new java.awt.Color(51, 51, 51));
        txtR3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtR3.setForeground(new java.awt.Color(255, 255, 255));
        txtR3.setToolTipText("");
        txtR3.setBorder(null);
        jPanel1.add(txtR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 400, 20));

        txtR1.setBackground(new java.awt.Color(51, 51, 51));
        txtR1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtR1.setForeground(new java.awt.Color(255, 255, 255));
        txtR1.setToolTipText("");
        txtR1.setBorder(null);
        jPanel1.add(txtR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 400, 20));

        lblPregunta3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPregunta3.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta3.setText("Pregunta 3");
        jPanel1.add(lblPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 430, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 430, 50));

        lblPregunta2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPregunta2.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta2.setText("Pregunta 2");
        jPanel1.add(lblPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 292, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 430, 60));

        lblPregunta1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPregunta1.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta1.setText("Pregunta 1");
        jPanel1.add(lblPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R10.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 360, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G10.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 360, 80));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fast-forward.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/G8.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/shielddrop.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R5.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1271, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked

    }//GEN-LAST:event_lblBackMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
  
    }//GEN-LAST:event_btnAceptarMouseClicked

    public boolean IsOk()
    {
//         try {
//            ResultSet rs = CntrlreadPreguntasS.readPreguntasS();            
//            List<String> listaRespuesta = new ArrayList<>();
//
//            while (rs.next()) {
//                String respuesta = rs.getString("Respuesta");
//                listaRespuesta.add(respuesta);
//            }
//            String R1 = listaRespuesta.get(0);  
//            String R2 = listaRespuesta.get(1);
//            String R3 = listaRespuesta.get(2);
//            
//            if(txtR1.getText().isBlank() || txtR2.getText().isBlank() || txtR3.getText().isBlank())
//            {
//                JOptionPane.showMessageDialog(this, "Por favor, ingrese todas las respuestas");
//                return false;
//            }
//            else{
//                if(!txtR1.getText().equals(R1)|| !txtR2.getText().equals(R2) || !txtR3.getText().equals(R3))
//                {
//                    JOptionPane.showMessageDialog(this, "Alguna de las respuestas es incorrecta, intente nuevamente");
//                    return false;
//                }
//                else
//                {
//                   JOptionPane.showMessageDialog(this, "Todo OK");
//                    txtR1.setText("");
//                    txtR2.setText("");
//                    txtR3.setText("");
//                   return true;
//                }
//            }
//            
//        } catch (SQLException ex) {
//            return false;
//        }  
        return false;
//         try {
//            ResultSet rs = CntrlreadPreguntasS.readPreguntasS();            
//            List<String> listaRespuesta = new ArrayList<>();
//
//            while (rs.next()) {
//                String respuesta = rs.getString("Respuesta");
//                listaRespuesta.add(respuesta);
//            }
//            String R1 = listaRespuesta.get(0);  
//            String R2 = listaRespuesta.get(1);
//            String R3 = listaRespuesta.get(2);
//            
//            if(txtR1.getText().isBlank() || txtR2.getText().isBlank() || txtR3.getText().isBlank())
//            {
//                JOptionPane.showMessageDialog(this, "Por favor, ingrese todas las respuestas");
//                return false;
//            }
//            else{
//                if(!txtR1.getText().equals(R1)|| !txtR2.getText().equals(R2) || !txtR3.getText().equals(R3))
//                {
//                    JOptionPane.showMessageDialog(this, "Alguna de las respuestas es incorrecta, intente nuevamente");
//                    return false;
//                }
//                else
//                {
//                   JOptionPane.showMessageDialog(this, "Todo OK");
//                    txtR1.setText("");
//                    txtR2.setText("");
//                    txtR3.setText("");
//                   return true;
//                }
//            }
//            
//        } catch (SQLException ex) {
//            return false;
//        }  
    }
    
    public JButton getbtnAceptar() {
        return btnAceptar;
    }
    
    
   public JLabel getlblBack() {
        return lblBack;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta3;
    public javax.swing.JTextField txtR1;
    public javax.swing.JTextField txtR2;
    public javax.swing.JTextField txtR3;
    // End of variables declaration//GEN-END:variables
}
