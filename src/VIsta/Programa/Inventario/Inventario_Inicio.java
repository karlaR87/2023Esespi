/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inventario;

import Modelo.ModeloDatosTransporte;
import Modelo.ModeloTransporte;
import VIsta.Bienvenida;
import VIsta.VistaAgregarTransporte;
import java.sql.*;


public class Inventario_Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Inventario_Inicio
     */
    public Inventario_Inicio() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 710));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario/ Inicio");

        kButton1.setForeground(new java.awt.Color(0, 0, 102));
        kButton1.setText("Armamento");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        kButton1.setkBorderRadius(40);
        kButton1.setkEndColor(new java.awt.Color(243, 167, 18));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(243, 167, 18));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverStartColor(new java.awt.Color(243, 167, 18));
        kButton1.setkIndicatorColor(new java.awt.Color(243, 167, 18));
        kButton1.setkPressedColor(new java.awt.Color(243, 167, 18));
        kButton1.setkSelectedColor(new java.awt.Color(243, 167, 18));
        kButton1.setkStartColor(new java.awt.Color(243, 167, 18));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Transporte");
        kButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(243, 167, 18));
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(243, 167, 18));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 102));
        kButton2.setkHoverEndColor(new java.awt.Color(243, 167, 18));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 102));
        kButton2.setkHoverStartColor(new java.awt.Color(243, 167, 18));
        kButton2.setkIndicatorColor(new java.awt.Color(243, 167, 18));
        kButton2.setkSelectedColor(new java.awt.Color(243, 167, 18));
        kButton2.setkStartColor(new java.awt.Color(243, 167, 18));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });

        kButton3.setText("Equipo especial");
        kButton3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        kButton3.setkAllowTab(true);
        kButton3.setkBackGroundColor(new java.awt.Color(243, 167, 18));
        kButton3.setkBorderRadius(40);
        kButton3.setkEndColor(new java.awt.Color(243, 167, 18));
        kButton3.setkForeGround(new java.awt.Color(0, 0, 102));
        kButton3.setkHoverColor(new java.awt.Color(243, 167, 18));
        kButton3.setkHoverEndColor(new java.awt.Color(243, 167, 18));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 102));
        kButton3.setkHoverStartColor(new java.awt.Color(243, 167, 18));
        kButton3.setkPressedColor(new java.awt.Color(243, 167, 18));
        kButton3.setkSelectedColor(new java.awt.Color(243, 167, 18));
        kButton3.setkStartColor(new java.awt.Color(243, 167, 18));
        kButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
      Inventario_Inicio_Armamento inv = new Inventario_Inicio_Armamento();
        inv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1MouseClicked

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
       //boton para mostrar formulario de transporte
       
      try {
                    ModeloTransporte modelo = new ModeloTransporte();
                    ModeloDatosTransporte modDtaos = new ModeloDatosTransporte();
                    VistaAgregarTransporte vista = new VistaAgregarTransporte();
                    
                    
                    
                    vista.setVisible(true);
                } catch (SQLException ex) {
                   
                }
       
    }//GEN-LAST:event_kButton2MouseClicked

    private void kButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton3MouseClicked
        //boton para mostrar formulario de equipo especial
    }//GEN-LAST:event_kButton3MouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    // End of variables declaration//GEN-END:variables
}
