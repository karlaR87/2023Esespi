package Controlador;
import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import VIsta.PorCorreo;
import VIsta.PorSMS;
import VIsta.RecuperarContra;
import VIsta.ReestablecerContra;
import VIsta.Registro_DatosPersonales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorRegistro implements ActionListener{

    private ModeloRegistro modeloRegistro;
    private RecuperarContra vistaRecuperarContra; // Referencia al JFrame
    private ReestablecerContra reestablecerContra;
    private PorCorreo porCorreo;
    private PorSMS porSMS;
    private mdlPolicias mdlPolicias;
    private mdlUsuarios mdlusuarios;
    private mdlTipoPersonas_Personas mdlTipoPersonasP;
    
     public ControladorRegistro(ModeloRegistro modeloRegistro, RecuperarContra vistaRecuperarContra, ReestablecerContra reestablecerContra, PorCorreo porCorreo, PorSMS porSMS, mdlPolicias mdlPolicias, mdlUsuarios mdlusuarios, mdlTipoPersonas_Personas mdlTipoPersonasP) {
     this.modeloRegistro = modeloRegistro;
     this.vistaRecuperarContra = vistaRecuperarContra;
     this.reestablecerContra = reestablecerContra;
     this.porCorreo = porCorreo;
     this.porSMS = porSMS;
     this.mdlPolicias = mdlPolicias;
     this.mdlusuarios = mdlusuarios;
     this.mdlTipoPersonasP = mdlTipoPersonasP;
     
     porCorreo.btnEnviarCode.addActionListener(this);
     porCorreo.btnAceptar.addActionListener(this);
     
     porSMS.btnAceptar.addActionListener(this);
     porSMS.btnEnviarCode.addActionListener(this);
    }
     int IdCurrentPersona;

    /**
     *
     * @param e
     */
     
      //PARTE DE CONTROLADOR DE REGISTRO 
    private Registro_DatosPersonales vista; // o la vista correspondiente

     public ControladorRegistro(ModeloRegistro modelo, Registro_DatosPersonales datos){
        this.modeloRegistro=modelo;
        this.vista=datos;
        this.vista.btnSiguiente.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //POR CORREO------------------------------------POR CORREO-------------------------------------POR CORREO
        if(e.getSource() == porCorreo.btnEnviarCode)
       {
          if(porCorreo.txtMail.getText().isBlank())
          {
            porCorreo.numeroAleatorio = 0;
            JOptionPane.showMessageDialog(porCorreo, "Por favor, ingrese su correo electrónico");
          }
          else
          {
            modeloRegistro.setCorreoElectronico(porCorreo.txtMail.getText().trim());
            IdCurrentPersona = modeloRegistro.readIDCorreo();
            if(IdCurrentPersona == -1)
            {
              porCorreo.numeroAleatorio = 0;
              JOptionPane.showMessageDialog(porCorreo, "No se encontró el correo electrónico, intente nuevamente");
            }
            else
            {
                //Ya con el idPersonas
                System.out.println("Si hay persona con ese correo: " + IdCurrentPersona);
                porCorreo.EnviarCorreo();
            }
          }
       }
        //--------------------------------------------------
        if(e.getSource() == porCorreo.btnAceptar)
       {
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
                
                
                mdlTipoPersonasP.setIdPersona(IdCurrentPersona);
                int currentIdpersona = mdlTipoPersonasP.readIDTipoPersona();
                
                mdlPolicias.setIdPersona(currentIdpersona);
                int IdCurrentUser = mdlPolicias.readIDUsuario();
                System.out.println(IdCurrentUser);
                
                if(IdCurrentUser == -1)
                {
                     JOptionPane.showMessageDialog(porCorreo, "No se encontró el usuario");
                }
                else
                {
                    mdlusuarios.setIdUsuario(IdCurrentUser);
                    vistaRecuperarContra.loadReesCon();
                }
            }
            else{
                 porCorreo.showDialog("El código ingresado no coincide, intente nuevamente");           
                }
            }
       }
        //POR SMS-----------------------------POR SMS---------------------------------------------POR SMS
         if(e.getSource() == porSMS.btnEnviarCode)
       {  
          if(porSMS.txtNumero.getText().isBlank())
          {
            porSMS.numeroAleatorio = 0;
            JOptionPane.showMessageDialog(porSMS, "Por favor, ingrese su número telefónico");
          }
          else
          {
            modeloRegistro.setNumeroTelefonico(porSMS.txtNumero.getText().trim());
            IdCurrentPersona = modeloRegistro.readIdTelefono();
            if(IdCurrentPersona == -1)
            {
              porSMS.numeroAleatorio = 0;
              JOptionPane.showMessageDialog(porSMS, "No se encontró el número telefónico, intente nuevamente");
            }
            else
            {
                System.out.println("Si hay persona con ese número telefónico: " + IdCurrentPersona);
                porSMS.sendSMS();
            }
          }
       }

        //-----------------------------------------------------------
          if(e.getSource() == porSMS.btnAceptar)
       {
        String txtcode = porSMS.txtCodeN.getText();
        String numeroA = String.valueOf(porSMS.numeroAleatorio);
        if(txtcode.isBlank())
        {JOptionPane.showMessageDialog(porSMS, "Por favor, ingrese el código enviado a su número telefónico");}
        else{
            if(txtcode.equals(numeroA))
            {
                JOptionPane.showMessageDialog(porSMS, "Codigos iguales");  
                porSMS.numeroAleatorio = 0;
                porSMS.txtNumero.setText("");
                porSMS.txtCodeN.setText("");
                                
                mdlTipoPersonasP.setIdPersona(IdCurrentPersona);
                int currentIdpersona = mdlTipoPersonasP.readIDTipoPersona();
                
                mdlPolicias.setIdPersona(currentIdpersona);
                int IdCurrentUser = mdlPolicias.readIDUsuario();
                System.out.println(IdCurrentUser);
                
                if(IdCurrentUser == -1)
                {
                     JOptionPane.showMessageDialog(porCorreo, "No se encontró el usuario");
                }
                else
                {
                    mdlusuarios.setIdUsuario(IdCurrentUser);
                    vistaRecuperarContra.loadReesCon();
                }
            }
            else{ 
                 JOptionPane.showMessageDialog(porSMS, "El código ingresado no coincide, intente nuevamente");        
                }
            }
       }
          
          //Registro de registro 
          
//          
//        if(e.getSource() == vista.btnSiguiente){
//           if(vista.isOK())
//            { 
//            modeloRegistro.setNombre(vista.txtNombres.getText());
//            modeloRegistro.setFecha(vista.jdcFecha.getDate());
//            modeloRegistro.setDirección(vista.txtDireccion.getText());
//            modeloRegistro.setDUI(vista.txtDui.getText());
//            modeloRegistro.setTel(vista.txtNumeroTel.getText());
//            modeloRegistro.setCorreo(vista.txtCorreo.getText());
//            modeloRegistro.setEstadocicivl(vista.cmbEstadoCivil1.getSelectedItem().toString());
//            modeloRegistro.setTipoSangre(vista.cmbtipoSangre1.getSelectedItem().toString());
//            modeloRegistro.setGenero(vista.cmbgenero.getSelectedItem().toString());
//          // modeloRegistro.agregarRegistroYAsociarIdiomas(idiomasSeleccionados);
//            }
//           else{
//               
//           }
//           
//        }
    }
}   
        
