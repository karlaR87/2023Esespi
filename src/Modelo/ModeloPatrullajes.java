package Modelo;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModeloPatrullajes {
     //Parametros
    private int idPatrullaje;

    
    //getters y setters
    public int getPatrullajes() {
        return idPatrullaje;
    }

    public void setPatrullajes(int IdPatrullaje) {
        this.idPatrullaje = IdPatrullaje;
    }
    
    //Metodo agregar
    public boolean readAllPatrullajes(ModeloPatrullajes modeloPatrullajes)
    {
        try {

           PreparedStatement readPatrullajes = conexionSql.getConexion().prepareStatement("Select * from tbPatrullajes");
           
           readPatrullajes.executeUpdate();
           return true;
           
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    
    }
}
