package Controlador;

import Modelo.mdlPolicias;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Policias.Agregar_policia;
import VIsta.Programa.Policias.Policias_Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contrlPolicias implements ActionListener{

    private Policias_Inicio vstPoli;
    private JframePrincipal jFrameP;
    private mdlPolicias mdlPoli;
    
    Agregar_policia jFrameAddPolice;
    
    public contrlPolicias(Policias_Inicio vstPoli, JframePrincipal jFrameP, mdlPolicias mdlPoli)
    {
        this.vstPoli = vstPoli;
        this.jFrameP = jFrameP;
        this.mdlPoli = mdlPoli;
        
        vstPoli.btnAddPolicia.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vstPoli.btnAddPolicia)
        {
            jFrameP.enable(false);
            jFrameP.jLabel3.setVisible(true);
            jFrameAddPolice = new Agregar_policia();
            jFrameAddPolice.setVisible(true);
        }
    }
    
}
