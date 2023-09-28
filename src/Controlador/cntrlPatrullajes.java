package Controlador;

import Modelo.ModeloPatrullajes;
import Modelo.mdlPolicias;
import VIsta.JoptionReplacemnt;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Patrullajes.Patrullajes_AddActividades;
import VIsta.Programa.Patrullajes.Patrullajes_AddEquipamiento;
import VIsta.Programa.Patrullajes.Patrullajes_AddPersonal;
import VIsta.Programa.Patrullajes.Patrullajes_AddUbicacion;
import VIsta.Programa.Patrullajes.Patrullajes_Agregar;
import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import com.teamdev.jxmaps.Circle;
import com.teamdev.jxmaps.CircleOptions;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.PolygonOptions;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.Painter;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import net.sf.jasperreports.engine.util.Pair;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;
import org.jxmapviewer.viewer.WaypointRenderer;

public class cntrlPatrullajes implements ActionListener {

    private ModeloPatrullajes modelPatrullajes;
    private JframePrincipal JframePrincipal;
    private Patrullajes_Inicio vstPatrullajes;
    private Patrullajes_Agregar addPatrullajes;
    private Patrullajes_AddPersonal addPersonal;
    private Patrullajes_AddUbicacion addUbicacion;
    private Patrullajes_AddActividades addActPatrullaje;
    private Patrullajes_AddEquipamiento addEquipamiento;

    public cntrlPatrullajes(ModeloPatrullajes modelPatrullajes, JframePrincipal JframePrincipal, Patrullajes_Inicio patrullajesHome, Patrullajes_Agregar addPatrullajes, Patrullajes_AddPersonal addPersonal, Patrullajes_AddUbicacion addUbicacion, Patrullajes_AddActividades addActPatrullaje, Patrullajes_AddEquipamiento addEquipamiento) {
        this.modelPatrullajes = modelPatrullajes;
        this.JframePrincipal = JframePrincipal;
        this.vstPatrullajes = patrullajesHome;
        this.addPatrullajes = addPatrullajes;
        this.addPersonal = addPersonal;
        this.addUbicacion = addUbicacion;
        this.addActPatrullaje = addActPatrullaje;
        this.addEquipamiento = addEquipamiento;
        
        this.JframePrincipal.btnPatrullajes.addActionListener(this);
        this.JframePrincipal.btniconPatrullajes.addActionListener(this);

        //Mostrar patrullaje
        this.vstPatrullajes.btnAddPatrullaje.addActionListener(this);
       //Add Patrullaje
        this.addPatrullajes.btnAddPatrullaje.addActionListener(this);
        //Cancel Patrullje 
        this.addPatrullajes.btnCancelPatrullaje.addActionListener(this);     
        
        //Mostrar Act patrullajes
        this.addPatrullajes.btnAddActPatru.addActionListener(this);
        //Cancel ActPatrullajes
        this.addActPatrullaje.btnCancel.addActionListener(this);
        //Acept ActPatrullajes
        this.addActPatrullaje.btnAcept.addActionListener(this);
        
        //Mostrar Personal
        this.addPatrullajes.btnAddPersonal.addActionListener(this);
        //Acept Personal
        this.addPersonal.btnAcept.addActionListener(this);
        //Cancel Personal
        this.addPersonal.btnCancel.addActionListener(this);
  
        //Mostrar Ubicacion
        this.addPatrullajes.btnAddUbi.addActionListener(this);
        //Cancelar MAPA
        this.addUbicacion.btnCancelMap.addActionListener(this);
        //Export MAPA
        this.addUbicacion.btnEXPORTAR.addActionListener(this);
        
        //Mostrar AddEquipamiento
        this.addPatrullajes.btnAddEqui.addActionListener(this);
        //Acept Equipamiento
        this.addEquipamiento.btnAcept.addActionListener(this);
        //Cancel Equipamiento
        this.addEquipamiento.btnCancel.addActionListener(this);
        
        showMap();
    }
   ImageIcon nuevoIcono;
    public double latitud = 0;
    public double longitud = 0;
    
