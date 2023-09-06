
package Modelo;

import VIsta.VistaAgregarTransporte;
import VIsta.VistaUsers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloVisualizarUsuarios {
    
     public void mostrar(VistaUsers IIT4){

        

        DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"IdPolicia","Usuario","Contraseña", "NivelUsuario", "IdTipoPersonas_Personas", "Nombre"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select Po.IdPolicia, us.Usuario, us.Contraseña, Nu.NivelUsuario, Tpp.IdTipoPersonas_Personas, CONCAT(Tp.Nombre, ' ', Tp.Apellido) AS Nombre from tbPolicias Po\n" +
"inner join tbUsuarios us on us.IdUsuario = Po.IdUsuario\n" +
"inner join tbNivelesUsuario Nu on Nu.IdNivelUsuario = us.IdNivelUsuario\n" +
"inner join tbTiposPersonas_Personas Tpp on Tpp.IdTipoPersonas_Personas = Po.IdTipoPersonas_Personas\n" +
"Inner join tbPersonas Tp on Tp.IdPersona = Tpp.IdPersona";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                System.out.println("ddddd");
                modelo.addRow(new Object[] {rs.getString("IdPolicia"),rs.getString("Usuario"),rs.getString("Contraseña"),rs.getString("NivelUsuario"),rs.getString("IdTipoPersonas_Personas")
                ,rs.getString("Nombre")});

            }

            

            IIT4.tbMostrarUsers.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
}
