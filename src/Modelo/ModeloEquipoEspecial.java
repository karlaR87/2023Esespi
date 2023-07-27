/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author karla
 */
public class ModeloEquipoEspecial {
    
    private int IdCategoriaEquipamiento; 
    private int Categoria; 

    public int getIdCategoriaEquipamiento() {
        return IdCategoriaEquipamiento;
    }

    public void setIdCategoriaEquipamiento(int IdCategoriaEquipamiento) {
        this.IdCategoriaEquipamiento = IdCategoriaEquipamiento;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
    
    //LLENAR 
    public void llenarCombo(JComboBox<String> combocat) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdCategoriaEquipamiento, Categoria from tbCategoriasEquipamiento";
        combocat.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdCategoriaEquipamiento");
                String nombre = result.getString("Categoria");
                combocat.addItem(nombre);
            }

 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            // Cerrar recursos
            if (result != null) {
                result.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conectar != null) {
                conectar.close();
            }
        }
    }
    
    public int IdRetorno3(String genero) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int gen = -1; 

 

        String SSQL = "SELECT IdCategoriaEquipamiento FROM tbCategoriasEquipamiento WHERE Categoria = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, genero);
            result = pst.executeQuery();

 

            if (result.next()) {
                gen = result.getInt("IdCategoriaEquipamiento");
            }

 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            // Cerrar recursos
            if (result != null) {
                result.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conectar != null) {
                conectar.close();
            }
        }

 

        return gen;
    }
    
    
}
