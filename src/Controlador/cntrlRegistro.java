package Controlador;

import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import VIsta.PreguntasSeguridad;
import VIsta.Registro;
import VIsta.RegistroInfoPolicial;
import VIsta.RegistroUsuario;
import VIsta.Registro_DatosPersonales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
    
     public cntrlRegistro(Registro vistaJframeRegistro, Registro_DatosPersonales vista, ModeloRegistro modeloRegistro, RegistroInfoPolicial InfoPolicial, mdlPolicias mdlPolicias, mdlTipoPersonas_Personas mdlTipoPersonas, RegistroUsuario registroUser, mdlUsuarios mdlUsuario, PreguntasSeguridad preguntasS, mdlPreguntasRespuestasDSeguridad mdlPreguntasDS){
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
            if(vista.cmbEstadoCivil1.getSelectedItem().toString().trim().equals("Soltero"))
            modeloRegistro.setTipoSangre(vista.cmbtipoSangre1.getSelectedItem().toString().trim());
            modeloRegistro.setGenero(vista.cmbgenero.getSelectedItem().toString().trim());
            vistaJframeRegistro.loadInfoPolicias();
            }
           else{  
           } 
        }
        
        if(e.getSource() == InfoPolicial.btnSiguiente)
        {
            if(InfoPolicial.isOk())
            {
                mdlPolicias.setONI(InfoPolicial.txtONI.getText().trim());
                mdlPolicias.setNumeroPlaca(InfoPolicial.txtNumeroPlaca.getText().trim());
                mdlPolicias.setIdGrupoPatrullaje(0);
                
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
                modeloRegistro.agregarRegistroYAsociarIdiomas(vistaJframeRegistro.idiomasSeleccionados);
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
                JOptionPane.showMessageDialog(preguntasS, "Datos insertados exitosamente");
                }catch(Exception ea)
                {
                    System.out.println(ea.toString());
                }
            }
            else
            {
                
            }
        }
    }
    
}
