package VIsta.Programa.Patrullajes;

import fonts.Fuentes;
import javax.swing.JButton;

/**
 *
 * @author Pao
 */
public class Patrullajes_Agregar extends javax.swing.JPanel {

    Fuentes tipoFuentes;
    public Patrullajes_Agregar() {
        initComponents();
        
        fontDesign();
    }

   private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
        // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
        
        btnAddPatrullaje.setText("<html><font color='white'> Agregar </font></html>");
        caracBtn(btnAddPatrullaje);
        
        btnCancelPatrullaje.setText("<html><font color='white'> Cancelar </font></html>");
        caracBtn(btnCancelPatrullaje);
    }
    
     private void caracBtn(JButton btn)
    {
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 1, 24)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCancelPatrullaje = new javax.swing.JButton();
        btnAddPatrullaje = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Patrullaje");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnCancelPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancelPatrullaje.png"))); // NOI18N
        btnCancelPatrullaje.setBorderPainted(false);
        btnCancelPatrullaje.setContentAreaFilled(false);
        btnCancelPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseClicked(evt);
            }
        });
        add(btnCancelPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 210, -1));

        btnAddPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPatrullaje.png"))); // NOI18N
        btnAddPatrullaje.setBorderPainted(false);
        btnAddPatrullaje.setContentAreaFilled(false);
        btnAddPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseClicked(evt);
            }
        });
        add(btnAddPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseClicked

    }//GEN-LAST:event_btnCancelPatrullajeMouseClicked

    private void btnAddPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatrullajeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddPatrullaje;
    public javax.swing.JButton btnCancelPatrullaje;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
