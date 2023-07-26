/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Controlador.ConexionPrueba;
import java.sql.Connection;
import Modelo.conexionSql;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModeloRegistro {
    
    private String CorreoElectronico;

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int readIDCorreo()
    {
        try{   
            String query = "Select IdPersona From tbPersonas Where CorreoElectronico = ?";    
            PreparedStatement readIdPersonaCorreo = ConexionPrueba.getConnection().prepareStatement(query);
            readIdPersonaCorreo.setString(1, CorreoElectronico);
            
             ResultSet rs = readIdPersonaCorreo.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return -1;

        }
    } 
    
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
