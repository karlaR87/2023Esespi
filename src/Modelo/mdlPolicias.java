package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mdlPolicias {
    private int idUsuario;
    private int IdTipoPersonas_Personas;
    private String ONI;
    private String NumeroPlaca;
    private int IdRangoTipoUsuario;
    private int IdGrupoPatrullaje;

    public int getIdGrupoPatrullaje() {
        return IdGrupoPatrullaje;
    }

    public void setIdGrupoPatrullaje(int IdGrupoPatrullaje) {
        this.IdGrupoPatrullaje = IdGrupoPatrullaje;
    }

    public int getIdRangoTipoUsuario() {
        return IdRangoTipoUsuario;
    }

    public void setIdRangoTipoUsuario(int IdRangoTipoUsuario) {
        this.IdRangoTipoUsuario = IdRangoTipoUsuario;
    }

    public String getONI() {
        return ONI;
    }

    public void setONI(String ONI) {
        this.ONI = ONI;
    }

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoPersonas_Personas() {
        return IdTipoPersonas_Personas;
    }

    public void setIdTipoPersonas_Personas(int idPersona) {
        this.IdTipoPersonas_Personas = idPersona;
    }
    
    public boolean insertPolicia()
    {
           try{
            String query = "INSERT INTO tbPolicias(ONI, NumeroPlaca, IdUsuario, IdRangoTipoUsuario, IdTipoPersonas_Personas, IdGrupoPatrullaje) VALUES (?,?,?,?,?,?)"; 
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, ONI);
            insertPolice.setString(2, NumeroPlaca);
            insertPolice.setInt(3, idUsuario);
            insertPolice.setInt(4, IdRangoTipoUsuario);
            insertPolice.setInt(5, IdTipoPersonas_Personas);
            insertPolice.setInt(6, IdGrupoPatrullaje);
            
            
            insertPolice.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query InsertUsuario: " + e.toString());
            return false;
        }
    }
    
    public int readIDUsuario()
    {
        try{   
            String query = "SELECT IdUsuario FROM tbPolicias WHERE IdTipoPersonas_Personas = ?";    
            PreparedStatement readIdUsuario = conexionSql.getConexion().prepareStatement(query);
            readIdUsuario.setInt(1, IdTipoPersonas_Personas);
            
             ResultSet rs = readIdUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuarioA: " + e.toString());
            return -1;

        }
    } 
}
