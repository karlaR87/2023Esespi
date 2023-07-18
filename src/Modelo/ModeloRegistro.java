/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import Modelo.conexionSql;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author karla
 */
public class ModeloRegistro {
    //llenar combobox 
    public static ResultSet CargarTiopoPersona(){
       Connection con; 
       PreparedStatement ps; 
       try{
           con =  conexionSql.getConexion();
           ps = con.prepareStatement("select * from TipoPersona");
           ResultSet rs; 
           rs = ps.executeQuery();
           return rs;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar");
           return null; 
       }
    }
    
}
