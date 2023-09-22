
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
        
        FlowLayout lay = new FlowLayout(FlowLayout.LEFT); //Definimos el tipo de layout que va a tener el panel
        setLayout(lay);//asignamos el valor del panel

        //conexion, el preparedstatement y el resultser
        Connection conectar = conexionSql.getConexion();
        PreparedStatement pst = null;
        ResultSet result = null;

        //acá va la query de la tabla a la que se la harán los paneles
        String SSQL = "select * from tbInformes ";

       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();
            
            //creamos un panel contenedor y le asignamos su layout,
            //el cual es el mismo que definimos arriba, 
            //unicamente que se debe escribir como new FlowLayout, luego definimos la ubicacion del layout
            //la cual es Leading
            
            JPanel Contenedor = new JPanel();
               Contenedor.setLayout(new FlowLayout(FlowLayout.LEADING));
               
            while (result.next()) {
                    
                //Creamos el panel en el cual se visualizarán los datos
               JPanel estudiantePanel = new JPanel(); 
               
                //le asignamos un layout, el cual será boxlayout ya que encerraremos en una "cajita"
                //los datos que se mostrarán, de modo que no rebasen los datos en caso que algun dato contenga bastantes caracteres
                //BoxLayout recibe dos parámetros, el panel que contendrá (el cual es el mismo que estamos definiendo)
                //y la orientación que tendrán los labels que se ingresarán, en este caso es en el eje Y, de forma horizontal
                estudiantePanel.setLayout(new BoxLayout(estudiantePanel, BoxLayout.Y_AXIS));
                
                //lo decoramos con un fondo de color
                estudiantePanel.setBackground(Color.DARK_GRAY); 
                
                //definimos un borde (para que se vea un poco mejor)
                //BorderFactory es la "extensión" que nos permite definir distintos tipos de bordes, 
                //en este caso, creamos un MatteBorder ya que el borde será grueso
                //y le asignamos la ubicación del borde, en este caso ya que es primer valor, el borde se pondrá arriba del panel
                //(Arriba, abajo, derecha, izquierda), finalmente le ponemos un color al borde
                Border borde = BorderFactory.createMatteBorder(15, 0, 0, 0, Color.ORANGE);
                
                //Le colocamente el borde al panel
                estudiantePanel.setBorder(borde);
                
                //definimos los campos que se van a mostrar, con sus respectivos valores y trayendolos del resultSet
                 int nombre = result.getInt("IdInforme");
                int apellido = result.getInt("IdPatrullaje");
                String apel = result.getString("Resultados");
                
                //creamos los JLabel, los cuales van a tener la información traída de las variables antes definidas
                JLabel label = new JLabel("Informe N° " + nombre );
                JLabel label4 = new JLabel("\n");
                 JLabel label2 = new JLabel("Patrullaje: "  + apellido );
                 JLabel label3 = new JLabel("Resultados: " + apel);
                 
                 //aquí definimos la alineación del texto
                 label.setAlignmentY(Component.CENTER_ALIGNMENT);
                 //aquí colocamos un tipo de letra al JLabel, y le colocamos el formato y tamaño
                 Font Arial = new Font("Arial", Font.PLAIN, 17);
                 Font Arial1 = new Font("Arial", Font.PLAIN, 22);
                 //asignamos el tipo de letra al label
                 
                 //Lo mismo se realiza para todos los JLabels definidos
                 label.setFont(Arial1);
                 label.setForeground(Color.WHITE);
                 label2.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label2.setFont(Arial);
                  label2.setForeground(Color.WHITE);
                 label3.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label3.setFont(Arial);
                  label3.setForeground(Color.WHITE);
                 
                  //Agregamos los JLabels al panel
                estudiantePanel.add(label);
                estudiantePanel.add(label4);
                estudiantePanel.add(label2);
                estudiantePanel.add(label3);
                
                //Agregamos el panel donde se encuentran los datos al panel Contenedor
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
            .addGap(0, 134, Short.MAX_VALUE)
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
