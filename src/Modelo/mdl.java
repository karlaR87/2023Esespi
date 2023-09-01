
package Modelo;

import VIsta.Programa.Reportes.VistaReportePatrullaje;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


public class mdl {
    //modelo a utilizar para visualizar las tablas de los reportes
    
    //Método para mostrar datos en una tabla
 

    public void mostrar(VistaReportePatrullaje vis){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdInforme","IdPatrullaje", "Fecha_Hora_Inicio", "Fecha_Hora_Fin", "Lugar_Acercamiento", "Hora_Acercamiento", "Nombre_Acercamiento"
        , "Acercamiento", "Lugar_Detenido", "Fecha_Detenido", "NombreInfractor", "Detalles", "Lugar_Denuncia", "Hora_Denuncia", "Nombre_Denunciante"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbInfor.IdInforme, \n" +
"tbPatru.IdPatrullaje, tbPatru.Fecha_Hora_Inicio, tbPatru.Fecha_Hora_Fin,\n" +
"tbAcerc.Lugar AS Lugar_Acercamiento, tbAcerc.Horas AS Hora_Acercamiento, tbAcerc.NombrePersona AS Nombre_Acercamiento, tbAcerc.Acercamiento,\n" +
"tbDete.Lugar AS Lugar_Detenido, tbDete.Fecha AS Fecha_Detenido,\n" +
"tbInfract.NombreInfractor,\n" +
"tbDec.Detalles,\n" +
"tbDenun.Lugar AS Lugar_Denuncia, tbDenun.Horas AS Hora_Denuncia,\n" +
"tbPer.Nombre AS Nombre_Denunciante\n" +
"FROM tbInformes tbInfor\n" +
"INNER JOIN tbPatrullajes tbPatru ON tbInfor.idPatrullaje = tbPatru.idPatrullaje\n" +
"INNER JOIN tbAcercamientos tbAcerc ON tbInfor.IdInforme = tbAcerc.IdInforme\n" +
"INNER JOIN tbDetenidos tbDete ON tbInfor.IdInforme = tbDete.IdInforme\n" +
"INNER JOIN tbInfractores tbInfract ON tbInfract.IdInfractor = tbDete.IdInfractor\n" +
"INNER JOIN tbInfractorDecomisos tbInfracDeco ON tbInfracDeco.IdDetenido = tbDete.IdDetenido\n" +
"INNER JOIN tbDecomisos tbDec ON tbDec.IdDecomiso = tbInfracDeco.IdDecomiso\n" +
"INNER JOIN tbDenuncias tbDenun ON tbDenun.IdInforme = tbInfor.IdInforme\n" +
"INNER JOIN tbTiposPersonas_Personas tbTipoP ON tbTipoP.IdTipoPersonas_Personas = tbDenun.IdTipoPersonas_Personas\n" +
"INNER JOIN tbPersonas tbPer ON tbPer.IdPersona = tbTipoP.IdPersona";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdInforme"),rs.getString("IdPatrullaje"),rs.getString("Fecha_Hora_Inicio"), rs.getString("Fecha_Hora_Fin"), rs.getString("Lugar_Acercamiento"), rs.getString("Hora_Acercamiento"), rs.getString("Nombre_Acercamiento"), rs.getString("Acercamiento")
                , rs.getString("Lugar_Detenido"), rs.getString("Fecha_Detenido"), rs.getString("NombreInfractor"), rs.getString("Detalles"), rs.getString("Lugar_Denuncia"), rs.getString("Hora_Denuncia"), rs.getString("Nombre_Denunciante")});

            }

            

            vis.tbDatos.setModel(modelo);



          

        }catch(SQLException ex){

            System.out.println(ex.toString());

        }

    }
}
