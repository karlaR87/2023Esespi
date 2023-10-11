package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionSql {
    //Metodo de conexion
//       public static Connection getConexion() {
//        // Datos de conexión
//        String endpoint = "database-1.cqdnfs7kilaa.us-east-1.rds.amazonaws.com";
//        String databaseName = "Esespi";
//        String username = "admin";
//        String password = "#Dbnlemus2006";
//
//        // Cadena de conexión
//        String connectionUrl = "jdbc:sqlserver://" + endpoint + ":1433;"
//                + "database=" + databaseName + ";"
//                + "user=" + username + ";"
//                + "password=" + password + ";"
//                + "encrypt=true;"
//                + "trustServerCertificate=true;";
//
//        // Retornamos la conexión
//        try {
//            // Cargamos el controlador JDBC de SQL Server
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            
//            // Creamos una variable de tipo Connection, al que le pasamos nuestra cadena de conexión
//            Connection conn = DriverManager.getConnection(connectionUrl);
//            
//            // Si funciona, retornamos la conexión
//            return conn;
//        } catch (ClassNotFoundException | SQLException ex) {
//            // Si no funciona, imprimimos en consola el error y retornamos un valor nulo
//            return null;
//        }
//    }
//
//    public static Connection getconnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Statement createStatement() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//    //CLASE PARA LA BASE LOCAL 
//     //Creación del metodo de conexión que retorna la conexión
    public static Connection getConexion(){
        
         //Cadena de conexión
        String conexionUrl  = "jdbc:sqlserver://localhost:1433;" // <- Editar por su puerto de SQL
                            + "databaseName=Esespi;" // <- Editar por su base de datos
                            + "user=sa;"
                            + "password=itr23;" 
                            + "encrypt=true;trustServerCertificate=true";
        
        //Retornamos la conexion
        try{
            //Creamos una variable de tipo Connection, al que le pasamos nuestra cadena de conexion
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            //SI funciona, retornamos la conexion
            return conn;
        }catch(SQLException ex){
            //Si no funciona, imprimimos en consola el error y retornamos un valor nulo
            System.out.println(ex.toString());
            return null;
        }
    } 
    
    

    
}
