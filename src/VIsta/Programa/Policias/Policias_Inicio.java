package VIsta.Programa.Policias;


import Modelo.mdlPolicias;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Pao
 * 
 * 
 */
public class Policias_Inicio extends javax.swing.JPanel {

    
    ImageIcon iconoOriginalEdit;
    ImageIcon iconoClareEdit;
     
    ImageIcon iconoOriginalAdd;
    ImageIcon iconoClareAdd;
     
    ImageIcon iconoOriginalDelete;
    ImageIcon iconoClareDelete;
     
    public int IdPolicia;
   
    public Policias_Inicio() {
        initComponents();
        
        IdPolicia = 0;
        iconoOriginalEdit = new ImageIcon("src/VIsta/imagenes/btnEditPolicia.png"); 
        iconoClareEdit = new ImageIcon("src/VIsta/imagenes/btnEditPoliciaClare.png");
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnAddPolicia.png"); 
        iconoClareAdd = new ImageIcon("src/VIsta/imagenes/btnAddPoliciaClare.png"); 
        
        iconoOriginalDelete = new ImageIcon("src/VIsta/imagenes/btnDeletePolicia.png"); 
        iconoClareDelete = new ImageIcon("src/VIsta/imagenes/btnDeletePoliciaClare.png");
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletePoliciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletePoliciaMouseExited(evt);
            }
        });
        btnDeletePolicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePoliciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeletePolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 340, 60, 60));

        btnEditPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnEditPolicia.setBorderPainted(false);
        btnEditPolicia.setContentAreaFilled(false);
        btnEditPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPoliciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditPoliciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditPoliciaMouseExited(evt);
            }
        });
        jPanel1.add(btnEditPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 220, 60, 60));

        btnAddPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddPolicia.setBorderPainted(false);
        btnAddPolicia.setContentAreaFilled(false);
        btnAddPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPoliciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPoliciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPoliciaMouseExited(evt);
            }
        });
        jPanel1.add(btnAddPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 280, 60, 60));

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backBuscar2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 50));

        tbDatosPolicias.setBackground(new java.awt.Color(70, 70, 70));
        tbDatosPolicias.setFont(new java.awt.Font("Arial", 0, 14));
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
        tbDatosPolicias.setInheritsPopupMenu(true);
        tbDatosPolicias.setSelectionBackground(new java.awt.Color(119, 119, 119));
        tbDatosPolicias.setShowGrid(false);
        tbDatosPolicias.getTableHeader().setResizingAllowed(false);
        tbDatosPolicias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosPoliciasMouseClicked(evt);
            }
        });
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

    private void tbDatosPoliciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosPoliciasMouseClicked
        int filaSeleccionada = tbDatosPolicias.getSelectedRow();
        //Obtenemos el id de la fila seleccionada
        String MiId = tbDatosPolicias.getValueAt(filaSeleccionada, 0).toString();
        IdPolicia = Integer.parseInt(MiId);
        System.out.println(IdPolicia);
    }//GEN-LAST:event_tbDatosPoliciasMouseClicked
    
    private void btnDeletePoliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePoliciaActionPerformed
        
    }//GEN-LAST:event_btnDeletePoliciaActionPerformed

    private void btnEditPoliciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPoliciaMouseEntered
              
        OriginialIcon();
        btnEditPolicia.setIcon(iconoClareEdit);
    }//GEN-LAST:event_btnEditPoliciaMouseEntered

    private void btnEditPoliciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPoliciaMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnEditPoliciaMouseExited

    private void btnAddPoliciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPoliciaMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnAddPoliciaMouseExited

    private void btnDeletePoliciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePoliciaMouseEntered
        OriginialIcon();
        btnDeletePolicia.setIcon(iconoClareDelete);
    }//GEN-LAST:event_btnDeletePoliciaMouseEntered

    private void btnDeletePoliciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePoliciaMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnDeletePoliciaMouseExited

    private void btnAddPoliciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPoliciaMouseEntered
       OriginialIcon();
       btnAddPolicia.setIcon(iconoClareAdd);
    }//GEN-LAST:event_btnAddPoliciaMouseEntered

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mdlPolicias m = new mdlPolicias();
        m.MostrarTablePoliciasB(this);
    }//GEN-LAST:event_txtBuscarKeyReleased

    
    public void OriginialIcon()
    {
        btnEditPolicia.setIcon(iconoOriginalEdit);
        btnAddPolicia.setIcon(iconoOriginalAdd);
        btnDeletePolicia.setIcon(iconoOriginalDelete);
    }
    
    public JButton getbtnAdd()
    {
        return btnAddPolicia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddPolicia;
    public javax.swing.JButton btnDeletePolicia;
    public javax.swing.JButton btnEditPolicia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbDatosPolicias;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
