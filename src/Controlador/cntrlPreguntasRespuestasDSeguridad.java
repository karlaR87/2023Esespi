package Controlador;

import Modelo.mdlPreguntasRespuestasDSeguridad;
import VIsta.PorPreguntasS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cntrlPreguntasRespuestasDSeguridad implements ActionListener{
     private mdlPreguntasRespuestasDSeguridad modeloPreguntasDSeguridadR;
     private PorPreguntasS vistaPreguntasDSeguridadR;
     
       public cntrlPreguntasRespuestasDSeguridad(mdlPreguntasRespuestasDSeguridad modeloPreguntasDSeguridadR, PorPreguntasS vistaPreguntasDSeguridadR) {
        this.modeloPreguntasDSeguridadR = modeloPreguntasDSeguridadR;
        this.vistaPreguntasDSeguridadR = vistaPreguntasDSeguridadR;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          
        
    }
    
}
