package VIsta.Programa.Patrullajes;

import Modelo.ModeloPatrullajes;
import Modelo.mdlPolicias;
import fonts.Fuentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;

public class Patrullajes_AddPersonal extends javax.swing.JFrame {

    Fuentes tipoFuentes;
    ModeloPatrullajes mdlPatrullajes;
    ImageIcon Line;
    GridBagConstraints constraints;
    ImageIcon FtoPrueba;
    
    ImageIcon A; ImageIcon B; ImageIcon C; ImageIcon D; ImageIcon E; ImageIcon F; ImageIcon G;
    ImageIcon H; ImageIcon I; ImageIcon J; ImageIcon K; ImageIcon L; ImageIcon M; ImageIcon N; 
    ImageIcon EGNE; ImageIcon O; ImageIcon P; ImageIcon Q; ImageIcon R; ImageIcon S; ImageIcon T; 
    ImageIcon U; ImageIcon V; ImageIcon W; ImageIcon X; ImageIcon Y; ImageIcon Z;
    
    public Patrullajes_AddPersonal() {
        initComponents();
    }
    public JPanel panelULTIMATE = new JPanel();
    
    public void showPolicias()
    {      
        Line = new ImageIcon("src/VIsta/imagenes/Line 4.png");
        FtoPrueba = new ImageIcon("src/VIsta/imagenes/Ellipse.png");
        this.jLabel3.setVisible(false);
        chargeImg();
        
        tipoFuentes = new Fuentes();
        try
        {
            mdlPatrullajes = new ModeloPatrullajes();
            ResultSet rs = mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje();
            
            List<String> listaNombres = new ArrayList<>();
            List<String> listaApellidos = new ArrayList<>();
            List<String> listaRango = new ArrayList<>();
            
            while(rs.next())
            {
                String Nombre = rs.getString("Nombre");
                listaNombres.add(Nombre);

                String Apellido = rs.getString("Apellido");
                listaApellidos.add(Apellido);
                
                String Rango = rs.getString("Rango");
                listaRango.add(Rango);
            }
            
            //En este punto, las 3 listas estan completas
            CreateHashMap(listaNombres);
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void CreateHashMap(List<String> listaNombres)
    {
         // Mapa para mapear letras a funciones
        Map<Character, Consumer<Void>> letraToFunction = new HashMap<>();
        letraToFunction.put('A', (Void) -> chargeA());
        letraToFunction.put('B', (Void) -> chargeB());
        // Agregar más letras y funciones según sea necesario

        // Recorre la lista y ejecuta las funciones correspondientes
        for (String nombre : listaNombres) {
            char primeraLetra = nombre.charAt(0);
            if (letraToFunction.containsKey(primeraLetra)) {
                letraToFunction.get(primeraLetra).accept(null);
                letraToFunction.remove(primeraLetra); // Marca que la función se ha ejecutado y quítala del mapa
            }
        }
        
         int topMargin = 0; // Márgen superior en píxeles
        int leftMargin = -20; // Márgen izquierdo en píxeles
        int bottomMargin = 0; // Márgen inferior en píxeles
        int rightMargin = 0; // Márgen derecho en píxeles
        EmptyBorder border = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);
        
        
        JViewport viewport = jScrollPane2.getViewport();
        
        panelULTIMATE.setLayout(new BoxLayout(panelULTIMATE, BoxLayout.Y_AXIS));;
        panelULTIMATE.setBackground(new Color(70, 70, 70));      
        panelULTIMATE.setBorder(border);
        viewport.add(panelULTIMATE);
        viewport.setView(panelULTIMATE);
    }

    public void chargeA()
    {        
        Component rigidArea20 = Box.createRigidArea(new Dimension(0, 15));
        // Crea un nuevo panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Diseño vertical
        panel.setBackground(new Color(70, 70, 70));
        
        JLabel Letter = new JLabel();
        Letter.setIcon(A);
        
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la izquierda
        horizontalBox.add(Letter); // Agrega el JLabel centrado horizontalmente
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la derecha

        panel.add(horizontalBox);

        try {
            ResultSet rs = mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullajeAAA();

            while (rs.next()) {
                JLabel Fto = new JLabel();
                Fto.setIcon(FtoPrueba);
                
                Component rigidArea = Box.createRigidArea(new Dimension(0, 10));
                Component rigidArea2 = Box.createRigidArea(new Dimension(0, 10));
                Box verticalBox = Box.createVerticalBox();
                
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                
                String Rango = rs.getString("Rango");
                
                JLabel label = new JLabel(Nombre + " " + Apellido);
                JLabel label2 = new JLabel(Rango);
                JLabel line = new JLabel();
                line.setIcon(Line);
                // Establece el color del texto en negro
                label.setForeground(Color.WHITE);
                label2.setForeground(new Color(177,177,177));
                label.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 20));
                label2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 13));

