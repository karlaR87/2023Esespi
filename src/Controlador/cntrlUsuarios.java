package Controlador;

import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlUsuarios;
import VIsta.AskUsuario1;
import VIsta.PorPreguntasS;
import VIsta.RecuperarContra;
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


     public cntrlUsuarios( mdlUsuarios modeloUsuarios, AskUsuario1 vistaUsuario1, mdlPreguntasRespuestasDSeguridad mdlPreguntasS, RecuperarContra vistaRecuperarContra) {
        this.modeloUsuarios = modeloUsuarios;
        this.vistaUsuario1 = vistaUsuario1;
        this.mdlPreguntasS = mdlPreguntasS;
       this.vistaRecuperarContra = vistaRecuperarContra;
        
        this.vistaUsuario1.btnAceptar.addActionListener(this);
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

                if(IdCurrentUser == -1)
                {
                    JOptionPane.showMessageDialog(vistaUsuario1, "No se encontró el usuario, intente nuevamente, Id: " + IdCurrentUser);
                }
                else
                {    
                     mdlPreguntasS.setIdUsuario(IdCurrentUser);
                     JOptionPane.showMessageDialog(vistaUsuario1, "Usuario encontrado, Id: " + IdCurrentUser);
                     vistaRecuperarContra.loadPreguntas();
                }
           }
       }
    }

}
