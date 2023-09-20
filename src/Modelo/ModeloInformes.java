
package Modelo;

import VIsta.Programa.Reportes.Reportes_Inicio;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloInformes {
    
    //de momento, solamente se hará un select a la tabla informe
    
    public void mostrar(Reportes_Inicio vistaR){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdInforme","IdPatrullaje", "Resultados"});



        try{

            Statement statement = (Statement) conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tbInformes";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdInforme"),rs.getString("IdPatrullaje"),rs.getString("Resultados")});

            }

            

            vistaR.tbMostrarDatos.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    public void mostrar1(Reportes_Inicio vistaR){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdInforme","IdPatrullaje", "Resultados"});



        try{

            Statement statement = (Statement) conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tbInformes "
                    + "where IdInforme like '%" + vistaR.txtBusquedaInforme.getText()+"%' or "
                    + "IdPatrullaje like '%" + vistaR.txtBusquedaInforme.getText()+"%' or "
                    + "Resultados like '%" + vistaR.txtBusquedaInforme.getText()+"%';";

            ResultSet rs = statement.executeQuery(query);


            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdInforme"),rs.getString("IdPatrullaje"),rs.getString("Resultados")});

            }
            
            vistaR.tbMostrarDatos.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
}
