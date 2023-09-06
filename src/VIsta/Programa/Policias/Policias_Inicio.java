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
        jPanel1 = new javax.swing.JPanel();
        btnDeletePolicia = new javax.swing.JButton();
        btnEditPolicia = new javax.swing.JButton();
        btnAddPolicia = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosPolicias = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeletePolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnDeletePolicia.png"))); // NOI18N
        btnDeletePolicia.setBorderPainted(false);
        btnDeletePolicia.setContentAreaFilled(false);
        btnDeletePolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletePolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnDeletePolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 340, 60, 60));

        btnEditPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnEditPolicia.setBorderPainted(false);
        btnEditPolicia.setContentAreaFilled(false);
        btnEditPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 220, 60, 60));

        btnAddPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddPolicia.setBorderPainted(false);
        btnAddPolicia.setContentAreaFilled(false);
        btnAddPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPoliciaMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 280, 60, 60));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 330, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backBuscar2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 50));

        tbDatosPolicias.setBackground(new java.awt.Color(70, 70, 70));
        tbDatosPolicias.setForeground(new java.awt.Color(255, 255, 255));
        tbDatosPolicias.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDatosPolicias.setGridColor(new java.awt.Color(255, 255, 255));
        tbDatosPolicias.setSelectionBackground(new java.awt.Color(119, 119, 119));
        tbDatosPolicias.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbDatosPolicias.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(tbDatosPolicias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 940, 520));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

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
    public javax.swing.JButton btnAddPolicia;
    private javax.swing.JButton btnDeletePolicia;
    private javax.swing.JButton btnEditPolicia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbDatosPolicias;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
