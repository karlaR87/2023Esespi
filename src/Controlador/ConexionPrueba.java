package Controlador;
import java.sql.*;

public class ConexionPrueba {
    //Metodo de conexion
    public static Connection getConnection(){
    
    //Cadena de conexion
        String conexionURL = "jdbc:sqlserver://localhost:50214;" +
            "databaseName=ESESPI_Expo1;" +
            "user=sa;" +
            "password=itr2023;" +
            "encrypt=true;trustServerCertificate=true";
        
    //Devuelve la conexion
    try{
        Connection conn = DriverManager.getConnection(conexionURL);
        return conn;
    }
    catch(SQLException ex){
        System.out.println("ERROR En la conexion: " + ex.toString());
        return null;
    }   
    }   
}
