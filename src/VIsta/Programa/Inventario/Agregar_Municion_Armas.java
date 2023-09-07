/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package VIsta.Programa.Inventario;

import Controlador.ControladorArmamento;
import Controlador.cntrlClibre;
import Modelo.ModeloArmamento;
import Modelo.ModeloCalibre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author karla
 */
public class Agregar_Municion_Armas extends javax.swing.JFrame  {
    
    ModeloArmamento modeloArmamento = new ModeloArmamento(); // Crea una única instancia del modelo

    
    ModeloCalibre modeloCalibre = new ModeloCalibre();


  
     
    public Agregar_Municion_Armas() {
        initComponents();
        modeloCalibre = new ModeloCalibre();

        modeloCalibre.mostrarParaSeleccion(this);
        addCheckBox(2, tbMuniconSelecccion);
//        

    }
    

     //metodo para poner los checkbox en las columnas
     public void addCheckBox(int column, JTable table)
    {
        //se crea una estancia de tablecolum para obtener modelo y numero de columna
        TableColumn tc = table.getColumnModel().getColumn(column);
        //lo pasamos a booleanos para poner obtener info
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }
     

    public boolean IsSelected(int row, int column, JTable table)
    {   
        
        return table.getValueAt(row, column) != null;// Obtener el valor booleano de la casilla seleccionada  
    } 
    

    
    
// Agregar un campo en la clase para almacenar los IDs de calibres seleccionados
    private List<Integer> calibresSeleccionados = new ArrayList<>();
    
    public List<Integer> getCalibresSeleccionados() {
        System.out.println("Calibres finales: " + calibresSeleccionados);
        return calibresSeleccionados;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMuniconSelecccion = new javax.swing.JTable();
        btnAgregarMunicion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMuniconSelecccion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMuniconSelecccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 420, 240));

        btnAgregarMunicion.setText("Agregar");
        btnAgregarMunicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMunicionMouseClicked(evt);
            }
        });
        btnAgregarMunicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMunicionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMunicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Vista_AgregarMunicionArmas1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMunicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMunicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMunicionActionPerformed

    private void btnAgregarMunicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMunicionMouseClicked
    // Limpiar la lista de calibres seleccionados
    calibresSeleccionados.clear();

    // Iterar sobre las filas de la tabla
    for (int row = 0; row < tbMuniconSelecccion.getRowCount(); row++) {
        Boolean isSelected = (Boolean) tbMuniconSelecccion.getValueAt(row, 2);
        int idCalibre = (int) tbMuniconSelecccion.getValueAt(row, 0);

        if (isSelected != null && isSelected) {
            // Agregar a la lista si está seleccionado
            calibresSeleccionados.add(idCalibre);
            System.out.println("Calibre seleccionado: " + idCalibre);
        } else {
            calibresSeleccionados.remove(Integer.valueOf(idCalibre));
            System.out.println("Calibre que se quitó: " + idCalibre);
        }
    }

    // Imprimir la lista final de calibres seleccionados
    

    // Cierra la ventana de calibres después de obtener los IDs
    this.dispose();
    }//GEN-LAST:event_btnAgregarMunicionMouseClicked

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar_Municion_Armas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Municion_Armas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Municion_Armas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Municion_Armas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarMunicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbMuniconSelecccion;
    // End of variables declaration//GEN-END:variables

      

}
