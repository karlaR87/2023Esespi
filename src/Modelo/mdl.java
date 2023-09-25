
package Modelo;

import VIsta.Programa.Inicio.Inicio;
import VIsta.Programa.Inventario.Inventario_Inicio;
import VIsta.Programa.Reportes.VistaReportePatrullajeConParametos;
import VIsta.Programa.Reportes.VistaReportePolPat;
import VIsta.Programa.Reportes.VistaReportrTransporteConParametros;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class mdl {
    
 
//Mostrar datos en la tabla de los reportes de los patrullajes
    public void mostrar(VistaReportePatrullajeConParametos vis){

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdPatrullaje", "Fecha_Hora_Inicio", "Fecha_Hora_Fin"});


        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select IdPatrullaje, Fecha_Hora_Inicio, Fecha_Hora_Fin from tbPatrullajes";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdPatrullaje"),rs.getString("Fecha_Hora_Inicio"), rs.getString("Fecha_Hora_Fin")});

            }

            

            vis.tbMostrarD.setModel(modelo);



          

        }catch(SQLException ex){

              JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    //Mostrar datos de los transportes para los reportes
    //Método para mostrar datos en una tabla
 

     public void mostrarRporte(VistaReportrTransporteConParametros rrr){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdDetalleTransporteEstacion","DetalleTransporte", "Placa", "TipoTransporte", 
            "Marca", "Patrullaje", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT        dbo.tbDetallesTransportesEstacion.IdDetalleTransporteEstacion, dbo.tbDetallesTransportesEstacion.DetalleTransporte, dbo.tbDetallesTransportesEstacion.Placa, dbo.tbTipoTransportesEstacion.TipoTransporte, \n" +
"                         dbo.tbMarcasDeVehiculos.Marca, patr.IdPatrullaje as Patrullaje, dbo.tbGrupoPatrullajes.NumeroDeGrupo\n" +
"FROM            dbo.tbDetallesTransportesEstacion INNER JOIN\n" +
"                         dbo.tbTipoTransportesEstacion ON dbo.tbDetallesTransportesEstacion.IdTipoTransporteEstacion = dbo.tbTipoTransportesEstacion.IdTipoTransporteEstacion INNER JOIN\n" +
"                         dbo.tbMarcasDeVehiculos ON dbo.tbDetallesTransportesEstacion.IdMarcaDeVehiculo = dbo.tbMarcasDeVehiculos.IdMarcaDeVehiculo INNER JOIN\n" +
"                         dbo.tbGrupoPatrullajes ON dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje = dbo.tbGrupoPatrullajes.IdGrupoPatrullaje INNER JOIN  dbo.tbPatrullajes patr ON patr.IdPatrullaje = dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),
                    rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("Patrullaje"), 
                    rs.getString("NumeroDeGrupo")});

            }

            

            rrr.tbMostrarData.setModel(modelo);



          

        }catch(SQLException ex){

              JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    //mostrar en el inicio de Inventario
    public void mostrar(Inventario_Inicio rrr){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdDetalleTransporteEstacion","DetalleTransporte", "Placa", "TipoTransporte", 
            "Marca", "Patrullaje", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT        dbo.tbDetallesTransportesEstacion.IdDetalleTransporteEstacion, dbo.tbDetallesTransportesEstacion.DetalleTransporte, dbo.tbDetallesTransportesEstacion.Placa, dbo.tbTipoTransportesEstacion.TipoTransporte, \n" +
"                         dbo.tbMarcasDeVehiculos.Marca, patr.IdPatrullaje as Patrullaje, dbo.tbGrupoPatrullajes.NumeroDeGrupo\n" +
"FROM            dbo.tbDetallesTransportesEstacion INNER JOIN\n" +
"                         dbo.tbTipoTransportesEstacion ON dbo.tbDetallesTransportesEstacion.IdTipoTransporteEstacion = dbo.tbTipoTransportesEstacion.IdTipoTransporteEstacion INNER JOIN\n" +
"                         dbo.tbMarcasDeVehiculos ON dbo.tbDetallesTransportesEstacion.IdMarcaDeVehiculo = dbo.tbMarcasDeVehiculos.IdMarcaDeVehiculo INNER JOIN\n" +
"                         dbo.tbGrupoPatrullajes ON dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje = dbo.tbGrupoPatrullajes.IdGrupoPatrullaje INNER JOIN  dbo.tbPatrullajes patr ON patr.IdPatrullaje = dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),
                    rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("Patrullaje"), 
                    rs.getString("NumeroDeGrupo")});

            }

            

            rrr.tbMostrarDatosTransporte.setModel(modelo);



          

        }catch(SQLException ex){

              JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    public void mostrarRe(VistaReportePolPat rrr1){

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdPolicia","ONI", "NumeroPlaca", "Rango", 
             "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select tbp.IdPolicia, tbp.ONI, tbp.NumeroPlaca, rp.Rango,\n" +
"gp.NumeroDeGrupo\n" +
"from tbPolicias tbP\n" +
"INNER JOIN tbRangosTipoUsuarios rp on rp.IdRangoTipoUsuario = tbp.IdRangoTipoUsuario\n" +
"INNER JOIN tbUsuarios nu on nu.IdUsuario = tbp.IdUsuario\n" +
"INNER JOIN tbNivelesUsuario nivu on nivu.IdNivelUsuario = nu.IdNivelUsuario\n" +
"INNER JOIN tbTiposPersonas_Personas tpp on tpp.IdTipoPersonas_Personas = tbp.IdTipoPersonas_Personas\n" +
"INNER JOIN TipoPersona tppr on tppr.IdTipoPersona = tpp.IdTipoPersona\n" +
"INNER JOIN tbPersonas tP on tP.IdPersona = tpp.IdPersona\n" +
"INNER JOIN tbGrupoPatrullajes gp on gp.IdGrupoPatrullaje = tbP.IdGrupoPatrullaje\n" +
"inner join tbPatrullajes pat on pat.IdGrupoPatrullaje = gp.IdGrupoPatrullaje  ";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdPolicia"),rs.getString("ONI"),
                    rs.getString("NumeroPlaca"), rs.getString("Rango"), rs.getString("NumeroDeGrupo")});

            }

            

            rrr1.tbMostrarData.setModel(modelo);



          

        }catch(SQLException ex){

             JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    
    
}
