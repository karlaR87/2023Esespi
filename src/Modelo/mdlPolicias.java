package Modelo;

import Controlador.ConexionPrueba;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mdlPolicias {
    private int idUsuario;
    private int idPersona;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
     public int readIDUsuario()
    {
        try{   
            String query = "SELECT IdUsuario FROM tbPolicias WHERE IdTipoPersonas_Personas = ?";    
            PreparedStatement readIdUsuario = ConexionPrueba.getConnection().prepareStatement(query);
            readIdUsuario.setInt(1, idPersona);
            
             ResultSet rs = readIdUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return -1;

        }
    } 
}
