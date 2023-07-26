package Controlador;

import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlUsuarios;
import VIsta.AskUsuario1;
import VIsta.Login;
import VIsta.PorPreguntasS;
import VIsta.RecuperarContra;
import VIsta.ReestablecerContra;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cntrlUsuarios implements ActionListener{
    
    private mdlUsuarios modeloUsuarios;
    private AskUsuario1 vistaUsuario1;
    private mdlPreguntasRespuestasDSeguridad mdlPreguntasS;
    private RecuperarContra vistaRecuperarContra; // Referencia al JFrame
    private ReestablecerContra reestablecerContra;


     public cntrlUsuarios( mdlUsuarios modeloUsuarios, AskUsuario1 vistaUsuario1, mdlPreguntasRespuestasDSeguridad mdlPreguntasS, RecuperarContra vistaRecuperarContra, ReestablecerContra reestablecerContra) {
        this.modeloUsuarios = modeloUsuarios;
        this.vistaUsuario1 = vistaUsuario1;
        this.mdlPreguntasS = mdlPreguntasS;
        this.vistaRecuperarContra = vistaRecuperarContra;
        this.reestablecerContra = reestablecerContra;
        
        this.vistaUsuario1.btnAceptar.addActionListener(this);
        this.reestablecerContra.btnAceptar.addActionListener(this);
        
    }
     
     public int IdCurrentUser;
     
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vistaUsuario1.btnAceptar)
       {
           if(vistaUsuario1.txtUsuario.getText().isBlank())
           {
                JOptionPane.showMessageDialog(vistaUsuario1, "No se permite ningún campo vacío");
           }
           else{
                modeloUsuarios.setUsuario(vistaUsuario1.txtUsuario.getText().trim());
                vistaUsuario1.txtUsuario.setText("");

                IdCurrentUser = modeloUsuarios.readIDUsuario();
                if(IdCurrentUser == 1)
                {JOptionPane.showMessageDialog(vistaUsuario1, "Es Admin: " + IdCurrentUser);
}
                else
                {
                    if(IdCurrentUser == -1)
                    {
                        JOptionPane.showMessageDialog(vistaUsuario1, "No se encontró el usuario, intente nuevamente, Id: " + IdCurrentUser);
                    }
                    else
                    {    
                         mdlPreguntasS.setIdUsuario(IdCurrentUser);
                         modeloUsuarios.setIdUsuario(IdCurrentUser);
                         JOptionPane.showMessageDialog(vistaUsuario1, "Usuario encontrado, Id: " + IdCurrentUser);
                         vistaRecuperarContra.loadPreguntas();
                    }
                }
           }
       }
       
        if(e.getSource() == reestablecerContra.btnAceptar)
       {
            if(reestablecerContra.AllisOk())
            {
              String conCompleta = reestablecerContra.convertirSHA256(reestablecerContra.txtContra1.getText());

             modeloUsuarios.setContrasena(conCompleta);
             System.out.println(modeloUsuarios.getIdUsuario() + "BBBB");
                
                if(modeloUsuarios.updateConUsuario())
                {
                     JOptionPane.showMessageDialog(reestablecerContra, "Contraseña restablecida exitosamente");
                    Login LG = new Login();
                    LG.setVisible(true);
                    vistaRecuperarContra.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(reestablecerContra, "No se pudo reestablecer la contraseña ");
                }
            }
            else{}
       }
    }
}
