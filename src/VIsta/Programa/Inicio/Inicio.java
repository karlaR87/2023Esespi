/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import Modelo.mdl;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JPanel {

   
    public Inicio() {
        initComponents();
        MostrarDato();
      
    }

   public void MostrarDato()
   {
       Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
        String SSQL = "SELECT COUNT(*) FROM tbDenuncias where Lugar = 'Zacate'";
       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                 int count = result.getInt(1); // Obtener el valor del contador
                
                lblMostrar.setText("Resultado: " + count);
                
            }
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMostrar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 710));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backNose.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backOflineOnline.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 142.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, 510));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gráficas policiales");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        lblMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
