package Controlador;

import Modelo.ModeloPatrullajes;
import Modelo.mdlPolicias;
import VIsta.JoptionReplacemnt;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Patrullajes.Patrullajes_AddPersonal;
import VIsta.Programa.Patrullajes.Patrullajes_Agregar;
import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;

public class cntrlPatrullajes implements ActionListener {

    private ModeloPatrullajes modelPatrullajes;
    private JframePrincipal JframePrincipal;
    private Patrullajes_Inicio vstPatrullajes;
    private Patrullajes_Agregar addPatrullajes;
    private Patrullajes_AddPersonal addPersonal;

    public cntrlPatrullajes(ModeloPatrullajes modelPatrullajes, JframePrincipal JframePrincipal, Patrullajes_Inicio patrullajesHome, Patrullajes_Agregar addPatrullajes, Patrullajes_AddPersonal addPersonal) {
        this.modelPatrullajes = modelPatrullajes;
        this.JframePrincipal = JframePrincipal;
        this.vstPatrullajes = patrullajesHome;
        this.addPatrullajes = addPatrullajes;
        this.addPersonal = addPersonal;
        
        this.JframePrincipal.btnPatrullajes.addActionListener(this);
        this.JframePrincipal.btniconPatrullajes.addActionListener(this);
        
        //Add Personal
        this.addPatrullajes.btnAddPersonal.addActionListener(this);
        //Add Patrullaje
        this.addPatrullajes.btnAddPatrullaje.addActionListener(this);
        //Cancel Patrullje 
        this.addPatrullajes.btnCancelPatrullaje.addActionListener(this);
        
        //Acept Personal
        this.addPersonal.btnAcept.addActionListener(this);
        //Cancel Personal
        this.addPersonal.btnCancel.addActionListener(this);
        
        this.vstPatrullajes.btnAddPatrullaje.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {   
        
        //-------------------------------Botones que muestran la PANTALLA INICIAL de patrullajes
        if (e.getSource() == JframePrincipal.btnPatrullajes) {
            JframePrincipal.showPatrullajePanel(1);
            
            modelPatrullajes.MostrarTablePatrullajes(vstPatrullajes);
        }
        
       if (e.getSource() == JframePrincipal.btniconPatrullajes) {
            JframePrincipal.showPatrullajePanel(2);
            
             modelPatrullajes.MostrarTablePatrullajes(vstPatrullajes);
        }
       
       //------------------------------------------------------------Boton que MUESTRA la PANTALLA de AGREGAR
      if(e.getSource() == vstPatrullajes.btnAddPatrullaje)
      {
          JframePrincipal.showAddPatrullajePanel();         
      }
       
       
       //--------------------------------AGREGAR PATRULLAJE BOTONOES-------------------------------------------------
       
       //------------------------------------------------------Boton que MUESTRA la pantalla para AGREGAR al personal
        if (e.getSource() == addPatrullajes.btnAddPersonal) {
            JframePrincipal.jLabel3.setVisible(true);
            addPersonal.setBackground(new Color(0,0,0,0));//Transparencia
              
            showPolicias();
            addPersonal.setVisible(true);
            JframePrincipal.enable(false);

        }
        //------------------------------------------------------Boton que CANCELA al Personal
        if (e.getSource() == addPersonal.btnCancel) {
          
           show("¿Seguro que quieres cancelar? no se guardarán los datos", 14, 1, 1);
           close1();
        }

        //------------------------------------------------------Boton que ACEPTA al Personal
        if (e.getSource() == addPersonal.btnAcept) {
          //Agregarlos
          if(ListaIdPolicias.size() != 3)
          {
            show("Debe seleccionar 3 policías", 17, 0, 0);
            close3();
          }
          else
          {
            show("Se asignará como jefe de grupo al mayor rango u ONI", 14, 0, 0);
            close4();
          }
    
        }
       
       //------------------------------------------------------------Boton que AGREGA el patrullaje
        if (e.getSource() == addPatrullajes.btnAddPatrullaje) {
        
        }
       
       //-------------------------------------------------------Boton que CANCELA la "Agregacion" del patrullaje
       if (e.getSource() == addPatrullajes.btnCancelPatrullaje) {
//           
         show("¿Seguro que quieres cancelar? no se guardarán los datos", 14, 1, 1);
         close2();
       }
       
    }
   
    //-------------METODOS SHOW JOPTION-------------
    
    JoptionReplacemnt Jo;
    public void show(String msg, int sizeTXT, int img, int type)
    {  
        JframePrincipal.setEnabled(false);
        JframePrincipal.jLabel3.setVisible(true);
        addPersonal.setEnabled(false);
        addPersonal.jLabel3.setVisible(true);
        
        Jo = new JoptionReplacemnt(type,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close3()
    {   
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
        }
        });
    }
    
