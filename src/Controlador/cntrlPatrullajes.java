package Controlador;

import Modelo.ModeloPatrullajes;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Patrullajes.Patrullajes_Agregar;
import VIsta.Programa.Patrullajes.Patrullajes_Inicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class cntrlPatrullajes implements ActionListener {

    private ModeloPatrullajes modelPatrullajes;
    private JframePrincipal JframePrincipal;
    private Patrullajes_Inicio patrullajesHome;
    private Patrullajes_Agregar addPatrullajes;

    public cntrlPatrullajes(ModeloPatrullajes modelPatrullajes, JframePrincipal JframePrincipal, Patrullajes_Inicio patrullajesHome, Patrullajes_Agregar addPatrullajes) {
        this.modelPatrullajes = modelPatrullajes;
        this.JframePrincipal = JframePrincipal;
        this.patrullajesHome = patrullajesHome;
        this.addPatrullajes = addPatrullajes;
        
        this.JframePrincipal.btnPatrullajes.addActionListener(this);
        this.JframePrincipal.btniconPatrullajes.addActionListener(this);
        this.patrullajesHome.btnAddPatrullaje.addActionListener(this);
        //Add Patrullaje
        this.addPatrullajes.btnAddPatrullaje.addActionListener(this);
        this.addPatrullajes.btnCancelPatrullaje.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {   
        if (e.getSource() == JframePrincipal.btnPatrullajes) {
            JframePrincipal.showPatrullajePanel(1);
            
//            modelPatrullajes.mostrar(patrullajesHome);
        }
        
       if (e.getSource() == JframePrincipal.btniconPatrullajes) {
            JframePrincipal.showPatrullajePanel(2);
            
//             modelPatrullajes.mostrar(patrullajesHome);
        }
       
       if (e.getSource() == patrullajesHome.btnAddPatrullaje) {
            JframePrincipal.showAddPatrullajePanel();
        }
       
       
    }

}
