package Controlador;

import Modelo.mdlPolicias;
import VIsta.JoptionReplacemnt;
import VIsta.Login;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Policias.Actualizar_Policia;
import VIsta.Programa.Policias.Agregar_Usuario;
import VIsta.Programa.Policias.Agregar_policia;
import VIsta.Programa.Policias.Policias_Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class contrlPolicias implements ActionListener{

    private Policias_Inicio vstPoli;
    private JframePrincipal jFrameP;
    private mdlPolicias mdlPoli;
    
    private Agregar_policia jFrameAddPolice;
    private Agregar_Usuario jFrameAddUser;
    
    private Actualizar_Policia jFrameUpdatePolice;
    
    String currentGenero;
    String currentTipoSangre;
    String currentEstadoCivil;
    String currentRangoUser;
    
    public int currentIdGenero;
    public int currentIdTipoSangre;
    public int currentIdEstadoCivil;
    public int currentIdRangoUser;
    
    public int idNivelUser;
    
    public contrlPolicias(Policias_Inicio vstPoli, JframePrincipal jFrameP, mdlPolicias mdlPoli, Agregar_policia jFrameAddPolice, Agregar_Usuario jFrameAddUser, int idNivelUser,  Actualizar_Policia jFrameUpdatePolice)
    {
        this.idNivelUser = idNivelUser;
        
        this.vstPoli = vstPoli;
        this.jFrameP = jFrameP;
        this.mdlPoli = mdlPoli;
        
        this.jFrameAddPolice = jFrameAddPolice;
        this.jFrameAddUser = jFrameAddUser;
        
        this.jFrameUpdatePolice = jFrameUpdatePolice;       
       
        vstPoli.btnAddPolicia.addActionListener(this);
        vstPoli.btnEditPolicia.addActionListener(this);
        
        jFrameAddPolice.btnGuardar.addActionListener(this);
        jFrameAddPolice.btnCancel.addActionListener(this);
        
        jFrameAddUser.btnGuardar.addActionListener(this);
        jFrameAddUser.btnCancel.addActionListener(this);
        
        jFrameUpdatePolice.btnCancel.addActionListener(this);
        jFrameUpdatePolice.btnGuardar.addActionListener(this);
        
        vstPoli.btnDeletePolicia.addActionListener(this);            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == vstPoli.btnDeletePolicia)
        {
            
            if (vstPoli.IdPolicia != 0){
            mdlPoli.setIdPolicia(vstPoli.IdPolicia);
            mdlPoli.deletetbPolicias();
            mdlPoli.MostrarTablePolicias(vstPoli);
            show1("El policía se ha eliminado correctamente", 17, 0, 0);
            close4();
            }
            
        }
        
        if(e.getSource() == vstPoli.btnAddPolicia)
        {
            jFrameP.enable(false);
            jFrameP.jLabel3.setVisible(true);
            jFrameAddPolice.setVisible(true);
            jFrameAddPolice.setEnabled(true);
            jFrameAddPolice.jLabel11.setVisible(false);
            jFrameAddPolice.setVisible(true);
        }
        
        if(e.getSource() == jFrameAddPolice.btnCancel)
        {
           //Mostrar JOption - borrar todo
            show("¿Seguro que quieres cancelar? se eliminarán los datos", 14, 1, 1);
            close1();
           
        }  
        
        if(e.getSource() == jFrameAddUser.btnCancel)
        {
           //Mostrar JOption - borrar todo
            show("¿Seguro que quieres cancelar? se eliminarán los datos", 14, 1, 1);
            close2();
        }  
//---------------------------------------------------------AGREGAR POLICIA INCLUYENDO USUARIO---------------------------------------------------------        
        
        if(e.getSource() == jFrameAddPolice.btnGuardar)
        {   
            if(jFrameAddPolice.txtApellido.getText().isBlank() || jFrameAddPolice.txtAreaDireccion.getText().isBlank()
               || jFrameAddPolice.txtCorreo.getText().isBlank() || jFrameAddPolice.txtDUI.getText().isBlank()
               || jFrameAddPolice.txtNombre.getText().isBlank() || jFrameAddPolice.txtNumero.getText().isBlank()
               || jFrameAddPolice.txtONI.getText().isBlank() || jFrameAddPolice.txtPlaca.getText().isBlank())
            {
                show("No se permiten campos vacíos", 17, 1, 0);
                close3(); 
            }
            else
            {

                String correoPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(correoPattern);
                Matcher matcher = pattern.matcher(jFrameAddPolice.txtCorreo.getText());
                if (!matcher.matches()) {
                show("El formato del correo electrónico no es válido", 17, 1, 0);
                close3();                                    
                }
                else
                {
                    //Validar en caso de que exista el DUI
                    mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                    int resultIdPDUI = mdlPoli.readDUIIfExistDUI();

                    if(resultIdPDUI == -1) //si es igual a -1, es que NO hay persona con ese dui
                    {
                       doTheInsertWhitAllCondicions();
                    }
                    else //si hay una persona con ese dui, no es necesario verificar las otras cosas de PERSONA, mas si de POLICIA Y USUARIO
                    {
                        doTheInsertWhitNOCondicionsPER();
                    }

                }
            }
        }
        
        if(e.getSource() == jFrameAddUser.btnGuardar)
        {
            if(jFrameAddUser.txtUsuario.getText().isBlank() || jFrameAddUser.txtContra.getText().isBlank())
            {
                 show("No se permiten campos vacíos", 17, 1, 0);
                close7(); 
            }
            else
            {
                //Hasta el final, insertamos todo, falta usuario y contra 
                mdlPoli.setUsuario(jFrameAddUser.txtUsuario.getText().trim());
                int resultUser = mdlPoli.readUserIfExistUser();

                if(resultUser == -1)
                {
                    //Insertamos todo
                    mdlPoli.setUsuario(jFrameAddUser.txtUsuario.getText().trim());
                    mdlPoli.setContra(convertirSHA256(jFrameAddUser.txtContra.getText().trim()));
                    mdlPoli.setIdNivelUsuario(returnIdNivelUsuario());
                    
                    if(mdlPoli.InsertPoliceIncludePersonaTipoPUser())
                    {                      
                        show("El policía fue agregado correctamente", 17, 1, 0);
                        close5();
                    }
                    else
                    {
                        show("No se pudo agregar al policía", 17, 1, 0);
                        close5();   
                    }
                }
                else
                {
                    mdlPoli.setUsuario("0");
                    show("Ya existe una persona con ese usuario", 17, 1, 0);
                    close6();
                } 
            }
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------ACTUALIZAR POLICIA---------------------------------------------------------        
        //MOSTRAR datos
        if(e.getSource() == vstPoli.btnEditPolicia)
        {
            if(vstPoli.IdPolicia == 0) 
            {
                show1("Seleccione un policía", 17, 0, 0);
                close4(); 
            }
            else
            {
               mdlPoli.setIdPolicia(vstPoli.IdPolicia);
               mdlPoli.CargarDatosPoliciales(jFrameUpdatePolice, this);
               jFrameUpdatePolice.jLabel11.setVisible(false);
               jFrameP.jLabel3.setVisible(true);
               jFrameP.setEnabled(false);
               jFrameUpdatePolice.setVisible(true);
               jFrameUpdatePolice.setEnabled(true);
            }

        }
        
        //CANCELAR DATOS
        if(e.getSource() == jFrameUpdatePolice.btnCancel)
        {
            show("¿Seguro que quieres cancelar? NO se guardarán los cambios", 13, 1, 1);
            close8(); 
        } 
        
        //GUARDAR CAMBIOS 
        if(e.getSource() == jFrameUpdatePolice.btnGuardar)
        {
            if(jFrameUpdatePolice.txtApellido.getText().isBlank() || jFrameUpdatePolice.ActutxtAreaDireccion.getText().isBlank()
               || jFrameUpdatePolice.txtCorreo.getText().isBlank() || jFrameUpdatePolice.txtDUI.getText().isBlank()
               || jFrameUpdatePolice.txtNombre.getText().isBlank() || jFrameUpdatePolice.txtNumero.getText().isBlank()
               || jFrameUpdatePolice.txtONI.getText().isBlank() || jFrameUpdatePolice.txtPlaca.getText().isBlank())
            {
                show("No se permiten campos vacíos", 17, 1, 0);
                close9(); 
            }
            else
            {

                String correoPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(correoPattern);
                Matcher matcher = pattern.matcher(jFrameUpdatePolice.txtCorreo.getText());
                
                if (!matcher.matches()) {
                show("El formato del correo electrónico no es válido", 17, 1, 0);
                close9();                                    
                }
                else
                {
                    //Validar en caso de que exista el DUI
                    mdlPoli.setDUI(jFrameUpdatePolice.txtDUI.getText().trim());
                    mdlPoli.setIdPolicia(vstPoli.IdPolicia);
                    
                    int resultIdPDUI = mdlPoli.readDUIIfExistNUEVODUI_Actualizar();

                    if(resultIdPDUI == -1) //si es igual a -1, es que NO hay persona con ese dui EXCEPTUANDO el que tiene ELLA O EL
                    {
                       doTheUpdateWhitAllCondicions();
                    }
                    else
                    {
                        show("Ya existe una persona con ese DUI", 17, 1, 0);
                        close9();      
                    }
                }
            }
        }
        
    }
    
//----------------------------------------COSAS QUE HICE PARA ACTUALIZAR----------------------------------------
    
    public void doTheUpdateWhitAllCondicions() 
    {
        mdlPoli.setCorreo(jFrameUpdatePolice.txtCorreo.getText().trim());
        mdlPoli.setIdPolicia(vstPoli.IdPolicia);
        
        int resulIdPCorreo = mdlPoli.readCorreoIfExistNUEVOCorreo_Actualizar();

        if(resulIdPCorreo == -1) //si es igual a -1, es que NO hay persona con ese correo
        {
            mdlPoli.setNumero(jFrameUpdatePolice.txtNumero.getText().trim());
            mdlPoli.setIdPolicia(vstPoli.IdPolicia);
            int resultIdPNumero = mdlPoli.readNumeroIfExistNUEVONumero_Actualizar();

            if(resultIdPNumero == -1) //si es igual a -1, es que NO hay persona con ese numero
            {
                //Validamos minimo de caracteres
                if(jFrameUpdatePolice.txtDUI.getText().length() < 9 )
                {
                    show("El DUI debe contener 9 caracteres", 17, 1, 0);
                    close9();    
                }                                  
                else
                {
                    if(jFrameUpdatePolice.txtNumero.getText().length() < 8 )
                    {
                        show("El número debe contener 8 caracteres", 17, 1, 0);
                        close9();    
                    } 
                    else
                    {  
                        if(jFrameUpdatePolice.txtONI.getText().length() < 8)
                        {
                            show("El ONI debe contener 8 caracteres", 17, 1, 0);
                            close9(); 
                        }
                        else
                        {
                            if(jFrameUpdatePolice.txtPlaca.getText().length() < 5)
                            {
                            show("La placa debe contener 5 caracteres", 17, 1, 0);
                            close9(); 
                            }
                            else
                            {
                                //Validar que NO Exista poli con el ONI
                                mdlPoli.setONI(jFrameUpdatePolice.txtONI.getText().trim());
                                mdlPoli.setIdPolicia(vstPoli.IdPolicia);
                                int resulIdPoliONI = mdlPoli.readONIIfExistNUEVOONI_Actualizar();
                                
                                if(resulIdPoliONI == -1) //si es igual a -1, es que NO hay policia con ese ONI
                                {
                                    //Validar que NO exista poli con la Placa
                                     mdlPoli.setNumeroPlaca(jFrameUpdatePolice.txtPlaca.getText().trim());
                                     mdlPoli.setIdPolicia(vstPoli.IdPolicia);
                                     int resulIdPoliPlaca = mdlPoli.readIdPoliIfExistsNumeroPlaca();
                                     
                                    if(resulIdPoliPlaca == -1) //si es igual a -1, es que NO hay policia con esa Placa
                                    { 
                                        mdlPoli.setIdPolicia(vstPoli.IdPolicia);
                                        //Ya validados, minimo de caracteres, DUI, Correo, Numero y en teoria todo, procedemos a insertar
                                        mdlPoli.setNombre(jFrameUpdatePolice.txtNombre.getText());
                                        mdlPoli.setApellido(jFrameUpdatePolice.txtApellido.getText());
                                        mdlPoli.setFechaNacimiento(jFrameUpdatePolice.jdcCalendar.getDate());
                                        mdlPoli.setDireccion(jFrameUpdatePolice.ActutxtAreaDireccion.getText());
                                        mdlPoli.setDUI(jFrameUpdatePolice.txtDUI.getText().trim());
                                        mdlPoli.setIdEstadoCivil(returnIdEstadoCivilActu());
                                        mdlPoli.setIdGenero(returnIdGeneroActu());
                                        mdlPoli.setIdTipoSangre(returnIdTipoSangreActu());
                                        mdlPoli.setCorreo(jFrameUpdatePolice.txtCorreo.getText().trim());
                                        mdlPoli.setNumero(jFrameUpdatePolice.txtNumero.getText().trim());
                                        mdlPoli.setONI(jFrameUpdatePolice.txtNumero.getText().trim());
                                        mdlPoli.setNumeroPlaca(jFrameUpdatePolice.txtPlaca.getText().trim());
                                        mdlPoli.setIdRangoUsuario(returnIdRangoUserActu());
                                        mdlPoli.setIdNivelUsuario(returnIdNivelUsuarioActu());
                                         
                                        mdlPoli.UpdatePolice();
                                        
                                        show("El policía fue agregado correctamente", 17, 1, 0);
                                        close10(); 
                                    }
                                    else
                                    {
                                        mdlPoli.setNumeroPlaca("0");
                                        show("Ya existe un policía con esa placa", 17, 1, 0);
                                        close9();
                                    }
                                }
                                else
                                {
                                    mdlPoli.setONI("0");
                                    show("Ya existe un policía con ese ONI", 17, 1, 0);
                                    close9();
                                }
                            }                 
                        }
                    }
                }
            }
            else
            {
                mdlPoli.setNumero("0");
                show("Ya existe una persona con ese número", 17, 1, 0);
                close9();
            }                     
        }
        else
        {
            mdlPoli.setCorreo("0");
            show("Ya existe una persona con ese correo", 17, 1, 0);
            close9();   
        }
    }
    
    
//----------------------------------------COSAS QUE HICE PARA AGREGAR----------------------------------------   
    
    public void doTheInsertWhitAllCondicions() //Porque quiere decir que es una NUEVA persona
    {
        mdlPoli.setCorreo(jFrameAddPolice.txtCorreo.getText().trim());
        int resulIdPCorreo = mdlPoli.readCorreoIfExistCorreo();

        if(resulIdPCorreo == -1) //si es igual a -1, es que NO hay persona con ese correo
        {
            mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
            int resultIdPNumero = mdlPoli.readNumeroIfExistNumero();

            if(resultIdPNumero == -1) //si es igual a -1, es que NO hay persona con ese numero
            {
                //Validamos minimo de caracteres
                if(jFrameAddPolice.txtDUI.getText().length() < 9 )
                {
                    show("El DUI debe contener 9 caracteres", 17, 1, 0);
                    close3();    
                }                                  
                else
                {
                    if(jFrameAddPolice.txtNumero.getText().length() < 8 )
                    {
                        show("El número debe contener 8 caracteres", 17, 1, 0);
                        close3();    
                    } 
                    else
                    {  
                        if(jFrameAddPolice.txtONI.getText().length() < 8)
                        {
                            show("El ONI debe contener 8 caracteres", 17, 1, 0);
                            close3(); 
                        }
                        else
                        {
                            if(jFrameAddPolice.txtPlaca.getText().length() < 5)
                            {
                            show("La placa debe contener 5 caracteres", 17, 1, 0);
                            close3(); 
                            }
                            else
                            {
                                //Validar que NO Exista poli con el ONI
                                mdlPoli.setONI(jFrameAddPolice.txtONI.getText().trim());
                                int resulIdPoliONI = mdlPoli.readIdPoliIfExistONI();
                                
                                if(resulIdPoliONI == -1) //si es igual a -1, es que NO hay policia con ese ONI
                                {
                                    //Validar que NO exista poli con la Placa
                                     mdlPoli.setNumeroPlaca(jFrameAddPolice.txtPlaca.getText().trim());
                                     int resulIdPoliPlaca = mdlPoli.readIdPoliIfExistsNumeroPlaca();
                                     
                                    if(resulIdPoliPlaca == -1) //si es igual a -1, es que NO hay policia con esa Placa
                                    {
                                        //Validar que NO exista poli con el idTipoPersona en base al DUI
                                        mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                                        int resulIdPoliIdPersona = mdlPoli.readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI();

                                        if(resulIdPoliIdPersona == -1) //si es igual a -1, es que NO hay policia con ese id
                                        {
                                            //Ya validados, minimo de caracteres, DUI, Correo, Numero y en teoria todo, procedemos a insertar
                                            mdlPoli.setNombre(jFrameAddPolice.txtNombre.getText());
                                            mdlPoli.setApellido(jFrameAddPolice.txtApellido.getText());
                                            mdlPoli.setFechaNacimiento(jFrameAddPolice.jdcCalendar.getDate());
                                            mdlPoli.setDireccion(jFrameAddPolice.txtAreaDireccion.getText());
                                            mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                                            mdlPoli.setIdEstadoCivil(returnIdEstadoCivil());
                                            mdlPoli.setIdGenero(returnIdGenero());
                                            mdlPoli.setIdTipoSangre(returnIdTipoSangre());
                                            mdlPoli.setCorreo(jFrameAddPolice.txtCorreo.getText().trim());
                                            mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
                                            mdlPoli.setONI(jFrameAddPolice.txtNumero.getText().trim());
                                            mdlPoli.setNumeroPlaca(jFrameAddPolice.txtPlaca.getText().trim());
                                            mdlPoli.setIdRangoUsuario(returnIdRangoUser());
                                             //Despues de aceptar la info del poli, vamos con el usuario

                                            jFrameAddUser.setVisible(true);           
                                            jFrameAddUser.setEnabled(true);   
                                            jFrameAddUser.jLabel2.setVisible(false);  
                                            jFrameAddPolice.setEnabled(false);
                                            jFrameAddPolice.jLabel11.setVisible(true);
                                        }
                                        else
                                        {
                                            mdlPoli.setDUI("0");
                                            show("Ya existe un policía con ese DUI", 17, 1, 0);
                                            close3();
                                        }                                    
                                    }
                                    else
                                    {
                                        mdlPoli.setNumeroPlaca("0");
                                        show("Ya existe un policía con esa placa", 17, 1, 0);
                                        close3();
                                    }
                                }
                                else
                                {
                                    mdlPoli.setONI("0");
                                    show("Ya existe un policía con ese ONI", 17, 1, 0);
                                    close3();
                                }
                            }                 
                        }
                    }
                }
            }
            else
            {
                mdlPoli.setNumero("0");
                show("Ya existe una persona con ese número", 17, 1, 0);
                close3();
            }                     
        }
        else
        {
            mdlPoli.setCorreo("0");
            show("Ya existe una persona con ese correo", 17, 1, 0);
            close3();   
        }
    }
    
    public void doTheInsertWhitNOCondicionsPER()
    {               
         //Validamos minimo de caracteres
        if(jFrameAddPolice.txtDUI.getText().length() < 9 )
        {
            show("El DUI debe contener 9 caracteres", 17, 1, 0);
            close3();    
        }                                  
        else
        {
            if(jFrameAddPolice.txtNumero.getText().length() < 8 )
            {
                show("El número debe contener 8 caracteres", 17, 1, 0);
                close3();    
            } 
            else
            { 
              if(jFrameAddPolice.txtONI.getText().length() < 8)
                {
                    show("El ONI debe contener 8 caracteres", 17, 1, 0);
                    close3(); 
                }
                else
                {
                    if(jFrameAddPolice.txtPlaca.getText().length() < 5)
                    {
                    show("La placa debe contener 5 caracteres", 17, 1, 0);
                    close3(); 
                    }
                    else
                    {
                        //Validar que NO Exista poli con el ONI
                        mdlPoli.setONI(jFrameAddPolice.txtONI.getText().trim());
                        int resulIdPoliONI = mdlPoli.readIdPoliIfExistONI();

                        if(resulIdPoliONI == -1) //si es igual a -1, es que NO hay policia con ese ONI
                        {
                            //Validar que NO exista poli con la Placa
                             mdlPoli.setNumeroPlaca(jFrameAddPolice.txtPlaca.getText().trim());
                             int resulIdPoliPlaca = mdlPoli.readIdPoliIfExistsNumeroPlaca();

                            if(resulIdPoliPlaca == -1) //si es igual a -1, es que NO hay policia con esa Placa
                            {
                                //Validar que NO exista poli con el idTipoPersona en base al DUI
                                mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                                int resulIdPoliIdPersona = mdlPoli.readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI();

                                if(resulIdPoliIdPersona == -1) //si es igual a -1, es que NO hay policia con ese id
                                {
                                    //Ya validados, minimo de caracteres, DUI, Correo, Numero y en teoria todo, procedemos a insertar
                                    mdlPoli.setNombre(jFrameAddPolice.txtNombre.getText());
                                    mdlPoli.setApellido(jFrameAddPolice.txtApellido.getText());
                                    mdlPoli.setFechaNacimiento(jFrameAddPolice.jdcCalendar.getDate());
                                    mdlPoli.setDireccion(jFrameAddPolice.txtAreaDireccion.getText());
                                    mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                                    mdlPoli.setIdEstadoCivil(returnIdEstadoCivil());
                                    mdlPoli.setIdGenero(returnIdGenero());
                                    mdlPoli.setIdTipoSangre(returnIdTipoSangre());
                                    mdlPoli.setCorreo(jFrameAddPolice.txtCorreo.getText().trim());
                                    mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
                                    mdlPoli.setONI(jFrameAddPolice.txtNumero.getText().trim());
                                    mdlPoli.setNumeroPlaca(jFrameAddPolice.txtPlaca.getText().trim());
                                    mdlPoli.setIdRangoUsuario(returnIdRangoUser());
                                     //Despues de aceptar la info del poli, vamos con el usuario

                                    jFrameAddUser.setVisible(true);           
                                    jFrameAddUser.setEnabled(true);   
                                    jFrameAddUser.jLabel2.setVisible(false);  
                                    jFrameAddPolice.setEnabled(false);
                                    jFrameAddPolice.jLabel11.setVisible(true);
                                }
                                else
                                {
                                    mdlPoli.setDUI("0");
                                    show("Ya existe un policía con ese DUI", 17, 1, 0);
                                    close3();
                                }                                    
                            }
                            else
                            {
                                mdlPoli.setNumeroPlaca("0");
                                show("Ya existe un policía con esa placa", 17, 1, 0);
                                close3();
                            }
                        }
                        else
                        {
                            mdlPoli.setONI("0");
                            show("Ya existe un policía con ese ONI", 17, 1, 0);
                            close3();
                        }
                    }                 
                }
            }
        }              
    }
    
    JoptionReplacemnt Jo;
    
     public void close10()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameUpdatePolice.setEnabled(true);
            jFrameUpdatePolice.jLabel11.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);  
            
            jFrameUpdatePolice.txtApellido.setText("");
            jFrameUpdatePolice.ActutxtAreaDireccion.setText("");
            jFrameUpdatePolice.txtCorreo.setText("");
            jFrameUpdatePolice.txtDUI.setText("");
            jFrameUpdatePolice.txtNombre.setText("");
            jFrameUpdatePolice.txtNumero.setText("");
            jFrameUpdatePolice.txtONI.setText("");
            jFrameUpdatePolice.txtPlaca.setText("");
            
            jFrameUpdatePolice.dispose();
            jFrameP.jLabel3.setVisible(false);
            jFrameP.setEnabled(true);
        }
        });
    }
    
    public void close9()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameUpdatePolice.setEnabled(true);
            jFrameUpdatePolice.jLabel11.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);  
        }
        });
    }

    public void close8()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);         
            jFrameUpdatePolice.setEnabled(true);
            jFrameUpdatePolice.jLabel11.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameP.setEnabled(true);
            vstPoli.IdPolicia = 0;
            
            jFrameUpdatePolice.dispose();
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameUpdatePolice.setEnabled(true);
            jFrameUpdatePolice.jLabel11.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
        }
        });
    }
    
    public void show(String msg, int sizeTXT, int img, int type)
    {  
        jFrameAddPolice.setEnabled(false);
        jFrameP.jLabel3.setVisible(true);
        jFrameAddUser.setEnabled(false);
        jFrameAddUser.jLabel2.setVisible(true);
        jFrameAddPolice.jLabel11.setVisible(true);
        jFrameUpdatePolice.jLabel11.setVisible(true);
        jFrameUpdatePolice.setEnabled(false);
        Jo = new JoptionReplacemnt(type,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void show1(String msg, int sizeTXT, int img, int type)
    {  
        jFrameP.setEnabled(false);
        jFrameAddPolice.setEnabled(false);
        jFrameP.jLabel3.setVisible(true);
        jFrameAddUser.setEnabled(false);
        jFrameAddUser.jLabel2.setVisible(true);
        jFrameAddPolice.jLabel11.setVisible(true);
        Jo = new JoptionReplacemnt(type,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            
            jFrameAddPolice.txtApellido.setText("");
            jFrameAddPolice.txtAreaDireccion.setText("");
            jFrameAddPolice.txtCorreo.setText("");
            jFrameAddPolice.txtDUI.setText("");
            jFrameAddPolice.txtNombre.setText("");
            jFrameAddPolice.txtNumero.setText("");
            jFrameAddPolice.txtONI.setText("");
            jFrameAddPolice.txtPlaca.setText("");
            
            jFrameAddUser.txtUsuario.setText("");
            jFrameAddUser.txtContra.setText("");
            
            jFrameAddPolice.jLabel11.setVisible(false);
            jFrameAddUser.jLabel2.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
            jFrameP.enable(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameAddUser.dispose();
            jFrameAddPolice.dispose();
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           Jo.setVisible(false);
             jFrameAddPolice.jLabel11.setVisible(false);
             jFrameAddUser.jLabel2.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
            jFrameP.enable(false);
            jFrameP.jLabel3.setVisible(true);
            jFrameAddUser.dispose();
        }
        });
    }

    public void close5()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            
            jFrameAddPolice.txtApellido.setText("");
            jFrameAddPolice.txtAreaDireccion.setText("");
            jFrameAddPolice.txtCorreo.setText("");
            jFrameAddPolice.txtDUI.setText("");
            jFrameAddPolice.txtNombre.setText("");
            jFrameAddPolice.txtNumero.setText("");
            jFrameAddPolice.txtONI.setText("");
            jFrameAddPolice.txtPlaca.setText("");
            
            jFrameAddUser.txtUsuario.setText("");
            jFrameAddUser.txtContra.setText("");
            
            
            jFrameAddPolice.jLabel11.setVisible(false);
            jFrameAddUser.jLabel2.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
            jFrameP.enable(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameAddUser.dispose();
            jFrameAddPolice.dispose();  
            
            mdlPoli.MostrarTablePolicias(vstPoli);
        }
        });
    }
    
    public void close2()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);         
            
            jFrameAddPolice.txtApellido.setText("");
            jFrameAddPolice.txtAreaDireccion.setText("");
            jFrameAddPolice.txtCorreo.setText("");
            jFrameAddPolice.txtDUI.setText("");
            jFrameAddPolice.txtNombre.setText("");
            jFrameAddPolice.txtNumero.setText("");
            jFrameAddPolice.txtONI.setText("");
            jFrameAddPolice.txtPlaca.setText("");
            
            jFrameAddUser.txtUsuario.setText("");
            jFrameAddUser.txtContra.setText("");
            
            jFrameAddPolice.setEnabled(true);
            jFrameAddUser.setEnabled(true);
            jFrameP.enable(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameAddPolice.dispose();
            jFrameAddUser.dispose();
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameAddUser.setEnabled(true);
             jFrameAddUser.jLabel2.setVisible(false);
            jFrameAddPolice.setEnabled(false);
            jFrameAddPolice.jLabel11.setVisible(true);
        }
        });
    }
    
    public void close3()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();         
            jFrameAddPolice.jLabel11.setVisible(false);
            jFrameAddPolice.setEnabled(true);
             jFrameAddUser.setEnabled(true);   
        }
        });
    }
    
    public void close4()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();    
            jFrameP.setEnabled(true);
             jFrameAddUser.setEnabled(true);
             jFrameAddUser.jLabel2.setVisible(false);
             jFrameP.jLabel3.setVisible(false);
        }
        });
    }
    public void close7()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();    
            jFrameP.setEnabled(false);
             jFrameAddUser.setEnabled(true);
             jFrameAddUser.jLabel2.setVisible(false);
             jFrameP.jLabel3.setVisible(true);
        }
        });
    }
    
    public void close6()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();         
             jFrameAddUser.setEnabled(true);   
             jFrameAddUser.jLabel2.setVisible(false);
        }
        });
    }
    
    public int returnIdNivelUsuarioActu()
    {
        if(returnIdRangoUser() == 1)
        {
            return 2;
        }
        else
        {
            return 4;
        }
    }
    
    public int returnIdNivelUsuario()
    {
        if(returnIdRangoUserActu() == 1)
        {
            return 2;
        }
        else
        {
            return 4;
        }
    }
    
    public int returnIdEstadoCivilActu()
    {
        currentEstadoCivil=jFrameUpdatePolice.cmbEstadoCivil.getSelectedItem().toString().trim();
       
       if(currentEstadoCivil.equals("Soltero"))
       {
           currentIdEstadoCivil = 1;
           return currentIdEstadoCivil;
       }
       else
       {
           currentIdEstadoCivil = 2;
           return currentIdEstadoCivil;
       }
    }
    
    public int returnIdEstadoCivil()
    {
        currentEstadoCivil=jFrameAddPolice.cmbEstadoCivil.getSelectedItem().toString().trim();
       
       if(currentEstadoCivil.equals("Soltero"))
       {
           currentIdEstadoCivil = 1;
           return currentIdEstadoCivil;
       }
       else
       {
           currentIdEstadoCivil = 2;
           return currentIdEstadoCivil;
       }
    }
    
    public int returnIdGeneroActu()
    {
        currentGenero=jFrameUpdatePolice.cmbGenero.getSelectedItem().toString().trim();
        if(currentGenero.equals("Femenino"))
        {
            currentIdGenero = 2;
            return currentIdGenero;
        }
        else
        {
            currentIdGenero = 1;
            return currentIdGenero;
        }
    }
    
    public int returnIdGenero()
    {
        currentGenero=jFrameAddPolice.cmbGenero.getSelectedItem().toString().trim();
        if(currentGenero.equals("Femenino"))
        {
            currentIdGenero = 2;
            return currentIdGenero;
        }
        else
        {
            currentIdGenero = 1;
            return currentIdGenero;
        }
    }
    
    public int returnIdRangoUserActu()
    {
        currentRangoUser=jFrameUpdatePolice.cmbRangoUser.getSelectedItem().toString().trim();
        if(currentRangoUser.equals("Comisionado General"))
        {
            currentIdRangoUser = 1;
            return currentIdRangoUser;
        }
        else 
        {
            if(currentRangoUser.equals("Comisionado"))
            {currentIdRangoUser = 2; return currentIdRangoUser;}
            else
            {
              if(currentRangoUser.equals("SubComisionado"))
              {currentIdRangoUser = 3; return currentIdRangoUser;}
              else
              {
                if(currentRangoUser.equals("Inspector Jefe"))
                {currentIdRangoUser = 4; return currentIdRangoUser;}
                else
                {
                   if(currentRangoUser.equals("Inspector"))
                   {currentIdRangoUser = 5; return currentIdRangoUser;}
                   else
                   {
                      if(currentRangoUser.equals("SubInspector"))
                      {currentIdRangoUser = 6; return currentIdRangoUser;}
                      else
                      {
                        if(currentRangoUser.equals("Sargento"))
                        {currentIdRangoUser = 7; return currentIdRangoUser;}
                        else
                        {
                            if(currentRangoUser.equals("Cabo"))
                            {currentIdRangoUser = 8; return currentIdRangoUser;}
                            else
                            {
                                currentIdRangoUser = 9; return currentIdRangoUser;
                            }
                        }
                      }
                   }
                }
              }
            }
        }
    }
    
    
    public int returnIdRangoUser()
    {
        currentRangoUser=jFrameAddPolice.cmbRangoUser.getSelectedItem().toString().trim();
        if(currentRangoUser.equals("Comisionado General"))
        {
            currentIdRangoUser = 1;
            return currentIdRangoUser;
        }
        else 
        {
            if(currentRangoUser.equals("Comisionado"))
            {currentIdRangoUser = 2; return currentIdRangoUser;}
            else
            {
              if(currentRangoUser.equals("SubComisionado"))
              {currentIdRangoUser = 3; return currentIdRangoUser;}
              else
              {
                if(currentRangoUser.equals("Inspector Jefe"))
                {currentIdRangoUser = 4; return currentIdRangoUser;}
                else
                {
                   if(currentRangoUser.equals("Inspector"))
                   {currentIdRangoUser = 5; return currentIdRangoUser;}
                   else
                   {
                      if(currentRangoUser.equals("SubInspector"))
                      {currentIdRangoUser = 6; return currentIdRangoUser;}
                      else
                      {
                        if(currentRangoUser.equals("Sargento"))
                        {currentIdRangoUser = 7; return currentIdRangoUser;}
                        else
                        {
                            if(currentRangoUser.equals("Cabo"))
                            {currentIdRangoUser = 8; return currentIdRangoUser;}
                            else
                            {
                                currentIdRangoUser = 9; return currentIdRangoUser;
                            }
                        }
                      }
                   }
                }
              }
            }
        }  
    }
    
    public int returnIdTipoSangreActu()
    {
        currentTipoSangre=jFrameUpdatePolice.cmbTipoSangre.getSelectedItem().toString().trim();
        if(currentTipoSangre.equals("A+"))
        {
            currentIdTipoSangre = 1;
            return currentIdTipoSangre;
        }
        else 
        {
            if(currentTipoSangre.equals("O+"))
            {currentIdTipoSangre = 2; return currentIdTipoSangre;}
            else
            {
              if(currentTipoSangre.equals("O-"))
              {currentIdTipoSangre = 3; return currentIdTipoSangre;}
              else
              {
                if(currentTipoSangre.equals("B+"))
                {currentIdTipoSangre = 4; return currentIdTipoSangre;}
                else
                {
                   if(currentTipoSangre.equals("AB+"))
                   {currentIdTipoSangre = 5; return currentIdTipoSangre;}
                   else
                   {
                      if(currentTipoSangre.equals("A-"))
                      {currentIdTipoSangre = 6; return currentIdTipoSangre;}
                      else
                      {
                        if(currentTipoSangre.equals("B-"))
                        {currentIdTipoSangre = 7; return currentIdTipoSangre;}
                        else
                        {
                            currentIdTipoSangre = 8; return currentIdTipoSangre;
                        }
                      }
                   }
                }
              }
            }
        } 
    }
    
    public int returnIdTipoSangre()
    {
       currentTipoSangre=jFrameAddPolice.cmbTipoSangre.getSelectedItem().toString().trim();
        if(currentTipoSangre.equals("A+"))
        {
            currentIdTipoSangre = 1;
            return currentIdTipoSangre;
        }
        else 
        {
            if(currentTipoSangre.equals("O+"))
            {currentIdTipoSangre = 2; return currentIdTipoSangre;}
            else
            {
              if(currentTipoSangre.equals("O-"))
              {currentIdTipoSangre = 3; return currentIdTipoSangre;}
              else
              {
                if(currentTipoSangre.equals("B+"))
                {currentIdTipoSangre = 4; return currentIdTipoSangre;}
                else
                {
                   if(currentTipoSangre.equals("AB+"))
                   {currentIdTipoSangre = 5; return currentIdTipoSangre;}
                   else
                   {
                      if(currentTipoSangre.equals("A-"))
                      {currentIdTipoSangre = 6; return currentIdTipoSangre;}
                      else
                      {
                        if(currentTipoSangre.equals("B-"))
                        {currentIdTipoSangre = 7; return currentIdTipoSangre;}
                        else
                        {
                            currentIdTipoSangre = 8; return currentIdTipoSangre;
                        }
                      }
                   }
                }
              }
            }
        } 
    }
    
     public String convertirSHA256(String password) {
	MessageDigest md = null;

	try {
            md = MessageDigest.getInstance("SHA-256");
	}
	catch (NoSuchAlgorithmException e) {
		
                JOptionPane.showMessageDialog(null, e.toString());
		return null;
	}

	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();

	for(byte b : hash) {
		sb.append(String.format("%02x", b));
	}

	return sb.toString();
}
}
