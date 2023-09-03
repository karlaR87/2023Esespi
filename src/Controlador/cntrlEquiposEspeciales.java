/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import Modelo.ModeloEquipoEspecial;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author karla
 */
public class cntrlEquiposEspeciales implements ActionListener{

    
    private ModeloEquipoEspecial MdlEquipos;
    private Agregar_EquipoEspecial Vista; 
    
    public cntrlEquiposEspeciales(ModeloEquipoEspecial modeloEspecial, Agregar_EquipoEspecial VistaEquipo){
        
        this.MdlEquipos=modeloEspecial;
        this.Vista=VistaEquipo;
        this.Vista.btnAdd.addActionListener(this);
        this.Vista.btnEliminar.addActionListener(this);
        this.Vista.btnModificar.addActionListener(this);
        System.out.println("el inicio del controlador equipo especial");
        
        
    }
    
    
    public void actionPerformed(ActionEvent e){ 
        ///ANTERIOR
         if (e.getSource() == Vista.btnAdd) {
             
            String variable2 = (String) Vista.cmbClasificacion.getSelectedItem();
            
            int v=-1;
            
            try {
                v = MdlEquipos.obtenerIdClasificacion(variable2);
                
                System.out.println("ID obtenido para " + variable2 + ": " + v);
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            MdlEquipos.setDetalles(Vista.txtDetalles.getText());
            MdlEquipos.setCantidad(Integer.parseInt(Vista.spCantidad.getValue().toString()));
            MdlEquipos.setClasificacion(Vista.cmbClasificacion.getSelectedItem().toString());
            MdlEquipos.setIdTipoClasificacion(v);

            MdlEquipos.agregar(MdlEquipos);
            MdlEquipos.mostrar(Vista);
            
        } else if (e.getSource() == Vista.btnEliminar) {
            MdlEquipos.eliminar(Vista);
            MdlEquipos.mostrar(Vista);
        } else if (e.getSource() == Vista.btnModificar) {
            System.out.println("Viene al controlador");
            MdlEquipos.actualizar(Vista);
            MdlEquipos.mostrar(Vista);
        }
    }
    }
 
    
