package Modelo;

import Controlador.ConexionPrueba;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mdlTipoPersonas_Personas {
    private int idPersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
     public int readIDTipoPersona()
    {
        try{   
            String query = "SELECT TOP 1 IdTipoPersonas_Personas FROM tbTiposPersonas_Personas WHERE IdPersona = ?";    
            PreparedStatement readIdUsuario = ConexionPrueba.getConnection().prepareStatement(query);
            readIdUsuario.setInt(1, idPersona);
            
             ResultSet rs = readIdUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdTipoPersonas_Personas");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUTipoPersona: " + e.toString());
            return -1;

        }
    } 
}
