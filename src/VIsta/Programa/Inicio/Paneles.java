
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Paneles extends javax.swing.JFrame {

    
    public Paneles() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        // Establece el layout del contenedor principal
        //GridLayout gridLayout = new GridLayout(0, 1);
        //gridLayout.setVgap(1); // Espacio vertical entre los paneles
        //setLayout(gridLayout);
        
        FlowLayout lay = new FlowLayout(FlowLayout.LEFT);
        setLayout(lay);

        Connection conectar = conexionSql.getConexion();
        PreparedStatement pst = null;
        ResultSet result = null;

        String SSQL = "select * from tbInformes ";

       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();
            
            JPanel Contenedor = new JPanel();
               Contenedor.setLayout(new FlowLayout(FlowLayout.LEADING));
               
            while (result.next()) {
               //JPanel estudiantePanel2 = new JPanel(); 
               //estudiantePanel2.setBackground(Color.DARK_GRAY);
               
               
               
              
               
               JPanel estudiantePanel = new JPanel(); 
               
                //estudiantePanel.setLayout(new FlowLayout());
                estudiantePanel.setLayout(new BoxLayout(estudiantePanel, BoxLayout.Y_AXIS));
                estudiantePanel.setBackground(Color.DARK_GRAY); 
                
                Border borde = BorderFactory.createMatteBorder(10, 0, 0, 0, Color.ORANGE);
                estudiantePanel.setBorder(borde);
                
                 int nombre = result.getInt("IdInforme");
                int apellido = result.getInt("IdPatrullaje");
                String apel = result.getString("Resultados");
                
                
                JLabel label = new JLabel("Número de informe: " + nombre );
                 JLabel label2 = new JLabel("Patrullaje: "  + apellido );
                 JLabel label3 = new JLabel("Resultados: " + apel);
                 
                 //estudiantePanel.add(estudiantePanel2);
                 //estudiantePanel2.setPreferredSize(new Dimension(50, 50));
                 //estudiantePanel2.setSize(50, 50);
                 
                 label.setAlignmentY(Component.CENTER_ALIGNMENT);
                 Font Arial = new Font("Arial", Font.PLAIN, 14);
                 label.setFont(Arial);
                 label.setForeground(Color.WHITE);
                 label2.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label2.setFont(Arial);
                  label2.setForeground(Color.WHITE);
                 label3.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label3.setFont(Arial);
                  label3.setForeground(Color.WHITE);
                 
                estudiantePanel.add(label);
                estudiantePanel.add(label2);
                estudiantePanel.add(label3);
                //add(estudiantePanel);
                Contenedor.add(estudiantePanel);
                
                
            }
            JScrollPane scroll = new JScrollPane(Contenedor);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            setContentPane(scroll);
            
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    
    
   
   
    
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
