/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionListener;
import Modelo.ModeloArmamento;
import VIsta.Programa.Inventario.Agregar_Armamento;
import java.awt.event.ActionEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*; 

/**
 *
 * @author karla
 */
public class ControladorArmamento implements ActionListener{
    
    private ModeloArmamento modeloArmamento;
    private Agregar_Armamento Vista; 
    
    public ControladorArmamento (ModeloArmamento modeloarmas, Agregar_Armamento VistaArmas){
        
        this.modeloArmamento=modeloarmas;
        this.Vista=VistaArmas;
        this.Vista.btnAdd.addActionListener(this);
        this.Vista.btnEliminar.addActionListener(this);
        this.Vista.btnModificar.addActionListener(this);
        System.out.println("el inicio del controlador");
        
        
    }
    
    
    public void actionPerformed(ActionEvent e){ 
        ///ANTERIOR
        if(e.getSource() == Vista.btnAdd){
                String variable2 = (String) Vista.cmbTipoArmamento.getSelectedItem();
                int v;
            try {
                v = modeloArmamento.IdRetornoTipoArmamento(variable2);
                
                
                System.out.println(v);
            } catch (SQLException ex) {
                
            }
                  
             modeloArmamento.setArmas(Vista.txtDetalles.getText());
             modeloArmamento.setTipoArmamento(Vista.cmbTipoArmamento.getSelectedItem().toString());    
             modeloArmamento.setCantidad((int) Vista.spCantidad.getValue());
           
            
            modeloArmamento.agregar(modeloArmamento);
//            modeloArmamento.mostrar(Vista);
         }
    
    }
}
