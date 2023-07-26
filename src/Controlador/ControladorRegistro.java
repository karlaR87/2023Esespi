package Controlador;
import Modelo.ModeloRegistro;
import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlUsuarios;
import VIsta.AskUsuario1;
import VIsta.PorCorreo;
import VIsta.PorSMS;
import VIsta.RecuperarContra;
import VIsta.ReestablecerContra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener{

    private ModeloRegistro modeloRegistro;
    private RecuperarContra vistaRecuperarContra; // Referencia al JFrame
    private ReestablecerContra reestablecerContra;
    private PorCorreo porCorreo;
    private PorSMS porSMS;
    
     public ControladorRegistro(ModeloRegistro modeloRegistro, RecuperarContra vistaRecuperarContra, ReestablecerContra reestablecerContra, PorCorreo porCorreo, PorSMS porSMS) {
     this.modeloRegistro = modeloRegistro;
     this.vistaRecuperarContra = vistaRecuperarContra;
     this.reestablecerContra = reestablecerContra;
     this.porCorreo = porCorreo;
     this.porSMS = porSMS;
     
     porCorreo.btnEnviarCode.addActionListener(this);
     porCorreo.btnAceptar.addActionListener(this);
     
     porSMS.btnAceptar.addActionListener(this);
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
            int IdCurrentPersona = modeloRegistro.readIDCorreo();
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
                
//                IdCurrentUser = modeloUsuarios.readIDUsuario();
                //Antes de esto V, debo conseguir el idUsuario
                vistaRecuperarContra.loadReesCon();
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
            JOptionPane.showMessageDialog(porCorreo, "Por favor, ingrese su número telefónico");
          }
          else
          {
            modeloRegistro.setCorreoElectronico(porCorreo.txtMail.getText().trim());
            int IdCurrentPersona = modeloRegistro.readIDCorreo();
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
                
//                IdCurrentUser = modeloUsuarios.readIDUsuario();
                //Antes de esto V, debo conseguir el idUsuario
                vistaRecuperarContra.loadReesCon();
            }
            else{ 
                 JOptionPane.showMessageDialog(porSMS, "El código ingresado no coincide, intente nuevamente");        
                }
            }
       }
}
    
    // llenar tipos persona 
    public static ResultSet CargarTiopoPersona(){
        return ModeloRegistro.CargarTiopoPersona();
    }
}   
        