    Map<String, String> ListaActPatru = new HashMap<>();
    String valorComboBox1;
    String valorComboBox2;
    String valorComboBox3;
    String valorComboBox4;
    String valorComboBox5;
    
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
          //------------CARGAR ARMAS CORTAS 
          ChargeArmas(modelPatrullajes.CharegeArmasCORTAS(), addPatrullajes.jSPArmasCortas);
          //------------CARGAR ARMAS LARGAS 
          ChargeArmas(modelPatrullajes.CharegeArmasLARGAS(), addPatrullajes.jSPArmasLargas);
          
      }
       //--------------------------------AGREGAR PATRULLAJE BOTONOES-------------------------------------------------
       
       //------------------------------------------------------------Boton que AGREGA el patrullaje
        
       if (e.getSource() == addPatrullajes.btnAddPatrullaje) 
       {    
           //-----------------CONFIRMAR QUE TODO ESTE COMPLETO-----------------------------------------------------------------------
          
           //---------------PRIMER EXECUTE (PATRULLAJES)
           if(addUbicacion.txtEXTENSIONKM.getText().trim().equals(""))
           {
               show("Asigna el área de patrullaje", 17, 1, 0);
               close8();
           }
           else
           {
               if(addPatrullajes.lblMAPImage.isVisible() == true)
               {
                   byte[] imageBytes = convertImageIconToBytes(nuevoIcono);
                   
                   mdlPatrullajes.setExtensionKM(addUbicacion.txtEXTENSIONKM.getText().trim());
                   mdlPatrullajes.setFotoByte(imageBytes);
               }
               else
               {
                   if(longitud == 0 || latitud == 0)
                   {
                        show("Selecciona un punto en el mapa", 17, 1, 0);
                        close8();
                   }
                   else
                   {
                       mdlPatrullajes.setLongitud(longitud);
                       mdlPatrullajes.setLatitud(latitud);
                       mdlPatrullajes.setTipoPatrullaje(addUbicacion.cmbTipoPatrullaje.getSelectedItem().toString());
                       
                       if(addPatrullajes.dpFechaInicio.getDate() == null || addPatrullajes.dpFechaFin.getDate() == null)
                       {
                           show("Determina la fecha de inicio del patrullaje", 15, 1, 0);
                           close8();
                       }
                       else
                       {
                           Date fechaInicioSelected = addPatrullajes.dpFechaInicio.getDate();
                           Date fechaFinSelected = addPatrullajes.dpFechaFin.getDate();
                           
                           int horaInicio = Integer.parseInt(addPatrullajes.txtHora1.getText().trim());
                           int minutosInicio = Integer.parseInt(addPatrullajes.txtMin1.getText().trim());   
                           
                           int horaFin = Integer.parseInt(addPatrullajes.txtHora2.getText().trim());
                           int minutosFin = Integer.parseInt(addPatrullajes.txtMin2.getText().trim());   

                            Calendar calendar1 = Calendar.getInstance();
                            calendar1.setTime(fechaInicioSelected);
                            calendar1.set(Calendar.HOUR_OF_DAY, horaInicio);
                            calendar1.set(Calendar.MINUTE, minutosInicio);

                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(fechaFinSelected);
                            calendar2.set(Calendar.HOUR_OF_DAY, horaFin);
                            calendar2.set(Calendar.MINUTE, minutosFin);
                            
                            // Obtén la fecha completa
                            Date fechaCompletaInicio = calendar1.getTime();
                            Date fechaCompletaFin = calendar2.getTime();
                            
                            mdlPatrullajes.setFechaInicio(fechaCompletaInicio);
                            mdlPatrullajes.setFechaFin(fechaCompletaFin);
                            
                            mdlPatrullajes.InsertarPatrullaje();
                            
                           //---------------SEGUNDO EXECUTE (ACTIVIDADES)
                           ChargeActividadesPatru();
                           
                           //----------------TERCER EXECUTE (ACTUALIZAR POLICIAS)
                            mdlPatrullajes.setIdPoli1(ListaIdPolicias.get(0));
                            mdlPatrullajes.setIdPoli2(ListaIdPolicias.get(1));
                            mdlPatrullajes.setIdPoli3(ListaIdPolicias.get(2));
                           
                            mdlPatrullajes.ActualizarPoliciasPatrullaje();
                            
                           //----------------CUARTO EXECUTE (INSERTAR ARMAS)
                       }
                   }
               }
                
           }
           
          
       }
       
       //-------------------------------------------------------Boton que CANCELA la "Agregacion" del patrullaje
       if (e.getSource() == addPatrullajes.btnCancelPatrullaje) {
//           
         show("¿Seguro que quieres cancelar? no se guardarán los datos", 14, 1, 1);
         close2();
       }
       
        //-------------------------------Botones que muestran la Pantalla de AddEquipamiento
        if(e.getSource() == addPatrullajes.btnAddEqui)
        {
            //---------------------Equipo Especializado--------
                //Visores
                ChargeEquipamiento(modelPatrullajes.CharegeEquipoESPECIALIZADO_Visores(), addEquipamiento.jScrollVisores);
                //Chalecos
                ChargeEquipamiento(modelPatrullajes.CharegeEquipoESPECIALIZADO_Chalecos(), addEquipamiento.jScrollChalecos);
                //Geolocalizacion
                ChargeEquipamiento(modelPatrullajes.CharegeEquipoESPECIALIZADO_Geolocalizacion(), addEquipamiento.jScrollGeolocalizacion);
                //Tactico de intervencion
                ChargeEquipamiento(modelPatrullajes.CharegeEquipoESPECIALIZADO_TacticoIntrv(), addEquipamiento.jScrollTactico);
            
            //---------------------Equipo Seguridad--------
                //Bastones
                ChargeEquipamiento(modelPatrullajes.CharegeEquiposSEGURIDAD_Bastones(), addEquipamiento.jScrollBastones);
                //Esposas
                ChargeEquipamiento(modelPatrullajes.CharegeEquiposSEGURIDAD_Esposas(), addEquipamiento.jScrollEsposas);
                //Taser
                ChargeEquipamiento(modelPatrullajes.CharegeEquiposSEGURIDAD_Taser(), addEquipamiento.jScrollTaser);
                //Radios
                ChargeEquipamiento(modelPatrullajes.CharegeEquiposSEGURIDAD_Radios(), addEquipamiento.jScrollRadios);
                //Escudos
                ChargeEquipamiento(modelPatrullajes.CharegeEquiposSEGURIDAD_Escudos(), addEquipamiento.jScrollEscudos);
            
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            addEquipamiento.setEnabled(true);
            addEquipamiento.setVisible(true);
            addEquipamiento.jLabel5.setVisible(false);
        }
        
        //Boton que ACEPTA la Agregacion del Equipamiento
        if(e.getSource() == addEquipamiento.btnAcept)
        {
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            addEquipamiento.setEnabled(true);
            addEquipamiento.jLabel5.setVisible(false);
            addEquipamiento.setVisible(false);
        }
        
        //Boton que Canela La Agregacion del equipamiento
        if(e.getSource() == addEquipamiento.btnCancel)
        {
           show("¿Seguro que quieres cancelar? no se guardarán los datos", 14, 1, 1);
           close7();
        }
       
       //------------------------------------------------------Boton que muestra la pantalla de actpatrullaje
       if(e.getSource() == addPatrullajes.btnAddActPatru)
       {
           JframePrincipal.jLabel3.setVisible(true);
           JframePrincipal.setEnabled(false);
           addActPatrullaje.setVisible(true);
           addActPatrullaje.setEnabled(true);
           addActPatrullaje.jLabel3.setVisible(false);
        
       }
       //------------------------------------------------------Boton que cancela la agregacion de actpatrullaje
       if(e.getSource() == addActPatrullaje.btnCancel)
       {
           show("¿Seguro que quieres cancelar? no se guardarán los datos", 14, 1, 1);
           close5();
       }
       
       //------------------------------------------------------Boton que ACEPTA la agregacion de actpatrullaje
       if(e.getSource() == addActPatrullaje.btnAcept)
       {
            int camposLlenos = 0;
            
            if (!addActPatrullaje.txtAct1.getText().isEmpty()) {
                String texto = addActPatrullaje.txtAct1.getText();
                valorComboBox1 = addActPatrullaje.cmbMedio1.getSelectedItem().toString();
                ListaActPatru.put("Act1", texto);
                camposLlenos++;
            } else {
                if(addActPatrullaje.txtAct1.getText().isEmpty() && ListaActPatru.containsKey("Act1"))
                {
                    valorComboBox1 = "";
                    ListaActPatru.remove("Act1");
                }
            }
            
            if (!addActPatrullaje.txtAct2.getText().isEmpty()) {
                String texto = addActPatrullaje.txtAct2.getText();
                 valorComboBox2 = addActPatrullaje.cmbMedio2.getSelectedItem().toString();
                ListaActPatru.put("Act2", texto);
                camposLlenos++;
            } else {
                if(addActPatrullaje.txtAct2.getText().isEmpty() && ListaActPatru.containsKey("Act2"))
                {
                    valorComboBox2 = "";
                    ListaActPatru.remove("Act2");
                }
            }
            
            if (!addActPatrullaje.txtAct3.getText().isEmpty()) {
                String texto = addActPatrullaje.txtAct3.getText();
                valorComboBox3 = addActPatrullaje.cmbMedio3.getSelectedItem().toString();
                ListaActPatru.put("Act3", texto);
                camposLlenos++;
            } else {
                if(addActPatrullaje.txtAct3.getText().isEmpty() && ListaActPatru.containsKey("Act3"))
                {
                    valorComboBox3 = "";
                    ListaActPatru.remove("Act3");
                }
            }
            
            if (!addActPatrullaje.txtAct4.getText().isEmpty()) {
                String texto = addActPatrullaje.txtAct4.getText();
                valorComboBox4 = addActPatrullaje.cmbMedio4.getSelectedItem().toString();
                ListaActPatru.put("Act4", texto);
                camposLlenos++;
            } else {
                if(addActPatrullaje.txtAct4.getText().isEmpty() && ListaActPatru.containsKey("Act4"))
                {
                    valorComboBox4 = "";
                    ListaActPatru.remove("Act4");
                }
            }
            
            if (!addActPatrullaje.txtAct5.getText().isEmpty()) {
                String texto = addActPatrullaje.txtAct5.getText();
                valorComboBox5 = addActPatrullaje.cmbMedio5.getSelectedItem().toString();
                ListaActPatru.put("Act5", texto);
                camposLlenos++;
            } else {
                if(addActPatrullaje.txtAct5.getText().isEmpty() && ListaActPatru.containsKey("Act5"))
                {
                    valorComboBox5 = "";
                    ListaActPatru.remove("Act5");
                }
            }

            if (camposLlenos >= 3) {
                JframePrincipal.setEnabled(true);
                JframePrincipal.jLabel3.setVisible(false);
                addActPatrullaje.setEnabled(true);
                addActPatrullaje.jLabel3.setVisible(false);
                addActPatrullaje.setVisible(false);
            } else 
            {
               show("Debe asignar al menos 3 actividades", 16, 1, 0);
               close6();
            }
                
           
       }
       //-----------------------------------------------------Boton para cancelar la agregacion de ubicacion(MAPA)
        if (e.getSource() == addUbicacion.btnCancelMap) 
        {
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            addUbicacion.setVisible(false);
        }
       //-----------------------------------------------------Boton para Aceptar la agregacion de ubicacion(MAPA)

        if(e.getSource() == addUbicacion.btnEXPORTAR)
        {
            //---------------------------------------------SET DEL MAPA-----------------
            // Crear un BufferedImage para renderizar el mapa
            getCoordinates();
            int width = mapViewer.getWidth();
            int height = mapViewer.getHeight();
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // Obtener el Graphics2D del BufferedImage
            Graphics2D g2d = bufferedImage.createGraphics();
            mapViewer.paint(g2d);
            g2d.dispose();
            
            ImageIcon mapIcon = new ImageIcon(bufferedImage);           
            nuevoIcono = new ImageIcon(mapIcon.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT));

            // Asignar el ImageIcon al JLabel
            addPatrullajes.lblMAPImage.setVisible(true);
            addPatrullajes.lblMAPImage.setIcon(nuevoIcono);

            // Habilitar el JFrame principal y ocultar el JFrame actual
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            addUbicacion.setVisible(false);
            
        }
       //-----------------------------------------------------Boton para mostrar la ubicacion(MAPA)
        if (e.getSource() == addPatrullajes.btnAddUbi) 
        {
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            addUbicacion.setVisible(true);
            addUbicacion.setEnabled(true);
        }
       
       //------------------------------------------------------Boton que MUESTRA la pantalla para AGREGAR al personal
        if (e.getSource() == addPatrullajes.btnAddPersonal) {
            JframePrincipal.jLabel3.setVisible(true);
            addPersonal.setBackground(new Color(0,0,0,0));//Transparencia
            addPersonal.setEnabled(true);   
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
              //---------------------------------------------SET DE PERSONAL-----------------
            show("Se asignará como jefe de grupo al mayor rango u ONI", 14, 0, 0);
            close4();
          }
    
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
        addActPatrullaje.setEnabled(false);
        addActPatrullaje.jLabel3.setVisible(true);
        addEquipamiento.setEnabled(false);
        addEquipamiento.jLabel5.setVisible(true);
        
        Jo = new JoptionReplacemnt(type,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close8()
    {   
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addActPatrullaje.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
           
            addActPatrullaje.jLabel3.setVisible(false);
            addEquipamiento.setEnabled(true);
            addEquipamiento.jLabel5.setVisible(false);      
        
        }
        });
    }
    
        public void close7()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);         
           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
             
            ListaIdDetalleEquipo.clear();         
                       
            addEquipamiento.setEnabled(true);
            addEquipamiento.jLabel5.setVisible(false);
            addEquipamiento.setVisible(false);
            
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            
            addEquipamiento.setEnabled(true);
            addEquipamiento.jLabel5.setVisible(false);
        }
        });
    }
   
    
    public void close5()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);         
           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
             
            addActPatrullaje.txtAct1.setText("");
            addActPatrullaje.txtAct2.setText("");
            addActPatrullaje.txtAct3.setText("");
            addActPatrullaje.txtAct4.setText("");
            addActPatrullaje.txtAct5.setText("");
            
            addActPatrullaje.cmbMedio1.setSelectedIndex(0);
            addActPatrullaje.cmbMedio2.setSelectedIndex(0);
            addActPatrullaje.cmbMedio3.setSelectedIndex(0);
            addActPatrullaje.cmbMedio4.setSelectedIndex(0);
            addActPatrullaje.cmbMedio5.setSelectedIndex(0);
            
            addActPatrullaje.setEnabled(true);
            addActPatrullaje.jLabel3.setVisible(false);
            addActPatrullaje.setVisible(false);
            
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            
            addActPatrullaje.setEnabled(true);
            addActPatrullaje.jLabel3.setVisible(false);
        }
        });
    }
    
    public void close6()
    {   
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(false);
            JframePrincipal.jLabel3.setVisible(true);
            
            addActPatrullaje.setEnabled(true);
            addActPatrullaje.jLabel3.setVisible(false);
        }
        });
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
            //-------------------------------------------------------------BORRAR TODO----------------------------------
            //--------------------ADD PERSONAL BORRAR
            ListaIdPolicias.clear();
            
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addPersonal.jLabel3.setVisible(false);
            panelULTIMATE.removeAll();
            // Luego, puedes llamar al mÃ©todo "revalidate()" para actualizar la interfaz de usuario
            panelULTIMATE.revalidate();
            panelULTIMATE.repaint(); 
            JframePrincipal.setExtendedState(JFrame.NORMAL);
           
            addPatrullajes.jLabel4.setVisible(true);
            addPatrullajes.pnlPersonal.removeAll();;
            addPatrullajes.pnlPersonal.revalidate();
            addPatrullajes.pnlPersonal.repaint(); 
            
            //--------------------ADD ACTIVIDAD BORRAR
            addActPatrullaje.txtAct1.setText("");
            addActPatrullaje.txtAct2.setText("");
            addActPatrullaje.txtAct3.setText("");
            addActPatrullaje.txtAct4.setText("");
            addActPatrullaje.txtAct5.setText("");
            
            addActPatrullaje.cmbMedio1.setSelectedIndex(0);
            addActPatrullaje.cmbMedio2.setSelectedIndex(0);
            addActPatrullaje.cmbMedio3.setSelectedIndex(0);
            addActPatrullaje.cmbMedio4.setSelectedIndex(0);
            addActPatrullaje.cmbMedio5.setSelectedIndex(0);
            
            ListaActPatru.clear();
            addActPatrullaje.setEnabled(true);
            
            //------------------HORARIOS BORRAR
            addPatrullajes.txtHora1.setText("");
            addPatrullajes.txtHora2.setText("");
            addPatrullajes.txtMin1.setText("");
            addPatrullajes.txtMin2.setText("");
            addPatrullajes.dpFechaFin.setDate(null);
            addPatrullajes.dpFechaInicio.setDate(null);
            
            //------------ARMAMENTO BORRAR
            ListaIdDetalleArmamento.clear();
            
            //------------EQUIPAMIENTO BORRAR
            ListaIdDetalleEquipo.clear();
            
            //------------MAPA BORRAR
            addUbicacion.txtEXTENSIONKM.setText("");
            
            JframePrincipal.showPatrullajePanel(2);
            addPatrullajes.setEnabled(true);
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);           
            JframePrincipal.setEnabled(true);
            JframePrincipal.jLabel3.setVisible(false);
            
            addPersonal.setEnabled(true);
            addActPatrullaje.setEnabled(true);
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
    //------------------CARGAR ACTIVIDADES DEL PATRULLAJE
    public void ChargeActividadesPatru()
    {
        if(ListaActPatru.containsKey("Act1"))
       {
           mdlPatrullajes.setActividadPatrullaje(ListaActPatru.get("Act1"));
           mdlPatrullajes.setMedioAsignacion(valorComboBox1);
           mdlPatrullajes.InsertarActividadesPatrullaje();
       }
       if(ListaActPatru.containsKey("Act2"))
       {
           mdlPatrullajes.setActividadPatrullaje(ListaActPatru.get("Act2"));
           mdlPatrullajes.setMedioAsignacion(valorComboBox2);
           mdlPatrullajes.InsertarActividadesPatrullaje();
       }
       if(ListaActPatru.containsKey("Act3"))
       {
           mdlPatrullajes.setActividadPatrullaje(ListaActPatru.get("Act3"));
           mdlPatrullajes.setMedioAsignacion(valorComboBox3);
           mdlPatrullajes.InsertarActividadesPatrullaje();
       }
       if(ListaActPatru.containsKey("Act4"))
       {
           mdlPatrullajes.setActividadPatrullaje(ListaActPatru.get("Act4"));
           mdlPatrullajes.setMedioAsignacion(valorComboBox4);
           mdlPatrullajes.InsertarActividadesPatrullaje();
       }
       if(ListaActPatru.containsKey("Act5"))
       {
           mdlPatrullajes.setActividadPatrullaje(ListaActPatru.get("Act5"));
           mdlPatrullajes.setMedioAsignacion(valorComboBox5);
           mdlPatrullajes.InsertarActividadesPatrullaje();
       }
    }
    
    //-----------------------------METODOS PARA EQUIPAMIENTO ESPECIALIZADO Y DE SEGURIDAD
    Map<Integer, Integer> ListaIdDetalleEquipo = new HashMap<>();
    
    public void ChargeEquipamiento(ResultSet rs, JScrollPane jScroll)
    {
        JPanel panel = new JPanel();
        JViewport viewport = jScroll.getViewport(); 
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));;
        panel.setBackground(new Color(70, 70, 70));      
                
        tipoFuentes = new Fuentes();
        try
        {
            while (rs.next()) 
            {
                int IdDetalle = rs.getInt("IdDetalleEquipo");
                int CantidadQueTieneLaBase = rs.getInt("Cantidad");
                
                String Equipo = rs.getString("Detalles");
                JLabel labelEquipo = new JLabel(Equipo);

                labelEquipo.setForeground(Color.WHITE);
                labelEquipo.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));

                SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, CantidadQueTieneLaBase, 1); // Valor inicial: 0, Mínimo: 0, Máximo: 5, Paso: 1
                
                JSpinner spinner = new JSpinner(spinnerModel);
                spinner.setName(String.valueOf(IdDetalle));
                spinner.setPreferredSize(new Dimension(10, 10));
                
                 if (ListaIdDetalleEquipo.containsKey(IdDetalle)) 
                {
                    spinner.setValue(ListaIdDetalleArmamento.get(IdDetalle));
                } else 
                {
                    spinner.setValue(0);
                }
                
                spinner.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    int valorActual = (int) spinner.getValue();
                    // Verifica si el valor es mayor que 0
                    if (valorActual > 0) {
                        ListaIdDetalleEquipo.put(Integer.valueOf(spinner.getName()), valorActual);
                    } else {
                        // Si el valor es 0, quita el nombre de la lista (si existe)
                        ListaIdDetalleEquipo.remove(Integer.valueOf(spinner.getName()));
                    }
                }
            });
                
                labelEquipo.setBorder(new EmptyBorder(5,1,0,10));
                spinner.setBorder(new EmptyBorder(5,1,0,10));
                
                Box HorizontalBox = Box.createHorizontalBox();               
                Box VerticalBox = Box.createVerticalBox();

                VerticalBox.add(Box.createVerticalGlue());
