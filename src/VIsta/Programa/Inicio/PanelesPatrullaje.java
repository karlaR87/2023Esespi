
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;


public class PanelesPatrullaje extends javax.swing.JFrame {

   
    public PanelesPatrullaje() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        FlowLayout lay = new FlowLayout(FlowLayout.LEFT); //Definimos el tipo de layout que va a tener el panel
        setLayout(lay);//asignamos el valor del panel

        //conexion, el preparedstatement y el resultser
        Connection conectar = conexionSql.getConexion();
        PreparedStatement pst = null;
        ResultSet result = null;

        //acá va la query de la tabla a la que se la harán los paneles
        String SSQL = "select IdPatrullaje, Fecha_Hora_Inicio as FechaDeInicio, "
                + "Fecha_Hora_Fin as FechaFinalizacion, CONCAT(Longitud, '', Latitud) AS Ubicacion "
                + "from tbPatrullajes";

       
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
                 int numPat = result.getInt("IdPatrullaje");
                Date fecha = result.getDate("FechaDeInicio");
                Date apellido = result.getDate("FechaFinalizacion");
                String apel = result.getString("Ubicacion");
                
                //Float apel = result.getFloat("Ubicacion");
                
                //creamos los JLabel, los cuales van a tener la información traída de las variables antes definidas
                
                 JLabel labellabel = new JLabel("Patrullaje N° " + numPat);
                 JLabel labellabel1 = new JLabel("\n");
                 
                JLabel label = new JLabel("Fecha de inicio: " + fecha );
                 JLabel label2 = new JLabel("Fecha de finalización: "  + apellido );
                 JLabel label3 = new JLabel("Ubicación: " + apel);
                 
                 //aquí definimos la alineación del texto
                 label.setAlignmentY(Component.CENTER_ALIGNMENT);
                 //aquí colocamos un tipo de letra al JLabel, y le colocamos el formato y tamaño
                 Font Arial = new Font("Arial", Font.PLAIN, 14);
                 Font Arial1 = new Font("Arial", Font.PLAIN, 22);
                 //asignamos el tipo de letra al label
                 
                 //Lo mismo se realiza para todos los JLabels definidos
                 labellabel.setFont(Arial1);
                 labellabel.setForeground(Color.WHITE);
                 label.setFont(Arial);
                 label.setForeground(Color.WHITE);
                 label2.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label2.setFont(Arial);
                  label2.setForeground(Color.WHITE);
                 label3.setAlignmentY(Component.CENTER_ALIGNMENT);
                  label3.setFont(Arial);
                  label3.setForeground(Color.WHITE);
                 
                  //Agregamos los JLabels al panel
                estudiantePanel.add(labellabel);
                estudiantePanel.add(labellabel1);
                
                estudiantePanel.add(label);
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
        setPreferredSize(new java.awt.Dimension(385, 179));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(PanelesPatrullaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelesPatrullaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelesPatrullaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelesPatrullaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelesPatrullaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
