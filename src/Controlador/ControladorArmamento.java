/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionListener;
import Modelo.ModeloArmamento;
import Modelo.ModeloCalibre;
import VIsta.Programa.Inventario.Agregar_Armamento;
import VIsta.Programa.Inventario.Agregar_Municion_Armas;
import java.awt.event.ActionEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author karla
 */
public class ControladorArmamento implements ActionListener{
    
    private ModeloArmamento modeloArmamento;
    private Agregar_Armamento Vista; 
    private Agregar_Municion_Armas vistamedia; 
    private ModeloCalibre calibre; 
   
    public ControladorArmamento (ModeloArmamento modeloarmas, Agregar_Armamento VistaArmas, Agregar_Municion_Armas vistamedia){
        
        this.modeloArmamento=modeloarmas;
        this.Vista=VistaArmas;
        this.vistamedia = vistamedia; 
        this.calibre = new ModeloCalibre();
        this.Vista.btnAdd.addActionListener(this);
        this.Vista.btnEliminar.addActionListener(this);
        this.Vista.btnModificar.addActionListener(this);

        System.out.println("el inicio del controlador armamento");

    }
   
    public void actionPerformed(ActionEvent e){
        
        
       if (e.getSource() == Vista.btnAdd) {
            String variable2 = (String) Vista.cmbTipoArmamento.getSelectedItem();
            int v = -1;
            try {
                v = modeloArmamento.IdRetornoTipoArmamento(variable2);
                System.out.println(v);
            } catch (SQLException ex) {
                // Manejar la excepción adecuadamente
            }

            modeloArmamento.setArmas(Vista.txtDetalles.getText());
            modeloArmamento.setTipoArmamento(Vista.cmbTipoArmamento.getSelectedItem().toString());
            modeloArmamento.setCantidad(Integer.parseInt(Vista.spCantidad.getValue().toString()));
            modeloArmamento.setIdTipoArmamento(v);

            // Agregar los detalles del arma y obtener el ID del detalle
            int idDetalleArma = modeloArmamento.agregar(modeloArmamento);

            // Obtener los IDs de los calibres seleccionados desde la vista de calibres
            
            List<Integer> idsCalibres = vistamedia.getCalibresSeleccionados();

            // Llamar al método para agregar relaciones
            modeloArmamento.agregarRelacionesArmamentoCalibres(idDetalleArma, idsCalibres);

            // Mostrar los datos actualizados
            modeloArmamento.mostrar(Vista);
        }

        
        else if (e.getSource() == Vista.btnEliminar) {
            modeloArmamento.eliminar(Vista);
            modeloArmamento.mostrar(Vista);
        }
        
        
        
        
        
        
        else if (e.getSource() == Vista.btnModificar) {
            System.out.println("Viene al controlador");
            modeloArmamento.actualizar(Vista);
            modeloArmamento.mostrar(Vista);
        }
        
        
        
        
    
    }
    

}
