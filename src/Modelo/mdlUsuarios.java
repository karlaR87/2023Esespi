package Modelo;

import java.sql.*;

public class mdlUsuarios {
    private int IdUsuario;
    private String Usuario;
    private String Contrasena;
    private int IdNivelUsuario;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public int getIdNivelUsuario() {
        return IdNivelUsuario;
    }

    public void setIdNivelUsuario(int IdNivelUsuario) {
        this.IdNivelUsuario = IdNivelUsuario;
    }
    
     public int readIDULTIMATEUsuario()
    {
        try {
        String query = "SELECT MAX(IdUsuario) as IdUsuario FROM tbUsuarios";
        PreparedStatement readIDUsuario = conexionSql.getConexion().prepareStatement(query);
        ResultSet rs = readIDUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {
                // No se encontró ningún usuario con el nombre proporcionado
                return -1; // O cualquier otro valor que desees usar para indicar que no se encontró el usuario.
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuarioB: " + e.toString());
            return -1; // O cualquier otro valor que desees usar para indicar un error.

        }
    }
    
    public boolean insertUsuario()
    {
           try{
            String query = "INSERT INTO tbUsuarios(Usuario, Contraseña, IdNivelUsuario) VALUES (?,?,?)"; 
            PreparedStatement insertUser = conexionSql.getConexion().prepareStatement(query);
            insertUser.setString(1, Usuario);
            insertUser.setString(2, Contrasena);
            insertUser.setInt(3, IdNivelUsuario);
            
            insertUser.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query InsertUsuarioA: " + e.toString());
            return false;
        }
    }
    
    public int readIDUsuario()
    {
        try {
        String query = "SELECT IdUsuario FROM tbUsuarios WHERE Usuario = ?";
        PreparedStatement readIDUsuario = conexionSql.getConexion().prepareStatement(query);
        readIDUsuario.setString(1, Usuario);
        ResultSet rs = readIDUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {
                // No se encontró ningún usuario con el nombre proporcionado
                return -1; 
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuarioC: " + e.toString());
            return -1; // O cualquier otro valor que desees usar para indicar un error.

        }
    }
    
    public int readIdTipoUsuario()
    {
        
         try {
            String query = "SELECT IdNivelUsuario FROM tbUsuarios WHERE Usuario = ?";
            PreparedStatement readIdTipoUsuario = conexionSql.getConexion().prepareStatement(query);
            readIdTipoUsuario.setString(1, Usuario);
            ResultSet rs = readIdTipoUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdNivelUsuario");
            } else {
                // No se encontró ningún usuario con el nombre proporcionado
                return -1; 
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuarioC: " + e.toString());
            return -1; // O cualquier otro valor que desees usar para indicar un error.

        }
    }
    
    public String readConUsuario()
    {
      try {
        String query = "SELECT Contraseña FROM tbUsuarios WHERE IdUsuario = ?";
        PreparedStatement readConsuario = conexionSql.getConexion().prepareStatement(query);
        readConsuario.setInt(1, IdUsuario);
        ResultSet rs = readConsuario.executeQuery();

            if (rs.next()) {
                return rs.getString("Contraseña");
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return null;

        }  
    }
    
    public boolean updateConUsuario()
    {
        try{
            String query = "UPDATE tbUsuarios SET Contraseña = ? WHERE IdUsuario = ?"; 
            PreparedStatement updateCon = conexionSql.getConexion().prepareStatement(query);
            updateCon.setString(1, Contrasena);
            updateCon.setInt(2, IdUsuario);
            
            updateCon.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query UpdateConUsuario: " + e.toString());
            return false;
        }
    }
}
