
package Controlador;
import java.sql.Connection;

public class ControllerConnection {
    public static Connection getControllerConnection(){
    return Modelo.conexionSql.getconnection();
}
}
