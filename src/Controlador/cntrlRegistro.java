package Controlador;

import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import VIsta.JoptionReplacemnt;
import VIsta.Login;
import VIsta.PreguntasSeguridad;
import VIsta.Registro;
import VIsta.RegistroInfoPolicial;
import VIsta.RegistroUsuario;
import VIsta.Registro_DatosPersonales;
import VIsta.Registro_Idiomas;
import VIsta.Registro_Nacionalidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;

public class cntrlRegistro implements ActionListener {

    private Registro vistaJframeRegistro; //Referencia al jFrames
    private Registro_DatosPersonales vista; //Referencia al JPanel
    private ModeloRegistro modeloRegistro;
    private RegistroInfoPolicial InfoPolicial;
    private mdlPolicias mdlPolicias;
    private mdlTipoPersonas_Personas mdlTipoPersonas;
    private RegistroUsuario registroUser;
    private mdlUsuarios mdlUsuario;
    private PreguntasSeguridad preguntasS;
    private mdlPreguntasRespuestasDSeguridad mdlPreguntasDS;
    private Registro_Idiomas vistaIdiomas;
    private Registro_Nacionalidades vistaNacionalidades;
    
     public cntrlRegistro(Registro vistaJframeRegistro, Registro_DatosPersonales vista, ModeloRegistro modeloRegistro, RegistroInfoPolicial InfoPolicial, mdlPolicias mdlPolicias, mdlTipoPersonas_Personas mdlTipoPersonas, RegistroUsuario registroUser, mdlUsuarios mdlUsuario, PreguntasSeguridad preguntasS, mdlPreguntasRespuestasDSeguridad mdlPreguntasDS, Registro_Idiomas Idiomas, Registro_Nacionalidades idNacionalidades){
        this.vistaJframeRegistro = vistaJframeRegistro;
        this.vista = vista;
        this.modeloRegistro = modeloRegistro;
        this.InfoPolicial = InfoPolicial;
        this.mdlPolicias = mdlPolicias;
        this.mdlTipoPersonas = mdlTipoPersonas;
        this.registroUser = registroUser;
        this.mdlUsuario = mdlUsuario;
        this.preguntasS = preguntasS;
        this.mdlPreguntasDS = mdlPreguntasDS;
        this.vistaIdiomas = Idiomas;
        this.vistaNacionalidades = idNacionalidades;
        
        InfoPolicial.btnSiguiente.addActionListener(this);
        vista.btnSiguiente.addActionListener(this);
        registroUser.btnSiguiente.addActionListener(this);
        preguntasS.btnAceptar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
          //Registro de registro           
          
        if(e.getSource() == vista.btnSiguiente){
            
           if(vista.isOK())
            { 
                
            modeloRegistro.setNombre(vista.txtNombres.getText().trim());
            modeloRegistro.setApellidos(vista.txtApellidos.getText().trim());
            modeloRegistro.setFecha(vista.jdcFecha.getDate());
            modeloRegistro.setDirección(vista.txtDireccion.getText().trim());
            modeloRegistro.setDUI(vista.txtDui.getText().trim());
            modeloRegistro.setTel(vista.txtNumeroTel.getText().trim());
            modeloRegistro.setCorreo(vista.txtCorreo.getText().trim());
            
            modeloRegistro.setIdgenero(vista.currentIdGenero);
             modeloRegistro.setIdtipoSangre(vista.currentIdTipoSangre);
              modeloRegistro.setIdestadocicivl(vista.currentIdEstadoCivil);
//            modeloRegistro.setTipoSangre(vista.cmbtipoSangre1.getSelectedItem().toString().trim());
//            modeloRegistro.setGenero(vista.cmbgenero.getSelectedItem().toString().trim());

            vistaJframeRegistro.loadInfoPolicias();
            }
           else{
               JOptionPane.showMessageDialog(null, "Error al ingresar datos. Tienes datos repetidos. Ingresa otros datos en el DUI, Telefono, o Correo electronico");
           } 
        }
        
        if(e.getSource() == InfoPolicial.btnSiguiente)
        {
            if(InfoPolicial.isOk())
            {
                mdlPolicias.setONI(InfoPolicial.txtONI.getText().trim());
                mdlPolicias.setNumeroPlaca(InfoPolicial.txtNumeroPlaca.getText().trim());
                
                int rangoTipoUsuario = 1;
                mdlPolicias.setIdRangoTipoUsuario(rangoTipoUsuario);
                vistaJframeRegistro.loadInfoUsuario();
            }
        }
        
        if(e.getSource() == registroUser.btnSiguiente)
        {
            if(registroUser.isOK())
            {
                mdlUsuario.setUsuario(registroUser.txtUsuario.getText().trim());
                mdlUsuario.setContrasena(registroUser.convertirSHA256(registroUser.txtContrasena.getText().trim()));
                mdlUsuario.setIdNivelUsuario(2);
              
                vistaJframeRegistro.loadPreguntasS();
            }
            else
            {
                
            }
        }
        
        if(e.getSource() == preguntasS.btnAceptar)
        {
            if(preguntasS.isOK())
            {   
                try{
                //Primero, Insertar a la persona
                
                
                int idPeronsa = modeloRegistro.agregarRegistroYObtenerID();
                
                List<Integer> idIdiomas = vistaIdiomas.getIdiomasSeleccionados();
                List<Integer> idNacion = vistaNacionalidades.getNacionalidadesSeleccionadas();
                 modeloRegistro.agregarRelacionesNacionalidades(idNacion,idPeronsa);
                 modeloRegistro.agregarRelacionesIdiomas(idIdiomas,idPeronsa);
                 
                
                //Segundo, Insertar el usuario
                mdlUsuario.insertUsuario();
                //Tercero, Insertar las preguntas de Seguridad
                    //Para eso, necesitamos el id usuario, que acabamos de agregar
                    //Seleccionamos el "Maximo", el "Ultimo"
                    int idCurrentUser = mdlUsuario.readIDULTIMATEUsuario();
                    mdlPreguntasDS.setIdUsuario(idCurrentUser);
                    System.out.println(idCurrentUser);
                    //Primera insercion de primera fila de P/R
                    mdlPreguntasDS.setPregunta(preguntasS.txt1Pregunta.getText().trim());
                    mdlPreguntasDS.setRespuesta(preguntasS.txt1Respuesta.getText().trim());
                    mdlPreguntasDS.setIdUsuario(idCurrentUser);
                    mdlPreguntasDS.insertPreguntasS();
                    //Segunda insercion de segunda fila de P/R
                    mdlPreguntasDS.setPregunta(preguntasS.txt2Pregunta.getText().trim());
                    mdlPreguntasDS.setRespuesta(preguntasS.txt2Respuesta.getText().trim());
                    mdlPreguntasDS.setIdUsuario(idCurrentUser);
                    mdlPreguntasDS.insertPreguntasS();
                    //Tercera insercion de tercera fila de P/R
                    mdlPreguntasDS.setPregunta(preguntasS.txt3Pregunta.getText().trim());
                    mdlPreguntasDS.setRespuesta(preguntasS.txt3Respuesta.getText().trim());
                    mdlPreguntasDS.setIdUsuario(idCurrentUser);
                    mdlPreguntasDS.insertPreguntasS();
                //Cuarto, Insertar al Policia
                    //Primero, necesitamos el id Usuario
                    mdlPolicias.setIdUsuario(idCurrentUser);
                    //Segundo, necesitamos el idTipoPersonas_Personas
                        //2.1, necesitamos primero el idDe la persona actual
                        int idCurrentPersona = modeloRegistro.readIdUltimaPersona();
                        //2.2, necesitamos insertar el tipo persona
                        mdlTipoPersonas.setIdPersona(idCurrentPersona);
                        mdlTipoPersonas.insertTipoPersona();
                        //2.3, ahora sacamos el idTipopersonas personas, de la tabla de antes
                        int TipoPersonas_Personas = mdlTipoPersonas.readIDTipoPersona();
                        mdlPolicias.setIdTipoPersonas_Personas(TipoPersonas_Personas);
                    mdlPolicias.insertPolicia();
                    
                show("Datos insertados exitosamente", 17, 0);      
                close2();
                }catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null, ea.toString());
                }
            }
            else
            {
                show("No se permite ningún campo vacío", 17, 1);      
                close1();
            }
        }
    }
    
    JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        preguntasS.jLabel12.setVisible(true);
        vistaJframeRegistro.setEnabled(false);
        Jo = new JoptionReplacemnt(0,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            preguntasS.jLabel12.setVisible(false);
            vistaJframeRegistro.setEnabled(true);
        }
        });
    }
    
     public void close2()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            preguntasS.jLabel12.setVisible(false);
            vistaJframeRegistro.setEnabled(true);
            //Exclusivo de close2
            vistaJframeRegistro.setVisible(false);
                     Login lg = new Login();
                    lg.setVisible(true);
            
        }
        });
    }
    
}
