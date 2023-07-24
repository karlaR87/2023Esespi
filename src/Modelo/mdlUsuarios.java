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
}
