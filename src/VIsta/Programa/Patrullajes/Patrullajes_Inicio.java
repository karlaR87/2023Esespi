package VIsta.Programa.Patrullajes;

import Modelo.ModeloPatrullajes;
import javax.swing.ImageIcon;

public class Patrullajes_Inicio extends javax.swing.JPanel {

    ImageIcon iconoOriginalEdit;
    ImageIcon iconoClareEdit;
     
    ImageIcon iconoOriginalAdd;
    ImageIcon iconoClareAdd;
     
    public int IdPatrullaje;
    
    ModeloPatrullajes yi = new ModeloPatrullajes();
    
    public Patrullajes_Inicio() {
        initComponents();
        
        IdPatrullaje = 0;
        
        iconoOriginalEdit = new ImageIcon("src/VIsta/imagenes/btnEditPolicia.png"); 
        iconoClareEdit = new ImageIcon("src/VIsta/imagenes/btnEditPoliciaClare.png");
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnAddPolicia.png"); 
        iconoClareAdd = new ImageIcon("src/VIsta/imagenes/btnAddPoliciaClare.png"); 
        
        

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatosPatrullajes = new javax.swing.JTable();
        btnEditPatrullaje = new javax.swing.JButton();
        btnAddPatrullaje = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatosPatrullajes.setBackground(new java.awt.Color(70, 70, 70));
        tbDatosPatrullajes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbDatosPatrullajes.setForeground(new java.awt.Color(255, 255, 255));
        tbDatosPatrullajes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDatosPatrullajes.setGridColor(new java.awt.Color(255, 255, 255));
        tbDatosPatrullajes.setInheritsPopupMenu(true);
        tbDatosPatrullajes.setSelectionBackground(new java.awt.Color(119, 119, 119));
        tbDatosPatrullajes.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(tbDatosPatrullajes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 940, 520));

        btnEditPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditPolicia.png"))); // NOI18N
        btnEditPatrullaje.setBorderPainted(false);
        btnEditPatrullaje.setContentAreaFilled(false);
        btnEditPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditPatrullajeMouseExited(evt);
            }
        });
        jPanel1.add(btnEditPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 280, 60, 60));

        btnAddPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddPatrullaje.setBorderPainted(false);
        btnAddPatrullaje.setContentAreaFilled(false);
        btnAddPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseExited(evt);
            }
        });
        jPanel1.add(btnAddPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 340, 60, 60));

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 330, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backBuscar2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPatrullajeMouseClicked

    }//GEN-LAST:event_btnEditPatrullajeMouseClicked

    private void btnEditPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPatrullajeMouseEntered

        OriginialIcon();
        btnEditPatrullaje.setIcon(iconoClareEdit);
    }//GEN-LAST:event_btnEditPatrullajeMouseEntered

    private void btnEditPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPatrullajeMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnEditPatrullajeMouseExited

    private void btnAddPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseClicked

    }//GEN-LAST:event_btnAddPatrullajeMouseClicked

    private void btnAddPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseEntered
        OriginialIcon();
        btnAddPatrullaje.setIcon(iconoClareAdd);
    }//GEN-LAST:event_btnAddPatrullajeMouseEntered

    private void btnAddPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnAddPatrullajeMouseExited

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        yi.MostrarTablePatrullajesBuscardor(this);
    }//GEN-LAST:event_txtBuscarKeyReleased

    
     public void OriginialIcon()
    {
        btnEditPatrullaje.setIcon(iconoOriginalEdit);
        btnAddPatrullaje.setIcon(iconoOriginalAdd);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddPatrullaje;
    public javax.swing.JButton btnEditPatrullaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbDatosPatrullajes;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
