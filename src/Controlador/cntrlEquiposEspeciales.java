/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import Modelo.ModeloEquipoEspecial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author karla
 */
public class cntrlEquiposEspeciales {
    
    private ModeloEquipoEspecial MdlEquipos;
    private Agregar_EquipoEspecial Vista; 
    
    public cntrlEquiposEspeciales(ModeloEquipoEspecial modeloEspecial, Agregar_EquipoEspecial VistaEquipo){
        this.MdlEquipos=modeloEspecial;
        this.Vista=VistaEquipo;
        //this.Vista.btnAdd.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Vista.btnAdd){
                //MdlEquipos.setIdCategoriaEquipamiento(Vista.cmbCat.getItemAt()));
                
            }
        }
    }
 
    
