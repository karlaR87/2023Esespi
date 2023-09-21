
package VIsta.Programa.Reportes;

import Modelo.ModeloInformes;
import Modelo.TextPrompt;
import Modelo.conexionSql;
import VIsta.Programa.Inicio.Paneles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Reportes_Inicio extends javax.swing.JPanel {

    
    public Reportes_Inicio() {
        initComponents();
        
        //Agregar un placeholder
        TextPrompt placeholder = new TextPrompt("Buscar", txtBusquedaInforme);
        
       ModeloInformes m = new ModeloInformes();
       m.mostrar(this);
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrarDatos = new javax.swing.JTable();
        txtBusquedaInforme = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        MostrarPaneles = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMostrarDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMostrarDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 730, 480));

        txtBusquedaInforme.setBorder(null);
        txtBusquedaInforme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaInformeKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusquedaInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 380, 40));

        jButton2.setBackground(new java.awt.Color(68, 68, 68));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAgregarReporte1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        MostrarPaneles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/LetterP.png"))); // NOI18N
        MostrarPaneles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarPanelesMouseClicked(evt);
            }
        });
        jPanel1.add(MostrarPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 50, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BusquedaGrande.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaInformeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaInformeKeyReleased
         ModeloInformes m = new ModeloInformes();
       m.mostrar1(this);
    }//GEN-LAST:event_txtBusquedaInformeKeyReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        EleccionReporte el = new EleccionReporte();
        el.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void MostrarPanelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarPanelesMouseClicked
        Paneles p = new Paneles();
        p.setVisible(true);
    }//GEN-LAST:event_MostrarPanelesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarPaneles;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbMostrarDatos;
    public javax.swing.JTextField txtBusquedaInforme;
    // End of variables declaration//GEN-END:variables
}
