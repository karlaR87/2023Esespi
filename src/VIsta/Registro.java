package VIsta;

import Controlador.cntrlRegistro;
import Modelo.ModeloDatosTransporte;
import Modelo.ModeloRegistro;
import Modelo.ModeloTransporte;
import Modelo.conexionSql;
import Modelo.mdlPolicias;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import java.sql.Connection;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


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
  
        ModeloRegistro mdlRegistro = new ModeloRegistro();
        mdlPolicias mdlPolicias= new mdlPolicias();
        mdlTipoPersonas_Personas mdltipoPersona = new mdlTipoPersonas_Personas();
        mdlUsuarios mdUsuario = new mdlUsuarios();
        
        cntrlRegistro cntrlRegistro = new cntrlRegistro(this, RDatosPersonales, mdlRegistro, RInfoPolicial, mdlPolicias, mdltipoPersona, RUsuario, mdUsuario);
        
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

    }
    
    public void loadPreguntasS()
    {
        cardLayout.show(jPanel2, "preguntasS");  
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
    public void loadInfoUsuario()
    {
        cardLayout.show(jPanel2, "rUsuario"); 
    }
    
    public void loadInfoPolicias()
    {
        cardLayout.show(jPanel2, "RInfoPolicial");
    }
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
            
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables



    
}
