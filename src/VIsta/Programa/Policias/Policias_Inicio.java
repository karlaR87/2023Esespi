/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Policias;

import javax.swing.JButton;

/**
 *
 * @author Pao
 */
public class Policias_Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Policias_Inicio
     */
    public Policias_Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanelAddPolice = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDeletePolicia = new javax.swing.JButton();
        btnEditPolicia = new javax.swing.JButton();
        btnAddPolicia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddPolice.setBackground(new java.awt.Color(70, 70, 70));
        jPanelAddPolice.setOpaque(false);
        jPanelAddPolice.setPreferredSize(new java.awt.Dimension(740, 444));
        jPanelAddPolice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanelAddPolice.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 690, 340));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/AgregarPoliciaFondo.png"))); // NOI18N
        jPanelAddPolice.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanelAddPolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 740, 444));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backBuscar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btnDeletePolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnDeletePolicia.png"))); // NOI18N
        btnDeletePolicia.setBorderPainted(false);
        btnDeletePolicia.setContentAreaFilled(false);
        btnDeletePolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletePolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnDeletePolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 60, 60));

        btnEditPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnEditPolicia.setBorderPainted(false);
        btnEditPolicia.setContentAreaFilled(false);
        btnEditPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 60, 60));

        btnAddPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddPolicia.setBorderPainted(false);
        btnAddPolicia.setContentAreaFilled(false);
        btnAddPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 60, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TABLAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletePoliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePoliciaMouseClicked
        
    }//GEN-LAST:event_btnDeletePoliciaMouseClicked

    private void btnEditPoliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPoliciaMouseClicked
        
    }//GEN-LAST:event_btnEditPoliciaMouseClicked

    private void btnAddPoliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPoliciaMouseClicked
    }//GEN-LAST:event_btnAddPoliciaMouseClicked

    
    public JButton getbtnAdd()
    {
        return btnAddPolicia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPolicia;
    private javax.swing.JButton btnDeletePolicia;
    private javax.swing.JButton btnEditPolicia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelAddPolice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
