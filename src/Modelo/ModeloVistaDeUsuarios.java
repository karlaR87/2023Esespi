
package Modelo;

import Controlador.cntrlLogin;
import VIsta.Login;
import VIsta.Programa.Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModeloVistaDeUsuarios {

    
   /* public void MostrarDatoDUI(Login u)
   {
       Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
         String dato = u.usu;
        
        String SSQL = "select  ty.Dui from tbPolicias tb\n" +
"Inner join tbUsuarios tu on tu.IdUsuario = tb.IdUsuario\n" +
"inner join [tbTiposPersonas_Personas] tr on tr.IdTipoPersonas_Personas = tb.IdTipoPersonas_Personas\n" +
"inner join tbPersonas ty on ty.IdPersona = tr.IdPersona\n"
                + "where Usuario = '" + dato + "';";
        
        System.out.println(SSQL);
       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                 
                
               
                
            }
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
   }*/
}
