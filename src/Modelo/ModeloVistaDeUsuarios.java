
package Modelo;

import VIsta.Login;
import VIsta.Programa.Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModeloVistaDeUsuarios {
    
  Login lg = new Login();
  

    
    public void MostrarDatoDUI(Usuario u)
   {
       Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
           String traer = lg.txtUsuario.getText().toString();
        System.out.println(traer);
        
        String SSQL = "select  ty.Dui from tbPolicias tb\n" +
"Inner join tbUsuarios tu on tu.IdUsuario = tb.IdUsuario\n" +
"inner join [tbTiposPersonas_Personas] tr on tr.IdTipoPersonas_Personas = tb.IdTipoPersonas_Personas\n" +
"inner join tbPersonas ty on ty.IdPersona = tr.IdPersona\n"
                + "where Usuario = '" + traer + "';";
        
        System.out.println(SSQL);
       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                 int count = result.getInt(1); // Obtener el valor del contador
                
                u.lblDui.setText("DUI: " + count);
                
            }
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
   }
}
