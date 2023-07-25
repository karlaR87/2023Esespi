/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import VIsta.Registro_Nacionalidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class mdlNacionalidad {
    private int idNacionalidad; 
    private String Nacionalidad; 

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    
    
     public void Mostrar(Registro_Nacionalidades Nacio){
        //Definir un modelo de datos para la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Agregar columnas o encabezado de la tabla
        modelo.setColumnIdentifiers(new Object[] {"idNacionalidad", "Nacionalidad", "Select"});
        //Hacer select a la base de datos
        try{
            Statement statement = conexionSql.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from tbNacionalidades");
            
            //Recorrer los resultados
            while(rs.next()){
                modelo.addRow(new Object[] {rs.getInt("idNacionalidad"), rs.getString("Nacionalidad"), false} );
             
            }
            Nacio.tbNacionalidad.setModel(modelo);
            Nacio.addCheckBox(2, Nacio.tbNacionalidad);
        }catch(SQLException e){
            System.out.println(e.toString());
            
        }
    }
}
