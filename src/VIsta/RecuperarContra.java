package VIsta;

import Controlador.ControladorRecuperarContra;
import Controlador.cntrlUsuarios;
import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RecuperarContra extends javax.swing.JFrame {
    
    private AskUsuario1 askUsuario;
    private MenuRC menu = new MenuRC();
    private PorCorreo porCorreo = new PorCorreo();
    private PorPreguntasS porPreguntasS;
    private PorSMS porSMS = new PorSMS(this);
    private ReestablecerContra resCon;
    private CardLayout cardLayout;
    
    public mdlPreguntasRespuestasDSeguridad mdlPreguntasDSeguridad;
    public ControladorRecuperarContra cntrRegistro;
    public ModeloRegistro mdlRegistro;
    public cntrlUsuarios cntrlUsuarios;
    
    public RecuperarContra() {
        initComponents();        
        
        mdlUsuarios mdlUsuario = new mdlUsuarios();
        mdlPreguntasDSeguridad = new mdlPreguntasRespuestasDSeguridad();       

        askUsuario = new AskUsuario1();
        resCon = new ReestablecerContra(this);
        
        mdlTipoPersonas_Personas mdlTipoPersonasP = new mdlTipoPersonas_Personas();
        mdlRegistro = new ModeloRegistro();        
        mdlPolicias mdlpolicias = new mdlPolicias();
        cntrRegistro = new ControladorRecuperarContra(mdlRegistro, this, resCon, porCorreo, porSMS, mdlpolicias, mdlUsuario, mdlTipoPersonasP);
        
        cntrlUsuarios = new cntrlUsuarios(mdlUsuario, askUsuario, mdlPreguntasDSeguridad, this, resCon);     
        
        cardLayout = new CardLayout();
        pnlPrincipal.setLayout(cardLayout);
        
        pnlPrincipal.add(menu, "menu");
        pnlPrincipal.add(porCorreo, "Correo");
        
        pnlPrincipal.add(porSMS, "SMS");
        pnlPrincipal.add(askUsuario, "askUsuario");

        cardLayout.show(pnlPrincipal, "menu");
        
        JButton btnCorreo = menu.getbtnCorreo();
        JButton btnSMS = menu.getbtnSMS();
        JButton btnSeguridad = menu.getbtnSeguridad();
        
        JLabel lblBack1 = menu.getlblBack();
        JLabel lblBack2 = porCorreo.getlblBack();
        JLabel lblBack6 = askUsuario.getlblBack();
        
        JLabel lblBack4 = porSMS.getlblBack();
        
        lblBack1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            Login LG = new Login();
            LG.setVisible(true);
            dispose();
        }
        });
        
        lblBack2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            porCorreo.numeroAleatorio = 0;
            porCorreo.visibleinCode(false);
            porCorreo.txtCode.setText("");
            porCorreo.txtMail.setText("");
            cardLayout.show(pnlPrincipal, "menu");
        }
        });
        
        lblBack4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(pnlPrincipal, "menu");
        }
        });
        
        lblBack6.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(pnlPrincipal, "menu");
        }
        });
        
        
        btnCorreo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            cardLayout.show(pnlPrincipal, "Correo");
            }
        });
        
        btnSMS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(pnlPrincipal, "SMS");
            }
        });
        
        btnSeguridad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(pnlPrincipal, "askUsuario");
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(870, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setPreferredSize(new java.awt.Dimension(870, 700));
        pnlPrincipal.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 870, 700));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(870, 30));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Minus-.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 11, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/XClose.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 4, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerMenuBar3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int LayoutX;
    int LayoutY;
    
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_jPanel2MousePressed

    public void loadPreguntas() 
    {
        porPreguntasS = new PorPreguntasS(mdlPreguntasDSeguridad, this);
        pnlPrincipal.add(porPreguntasS, "PreguntasS");
           
        JLabel lblBack3 = porPreguntasS.getlblBack();
        JButton btnacept3 = porPreguntasS.getbtnAceptar();
                
        cardLayout.show(pnlPrincipal, "PreguntasS");
                
        btnacept3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
            if(porPreguntasS.IsOk())
            {
                loadReesCon();
            }
            else{}
        }
        });
        
        lblBack3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
             porPreguntasS.txtR1.setText("");
             porPreguntasS.txtR2.setText("");
             porPreguntasS.txtR3.setText("");
            cardLayout.show(pnlPrincipal, "askUsuario");
        }
        });
    }
    
    
    public void loadReesCon()
    {
       pnlPrincipal.add(resCon, "ReesCon");
       JLabel lblBack5 = resCon.getlblBack();
       
       cardLayout.show(pnlPrincipal, "ReesCon");
       
        lblBack5.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            porCorreo.numeroAleatorio = 0;
            porCorreo.visibleinCode(false);
            porCorreo.txtCode.setText("");
            porCorreo.txtMail.setText("");            
            cardLayout.show(pnlPrincipal, "menu");
        }
        });   
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
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new RecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
