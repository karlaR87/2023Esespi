package Controlador;
import Modelo.ModeloRegistro;
import Modelo.mdlPolicias;
import Modelo.mdlTipoPersonas_Personas;
import Modelo.mdlUsuarios;
import VIsta.JoptionReplacemnt;
import VIsta.PorCorreo;
import VIsta.PorSMS;
import VIsta.RecuperarContra;
import VIsta.ReestablecerContra;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRecuperarContra implements ActionListener{

    private ModeloRegistro modeloRegistro;
    private RecuperarContra vistaRecuperarContra; // Referencia al JFrame
    private ReestablecerContra reestablecerContra;
    private PorCorreo porCorreo;
    private PorSMS porSMS;
    private mdlPolicias mdlPolicias;
    private mdlUsuarios mdlusuarios;
    private mdlTipoPersonas_Personas mdlTipoPersonasP;
    
     public ControladorRecuperarContra(ModeloRegistro modeloRegistro, RecuperarContra vistaRecuperarContra, ReestablecerContra reestablecerContra, PorCorreo porCorreo, PorSMS porSMS, mdlPolicias mdlPolicias, mdlUsuarios mdlusuarios, mdlTipoPersonas_Personas mdlTipoPersonasP) {
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
     

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //POR CORREO------------------------------------POR CORREO-------------------------------------POR CORREO
        if(e.getSource() == porCorreo.btnEnviarCode)
       {
          if(porCorreo.txtMail.getText().isBlank())
          {
            porCorreo.numeroAleatorio = 0;
            show("Ingrese su correo electrónico", 17, 1);
            close1();
          }
          else
          {
            modeloRegistro.setCorreoElectronico(porCorreo.txtMail.getText().trim());
            IdCurrentPersona = modeloRegistro.readIDCorreo();
            if(IdCurrentPersona == -1)
            {
              porCorreo.numeroAleatorio = 0;
               show("No se encontró el correo electrónico", 17, 1);
                close1();
            }
            else
            {
                //Ya con el idPersonas
                System.out.println("Si hay persona con ese correo: " + IdCurrentPersona);
                //Pero ahora confirmamos que esa persona tenga usuario de tipo 2, osea, jefe de policias
                int idNivel = modeloRegistro.readIdTipoUsuarioFromCorreo();
                if(idNivel != 2)
                {
                    show("No se puede restablecer su contraseña, no es jefe policial", 13, 1);
                    close1();
                }
                else
                {
                    porCorreo.EnviarCorreo();
                    show("Correo Enviado", 17, 0);
                    close1();
                }
            }
          }
       }
        //--------------------------------------------------
        if(e.getSource() == porCorreo.btnAceptar)
       {
        String txtcode = porCorreo.txtCode.getText();
        String numeroA = String.valueOf(porCorreo.numeroAleatorio);
        if(txtcode.isBlank())
        { show("Ingrese el código enviado a su correo electrónico", 15, 1);
          close1();}
        else{
            if(txtcode.equals(numeroA))
            {
                porCorreo.numeroAleatorio = 0;
                porCorreo.txtMail.setText("");
                porCorreo.txtCode.setText("");
                
                mdlTipoPersonasP.setIdPersona(IdCurrentPersona);
                int currentIdpersona = mdlTipoPersonasP.readIDTipoPersona();
                
                mdlPolicias.setIdTipoPersonas_Personas(currentIdpersona);
                int IdCurrentUser = mdlPolicias.readIDUsuario();
                System.out.println(IdCurrentUser);
                
                if(IdCurrentUser == -1)
                {
                    show("No se encontró el usuario", 17, 1);
                    close1();

                }
                else
                {
                    mdlusuarios.setIdUsuario(IdCurrentUser);
                    vistaRecuperarContra.loadReesCon();
                }
            }
            else{
                 show("El código ingresado no coincide, intente nuevamente", 14, 1);      
                 close1();
                }
            }
       }
        //POR SMS-----------------------------POR SMS---------------------------------------------POR SMS
         if(e.getSource() == porSMS.btnEnviarCode)
       {  
          if(porSMS.txtNumero.getText().isBlank())
          {
            porSMS.numeroAleatorio = 0;
            show("Ingrese su número telefónico", 17, 1);      
            close1();
          }
          else
          {
            modeloRegistro.setNumeroTelefonico(porSMS.txtNumero.getText().trim());
            IdCurrentPersona = modeloRegistro.readIdTelefono();
            if(IdCurrentPersona == -1)
            {
              porSMS.numeroAleatorio = 0;
              show("No se encontró el número telefónico", 17, 1);      
              close1();
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
        {
            show("Ingrese el código enviado a su número telefónico", 16, 1);      
            close1();
        }
        else{
            if(txtcode.equals(numeroA))
            {
                //JOptionPane.showMessageDialog(porSMS, "Codigos iguales");  
                porSMS.numeroAleatorio = 0;
                porSMS.txtNumero.setText("");
                porSMS.txtCodeN.setText("");
                                
                mdlTipoPersonasP.setIdPersona(IdCurrentPersona);
                int currentIdpersona = mdlTipoPersonasP.readIDTipoPersona();
                
                mdlPolicias.setIdTipoPersonas_Personas(currentIdpersona);
                int IdCurrentUser = mdlPolicias.readIDUsuario();
                System.out.println(IdCurrentUser);
                
                if(IdCurrentUser == -1)
                {      
                    show("No se encontró el usuario", 17, 1);      
                    close1();
                }
                else
                {
                    mdlusuarios.setIdUsuario(IdCurrentUser);
                    vistaRecuperarContra.loadReesCon();
                }
            }
            else{ 
                 show("El código ingresado no coincide", 17, 1);      
                 close1();
                }
            }
       }
    }
    
    JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        porCorreo.jLabel6.setVisible(true);
        porSMS.jLabel7.setVisible(true);
        vistaRecuperarContra.setEnabled(false);
        Jo = new JoptionReplacemnt(0,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            porCorreo.jLabel6.setVisible(false);
             porSMS.jLabel7.setVisible(false);
            vistaRecuperarContra.setEnabled(true);
        }
        });
    }
}   
        
