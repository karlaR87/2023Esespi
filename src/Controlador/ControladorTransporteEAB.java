
package Controlador;

import Modelo.ModeloDatosTransporte;
import Modelo.ModeloTransporte;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import VIsta.VistaAgregarTransporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorTransporteEAB implements ActionListener{
    private ModeloTransporte mdTr;
        private ModeloDatosTransporte mdDTr;
        private Inventario_Inicio_Transportes vstATr;
        
        public ControladorTransporteEAB(ModeloTransporte mdTr, ModeloDatosTransporte mdDTr, Inventario_Inicio_Transportes vstATr)
        {
            this.mdTr = mdTr;
            this.mdDTr = mdDTr;
            this.vstATr = vstATr;
           this.vstATr.btnEliminar.addActionListener(this);
           this.vstATr.btnModificar.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vstATr.btnEliminar){
             
            mdDTr.eliminar(vstATr);
            mdDTr.mostrar(vstATr);
        } 
        
        if(e.getSource() == vstATr.btnModificar){
             
           mdDTr.setDetalles(vstATr.txtNuevoDetalle.getText());
            
            mdDTr.setPlaca(vstATr.txtNuevaPLaca.getText());
           
            
           
            mdDTr.actualizar(vstATr);
            mdDTr.mostrar(vstATr);
        } 
    }
}
