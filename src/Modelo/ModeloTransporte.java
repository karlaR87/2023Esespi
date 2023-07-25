package Modelo;

import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ModeloTransporte {
    
   private int id;
   private String TipoTransporte;

    public ModeloTransporte(int id, String TipoTransporte) {
        this.id = id;
        this.TipoTransporte = TipoTransporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTransporte() {
        return TipoTransporte;
    }

    public void setTipoTransporte(String TipoTransporte) {
        this.TipoTransporte = TipoTransporte;
    }
   
   //toda clase que debe ser lista debe llevar el metodo toString()

    @Override
    public String toString() {
        return TipoTransporte; //devuelve el nombre porque será lo que se mostrará en el formulario
    }
    
}
