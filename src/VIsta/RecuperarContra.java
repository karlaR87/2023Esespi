package VIsta;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecuperarContra extends javax.swing.JFrame {
    
    MenuRC menu = new MenuRC();
    PorCorreo porCorreo = new PorCorreo();
    PorPreguntasS porPreguntasS = new PorPreguntasS();
    PorSMS porSMS = new PorSMS();
    ReestablecerContra resCon = new ReestablecerContra();
    
    private CardLayout cardLayout;
    public RecuperarContra() {
        initComponents();  
        
        cardLayout = new CardLayout();
        pnlPrincipal.setLayout(cardLayout);
        
        pnlPrincipal.add(menu, "menu");
        pnlPrincipal.add(porCorreo, "Correo");
        pnlPrincipal.add(porPreguntasS, "PreguntasS");
        pnlPrincipal.add(porSMS, "SMS");
        pnlPrincipal.add(resCon, "ReesCon");

        cardLayout.show(pnlPrincipal, "menu");
        
        JButton btnCorreo = menu.getbtnCorreo();
        JButton btnSMS = menu.getbtnSMS();
        JButton btnSeguridad = menu.getbtnSeguridad();
        
        JLabel lblBack1 = menu.getlblBack();
        JLabel lblBack2 = porCorreo.getlblBack();
        JLabel lblBack3 = porPreguntasS.getlblBack();
        JLabel lblBack4 = porSMS.getlblBack();
        JLabel lblBack5 = resCon.getlblBack();
        
        JButton btnacept1 = porCorreo.getbtnAceptar();
        JButton btnacept2 = resCon.getbtnAceptar();
        JButton btnacept3 = porPreguntasS.getbtnAceptar();
        
        btnacept2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
            if(resCon.AllisOk())
            {
                Login LG = new Login();
                LG.setVisible(true);
                dispose();
            }
            else{}
        }
        });
        
        btnacept3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
            if(porPreguntasS.IsOk())
            {
                 cardLayout.show(pnlPrincipal, "ReesCon");
            }
            else{}
        }
        });
               
        btnacept1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {          
        String txtcode = porCorreo.txtCode.getText();
        String numeroA = String.valueOf(porCorreo.numeroAleatorio);
        if(txtcode.isBlank())
        {porCorreo.showDialog("Por favor, ingrese el código enviado a su correo electrónico");}
        else{
            if(txtcode.equals(numeroA))
            {
                porCorreo.showDialog("Codigos iguales");  
                porCorreo.numeroAleatorio = 0;
                porCorreo.txtMail.setText("");
                porCorreo.txtCode.setText("");
                cardLayout.show(pnlPrincipal, "ReesCon");
            }
            else{
                 porCorreo.showDialog("El código ingresado no coincide, intente nuevamente");           
                }
            }
        }
        });
         
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
        
        lblBack3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
             porPreguntasS.txtR1.setText("");
             porPreguntasS.txtR2.setText("");
             porPreguntasS.txtR3.setText("");
            cardLayout.show(pnlPrincipal, "menu");
        }
        });
        
        lblBack4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            cardLayout.show(pnlPrincipal, "menu");
        }
        });
        
         lblBack5.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            porCorreo.numeroAleatorio = 0;
            porCorreo.visibleinCode(false);
            porCorreo.txtCode.setText("");
            porCorreo.txtMail.setText("");            
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
                cardLayout.show(pnlPrincipal, "PreguntasS");
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 700));

        pnlPrincipal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
           
    public void putReesCon()
    {
      cardLayout.show(pnlPrincipal, "ReesCon");
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
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
