/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inventario;

import Modelo.ModeloArmamento;
import Modelo.ModeloDatosTransporte;
import Modelo.ModeloEquipoEspecial;
import Modelo.ModeloTransporte;
import Modelo.mdl;
import VIsta.Bienvenida;
import VIsta.Programa.JframePrincipal;
import VIsta.VistaAgregarTransporte;
import java.sql.*;


public class Inventario_Inicio extends javax.swing.JPanel {

  
    public Inventario_Inicio() {
        initComponents();
        mdl mo = new mdl();
        mo.mostrar(this);
        ModeloEquipoEspecial c = new ModeloEquipoEspecial();
        c.mostrar1(this);
        ModeloArmamento v = new ModeloArmamento();
        v.mostrar1(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteEquipo = new javax.swing.JButton();
        btnEdiEquipo = new javax.swing.JButton();
        btnAddEquipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrarDatosTransporte = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrarDatosEquipoEsp = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMostrarDatosArmamento = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 710));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backBuscar.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btnDeleteEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnDeletePolicia.png"))); // NOI18N
        btnDeleteEquipo.setBorderPainted(false);
        btnDeleteEquipo.setContentAreaFilled(false);
        btnDeleteEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEquipoMouseClicked(evt);
            }
        });
        jPanel4.add(btnDeleteEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 60, 60));

        btnEdiEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnEdiEquipo.setBorderPainted(false);
        btnEdiEquipo.setContentAreaFilled(false);
        btnEdiEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdiEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdiEquipoMouseClicked(evt);
            }
        });
        jPanel4.add(btnEdiEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 60, 60));

        btnAddEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddEquipo.setBorderPainted(false);
        btnAddEquipo.setContentAreaFilled(false);
        btnAddEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEquipoMouseClicked(evt);
            }
        });
        jPanel4.add(btnAddEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 60, 60));

        tbMostrarDatosTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMostrarDatosTransporte);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 820, 170));

        tbMostrarDatosEquipoEsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbMostrarDatosEquipoEsp);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 820, 160));

        tbMostrarDatosArmamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbMostrarDatosArmamento);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 820, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 30, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 980, 710));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnDeleteEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEquipoMouseClicked

    }//GEN-LAST:event_btnDeleteEquipoMouseClicked

    private void btnEdiEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdiEquipoMouseClicked

    }//GEN-LAST:event_btnEdiEquipoMouseClicked

    private void btnAddEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEquipoMouseClicked
        
        ElecION_Equipo JFP = new ElecION_Equipo();
        JFP.setVisible(true);
        
    }//GEN-LAST:event_btnAddEquipoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        mdl mo = new mdl();
        mo.mostrar(this);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       ModeloEquipoEspecial c = new ModeloEquipoEspecial();
        c.mostrar1(this);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ModeloArmamento v = new ModeloArmamento();
        v.mostrar1(this);
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipo;
    private javax.swing.JButton btnDeleteEquipo;
    private javax.swing.JButton btnEdiEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTable tbMostrarDatosArmamento;
    public javax.swing.JTable tbMostrarDatosEquipoEsp;
    public javax.swing.JTable tbMostrarDatosTransporte;
    // End of variables declaration//GEN-END:variables
}
