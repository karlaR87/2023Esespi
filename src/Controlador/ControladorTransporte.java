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
           this.vstATr.btnEliminar.addActionListener(this);
           this.vstATr.btnModificar.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //agregar
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
            
            VistaAgregarTransporte m;
            try {
                m = new VistaAgregarTransporte();
                mdDTr.mostrar(m);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            //eliminar
            
            if(e.getSource() == vstATr.btnEliminar){

            mdTr.setTipotransporte(vstATr.cmbTipos.getSelectedItem().toString());         
            
            
            mdDTr.eliminar(vstATr);
            
            VistaAgregarTransporte me;
            try {
                me = new VistaAgregarTransporte();
                mdDTr.mostrar(me);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }       
        
       }
        
        //actualizar
        
        if(e.getSource() == vstATr.btnModificar){
            
            String variable = (String) vstATr.cmbTipos.getSelectedItem();
            int v;
            try {
                v = mdTr.IdRetorno(variable);
                System.out.println(v);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            String variable2 = (String) vstATr.cmbMarcas.getSelectedItem();
            int v2;
            try {
                v2 = mdTr.IdRetorno(variable);
                System.out.println(v2);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            String variable3 = (String) vstATr.cmbGrupos.getSelectedItem();
            int v3;
            try {
                v3 = mdTr.IdRetorno(variable);
                System.out.println(v3);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            mdTr.setTipotransporte(vstATr.cmbTipos.getSelectedItem().toString());         
            //mdDTr.setCantidad(Integer.parseInt(vstATr.txtNumero1.getText()));
            try {
                mdDTr.actualizar(vstATr);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            VistaAgregarTransporte m;
            try {
                m = new VistaAgregarTransporte();
                mdDTr.mostrar(m);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        }
}