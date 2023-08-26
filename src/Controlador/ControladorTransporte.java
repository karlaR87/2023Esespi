package Controlador;

import Modelo.ModeloDatosTransporte;
import Modelo.ModeloTransporte;
import Modelo.conexionSql;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import VIsta.VistaAgregarTransporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControladorTransporte implements ActionListener{
    
        private ModeloTransporte mdTr;
        private ModeloDatosTransporte mdDTr;
        private VistaAgregarTransporte vstATr;
        
        public ControladorTransporte(ModeloTransporte mdTr, ModeloDatosTransporte mdDTr, VistaAgregarTransporte vstATr)
        {
            this.mdTr = mdTr;
            this.mdDTr = mdDTr;
            this.vstATr = vstATr;
           this.vstATr.btnRegistrar.addActionListener(this);
           
           
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vstATr.btnRegistrar){
            
            String variable = (String) vstATr.cmbTipos.getSelectedItem();
            int v;
            try {
                v = mdTr.IdRetorno(variable);
                System.out.println(v);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            mdTr.setTipotransporte(vstATr.cmbTipos.getSelectedItem().toString());         
            //mdDTr.setCantidad(Integer.parseInt(vstATr.txtNumero1.getText()));
            
            
            mdDTr.agregar(mdTr, mdDTr);
            
            Inventario_Inicio_Transportes m = new Inventario_Inicio_Transportes();
            mdDTr.mostrar(m);
        }       
        
    }
}