    public void close2()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);         
           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
            addPersonal.setVisible(false);
            
            JframePrincipal.setExtendedState(JFrame.NORMAL);
            //Borrar todo
            JframePrincipal.showPatrullajePanel(2);
            
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
        }
        });
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);     
            
            addPatrullajes.jLabel4.setVisible(true);
            addPatrullajes.pnlPersonal.removeAll();
            addPatrullajes.pnlPersonal.revalidate();
            addPatrullajes.pnlPersonal.repaint();
            
            ListaIdPolicias.clear();
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
            addPersonal.setVisible(false);
            panelULTIMATE.removeAll();
            // Luego, puedes llamar al mÃ©todo "revalidate()" para actualizar la interfaz de usuario
            panelULTIMATE.revalidate();
            panelULTIMATE.repaint(); 
            JframePrincipal.setExtendedState(JFrame.NORMAL);
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
        }
        });
    }
    
    
    //----------------METODOS PARA VER LOS POLICIAS APTOS DE SELECCION--------------
    Fuentes tipoFuentes;
    ModeloPatrullajes mdlPatrullajes;
    ImageIcon Line;
    GridBagConstraints constraints;
    ImageIcon FtoPrueba;
    ImageIcon Check = new ImageIcon("src/VIsta/imagenes/Ellipse 25.png");
    ImageIcon NOCheck = new ImageIcon("src/VIsta/imagenes/Ellipse 9.png");
    
    ImageIcon A; ImageIcon B; ImageIcon C; ImageIcon D; ImageIcon E; ImageIcon F; ImageIcon G;
    ImageIcon H; ImageIcon I; ImageIcon J; ImageIcon K; ImageIcon L; ImageIcon M; ImageIcon N; 
    ImageIcon EGNE; ImageIcon O; ImageIcon P; ImageIcon Q; ImageIcon R; ImageIcon S; ImageIcon T; 
    ImageIcon U; ImageIcon V; ImageIcon W; ImageIcon X; ImageIcon Y; ImageIcon Z;
    
    List<Integer> ListaIdPolicias = new ArrayList<>();  
    public JPanel panelULTIMATE = new JPanel();

    
    public void showPolicias()
    {   
        
        Line = new ImageIcon("src/VIsta/imagenes/Line 4.png");
        FtoPrueba = new ImageIcon("src/VIsta/imagenes/Ellipse.png");
        addPersonal.jLabel3.setVisible(false);
        chargeImg();
        
        tipoFuentes = new Fuentes();
        try
        {
            mdlPatrullajes = new ModeloPatrullajes();
            ResultSet rs = mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullajeWHITOUTLIKE();
            
            List<String> listaNombres = new ArrayList<>();
            
            while(rs.next())
            {
                String Nombre = rs.getString("Nombre");
                listaNombres.add(Nombre);
            }   
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
        letraToFunction.put('A', (Void) -> chargeAll(A, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("A%")));
        letraToFunction.put('B', (Void) -> chargeAll(B, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("B%")));
        letraToFunction.put('C', (Void) -> chargeAll(C, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("C%")));
        letraToFunction.put('D', (Void) -> chargeAll(D, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("D%")));
        letraToFunction.put('E', (Void) -> chargeAll(E, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("E%")));
        letraToFunction.put('F', (Void) -> chargeAll(F, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("F%")));
        letraToFunction.put('G', (Void) -> chargeAll(G, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("G%")));
        letraToFunction.put('H', (Void) -> chargeAll(H, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("H%")));
        letraToFunction.put('I', (Void) -> chargeAll(I, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("I%")));
        letraToFunction.put('J', (Void) -> chargeAll(J, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("J%")));
        letraToFunction.put('K', (Void) -> chargeAll(K, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("K%")));
        letraToFunction.put('L', (Void) -> chargeAll(L, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("L%")));
        letraToFunction.put('M', (Void) -> chargeAll(M, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("M%")));
        letraToFunction.put('N', (Void) -> chargeAll(N, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("N%")));
        letraToFunction.put('Ñ', (Void) -> chargeAll(EGNE, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("Ñ%")));
        letraToFunction.put('O', (Void) -> chargeAll(O, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("O%")));
        letraToFunction.put('P', (Void) -> chargeAll(P, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("P%")));
        letraToFunction.put('Q', (Void) -> chargeAll(Q, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("Q%")));
        letraToFunction.put('R', (Void) -> chargeAll(R, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("R%")));
        letraToFunction.put('S', (Void) -> chargeAll(S, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("S%")));
        letraToFunction.put('T', (Void) -> chargeAll(T, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("T%")));
        letraToFunction.put('U', (Void) -> chargeAll(U, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("U%")));
        letraToFunction.put('V', (Void) -> chargeAll(V, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("V%")));
        letraToFunction.put('W', (Void) -> chargeAll(W, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("W%")));
        letraToFunction.put('X', (Void) -> chargeAll(X, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("X%")));
        letraToFunction.put('Y', (Void) -> chargeAll(Y, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("Y%")));
        letraToFunction.put('Z', (Void) -> chargeAll(Z, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullaje("Z%")));

        // Recorre la lista y ejecuta las funciones 
        for (String nombre : listaNombres) {
            char primeraLetra = nombre.charAt(0);
            if (letraToFunction.containsKey(primeraLetra)) {
                letraToFunction.get(primeraLetra).accept(null);
                letraToFunction.remove(primeraLetra); // Marca que la funciÃ³n se ha ejecutado y quÃ­tala del mapa
            }
        }
        
        int topMargin = 0; // MÃ¡rgen superior en pÃ­xeles
        int leftMargin = -20; // MÃ¡rgen izquierdo en pÃ­xeles
        int bottomMargin = 0; // MÃ¡rgen inferior en pÃ­xeles
        int rightMargin = 0; // MÃ¡rgen derecho en pÃ­xeles
        EmptyBorder border = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);
 
        JViewport viewport = addPersonal.jScrollPane2.getViewport(); 
        panelULTIMATE.setLayout(new BoxLayout(panelULTIMATE, BoxLayout.Y_AXIS));;
        panelULTIMATE.setBackground(new Color(70, 70, 70));      
        panelULTIMATE.setBorder(border);
        viewport.add(panelULTIMATE);
        viewport.setView(panelULTIMATE);
    }
    Component rigidArea = Box.createRigidArea(new Dimension(0, 10));
    
    public void chargeAll(ImageIcon img, ResultSet rs)
    {       
        Component rigidArea20 = Box.createRigidArea(new Dimension(0, 15));
        // Crea un nuevo panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // DiseÃ±o vertical
        panel.setBackground(new Color(70, 70, 70));
        
        JLabel Letter = new JLabel();
        Letter.setIcon(img);
        
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la izquierda
        horizontalBox.add(Letter); // Agrega el JLabel centrado horizontalmente
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la derecha

        horizontalBox.setBorder(new EmptyBorder(0,0,10,0));
        panel.add(horizontalBox);

        try {

            while (rs.next()) {
                
                JLabel Fto = new JLabel();
                ImageIcon imagenIcon = new ImageIcon("src/VIsta/imagenes/FTORplc.png");
                Fto.setIcon(imagenIcon);
                
                Component rigidArea2 = Box.createRigidArea(new Dimension(0, 10));
                
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                
                String Rango = rs.getString("Rango");
                
                int IdPolicia = rs.getInt("IdPolicia");
                
                String nameComplete = "<html>" + Nombre + " " + Apellido + "</html>";
                JLabel label = new JLabel(nameComplete);
               label.setPreferredSize(new Dimension(50, 50));
                
                JLabel label2 = new JLabel(Rango);
                JLabel line = new JLabel();
                line.setIcon(Line);
                // Establece el color del texto en negro
                label.setForeground(Color.WHITE);
                label2.setForeground(new Color(177,177,177));
                label.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 16));
                label2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 12));

                //Crear CheckBox con el "valor" del idPolicia
                JCheckBox checkBox = new JCheckBox(String.valueOf(IdPolicia), false);
                checkBox.setForeground(new Color(70, 70, 70));
                checkBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                checkBox.setSelectedIcon(Check);
                checkBox.setIcon(NOCheck);
                
                if (ListaIdPolicias.contains(IdPolicia)) 
                {
                    checkBox.setSelected(true);
                } else 
                {
                    checkBox.setSelected(false);
                }
                
                //ActionListenerdel checkbox
                checkBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JCheckBox source = (JCheckBox) e.getSource();
                    if (source.isSelected()) {
                        System.out.println("Checkbox seleccionado " + checkBox.getText());
                        addIdANDConfirmNumber(Integer.valueOf(checkBox.getText()), checkBox);
                        
                        
                    } else {
                        System.out.println("Checkbox deseleccionado " + checkBox.getText());
                        eliminateIdA(Integer.valueOf(checkBox.getText()));
                        
                    }
                }
            });
                int topMargin = 0; // MÃ¡rgen superior en pÃ­xeles
                int leftMargin = 0; // MÃ¡rgen izquierdo en pÃ­xeles
                int bottomMargin = 0; // MÃ¡rgen inferior en pÃ­xeles
                int rightMargin = 0; // MÃ¡rgen derecho en pÃ­xeles
                EmptyBorder border = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);
                EmptyBorder margin = new EmptyBorder(topMargin, 20, bottomMargin, 10);
                checkBox.setBorder(new EmptyBorder(0,5,0,5));
                
                Box verticalBox = Box.createVerticalBox();
                Box verticalBox2 = Box.createVerticalBox();
                Box horizontalBox2 = Box.createHorizontalBox();
                
                Box horizontalMAIN = Box.createHorizontalBox();
                
                verticalBox2.add(horizontalMAIN);
                verticalBox2.add(horizontalBox2);
                horizontalMAIN.setBorder(border);
                Fto.setBorder(margin);
                horizontalMAIN.add(Fto);
                horizontalMAIN.add(verticalBox);
                horizontalMAIN.add(checkBox);
                verticalBox.add(label); // Agrega la etiqueta al panel
                verticalBox.add(label2);
                horizontalBox2.add(rigidArea);
                horizontalBox2.add(line);         
                horizontalBox2.add(rigidArea2);
                horizontalBox2.setBorder(new EmptyBorder(0,76,0,10));
                horizontalBox2.add(Box.createHorizontalGlue());
        
                panel.add(verticalBox2);
            }
            
            panelULTIMATE.add(panel);
            panelULTIMATE.add(rigidArea20);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void addIdANDConfirmNumber(int IdPolicia, JCheckBox checkBox)
    {
        if(ListaIdPolicias.size() == 3)
        {
            checkBox.setSelected(false);
            show("No se puede seleccionar más de 3 policias", 16, 0, 0);
            close3();
            System.out.println(ListaIdPolicias);
        }
        else
        {
            ListaIdPolicias.add(Integer.valueOf(IdPolicia));
        }
    }
    
    public void eliminateIdA(int IdPolicia)
    {
        ListaIdPolicias.remove(Integer.valueOf(IdPolicia));
    }
  
    public void close4()
    {   
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);      
            
            addPatrullajes.pnlPersonal.removeAll();
            addPatrullajes.pnlPersonal.revalidate();
            addPatrullajes.pnlPersonal.repaint();
            panelULTIMATE.removeAll();
            // Luego, puedes llamar al mÃ©todo "revalidate()" para actualizar la interfaz de usuario
            panelULTIMATE.revalidate();
            panelULTIMATE.repaint();
            
            JframePrincipal.jLabel3.setVisible(false);
            JframePrincipal.setEnabled(true);
            addPersonal.setVisible(false);
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
            
            addPatrullajes.jLabel4.setVisible(false);

            
             mdlPatrullajes = new ModeloPatrullajes();
             
             for(int Id: ListaIdPolicias)
             {
                try {
                    ResultSet rs = mdlPatrullajes.ChargePoliciaSELECTED(Id);
                    addPatrullajes.pnlPersonal.setLayout(new BoxLayout(addPatrullajes.pnlPersonal, BoxLayout.Y_AXIS));
                    while (rs.next()) {
                        
                        JLabel Fto = new JLabel();
                        ImageIcon imagenIcon = new ImageIcon("src/VIsta/imagenes/FTORplc.png");
                        Fto.setIcon(imagenIcon);
                        
                        Component rigidArea2 = Box.createRigidArea(new Dimension(0, 10));
                        
                        String Nombre = rs.getString("Nombre");
                        String Apellido = rs.getString("Apellido");
                        
                        String Rango = rs.getString("Rango");
                        
                        int IdPolicia = rs.getInt("IdPolicia");
                        
                        String nameComplete = "<html>" + Nombre + " " + Apellido + "</html>";
                        JLabel label = new JLabel(nameComplete);
                        label.setPreferredSize(new Dimension(50, 50));
                        
                        JLabel label2 = new JLabel(Rango);
                        JLabel line = new JLabel();
                        line.setIcon(Line);
                        // Establece el color del texto en negro
                        label.setForeground(Color.WHITE);
                        label2.setForeground(new Color(177,177,177));
                        label.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 16));
                        label2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 12));
                        
                        int topMargin = 0; // MÃ¡rgen superior en pÃ­xeles
                        int leftMargin = 0; // MÃ¡rgen izquierdo en pÃ­xeles
                        int bottomMargin = 0; // MÃ¡rgen inferior en pÃ­xeles
                        int rightMargin = 0; // MÃ¡rgen derecho en pÃ­xeles
                        EmptyBorder border = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);
                        EmptyBorder margin = new EmptyBorder(topMargin, 5, bottomMargin, 10);
                        
                        Box verticalBox = Box.createVerticalBox();
                        Box verticalBox2 = Box.createVerticalBox();
                        Box horizontalBox2 = Box.createHorizontalBox();

                        Box horizontalMAIN = Box.createHorizontalBox();

                        verticalBox2.add(horizontalMAIN);
                        verticalBox2.add(horizontalBox2);
                        horizontalMAIN.setBorder(border);
                        Fto.setBorder(margin);
                        horizontalMAIN.add(Fto);
                        horizontalMAIN.add(verticalBox);
                        verticalBox.add(label); // Agrega la etiqueta al panel
                        verticalBox.add(label2);
                        horizontalBox2.add(rigidArea);
                        horizontalBox2.add(line);         
                        horizontalBox2.add(rigidArea2);
                        horizontalBox2.setBorder(new EmptyBorder(0,60,0,10));
                        horizontalBox2.add(Box.createHorizontalGlue());
        
                        addPatrullajes.pnlPersonal.add(verticalBox2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(cntrlPatrullajes.class.getName()).log(Level.SEVERE, null, ex);
                }
                
             }
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
       Z = new ImageIcon("src/VIsta/imagenes/LetterZ.png");
    }
}
