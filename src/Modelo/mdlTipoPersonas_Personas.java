package Modelo;

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
    
    
    
    public boolean insertTipoPersona()
    {
         try{
            String query = "INSERT INTO tbTiposPersonas_Personas(IdTipoPersona, IdPersona) VALUES (1, ?)"; 
            PreparedStatement insertTipoPersona = conexionSql.getConexion().prepareStatement(query);
            insertTipoPersona.setInt(1, idPersona);

            insertTipoPersona.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query TipoPersonas: " + e.toString());
            return false;
        }
    }
    
     public int readIDTipoPersona()
    {
        try{   
            String query = "SELECT TOP 1 IdTipoPersonas_Personas FROM tbTiposPersonas_Personas WHERE IdPersona = ?";    
            PreparedStatement readIdUsuario = conexionSql.getConexion().prepareStatement(query);
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