//                VerticalBox.add(VerticalBox);
                VerticalBox.add(labelEquipo);
                VerticalBox.add(spinner);
                VerticalBox.add(Box.createHorizontalGlue());
                VerticalBox.add(Box.createVerticalGlue());
                panel.add(VerticalBox);
                
                
            }
            
            viewport.add(panel);
            viewport.setView(panel);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
    
    //-----------------------------METODOS PARA ARMAS CORTAS Y LARGAS
    Map<Integer, Integer> ListaIdDetalleArmamento = new HashMap<>();
    
    public void ChargeArmas(ResultSet rs, JScrollPane jScroll)
    {
        JPanel panel = new JPanel();
        JViewport viewport = jScroll.getViewport(); 
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));;
        panel.setBackground(new Color(70, 70, 70));      
                
        tipoFuentes = new Fuentes();
        try
        {
            while (rs.next()) 
            {
                int IdDetalle = rs.getInt("IdDetalleArmamentoEstacion");
                int CantidadQueTieneLaBase = rs.getInt("Cantidad");
                
                String Arma = rs.getString("DetalleArmamento");
                JLabel labelArma = new JLabel(Arma);

                labelArma.setForeground(Color.WHITE);
                labelArma.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));

                SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, CantidadQueTieneLaBase, 1); // Valor inicial: 0, Mínimo: 0, Máximo: 5, Paso: 1
                
                JSpinner spinner = new JSpinner(spinnerModel);
                spinner.setName(String.valueOf(IdDetalle));
                spinner.setPreferredSize(new Dimension(5, 30));
                
                
                if (ListaIdDetalleArmamento.containsKey(IdDetalle)) 
                {
                    spinner.setValue(ListaIdDetalleArmamento.get(IdDetalle));
                } else 
                {
                    spinner.setValue(0);
                }
                
                spinner.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    int valorActual = (int) spinner.getValue();
                    // Verifica si el valor es mayor que 0
                    if (valorActual > 0) {
                        ListaIdDetalleArmamento.put(Integer.valueOf(spinner.getName()), valorActual);
                    } else {
                        // Si el valor es 0, quita el nombre de la lista (si existe)
                        ListaIdDetalleArmamento.remove(Integer.valueOf(spinner.getName()));
                    }
                }
            });
                
                labelArma.setBorder(new EmptyBorder(5,10,0,10));
                spinner.setBorder(new EmptyBorder(5,10,0,10));
                    
                Box VerticalBoxMAINMAIN = Box.createHorizontalBox();
                Box VerticalBoxMAIN = Box.createVerticalBox();
                Box VerticalBox = Box.createVerticalBox();
                Box HorizontalMain = Box.createHorizontalBox();
                Box Horizontal2 = Box.createHorizontalBox();
                
                VerticalBoxMAINMAIN.add(VerticalBoxMAIN);
                VerticalBoxMAIN.add(HorizontalMain);
                HorizontalMain.add(VerticalBox);
                VerticalBox.add(labelArma);
                VerticalBoxMAIN.add(Horizontal2);
                Horizontal2.add(spinner);
                VerticalBoxMAINMAIN.add(Box.createHorizontalGlue());
                panel.add(VerticalBoxMAINMAIN);
            }
            
            viewport.add(panel);
            viewport.setView(panel);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    //------------------METODO PARA MOSTRAR EL MAPA-----------------
    private static double RadioEnKM= 25;
    JXMapViewer mapViewer;
    
    public void showMap() {
        // Crea un objeto JXMapViewer
        mapViewer = new JXMapViewer();

        // Crea un TileFactoryInfo para OpenStreetMap
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        mapViewer.setTileFactory(tileFactory);

        // Usar 7 como zoom inicial
        mapViewer.setZoom(7);

        // Centrar el mapa en El Salvador
        GeoPosition elSalvador = new GeoPosition(13.6929, -89.2182);
        mapViewer.setCenterPosition(elSalvador);

        // Crear un Set de waypoints y un WaypointPainter para pintarlos
        Set<Waypoint> waypoints = new HashSet<>();
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
        waypointPainter.setWaypoints(waypoints);
        mapViewer.setOverlayPainter(waypointPainter);

        
        // Agrega un listener de mouse para obtener las coordenadas al hacer clic
        mapViewer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Convierte el punto de la pantalla en una coordenada geográfica
                GeoPosition geo = mapViewer.convertPointToGeoPosition(e.getPoint());

                // Verifica si las coordenadas se encuentran en El Salvador
                if(geo.getLatitude() > 13.1483 && geo.getLatitude() < 14.4226 && geo.getLongitude() > -90.1295 && geo.getLongitude() < -87.6877) {                    

                    // Guarda las coordenadas para su recuperación posterior
                    latitud = geo.getLatitude();
                    longitud = geo.getLongitude();

                    // Añade un waypoint al conjunto de waypoints y actualiza el WaypointPainter
                    waypoints.clear();  // Limpiar los waypoints existentes (sólo queremos el último clic)
                    waypoints.add(new DefaultWaypoint(geo));
                    waypointPainter.setWaypoints(waypoints);
                    mapViewer.repaint();  // Repintar para mostrar el nuevo waypoint
                } else {
                   JOptionPane.showMessageDialog(null, "¡Ubicación fuera de El Salvador!");
                }
            }
        });

        // Agrega un controlador de mouse para permitir el desplazamiento del mapa
        PanMouseInputListener mia = new PanMouseInputListener(mapViewer);
        mapViewer.addMouseListener(mia);
        mapViewer.addMouseMotionListener(mia);

        // Agrega un controlador de rueda del mouse para permitir el zoom
        mapViewer.addMouseWheelListener(e -> {
            int rotation = e.getWheelRotation();
            int currentZoom = mapViewer.getZoom();
            if (rotation < 0) {
                if(currentZoom == 2) {}
                else{mapViewer.setZoom(currentZoom - 1);}
            } else {
                if(currentZoom == 11) {}
                else{ mapViewer.setZoom(currentZoom + 1);}
            }
        });

