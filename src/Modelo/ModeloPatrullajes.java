package Modelo;

import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import VIsta.Programa.Policias.Policias_Inicio;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
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

    //---------------------------------------------EQUIPO DE ESPECIALIZADO
    
    public ResultSet CharegeEquipoESPECIALIZADO_Visores()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 1 AND tbTipo.IdTiposEquipamientoEstacion = 9";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquipoESPECIALIZADO_Chalecos()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 1 AND tbTipo.IdTiposEquipamientoEstacion = 6";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquipoESPECIALIZADO_Geolocalizacion()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 1 AND tbTipo.IdTiposEquipamientoEstacion = 7";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquipoESPECIALIZADO_TacticoIntrv()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 1 AND tbTipo.IdTiposEquipamientoEstacion = 6";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    //---------------------------------------------EQUIPO DE SEGURIDAD
    
    public ResultSet CharegeEquiposSEGURIDAD_Bastones()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 2 AND tbTipo.IdTiposEquipamientoEstacion = 1";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquiposSEGURIDAD_Esposas()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 2 AND tbTipo.IdTiposEquipamientoEstacion = 2";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquiposSEGURIDAD_Taser()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 2 AND tbTipo.IdTiposEquipamientoEstacion = 3";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquiposSEGURIDAD_Radios()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 2 AND tbTipo.IdTiposEquipamientoEstacion = 4";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeEquiposSEGURIDAD_Escudos()
    {
        try{
            String query = "SELECT tbDeta.IdDetalleEquipo, tbDeta.Detalles, tbDeta.Cantidad FROM tdDetallesEquipo tbDeta\n" +
            "INNER JOIN tbTiposEquipamientoEstacion tbTipo ON tbDeta.IdTiposEquipamientoEstacion = tbTipo.IdTiposEquipamientoEstacion\n" +
            "INNER JOIN tbCategoriasEquipamiento tbCate ON tbCate.IdCategoriaEquipamiento = tbTipo.IdCategoriaEquipamiento\n" +
            "WHERE tbCate.IdCategoriaEquipamiento = 2 AND tbTipo.IdTiposEquipamientoEstacion = 5";
            PreparedStatement chargeEQUIMPENT = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargeEQUIMPENT.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    
    public ResultSet CharegeArmasCORTAS()
    {
        try{
            String query = "SELECT IdDetalleArmamentoEstacion, DetalleArmamento, Cantidad FROM tbDetallesArmamentosEstacion \n" +
            "WHERE IdTipoArmamentoEstacion = 1";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet CharegeArmasLARGAS()
    {
        try{
            String query = "SELECT IdDetalleArmamentoEstacion, DetalleArmamento, Cantidad FROM tbDetallesArmamentosEstacion \n" +
            "WHERE IdTipoArmamentoEstacion = 2";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    //LLENAR COMBOBOX Tipo Patrullaje
    public void llenarComboTipoPatrullaje(JComboBox<String> cmb) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

        String SSQL = "SELECT IdTipoPatrullaje, TipoPatrullajes FROM tbTiposPatrullajes";
        cmb.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

            while (result.next()) {
                int id = result.getInt("IdTipoPatrullaje");
                String Medio = result.getString("TipoPatrullajes");
                cmb.addItem(Medio);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            // Cerrar recursos
            if (result != null) {
                result.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conectar != null) {
                conectar.close();
            }
        }
    }
    
    //LLENAR COMBOBOX Medio asignacion
    public void llenarCombo(JComboBox<String> cmb) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

        String SSQL = "SELECT IdMediosAsignacionAct, Medio FROM tbMediosAsignacionAct";
        cmb.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

            while (result.next()) {
                int id = result.getInt("IdMediosAsignacionAct");
                String Medio = result.getString("Medio");
                cmb.addItem(Medio);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            // Cerrar recursos
            if (result != null) {
                result.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conectar != null) {
                conectar.close();
            }
        }
    }
    
    public ResultSet ChargePoliciaSELECTED(int IdPolicia)
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
"WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 AND tbPoli.IdPolicia = ? ";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            chargePolice.setInt(1, IdPolicia);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

           
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public ResultSet ChargeInfoPolicialAptaParaPatrullajeWHITOUTLIKE()
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
"WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 ORDER BY tbPer.Nombre ";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            
            ResultSet rs = chargePolice.executeQuery();
            
            return rs;

           
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
    
     public ResultSet ChargeInfoPolicialAptaParaPatrullaje(String Letter)
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
"WHERE tbEP.Estado != 1 AND us.IdNivelUsuario = 4 AND tbPer.Nombre LIKE ?";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            chargePolice.setString(1, Letter);
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
      
        modelo.setColumnIdentifiers(new Object []{"IDP", "Longitud", "Latitud", "ExtensionKM", "Fecha De Inicio", 
            "Fecha De Fin", "NGrupo"});

        try{

            java.sql.Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbPatru.IdPatrullaje AS IDP, tbPatru.Longitud, tbPatru.Latitud, tbPatru.ExtensionKM, Fecha_Hora_Inicio, \n" +
            "Fecha_Hora_Fin, tbGPatru.NumeroDeGrupo\n" +
            "FROM tbPatrullajes tbPatru \n" +
            "INNER JOIN tbGrupoPatrullajes tbGPatru ON tbGPatru.IdGrupoPatrullaje = tbPatru.IdGrupoPatrullaje\n" +
            "INNER JOIN tbMunicipios tbMuni ON tbMuni.IdMunicipio = tbPatru.IdMunicipio \n" +
            "WHERE tbPatru.Fecha_Hora_Fin> GETDATE();";
            
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                modelo.addRow(new Object[] {rs.getString("IDP"),rs.getString("Longitud"), rs.getString("Latitud"),
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
            cellRenderer.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 14)); // Aplica el estilo de fuente personalizado)); // Fuente de tamaÃ±o 16 para las filas de datos
            vsPatrullajes.tbDatosPatrullajes.setDefaultRenderer(Object.class, cellRenderer);

            // Ajustar el ancho de las columnas
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(0).setPreferredWidth(10); // Cambia el ancho de la primera columna 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(1).setPreferredWidth(45);
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(2).setPreferredWidth(45); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(3).setPreferredWidth(60); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(4).setPreferredWidth(118); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(5).setPreferredWidth(118); 
            vsPatrullajes.tbDatosPatrullajes.getColumnModel().getColumn(6).setPreferredWidth(20); 
            //vstPolicias.tbDatosPolicias.getColumnModel().getColumn(8).setPreferredWidth(10); 
        
        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
}
