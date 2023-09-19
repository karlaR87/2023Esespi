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
public class MdlMunicion {
    private int idMunicion; 
    private String municion; 

    public int getIdMunicion() {
        return idMunicion;
    }

    public void setIdMunicion(int idMunicion) {
        this.idMunicion = idMunicion;
    }

    public String getMunicion() {
        return municion;
    }

    public void setMunicion(String municion) {
        this.municion = municion;
    }

    
    
    
   
}
