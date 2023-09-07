/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloCalibre;
import java.awt.event.ActionListener;
import VIsta.Programa.Inventario.Agregar_calibre;
import java.awt.event.ActionEvent;
/**
 *
 * @author karla
 */
public class cntrlClibre implements ActionListener{
    
     
    private ModeloCalibre modeloCalibre;
    private Agregar_calibre  Vista; 
    
    public cntrlClibre(ModeloCalibre mdlCalibre, Agregar_calibre VistaCalibre){
        
        this.modeloCalibre=mdlCalibre;
        this.Vista=VistaCalibre;
        this.Vista.btnAdd.addActionListener(this);
        this.Vista.btnEliminar.addActionListener(this);
        this.Vista.btnModificar.addActionListener(this);
        System.out.println("el inicio del controlador calibre");
        
        
    }
    
    
    public void actionPerformed(ActionEvent e){ 
        ///ANTERIOR
        if(e.getSource() == Vista.btnAdd){
            
            // Obtener el valor de txtCalibre en la vista y configurarlo en la instancia de ModeloCalibre
    modeloCalibre.setCalibre(Vista.txtCalibre.getText());

    // Obtener el valor de spCantidad en la vista y configurarlo en la instancia de ModeloCalibre
    modeloCalibre.setCantidad((int) Vista.spCantidad.getValue());

            
            modeloCalibre.agregar(modeloCalibre);
            modeloCalibre.mostrar(Vista);
         }
         if(e.getSource() == Vista.btnEliminar){
             
            if (Vista.idCalibre != 0){
            modeloCalibre.eliminar(Vista);
            modeloCalibre.mostrar(Vista);
            }
            
            
            }
         
         if(e.getSource() == Vista.btnModificar){
             System.out.println("Viene al controladpr");
            modeloCalibre.actualizar(Vista);
            modeloCalibre.mostrar(Vista);
            
            }
        }
    }
 
    

