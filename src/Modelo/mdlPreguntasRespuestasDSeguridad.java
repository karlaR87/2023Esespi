package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class mdlPreguntasRespuestasDSeguridad {
    private int IdPreguntaRespuestaSegura;
    private int IdUsuario;
    private String Pregunta;
    private String Respuesta;

    public int getIdPreguntaRespuestaSegura() {
        return IdPreguntaRespuestaSegura;
    }

    public void setIdPreguntaRespuestaSegura(int IdPreguntaRespuestaSegura) {
        this.IdPreguntaRespuestaSegura = IdPreguntaRespuestaSegura;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }
    
    
  public void insertPreguntasS()
    {
        try{
            String query = "Insert Into tbPreguntasRespuestasDSeguridad(IdUsuario, Pregunta, Respuesta) Values (?,?,?)"; 
            PreparedStatement addPreguntasS = conexionSql.getConexion().prepareStatement(query);
            addPreguntasS.setInt(1, IdUsuario);
            addPreguntasS.setString(2, Pregunta);
            addPreguntasS.setString(3, Respuesta);
            
            addPreguntasS.executeUpdate();
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
        }
    }

  public ResultSet readPreguntas()
    {
        try{
            String query = "Select Pregunta, Respuesta From tbPreguntasRespuestasDSeguridad Where IdUsuario = ?";    
            PreparedStatement readPreguntas = conexionSql.getConexion().prepareStatement(query);
            readPreguntas.setInt(1, IdUsuario);
            ResultSet rs = readPreguntas.executeQuery();
            return rs;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }

}
