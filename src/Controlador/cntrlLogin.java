package Controlador;

import Modelo.mdlUsuarios;
import VIsta.JoptionReplacemnt;
import VIsta.Login;
import VIsta.Programa.JframePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class cntrlLogin implements ActionListener{

    private Login lg;
    private mdlUsuarios mdlUsuarios;
    
    public cntrlLogin(Login lg, mdlUsuarios mdlUsuarios)
    {
        this.lg = lg;
        this.mdlUsuarios = mdlUsuarios;
        
        lg.btnIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == lg.btnIngresar)
        {
            mdlUsuarios.setUsuario(lg.txtUsuario.getText().trim());
            int idUser = mdlUsuarios.readIDUsuario();
            
            if(idUser == -1)
            {
                
                show("No se encontró el usuario, intente nuevamente", 15, 1);
                close1();
            }
            else
            {
                mdlUsuarios.setIdUsuario(idUser);
                System.out.println(idUser);
                String con = mdlUsuarios.readConUsuario();
                 if(con == null)
                 {
                    show("Usuario o contraseña incorrecto", 17, 1);
                    close1();
                 }
                 else
                 {
                     System.out.println(con);
                     System.out.println(lg.convertirSHA256(lg.txtContraseña.getText().trim()));
                     
                     if(con.equals(lg.convertirSHA256(lg.txtContraseña.getText().trim())))
                     {
                        lg.IdNivelUser = mdlUsuarios.readIdNivelUsuario();
                        if(lg.IdNivelUser == 1 || lg.IdNivelUser == 2)
                        {
                            JframePrincipal JFP = new JframePrincipal(lg.IdNivelUser);
                            JFP.setVisible(true);
                            lg.setVisible(false); 
                        }
                        else
                        {
                            show("Solo jefes y administradores pueden iniciar sesión", 13, 1);
                            close1();
                        }
                            
                     }
                     else
                     {
                        show("Contraseña incorrecta", 17, 1);
                        close1();
                     }
                 }
            }

            }
        }
     JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img)
    {
        lg.jLabel1.setVisible(true);
        lg.setEnabled(false);
        Jo = new JoptionReplacemnt(0,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            lg.jLabel1.setVisible(false);
            lg.setEnabled(true);
        }
        });
    }
    
    
   }
    


 
