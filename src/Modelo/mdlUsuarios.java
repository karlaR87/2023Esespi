package Modelo;

import Controlador.ConexionPrueba;
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
    
    
    public boolean insertUsuario()
    {
           try{
            String query = "INSERT INTO tbUsuarios(Usuario, Contraseña, IdNivelUsuario) VALUES (?,?,?)"; 
            PreparedStatement insertUser = ConexionPrueba.getConnection().prepareStatement(query);
            insertUser.setString(1, Usuario);
            insertUser.setString(2, Contrasena);
            insertUser.setInt(3, IdNivelUsuario);
            
            insertUser.executeUpdate();
            return true;
          
        }catch(Exception e){
            System.out.println("ERROR en el query InsertUsuario: " + e.toString());
            return false;
        }
    }
    
    public int readIDUsuario()
    {
        try {
        String query = "SELECT IdUsuario FROM tbUsuarios WHERE Usuario = ?";
        PreparedStatement readIDUsuario = ConexionPrueba.getConnection().prepareStatement(query);
        readIDUsuario.setString(1, Usuario);
        ResultSet rs = readIDUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {
                // No se encontró ningún usuario con el nombre proporcionado
                return -1; // O cualquier otro valor que desees usar para indicar que no se encontró el usuario.
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return -1; // O cualquier otro valor que desees usar para indicar un error.

        }
    }
    
    public String readConUsuario()
    {
      try {
        String query = "SELECT Contraseña FROM tbUsuarios WHERE IdUsuario = 1";
        PreparedStatement readConsuario = ConexionPrueba.getConnection().prepareStatement(query);
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
            PreparedStatement updateCon = ConexionPrueba.getConnection().prepareStatement(query);
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