//        // Crear el botón personalizado
//        Button_Edit btnSave = new Button_Edit();
//        btnSave.setText("Guardar");
//        btnSave.setPreferredSize(new Dimension(96, 40));
//        btnSave.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"Latitud: " + latitud + ", Longitud: " + longitud);
//            }
//        });

//        // Crear el JLayeredPane y añadir los componentes
//        JLayeredPane layeredPane = new JLayeredPane();
//        mapViewer.setBounds(0, 0, (int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.9), (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.9));
//        layeredPane.add(mapViewer, JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(btnSave, JLayeredPane.PALETTE_LAYER);

//        // Crear y mostrar el JFrame
//        JFrame frame = new JFrame("Mapa de El Salvador");
//        frame.getContentPane().add(layeredPane);
//        frame.setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.9), (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.9));  // Definir un tamaño inicial para el frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         mapViewer.setBounds(0, 0, (int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.9), (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.9));
         mapViewer.setSize(addUbicacion.jpnlMapContainer.getSize());
         mapViewer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        addUbicacion.jpnlMapContainer.add(mapViewer);       
        mapViewer.repaint();  
        
        addUbicacion.jpnlMapContainer.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                mapViewer.setSize(addUbicacion.jpnlMapContainer.getSize());
                 mapViewer.repaint();
              }
        });
    }

    // Método para obtener las últimas coordenadas seleccionadas
    public double[] getCoordinates() {
        return new double[] { latitud, longitud };
    }
    
    
