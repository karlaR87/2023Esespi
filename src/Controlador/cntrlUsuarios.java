package Controlador;

import Modelo.mdlPreguntasRespuestasDSeguridad;
import Modelo.mdlUsuarios;
import VIsta.AskUsuario1;
import VIsta.JoptionReplacemnt;
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

     public cntrlUsuarios(mdlUsuarios modeloUsuarios, AskUsuario1 vistaUsuario1, mdlPreguntasRespuestasDSeguridad mdlPreguntasS, RecuperarContra vistaRecuperarContra, ReestablecerContra reestablecerContra) {
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
               show("No se permite ningún campo vacío", 17, 1);
               close1();
           }
           else{
                modeloUsuarios.setUsuario(vistaUsuario1.txtUsuario.getText().trim());
                vistaUsuario1.txtUsuario.setText("");

                IdCurrentUser = modeloUsuarios.readIDUsuario();
                if(IdCurrentUser == 1)
                {
                    show("Es el Administrador, restablezca de otra manera", 15,0);
                    close1();
                }
                else
                {
                    if(IdCurrentUser == -1)
                    {
                        show("No se encontró el usuario, intente nuevamente", 15, 1);
                        close1();
                    }
                    else
                    {    
                         mdlPreguntasS.setIdUsuario(IdCurrentUser);
                         modeloUsuarios.setIdUsuario(IdCurrentUser);                         
                         show("Usuario encontrado Id: " + IdCurrentUser, 17, 0);   
                         close2();
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
 //            System.out.println(modeloUsuarios.getIdUsuario() + "BBBB");
                
                if(modeloUsuarios.updateConUsuario())
                {
                    reestablecerContra.jLabel6.setVisible(true);
                    show("Contraseña restablecida exitosamente", 17, 0);                   
                    close3();    
                }
                else
                {
                    show("No se pudo restablecer la contraseña", 15 , 1);
                    close1();
                }
            }
            else{}
       }
    }
    
     JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        vistaUsuario1.jLabel6.setVisible(true);
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
            vistaUsuario1.jLabel6.setVisible(false);
            vistaRecuperarContra.setEnabled(true);
        }
        });
    }
    
    public void close2()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();
            vistaUsuario1.jLabel6.setVisible(false);
            vistaRecuperarContra.setEnabled(true);
            //Esclusivo de close2
            vistaRecuperarContra.loadPreguntas();
        }
        });
    }
    
    public void close3()
    {
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.dispose();
            vistaRecuperarContra.setEnabled(true);
            reestablecerContra.jLabel6.setVisible(false);
            //Exclusivo de close3
               Login LG = new Login();
                    LG.setVisible(true);
                    vistaRecuperarContra.dispose();
            
        }
        });
    }
}
