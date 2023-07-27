package Controlador;

import Modelo.mdlUsuarios;
import VIsta.Login;
import VIsta.Programa.JframePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            mdlUsuarios.setUsuario(lg.convertirSHA256(lg.txtUsuario.getText().trim()));
            int idUser = mdlUsuarios.readIDUsuario();
            
            if(idUser == -1)
            {
                JOptionPane.showMessageDialog(lg, "No se encontró el usuario, intente nuevamente");
            }
            else
            {
                mdlUsuarios.setIdUsuario(idUser);
                String con = mdlUsuarios.readConUsuario();
                 if(con == null)
                 {
                    JOptionPane.showMessageDialog(lg, "Usuario o contraseña incorrecto");
                 }
                 else
                 {
                     if(con.equals(lg.convertirSHA256(lg.txtUsuario.getText().trim())))
                     {
                        JframePrincipal JFP = new JframePrincipal();
                        JFP.setVisible(true);
                        lg.setVisible(false); 
                     }
                     else
                     {
                        JOptionPane.showMessageDialog(lg, "Contraseña incorrecta"); 
                     }

                 }
            }

            }
        }
    }
    


 
