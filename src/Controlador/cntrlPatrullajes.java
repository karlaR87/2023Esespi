package Controlador;

import Modelo.ModeloPatrullajes;
import Modelo.mdlPolicias;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Patrullajes.Patrullajes_AddPersonal;
import VIsta.Programa.Patrullajes.Patrullajes_Agregar;
import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cntrlPatrullajes implements ActionListener {

    private ModeloPatrullajes modelPatrullajes;
    private JframePrincipal JframePrincipal;
    private Patrullajes_Inicio patrullajesHome;
    private Patrullajes_Agregar addPatrullajes;
    private Patrullajes_AddPersonal addPersonal;

    public cntrlPatrullajes(ModeloPatrullajes modelPatrullajes, JframePrincipal JframePrincipal, Patrullajes_Inicio patrullajesHome, Patrullajes_Agregar addPatrullajes, Patrullajes_AddPersonal addPersonal) {
        this.modelPatrullajes = modelPatrullajes;
        this.JframePrincipal = JframePrincipal;
        this.patrullajesHome = patrullajesHome;
        this.addPatrullajes = addPatrullajes;
        this.addPersonal = addPersonal;
        
        this.JframePrincipal.btnPatrullajes.addActionListener(this);
        this.JframePrincipal.btniconPatrullajes.addActionListener(this);
        this.patrullajesHome.btnAddPatrullaje.addActionListener(this);
        
        //Add Personal
        this.addPatrullajes.btnAddPersonal.addActionListener(this);
        //Add Patrullaje
        this.addPatrullajes.btnAddPatrullaje.addActionListener(this);
        //Cancel Patrullje 
        this.addPatrullajes.btnCancelPatrullaje.addActionListener(this);
        
        //Acept Personal
        this.addPersonal.btnAcept.addActionListener(this);
        //Cancel Personal
        this.addPersonal.btnCancel.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {   
        
        //-------------------------------Botones que muestran la PANTALLA INICIAL de patrullajes
        if (e.getSource() == JframePrincipal.btnPatrullajes) {
            JframePrincipal.showPatrullajePanel(1);
            
//            modelPatrullajes.mostrar(patrullajesHome);
        }
        
       if (e.getSource() == JframePrincipal.btniconPatrullajes) {
            JframePrincipal.showPatrullajePanel(2);
            
//             modelPatrullajes.mostrar(patrullajesHome);
        }
       
       //------------------------------------------------------------Boton que MUESTRA la PANTALLA de AGREGAR
       if (e.getSource() == patrullajesHome.btnAddPatrullaje) {
            JframePrincipal.showAddPatrullajePanel();
        }
       
       
       //--------------------------------AGREGAR PATRULLAJE BOTONOES-------------------------------------------------
       
       //------------------------------------------------------Boton que MUESTRA la pantalla para AGREGAR al personal
        if (e.getSource() == addPatrullajes.btnAddPersonal) {
            JframePrincipal.jLabel3.setVisible(true);
            addPersonal.setBackground(new Color(0,0,0,0));//Transparencia
            addPersonal.setVisible(true);
            JframePrincipal.enable(false);

        }
        //------------------------------------------------------Boton que CANCELA al Personal
        if (e.getSource() == addPersonal.btnCancel) {
          
           if(showMessage("¿Seguro que quieres cancelar?, se eliminarán todos los datos que no han sido guardados", "Confirmación"))
           {
            //Borrar Todo
               JframePrincipal.jLabel3.setVisible(false);
                addPersonal.setVisible(false);
                JframePrincipal.enable(true);
                JframePrincipal.setExtendedState(JFrame.NORMAL);
           }
        }

        //------------------------------------------------------Boton que ACEPTA al Personal
        if (e.getSource() == addPersonal.btnAcept) {
          //Agregarlos
          
        }
       
       //------------------------------------------------------------Boton que AGREGA el patrullaje
        if (e.getSource() == addPatrullajes.btnAddPatrullaje) {
        
        }
       
       //-------------------------------------------------------Boton que CANCELA la "Agregacion" del patrullaje
       if (e.getSource() == addPatrullajes.btnCancelPatrullaje) {
           if(showMessage("¿Seguro que quieres cancelar?, se eliminarán todos los datos que no han sido guardados", "Confirmación"))
           {
            //Borrar Todo
               JframePrincipal.showPatrullajePanel(2);
           }
       }
       
    }
    
    public boolean showMessage(String Message, String Title)
    {
        int response = -1;  // Valor inicial para entrar en el bucle
            while (response != JOptionPane.YES_OPTION && response != JOptionPane.NO_OPTION) {
                response = JOptionPane.showConfirmDialog(
                    null, 
                    Message, 
                    Title, 
                    JOptionPane.YES_NO_OPTION,
                   JOptionPane.WARNING_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    return true;                  
                } else if (response == JOptionPane.NO_OPTION) {
                    return false;
                }
            }     
        return false;
    }

}
