/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloRegistro;
import java.sql.ResultSet;
/**
 *
 * @author karla
 */
public class ControladorRegistro {
    // llenar tipos persona 
    
    public static ResultSet CargarTiopoPersona(){
        return ModeloRegistro.CargarTiopoPersona();
    }
}
