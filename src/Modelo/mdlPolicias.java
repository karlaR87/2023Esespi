package Modelo;

import VIsta.Programa.Policias.Policias_Inicio;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class mdlPolicias {
    private int idUsuario;
    private int IdTipoPersonas_Personas;
    private String ONI;
    private String NumeroPlaca;
    private int IdRangoTipoUsuario;
    private int IdGrupoPatrullaje;
    private byte[] Foto;

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }
    
    public int getIdGrupoPatrullaje() {
        return IdGrupoPatrullaje;
    }

    public void setIdGrupoPatrullaje(int IdGrupoPatrullaje) {
        this.IdGrupoPatrullaje = IdGrupoPatrullaje;
    }

    public int getIdRangoTipoUsuario() {
        return IdRangoTipoUsuario;
    }

    public void setIdRangoTipoUsuario(int IdRangoTipoUsuario) {
        this.IdRangoTipoUsuario = IdRangoTipoUsuario;
    }

    public String getONI() {
        return ONI;
    }

    public void setONI(String ONI) {
        this.ONI = ONI;
    }

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoPersonas_Personas() {
        return IdTipoPersonas_Personas;
    }

    public void setIdTipoPersonas_Personas(int idPersona) {
        this.IdTipoPersonas_Personas = idPersona;
    }
    
     public int readDUIIfExistDUI()
    {
        try{   
            String query = "SELECT DUI FROM tbPersonas WHERE DUI = ?";    
            PreparedStatement readDUIIfExistDUI = conexionSql.getConexion().prepareStatement(query);
            
             ResultSet rs = readDUIIfExistDUI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("DUI");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }
      //Mostrar datos en las tablas
    public void MostrarTablePolicias(Policias_Inicio vstPolicias){
        Color clrOrang = new Color( 243, 167, 18);
        DefaultTableModel modelo = new DefaultTableModel();
      
        modelo.setColumnIdentifiers(new Object []{"ID","Apellidos", "Género","DUI", "Número", "Rango", 
            "ONI", "Placa", "Grupo"});

        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbPoli.IdPolicia AS IdentificadorID, tbPer.Apellido AS Apellidos, tbPer.Dui AS DUI, \n" +
                            "tbGenero.Genero, tbPer.NumeroTel AS NumeroTel,\n" +
                            "tbRngTPU.Rango, tbPoli.ONI, tbPoli.NumeroPlaca, tbGrP.NumeroDeGrupo\n" +
                            "FROM tbPersonas tbPer\n" +
                            "INNER JOIN tbGeneros tbGenero ON tbGenero.IdGenero = tbPer.IdGenero\n" +
                            "INNER JOIN tbTiposPersonas_Personas tbTipoP ON tbTipoP.IdPersona = tbPer.IdPersona\n" +
                            "INNER JOIN tbPolicias tbPoli ON tbPoli.IdTipoPersonas_Personas = tbTipoP.IdTipoPersonas_Personas\n" +
                            "INNER JOIN tbRangosTipoUsuarios tbRngTPU ON tbRngTPU.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
                            "INNER JOIN tbGrupoPatrullajes tbGrP ON tbGrP.IdGrupoPatrullaje = tbPoli.IdGrupoPatrullaje\n" +
                            "INNER JOIN tbPatrullajes tbP ON tbP.IdGrupoPatrullaje = tbGrP.IdGrupoPatrullaje ORDER BY tbPoli.IdRangoTipoUsuario";
            
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                modelo.addRow(new Object[] {rs.getString("IdentificadorID"),rs.getString("Apellidos"),rs.getString("Genero"), rs.getString("DUI"),
                    rs.getString("NumeroTel"), rs.getString("Rango"), rs.getString("ONI"),rs.getString("NumeroPlaca"), rs.getString("NumeroDeGrupo")});

            }
            
            Fuentes tipoFuentes = new Fuentes();;
            
            vstPolicias.tbDatosPolicias.setModel(modelo);
            
            JTableHeader header = vstPolicias.tbDatosPolicias.getTableHeader();
            header.setBackground(clrOrang); // Cambia el color del encabezado

        // Ajustar el alto de las filas
        vstPolicias.tbDatosPolicias.setRowHeight(35); // Cambia el alto deseado para todas las filas
        header.setPreferredSize(new Dimension(header.getWidth(), 50)); // Cambia el alto del encabezado

        // Aplicar estilo de fuente personalizado al encabezado
        header.setFont( tipoFuentes.fuente(tipoFuentes.DMSans, 1, 15)); // Aplica el estilo de fuente personalizado

        // Cambiar el color del texto del encabezado (opcional)
        header.setForeground(Color.BLACK);
        
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) vstPolicias.tbDatosPolicias.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto del encabezado

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 14)); // Aplica el estilo de fuente personalizado)); // Fuente de tamaño 16 para las filas de datos
        vstPolicias.tbDatosPolicias.setDefaultRenderer(Object.class, cellRenderer);
        
        // Ajustar el ancho de las columnas
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(0).setPreferredWidth(10); // Cambia el ancho de la primera columna
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(1).setPreferredWidth(100); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(2).setPreferredWidth(40);
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(3).setPreferredWidth(35); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(4).setPreferredWidth(35); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(5).setPreferredWidth(130); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(6).setPreferredWidth(20); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(7).setPreferredWidth(20); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(8).setPreferredWidth(10); 

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
    
    
     public ResultSet readPoliceInfoWithJoins() {
        try {
           String query = "SELECT p.IdPolicia, p.IdUsuario, r.Rango, " +
                       "SUBSTRING(per.Nombre, 1, CHARINDEX(' ', per.Nombre + ' ') - 1) AS Nombre, " +
                       "SUBSTRING(per.Apellido, 1, CHARINDEX(' ', per.Apellido + ' ') - 1) AS Apellido, " +
                       "p.IdGrupoPatrullaje " +
                       "FROM tbPolicias p " +
                       "INNER JOIN tbRangosTipoUsuarios r ON p.IdRangoTipoUsuario = r.IdRangoTipoUsuario " +
                       "INNER JOIN tbTiposPersonas_Personas tp ON p.IdTipoPersonas_Personas = tp.IdPersona " +
                       "INNER JOIN tbPersonas per ON per.IdPersona = tp.IdPersona " +
                       "INNER JOIN tbUsuarios us ON us.IdUsuario = p.IdUsuario " +
                       "WHERE p.IdGrupoPatrullaje IS NULL AND us.IdNivelUsuario = 2 " +
                       "ORDER BY Nombre;";
             
            PreparedStatement readUserInfo = conexionSql.getConexion().prepareStatement(query);
            ResultSet rs = readUserInfo.executeQuery();
            return rs;
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    public boolean insertPolicia()
    {
           try{
            String query = "INSERT INTO tbPolicias(ONI, NumeroPlaca, IdUsuario, IdRangoTipoUsuario, IdTipoPersonas_Personas) VALUES (?,?,?,?,?)"; 
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, ONI);
            insertPolice.setString(2, NumeroPlaca);
            insertPolice.setInt(3, idUsuario);
            insertPolice.setInt(4, IdRangoTipoUsuario);
            insertPolice.setInt(5, IdTipoPersonas_Personas);
            
            insertPolice.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro hecho");
            return true;
          
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public int readIDUsuario()
    {
        try{   
            String query = "SELECT IdUsuario FROM tbPolicias WHERE IdTipoPersonas_Personas = ?";    
            PreparedStatement readIdUsuario = conexionSql.getConexion().prepareStatement(query);
            readIdUsuario.setInt(1, IdTipoPersonas_Personas);
            
             ResultSet rs = readIdUsuario.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;

        }
    } 
}
