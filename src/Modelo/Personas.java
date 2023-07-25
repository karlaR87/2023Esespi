package Modelo;
import Controlador.ConexionPrueba;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Personas {
    
  public ResultSet readCorreo(String correo)
    {
        try{
            
            String query = "Select CorreoElectronico From tbPersonas Where CorreoElectronico = ?";    
            PreparedStatement readCorreo = ConexionPrueba.getConnection().prepareStatement(query);
            readCorreo.setString(1, correo);
            
            ResultSet rs = readCorreo.executeQuery();
            return rs;
          
        }catch(Exception e){
            System.out.println("ERROR en el query readCorreo: " + e.toString());
            return null;
        }
    
    }  
}
