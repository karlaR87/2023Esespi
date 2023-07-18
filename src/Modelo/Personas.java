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
  
  public boolean insertPreguntasS(int idPersona, String Pregunta, String Respuesta)
    {
        try{
            String query = "Insert Into tbPreguntasRespuestasSeguras(IdPersona, Pregunta, Respuesta) Values (?,?,?)"; 
            PreparedStatement addPreguntasS = ConexionPrueba.getConnection().prepareStatement(query);
            addPreguntasS.setInt(1, idPersona);
            addPreguntasS.setString(2, Pregunta);
            addPreguntasS.setString(3, Respuesta);
            
            addPreguntasS.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query addPreguntasS: " + e.toString());
            return false;
        }
    }

  public ResultSet readPreguntas()
    {
        try{
            String query = "Select Pregunta, Respuesta From tbPreguntasRespuestasSeguras Where IdPersona = 1";    
            PreparedStatement readPreguntas = ConexionPrueba.getConnection().prepareStatement(query);
            ResultSet rs = readPreguntas.executeQuery();
            return rs;
          
        }catch(Exception e){
            System.out.println("ERROR en el query readCorreo: " + e.toString());
            return null;
        }
    
    }

   public boolean updateContra(String con, String user)
    {
        try{
            String query = "Update tbUsuarios Set Contraseña = ? Where Usuario = ?"; 
            PreparedStatement updateCon = ConexionPrueba.getConnection().prepareStatement(query);
            updateCon.setString(1, con);
            updateCon.setString(2, user);
            
            updateCon.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query addPreguntasS: " + e.toString());
            return false;
        }
    }
   
  
}