//     public void showMap() {
//         
//        // Crea un objeto JXMapViewer
//        JXMapViewer mapViewer = new JXMapViewer();
//
//        // Crea un TileFactoryInfo para OpenStreetMap
//        TileFactoryInfo info = new OSMTileFactoryInfo();
//        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
//        mapViewer.setTileFactory(tileFactory);
//
//        // Usar 7 como zoom inicial
//        mapViewer.setZoom(11);
//        
//        // Centrar el mapa en El Salvador
//        GeoPosition elSalvador = new GeoPosition(13.6929, -89.2182);
//        mapViewer.setCenterPosition(elSalvador);
//
//      // Crear un Set de waypoints y un WaypointPainter para pintarlos
//        Set<Waypoint> waypoints = new HashSet<>();
//        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
//        waypointPainter.setWaypoints(waypoints);
//        mapViewer.setOverlayPainter(waypointPainter);
//        
//        // Agrega un listener de mouse para obtener las coordenadas al hacer clic
//        mapViewer.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // Convierte el punto de la pantalla en una coordenada geográfica
//                GeoPosition geo = mapViewer.convertPointToGeoPosition(e.getPoint());
//
//                // Verifica si las coordenadas se encuentran en El Salvador
//                if(geo.getLatitude() > 13.1483 && geo.getLatitude() < 14.4226 && geo.getLongitude() > -90.1295 && geo.getLongitude() < -87.6877) {
//
//                    // Guarda las coordenadas para su recuperación posterior
//                    latitud = geo.getLatitude();
//                    longitud = geo.getLongitude();
//                    
//                    // Dibujar un círculo alrededor del marcador
//                    drawCircleAroundMarker(mapViewer, geo, DiametroenKM, waypoints, waypointPainter); 
//                    
//                } else {
//                   JOptionPane.showMessageDialog(null, "¡Ubicación fuera de El Salvador!");
//                }
//            }
//        });
//
//        // Agrega un controlador de mouse para permitir el desplazamiento del mapa
//        PanMouseInputListener mia = new PanMouseInputListener(mapViewer);
//        mapViewer.addMouseListener(mia);
//        mapViewer.addMouseMotionListener(mia);
//
//        // Agrega un controlador de rueda del mouse para permitir el zoom
//        mapViewer.addMouseWheelListener(e -> {
//            int rotation = e.getWheelRotation();
//            int currentZoom = mapViewer.getZoom();
//            if (rotation < 0) {
//                 if(currentZoom == 2) {}
//                else{mapViewer.setZoom(currentZoom - 1);}
//            } else {
//                
//                if(currentZoom == 11) {}
//                else{ mapViewer.setZoom(currentZoom + 1);}
//            }
//        });
//
//        mapViewer.setBounds(0, 0, (int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.9), (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.9));
//         mapViewer.setSize(addUbicacion.jpnlMapContainer.getSize());
//         mapViewer.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        
//        addUbicacion.jpnlMapContainer.add(mapViewer); 
//         
//        addUbicacion.jpnlMapContainer.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                mapViewer.setSize(addUbicacion.jpnlMapContainer.getSize());
//              }
//        });
//
//    }
//
//    // Método para obtener las últimas coordenadas seleccionadas
//    public double[] getCoordinates() {
//        return new double[] { latitud, longitud };
//    }
//          
//    private void drawCircleAroundMarker(JXMapViewer mapViewer, GeoPosition center, double DiametroenKM, Set<Waypoint> waypoints, WaypointPainter<Waypoint> circlePainter) {
//    double diametroEnGrados = DiametroenKM / 111.32; // 1 grado de latitud es aproximadamente 111.32 kilómetros
//    double diametroEnPixeles = diametroEnGrados / (360.0 / (Math.pow(2, mapViewer.getZoom()) * 256));
//
//    // Añade un waypoint al conjunto de waypoints y actualiza el WaypointPainter
//    waypoints.clear(); // Limpiar los waypoints existentes (sólo queremos el último clic)
//    waypoints.add(new DefaultWaypoint(center));
//    circlePainter.setWaypoints(waypoints);
//
//    // Configura el estilo del círculo
//    circlePainter.setRenderer(new WaypointRenderer<Waypoint>() {
//        @Override
//        public void paintWaypoint(Graphics2D g, JXMapViewer map, Waypoint wp) {
//            // Dibuja un círculo alrededor del marcador
//            Point2D point = map.getTileFactory().geoToPixel(wp.getPosition(), map.getZoom());
//
//            g.setColor(new Color(0, 0, 255, 64)); // Relleno azul transparente
//            g.fillOval((int) (point.getX() - diametroEnPixeles), (int) (point.getY() - diametroEnPixeles), (int) (diametroEnPixeles * 2), (int) (diametroEnPixeles * 2));
//        }
//    });
//
//    // Agrega el WaypointPainter al JXMapViewer
//    mapViewer.setOverlayPainter(circlePainter);
//    mapViewer.repaint(); // Repintar para mostrar el nuevo waypoint
//}
    
    //----------------METODOS PARA VER LOS POLICIAS APTOS DE SELECCION--------------
    Fuentes tipoFuentes;
    ModeloPatrullajes mdlPatrullajes;
    ImageIcon Line;
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
                checkBox.setForeground(new Color(70,70,70));
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
    
     private static byte[] convertImageIconToBytes(ImageIcon imageIcon) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            // Convierte el ImageIcon en un arreglo de bytes
            ImageIO.write((BufferedImage) imageIcon.getImage(), "png", baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }
}
