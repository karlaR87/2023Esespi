package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSql {
    //Metodo de conexion
       public static Connection getConexion() {
        // Datos de conexión
        String endpoint = "expo2023.coadsqodqdsq.us-east-2.rds.amazonaws.com";
        String databaseName = "ESESPI_Expo1";
        String username = "expo";
        String password = "fbXJ7f0W";

        // Cadena de conexión
        String connectionUrl = "jdbc:sqlserver://" + endpoint + ":1433;"
                + "database=" + databaseName + ";"
                + "user=" + username + ";"
                + "password=" + password + ";"
                + "encrypt=true;"
                + "trustServerCertificate=true;";

        // Retornamos la conexión
        try {
            // Cargamos el controlador JDBC de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Creamos una variable de tipo Connection, al que le pasamos nuestra cadena de conexión
            Connection conn = DriverManager.getConnection(connectionUrl);
            
            // Si funciona, retornamos la conexión
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            // Si no funciona, imprimimos en consola el error y retornamos un valor nulo
            return null;
        }
    }

    public static Connection getconnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
