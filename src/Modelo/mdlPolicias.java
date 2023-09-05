package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mdlPolicias {
    private int idUsuario;
    private int IdTipoPersonas_Personas;
    private String ONI;
    private String NumeroPlaca;
    private int IdRangoTipoUsuario;
    private int IdGrupoPatrullaje;
    private byte[] Foto;

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }
    
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
    
    
     public ResultSet readPoliceInfoWithJoins() {
        try {
           String query = "SELECT p.IdPolicia, p.IdUsuario, r.Rango, " +
                       "SUBSTRING(per.Nombre, 1, CHARINDEX(' ', per.Nombre + ' ') - 1) AS Nombre, " +
                       "SUBSTRING(per.Apellido, 1, CHARINDEX(' ', per.Apellido + ' ') - 1) AS Apellido, " +
                       "p.IdGrupoPatrullaje " +
                       "FROM tbPolicias p " +
                       "INNER JOIN tbRangosTipoUsuarios r ON p.IdRangoTipoUsuario = r.IdRangoTipoUsuario " +
                       "INNER JOIN tbTiposPersonas_Personas tp ON p.IdTipoPersonas_Personas = tp.IdPersona " +
                       "INNER JOIN tbPersonas per ON per.IdPersona = tp.IdPersona " +
                       "INNER JOIN tbUsuarios us ON us.IdUsuario = p.IdUsuario " +
                       "WHERE p.IdGrupoPatrullaje IS NULL AND us.IdNivelUsuario = 2 " +
                       "ORDER BY Nombre;";
             
            PreparedStatement readUserInfo = conexionSql.getConexion().prepareStatement(query);
            ResultSet rs = readUserInfo.executeQuery();
            return rs;
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    public boolean insertPolicia()
    {
           try{
            String query = "INSERT INTO tbPolicias(ONI, NumeroPlaca, IdUsuario, IdRangoTipoUsuario, IdTipoPersonas_Personas) VALUES (?,?,?,?,?)"; 
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, ONI);
            insertPolice.setString(2, NumeroPlaca);
            insertPolice.setInt(3, idUsuario);
            insertPolice.setInt(4, IdRangoTipoUsuario);
            insertPolice.setInt(5, IdTipoPersonas_Personas);
            
            insertPolice.executeUpdate();
            return true;
          
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
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
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;

        }
    } 
}
