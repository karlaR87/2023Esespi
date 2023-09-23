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
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
            addPersonal.setVisible(false);
            panelULTIMATE.removeAll();
            // Luego, puedes llamar al método "revalidate()" para actualizar la interfaz de usuario
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
    
    ImageIcon A; ImageIcon B; ImageIcon C; ImageIcon D; ImageIcon E; ImageIcon F; ImageIcon G;
    ImageIcon H; ImageIcon I; ImageIcon J; ImageIcon K; ImageIcon L; ImageIcon M; ImageIcon N; 
    ImageIcon EGNE; ImageIcon O; ImageIcon P; ImageIcon Q; ImageIcon R; ImageIcon S; ImageIcon T; 
    ImageIcon U; ImageIcon V; ImageIcon W; ImageIcon X; ImageIcon Y; ImageIcon Z;
    
    List<Integer> ListaIdPolicias;
    public JPanel panelULTIMATE = new JPanel();
    
    public void showPolicias()
    {      
        ListaIdPolicias = new ArrayList<>();       
        Line = new ImageIcon("src/VIsta/imagenes/Line 4.png");
        FtoPrueba = new ImageIcon("src/VIsta/imagenes/Ellipse.png");
        addPersonal.jLabel3.setVisible(false);
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
        letraToFunction.put('A', (Void) -> chargeAll(A, mdlPatrullajes.ChargeInfoPolicialAptaParaPatrullajeAAA()));
//        letraToFunction.put('B', (Void) -> chargeB());
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
 
        JViewport viewport = addPersonal.jScrollPane2.getViewport(); 
        panelULTIMATE.setLayout(new BoxLayout(panelULTIMATE, BoxLayout.Y_AXIS));;
        panelULTIMATE.setBackground(new Color(70, 70, 70));      
        panelULTIMATE.setBorder(border);
        viewport.add(panelULTIMATE);
        viewport.setView(panelULTIMATE);
    }
    
    public void chargeAll(ImageIcon img, ResultSet rs)
    {        
        Component rigidArea20 = Box.createRigidArea(new Dimension(0, 15));
        // Crea un nuevo panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Diseño vertical
        panel.setBackground(new Color(70, 70, 70));
        
        JLabel Letter = new JLabel();
        Letter.setIcon(img);
        
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la izquierda
        horizontalBox.add(Letter); // Agrega el JLabel centrado horizontalmente
        horizontalBox.add(Box.createHorizontalGlue()); // Espacio a la derecha

        panel.add(horizontalBox);

        try {

            while (rs.next()) {
                
                JLabel Fto = new JLabel();
                Fto.setIcon(FtoPrueba);
                
                Component rigidArea = Box.createRigidArea(new Dimension(0, 10));
                Component rigidArea2 = Box.createRigidArea(new Dimension(0, 10));
                
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                
                String Rango = rs.getString("Rango");
                
                int IdPolicia = rs.getInt("IdPolicia");
                
                JLabel label = new JLabel("<html>" + Nombre + " " + Apellido + "</hmtl>");
                label.setMaximumSize(new Dimension(150, Integer.MAX_VALUE));
                
                JLabel label2 = new JLabel(Rango);
                JLabel line = new JLabel();
                line.setIcon(Line);
                // Establece el color del texto en negro
                label.setForeground(Color.WHITE);
                label2.setForeground(new Color(177,177,177));
                label.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 20));
                label2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 1, 13));

                //Crear CheckBox con el "valor" del idPolicia
                JCheckBox checkBox = new JCheckBox(String.valueOf(IdPolicia), false);
                checkBox.setForeground(Color.WHITE);
                checkBox.setBackground(Color.RED);
                
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
                int topMargin = 0; // Márgen superior en píxeles
                int leftMargin = 0; // Márgen izquierdo en píxeles
                int bottomMargin = 0; // Márgen inferior en píxeles
                int rightMargin = 0; // Márgen derecho en píxeles
                EmptyBorder border = new EmptyBorder(topMargin, leftMargin, bottomMargin, rightMargin);
                EmptyBorder margin = new EmptyBorder(topMargin, leftMargin, bottomMargin, 10);

                
                Box verticalBox = Box.createVerticalBox();
                
                Box horizontalMAIN = Box.createHorizontalBox();
                horizontalMAIN.setBorder(border);
                Fto.setBorder(margin);
                horizontalMAIN.add(Fto);
                horizontalMAIN.add(verticalBox);
                horizontalMAIN.add(checkBox);
                verticalBox.add(label); // Agrega la etiqueta al panel
                verticalBox.add(label2);
                verticalBox.add(rigidArea);
                verticalBox.add(line);
                verticalBox.add(rigidArea2);
                
                panel.add(horizontalMAIN);
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
            show("No se pueden seleccionar más de 3 policias", 16, 0, 0);
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
}
