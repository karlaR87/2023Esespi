package Modelo;


import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloPatrullajes {
     //Parametros
    private int idPatrullaje;

    
    //getters y setters
    public int getPatrullajes() {
        return idPatrullaje;
    }

    public void setPatrullajes(int IdPatrullaje) {
        this.idPatrullaje = IdPatrullaje;
    }
    
    //Metodo leer
       public void mostrar(Patrullajes_Inicio vstPatrullajes){

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"id","nombre", "cantidad", "cura"});

        try{

            java.sql.Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tbMedicinas";

            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("id"),rs.getString("nombre"),rs.getString("cantidad"), rs.getString("cura")});

            }

//            vstPatrullajes.JTMedicinas.setModel(modelo);
 

        }catch(SQLException ex){

              JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
}
