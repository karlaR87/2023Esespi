package VIsta;

import Modelo.conexionSql;
import java.sql.Connection;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Controlador.ControladorRegistro;


public class Registro extends javax.swing.JFrame {

    private Registro_Idiomas formularioIdiomas;
    private Registro_Nacionalidades formularioNacionalidad;
    private ArrayList<Boolean> idiomasSeleccionados = new ArrayList<>();
    private ArrayList<Boolean> nacionalidadesSelecionadas = new ArrayList<>();
    
    void agregarIdiomaSeleccionado(Boolean idiomaSeleccionado) {
        
        idiomasSeleccionados.add(idiomaSeleccionado);
        formularioIdiomas.setRegistro(this);
  
    }
    
    void agregarNacionalidadSeleccionada(Boolean nacionalidadseleccionada) {
       
        nacionalidadesSelecionadas.add(nacionalidadseleccionada);
         formularioNacionalidad.setRegistro(this);

    }
    
    public Registro() {
        initComponents();
        PanelsShowInit();
        formularioIdiomas = new Registro_Idiomas(); // Crear una instancia de Registro_Idiomas
        formularioIdiomas.setRegistro(this); // Establecer la referencia a la instancia de Registro
        
        
    }
    
    
    private CardLayout cardLayout;
  
    private void PanelsShowInit()
    {
        Registro_DatosPersonales RDatosPersonales = new Registro_DatosPersonales();
        RegistroInfoPolicial RInfoPolicial = new RegistroInfoPolicial();
        RegistroUsuario RUsuario = new RegistroUsuario();
        PreguntasSeguridad RPreguntasS = new PreguntasSeguridad();
  
        
       cardLayout = new CardLayout();
        jPanel2.setLayout(cardLayout);
        RDatosPersonales.setRegistro(this);
        
        jPanel2.add(RDatosPersonales, "RDatosPersonales");
        jPanel2.add(RInfoPolicial, "RInfoPolicial");
        jPanel2.add(RUsuario, "rUsuario");
        jPanel2.add(RPreguntasS, "preguntasS");
                
        cardLayout.show(jPanel2, "RDatosPersonales");
        
        JLabel lblBack1 = RDatosPersonales.getlblBack();
        JLabel lblBack2 = RInfoPolicial.lblRegresar;
        JLabel lblBack3 = RUsuario.lblRegresar;
        JLabel lblBack4 = RPreguntasS.getlblBack();
        
        JButton next1 = RDatosPersonales.getBtnSiguiente();      
        JButton next2 = RInfoPolicial.btnSiguiente; 
        JButton next3 = RUsuario.btnSiguiente; 
        
        lblBack1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            Login LG = new Login();
            LG.setVisible(true);
            dispose();
        }
        });
        
        lblBack2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(jPanel2, "RDatosPersonales");
        }
        });
        
         lblBack3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(jPanel2, "RInfoPolicial");
        }
        });
        
        lblBack4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(jPanel2, "rUsuario");
        }
        });
        
        next1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
//            if(tenemos todos los datos)
//            {
                cardLayout.show(jPanel2, "RInfoPolicial");
//            }
//            else
//            {
//             si no, evitar y mostrar mensaje de que falta
//            }
        }
        });
        
        next2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
//            if(tenemos todos los datos)
//            {
                cardLayout.show(jPanel2, "rUsuario"); 
//            }
//            else
//            {
//             si no, evitar y mostrar mensaje de que falta
//            }
        }
        });

        next3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
//            if(tenemos todos los datos)
//            {
                cardLayout.show(jPanel2, "preguntasS"); 
//            }
//            else
//            {
//             si no, evitar y mostrar mensaje de que falta
//            }
        }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1010, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1012, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1010, 720));
        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


    
}
