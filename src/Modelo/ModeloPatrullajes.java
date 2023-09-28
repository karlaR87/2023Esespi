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
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ModeloPatrullajes {
    
     //Parametros
    private int IdPatrullaje;
    private String ExtensionKM;
    private byte[] FotoByte;
//     = convertImageIconToBytes(mapIcon);
    private double Longitud;
    private double Latitud;
    private String TipoPatrullaje;
    private Date FechaInicio;
    private Date FechaFin;
    
    private String ActividadPatrullaje;
    private String MedioAsignacion;

    private int IdPoli1;
    private int IdPoli2;
    private int IdPoli3;
    
    private int IdDetalleArmamento;
    private int CantidadAsignadaArmamento;
            
    private int IdDetalleEquipo;
    private int CantidadAsignadaEquipamiento;      
    
    //getters y setters

    public int getIdDetalleEquipo() {
        return IdDetalleEquipo;
    }

    public void setIdDetalleEquipo(int IdDetalleEquipo) {
        this.IdDetalleEquipo = IdDetalleEquipo;
    }

    public int getCantidadAsignadaEquipamiento() {
        return CantidadAsignadaEquipamiento;
    }

    public void setCantidadAsignadaEquipamiento(int CantidadAsignadaEquipamiento) {
        this.CantidadAsignadaEquipamiento = CantidadAsignadaEquipamiento;
    }

    
    
    public int getIdDetalleArmamento() {
        return IdDetalleArmamento;
    }

    public void setIdDetalleArmamento(int IdDetalleArmamento) {
        this.IdDetalleArmamento = IdDetalleArmamento;
    }

    public int getCantidadAsignadaArmamento() {
        return CantidadAsignadaArmamento;
    }

    public void setCantidadAsignadaArmamento(int CantidadAsignadaArmamento) {
        this.CantidadAsignadaArmamento = CantidadAsignadaArmamento;
    }
    
    

    public int getIdPoli1() {
        return IdPoli1;
    }

    public void setIdPoli1(int IdPoli1) {
        this.IdPoli1 = IdPoli1;
    }

    public int getIdPoli2() {
        return IdPoli2;
    }

    public void setIdPoli2(int IdPol21) {
        this.IdPoli2 = IdPol21;
    }

    public int getIdPoli3() {
        return IdPoli3;
    }

    public void setIdPoli3(int IdPoli3) {
        this.IdPoli3 = IdPoli3;
    }
    
    
    
    public String getActividadPatrullaje() {    
        return ActividadPatrullaje;
    }

    public void setActividadPatrullaje(String ActividadPatrullaje) {
        this.ActividadPatrullaje = ActividadPatrullaje;
    }

    public String getMedioAsignacion() {
        return MedioAsignacion;
    }
    
    public void setMedioAsignacion(String MedioAsignacion) {
        this.MedioAsignacion = MedioAsignacion;
    }

    public String getExtensionKM() {
        return ExtensionKM;
    }

    public void setExtensionKM(String ExtensionKM) {
        this.ExtensionKM = ExtensionKM;
    }

    public byte[] getFotoByte() {
        return FotoByte;
    }

    public void setFotoByte(byte[] FotoByte) {
        this.FotoByte = FotoByte;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public String getTipoPatrullaje() {
        return TipoPatrullaje;
    }

    public void setTipoPatrullaje(String TipoPatrullaje) {
        this.TipoPatrullaje = TipoPatrullaje;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    
    public int getPatrullajes() {
        return IdPatrullaje;
    }

    public void setPatrullajes(int IdPatrullaje) {
        this.IdPatrullaje = IdPatrullaje;
    }

    //-----------------------------------------------PRIMER INSERT DE PATRULLAJES
     public boolean InsertarPatrullaje()
    {//NIVEL DE USUARIO 4 = POLI $$ 2 = JEFE DE POLI
       try{
            String query = "EXEC dbo.InsertarPatrullaje\n" +
            "@ExtensionKM = ?,\n" +
            "@FotoMAPA = ?,\n" +
            "@Longitud = ?,\n" +
            "@Latitud = ?,\n" +
            "@TipoPatrullaje = ?,\n" +
            "@FechaInicio = ?,\n" +
            "@FechaFin = ?"; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, ExtensionKM);
            insertPolice.setBytes(2, FotoByte);
            insertPolice.setDouble(3, Longitud);
            insertPolice.setDouble(4, Latitud);
            insertPolice.setString(5, TipoPatrullaje);
            insertPolice.setDate(6, (java.sql.Date) FechaInicio);
            insertPolice.setDate(7, (java.sql.Date) FechaFin);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
     
     //-----------------------------------------------SEGUNDO INSERT DE PATRULLAJES
     public boolean InsertarActividadesPatrullaje()
    {
       try{
            String query = "EXEC dbo.InsertarActPatrullaje\n" +
            "	@ActividadPatrullaje = ?,\n" +
            "	@MedioAsignacion = ? "; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, ActividadPatrullaje);
            insertPolice.setString(2, MedioAsignacion);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
     //-----------------------------------------------TERCER INSERT DE PATRULLAJES
     public boolean ActualizarPoliciasPatrullaje()
    {
       try{
            String query = "EXEC dbo.ActualizarIdPolicias\n" +
            "	@IdPolicia1 = ?,\n" +
            "	@IdPolicia2 = ?,\n" +
            "	@IdPolicia3 = ?"; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setInt(1, IdPoli1);
            insertPolice.setInt(2, IdPoli2);
            insertPolice.setInt(2, IdPoli3);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
     //-----------------------------------------------CUARTO INSERT DE PATRULLAJES
     public boolean InsertarArmasPatrullaje()
    {
       try{
            String query = "EXECUTE dbo.InsertarArmasPatrullaje\n" +
            "	@CantidadAsignada = ?,\n" +
            "	@IdDetalleArmamentoEstacion = ?"; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setInt(1, CantidadAsignadaArmamento);
            insertPolice.setInt(2, IdDetalleArmamento);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
     
     //-----------------------------------------------QUINTO INSERT DE PATRULLAJES
     public boolean InsertarEquipoPatrullaje()
    {
       try{
            String query = "EXEC dbo.InsertarEquipoPatrullaje\n" +
            "	@CantidadAsignada = ?,\n" +
            "	@IdDetalleEquipo = ?"; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setInt(1, CantidadAsignadaEquipamiento);
            insertPolice.setInt(2, IdDetalleEquipo);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
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
