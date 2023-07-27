package Controlador;

import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import VIsta.Registro;
import VIsta.RegistroInfoPolicial;
import VIsta.RegistroUsuario;
import VIsta.Registro_DatosPersonales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cntrlRegistro implements ActionListener {

    private Registro vistaJframeRegistro; //Referencia al jFrames
    private Registro_DatosPersonales vista; //Referencia al JPanel
    private ModeloRegistro modeloRegistro;
    private RegistroInfoPolicial InfoPolicial;
    private mdlPolicias mdlPolicias;
    private mdlTipoPersonas_Personas mdlTipoPersonas;
    private RegistroUsuario registroUser;
    private mdlUsuarios mdlUsuario;
    
     public cntrlRegistro(Registro vistaJframeRegistro, Registro_DatosPersonales vista, ModeloRegistro modeloRegistro, RegistroInfoPolicial InfoPolicial, mdlPolicias mdlPolicias, mdlTipoPersonas_Personas mdlTipoPersonas, RegistroUsuario registroUser, mdlUsuarios mdlUsuario){
        this.vistaJframeRegistro = vistaJframeRegistro;
        this.vista = vista;
        this.modeloRegistro = modeloRegistro;
        this.InfoPolicial = InfoPolicial;
        this.mdlPolicias = mdlPolicias;
        this.mdlTipoPersonas = mdlTipoPersonas;
        this.registroUser = registroUser;
        this.mdlUsuario = mdlUsuario;
        
        InfoPolicial.btnSiguiente.addActionListener(this);
        vista.btnSiguiente.addActionListener(this);
        registroUser.btnSiguiente.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
          //Registro de registro           
          
        if(e.getSource() == vista.btnSiguiente){
           if(vista.isOK())
            { 
            modeloRegistro.setNombre(vista.txtNombres.getText());
            modeloRegistro.setFecha(vista.jdcFecha.getDate());
            modeloRegistro.setDirección(vista.txtDireccion.getText());
            modeloRegistro.setDUI(vista.txtDui.getText());
            modeloRegistro.setTel(vista.txtNumeroTel.getText());
            modeloRegistro.setCorreo(vista.txtCorreo.getText());
            modeloRegistro.setEstadocicivl(vista.cmbEstadoCivil1.getSelectedItem().toString());
            modeloRegistro.setTipoSangre(vista.cmbtipoSangre1.getSelectedItem().toString());
            modeloRegistro.setGenero(vista.cmbgenero.getSelectedItem().toString());
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
                
//                int idCurrentPersona = modeloRegistro.readIdUltimaPersona();
//                if(idCurrentPersona == -1)
//                {
//                    idCurrentPersona = 1;
//                }
//                else
//                {
//                    idCurrentPersona += 1;
//                }
//                
//                mdlTipoPersonas.setIdPersona(idCurrentPersona);
//                mdlTipoPersonas.insertTipoPersona();
//                
//                int TipoPersonas_Personas = mdlTipoPersonas.readIDTipoPersona();
//                mdlPolicias.setIdTipoPersonas_Personas(TipoPersonas_Personas);
                
                vistaJframeRegistro.loadInfoUsuario();
            }
        }
        
        if(e.getSource() == registroUser.btnSiguiente)
        {
            if(registroUser.isOK())
            {
                mdlUsuario.setUsuario(registroUser.txtUsuario.getText().trim());
                mdlUsuario.setContrasena(registroUser.txtContrasena.getText().trim());
                mdlUsuario.setIdNivelUsuario(2);
                
                
                
                vistaJframeRegistro.loadPreguntasS();
            }
            else
            {
                
            }
        }
    }
    
}
