/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import VIsta.Registro_Idiomas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class mdlIdiomas {
    
    private int IdIdiomas; 
    private String idiomas; 

    public int getIdIdiomas() {
        return IdIdiomas;
    }

    public void setIdIdiomas(int IdIdiomas) {
        this.IdIdiomas = IdIdiomas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    
    public void Mostrar(Registro_Idiomas idiomas){
        System.out.println("mostrar");
        //Definir un modelo de datos para la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Agregar columnas o encabezado de la tabla
        modelo.setColumnIdentifiers(new Object[] {"IdIdioma", "Idioma", "Checbox"});
        //Hacer select a la base de datos
        try{
            Statement statement = conexionSql.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from tbIdiomas");
            System.out.println("mostrar2");
            
            //Recorrer los resultados
            while(rs.next()){
                modelo.addRow(new Object[] {rs.getInt("IdIdioma"), rs.getString("Idioma"), null} );
                System.out.println("mostrar3");
            }
            idiomas.tbIdiomas.setModel(modelo);
            
            idiomas.addCheckBox(2, idiomas.tbIdiomas);

        }catch(SQLException e){
              JOptionPane.showMessageDialog(null, e.toString());
        }
    }
     
    
}
