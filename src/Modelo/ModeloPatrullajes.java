package Modelo;


import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import VIsta.Programa.Policias.Policias_Inicio;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
    
    public ResultSet ChargeInfoPolicialAptaParaPatrullaje()
    {
        try{
            String query = "SELECT tbPoli.IdPolicia, tbPoli.IdUsuario, tbRan.Rango,\n" +
            "SUBSTRING(tbPer.Nombre, 1, CHARINDEX(' ', tbPer.Nombre + ' ') - 1) AS Nombre, \n" +
            "SUBSTRING(tbPer.Apellido, 1, CHARINDEX(' ', tbPer.Apellido + ' ') - 1) AS Apellido\n" +
            "FROM tbPolicias tbPoli\n" +
            "INNER JOIN tbRangosTipoUsuarios tbRan ON tbRan.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
            "INNER JOIN tbTiposPersonas_Personas tp ON tbPoli.IdTipoPersonas_Personas = tp.IdTipoPersonas_Personas\n" +
            "INNER JOIN tbPersonas tbPer ON tbPer.IdPersona = tp.IdPersona \n" +
            "INNER JOIN tbUsuarios us ON us.IdUsuario = tbPoli.IdUsuario\n" +
            "INNER JOIN tbEstadoPolicia tbEP ON tbEP.IdPolicia = tbPoli.IdPolicia \n" +
            "WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 ORDER BY tbPer.Nombre";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

           
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
     public ResultSet ChargeInfoPolicialAptaParaPatrullajeAAA()
    {
        try{
            String query = "SELECT tbPoli.IdPolicia, tbPoli.IdUsuario, tbRan.Rango,\n" +
            "SUBSTRING(tbPer.Nombre, 1, CHARINDEX(' ', tbPer.Nombre + ' ') - 1) AS Nombre, \n" +
            "SUBSTRING(tbPer.Apellido, 1, CHARINDEX(' ', tbPer.Apellido + ' ') - 1) AS Apellido\n" +
            "FROM tbPolicias tbPoli\n" +
            "INNER JOIN tbRangosTipoUsuarios tbRan ON tbRan.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
            "INNER JOIN tbTiposPersonas_Personas tp ON tbPoli.IdTipoPersonas_Personas = tp.IdTipoPersonas_Personas\n" +
            "INNER JOIN tbPersonas tbPer ON tbPer.IdPersona = tp.IdPersona \n" +
            "INNER JOIN tbUsuarios us ON us.IdUsuario = tbPoli.IdUsuario\n" +
            "INNER JOIN tbEstadoPolicia tbEP ON tbEP.IdPolicia = tbPoli.IdPolicia \n" +
            "WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 AND tbPer.Nombre LIKE 'A%'";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
     
     public ResultSet ChargeInfoPolicialAptaParaPatrullajeBBB()
    {
        try{
            String query = "SELECT tbPoli.IdPolicia, tbPoli.IdUsuario, tbRan.Rango,\n" +
            "SUBSTRING(tbPer.Nombre, 1, CHARINDEX(' ', tbPer.Nombre + ' ') - 1) AS Nombre, \n" +
            "SUBSTRING(tbPer.Apellido, 1, CHARINDEX(' ', tbPer.Apellido + ' ') - 1) AS Apellido\n" +
            "FROM tbPolicias tbPoli\n" +
            "INNER JOIN tbRangosTipoUsuarios tbRan ON tbRan.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
            "INNER JOIN tbTiposPersonas_Personas tp ON tbPoli.IdTipoPersonas_Personas = tp.IdTipoPersonas_Personas\n" +
            "INNER JOIN tbPersonas tbPer ON tbPer.IdPersona = tp.IdPersona \n" +
            "INNER JOIN tbUsuarios us ON us.IdUsuario = tbPoli.IdUsuario\n" +
            "INNER JOIN tbEstadoPolicia tbEP ON tbEP.IdPolicia = tbPoli.IdPolicia \n" +
            "WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 AND tbPer.Nombre LIKE 'B%'";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    
    //------------------MOSTRAR datos de los PATRULLAJES-----------------
     public void MostrarTablePatrullajes(Patrullajes_Inicio vsPatrullajes){
         
        vsPatrullajes.IdPatrullaje = 0;
        Color clrOrang = new Color( 243, 167, 18);
        DefaultTableModel modelo = new DefaultTableModel();
      
        modelo.setColumnIdentifiers(new Object []{"IDP", "Locacion", "Longitud", "Latitud", "ExtensionKM", "Fecha De Inicio", 
            "Fecha De Fin", "NGrupo"});

        try{

            java.sql.Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbPatru.IdPatrullaje AS IDP,  tbMuni.Municipio AS Locacion, tbPatru.Longitud, tbPatru.Latitud, tbPatru.ExtensionKM, Fecha_Hora_Inicio, \n" +
            "Fecha_Hora_Fin, tbGPatru.NumeroDeGrupo\n" +
            "FROM tbPatrullajes tbPatru \n" +
            "INNER JOIN tbGrupoPatrullajes tbGPatru ON tbGPatru.IdGrupoPatrullaje = tbPatru.IdGrupoPatrullaje\n" +
            "INNER JOIN tbMunicipios tbMuni ON tbMuni.IdMunicipio = tbPatru.IdMunicipio";
            
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                modelo.addRow(new Object[] {rs.getString("IDP"),rs.getString("Locacion"),rs.getString("Longitud"), rs.getString("Latitud"),
                    rs.getString("ExtensionKM"), rs.getString("Fecha_Hora_Inicio"), rs.getString("Fecha_Hora_Fin"),rs.getString("NumeroDeGrupo")});//, rs.getString("NumeroDeGrupo")});

            }
            
            Fuentes tipoFuentes = new Fuentes();;
            
            vsPatrullajes.tbDatosPatrullajes.setModel(modelo);
            
            JTableHeader header = vsPatrullajes.tbDatosPatrullajes.getTableHeader();
            header.setBackground(clrOrang); // Cambia el color del encabezado

            // Ajustar el alto de las filas
            vsPatrullajes.tbDatosPatrullajes.setRowHeight(35); // Cambia el alto deseado para todas las filas
            header.setPreferredSize(new Dimension(header.getWidth(), 50)); // Cambia el alto del encabezado

            // Aplicar estilo de fuente personalizado al encabezado
            header.setFont( tipoFuentes.fuente(tipoFuentes.DMSans, 1, 16)); // Aplica el estilo de fuente personalizado

            // Cambiar el color del texto del encabezado (opcional)
            header.setForeground(Color.BLACK);

            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) vsPatrullajes.tbDatosPatrullajes.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto del encabezado

            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
            cellRenderer.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 14)); // Aplica el estilo de fuente personalizado)); // Fuente de tamaño 16 para las filas de datos
            vsPatrullajes.tbDatosPatrullajes.setDefaultRenderer(Object.class, cellRenderer);

            // Ajustar el ancho de las columnas
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(0).setPreferredWidth(10); // Cambia el ancho de la primera columna
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(1).setPreferredWidth(90); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(2).setPreferredWidth(45);
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(3).setPreferredWidth(45); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(4).setPreferredWidth(60); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(5).setPreferredWidth(118); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(6).setPreferredWidth(118); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(7).setPreferredWidth(20); 
            //vstPolicias.tbDatosPolicias.getColumnModel().getColumn(8).setPreferredWidth(10); 
        
        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
}