                verticalBox.add(Fto);
                verticalBox.add(label); // Agrega la etiqueta al panel
                verticalBox.add(label2);
                verticalBox.add(rigidArea);
                verticalBox.add(line);
                verticalBox.add(rigidArea2);
                panel.add(verticalBox);
            }
            
            panelULTIMATE.add(panel);
            panelULTIMATE.add(rigidArea20);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void chargeB()
    {
        Component rigidArea20 = Box.createRigidArea(new Dimension(0, 15));

        // Crea un nuevo panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Diseño vertical
        panel.setBackground(new Color(70, 70, 70));
        
        JLabel Letter = new JLabel();
        Letter.setIcon(B);
       
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la izquierda
        horizontalBox.add(Letter); // Agrega el JLabel centrado horizontalmente
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la derecha

        panel.add(horizontalBox);
        
        try {
            ResultSet rs = mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullajeBBB();

            while (rs.next()) {              
                Component rigidArea = Box.createRigidArea(new Dimension(0, 10));
                Component rigidArea2 = Box.createRigidArea(new Dimension(0, 10));
                
                String Nombre = rs.getString("Nombre");
                
                String Apellido = rs.getString("Apellido");
                
                String Rango = rs.getString("Rango");
                
                JLabel label = new JLabel(Nombre + " " + Apellido);
                JLabel label2 = new JLabel(Rango);
                JLabel line = new JLabel();
                line.setIcon(Line);
                // Establece el color del texto en negro
                label.setForeground(Color.WHITE);
                label2.setForeground(new Color(177,177,177));
                label.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 20));
                label2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 13));
                
                panel.add(label); // Agrega la etiqueta al panel
                panel.add(label2);
                panel.add(rigidArea);
                panel.add(line);
                panel.add(rigidArea2);
            }
            panelULTIMATE.add(panel);
            panelULTIMATE.add(rigidArea20);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        btnCancel = new javax.swing.JButton();
        btnAcept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BlackTransparentADDPERSONAL.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backSearch.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 76, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(70, 70, 70));
        jScrollPane2.setBorder(null);
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 370));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnX1.png"))); // NOI18N
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 500, -1, 50));

        btnAcept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCheck1.png"))); // NOI18N
        btnAcept.setBorderPainted(false);
        btnAcept.setContentAreaFilled(false);
        btnAcept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptMouseClicked(evt);
            }
        });
        getContentPane().add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 500, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backAddPersonal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnAceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptMouseClicked

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
            java.util.logging.Logger.getLogger(Patrullajes_AddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patrullajes_AddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mdlPolicias mdlPolicias = new mdlPolicias();
                new Patrullajes_AddPersonal().setVisible(true);
            }
        });
    }

    public void chargeImg()
    {
       A = new ImageIcon("src/VIsta/imagenes/LetterA.png");
       B = new ImageIcon("src/VIsta/imagenes/LetterB.png");
       C = new ImageIcon("src/VIsta/imagenes/LetterC.png");
       D = new ImageIcon("src/VIsta/imagenes/LetterD.png");
       E = new ImageIcon("src/VIsta/imagenes/LetterE.png");
       F = new ImageIcon("src/VIsta/imagenes/LetterF.png");
       G = new ImageIcon("src/VIsta/imagenes/LetterG.png");
       H = new ImageIcon("src/VIsta/imagenes/LetterH.png");
       I = new ImageIcon("src/VIsta/imagenes/LetterI.png");
       J = new ImageIcon("src/VIsta/imagenes/LetterJ.png");
       K = new ImageIcon("src/VIsta/imagenes/LetterK.png");
       L = new ImageIcon("src/VIsta/imagenes/LetterL.png");
       M = new ImageIcon("src/VIsta/imagenes/LetterM.png");
       N = new ImageIcon("src/VIsta/imagenes/LetterN.png");
       EGNE = new ImageIcon("src/VIsta/imagenes/LetterEgne.png");
       O = new ImageIcon("src/VIsta/imagenes/LetterO.png");
       P = new ImageIcon("src/VIsta/imagenes/LetterP.png");
       Q = new ImageIcon("src/VIsta/imagenes/LetterQ.png");
       R = new ImageIcon("src/VIsta/imagenes/LetterR.png");
       S = new ImageIcon("src/VIsta/imagenes/LetterS.png");
       T = new ImageIcon("src/VIsta/imagenes/LetterT.png");
       U = new ImageIcon("src/VIsta/imagenes/LetterU.png");
       V = new ImageIcon("src/VIsta/imagenes/LetterV.png");
       W = new ImageIcon("src/VIsta/imagenes/LetterW.png");
       X = new ImageIcon("src/VIsta/imagenes/LetterX.png");
       Y = new ImageIcon("src/VIsta/imagenes/LetterY.png");
       Z = new ImageIcon("src/VIsta/imagenes/LetteZ.png");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcept;
    public javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
