package Modelo;

import Controlador.contrlPolicias;
import VIsta.Programa.Policias.Actualizar_Policia;
import VIsta.Programa.Policias.Policias_Inicio;
import fonts.Fuentes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class mdlPolicias {
    private int idUsuario;
    private int IdTipoPersonasPersonas;

    private int IdRangoTipoUsuario; 
    private int IdGrupoPatrullaje; 
    private int IdNivelUsuario;
    
    private String Nombre;
    private String Apellido;
    private Date FechaNacimiento;
    private String Direccion;
    private String DUI;
    private int IdEstadoCivil;
    private int IdTipoSangre;
    private int IdGenero;
    private String Usuario;
    private String Contra;
    private int IdRangoUsuario;

    private int IdPolicia;

    public int getIdNivelUsuario() {
        return IdNivelUsuario;
    }

    public void setIdNivelUsuario(int IdNivelUsuario) {
        this.IdNivelUsuario = IdNivelUsuario;
    }
     
    public int getIdPolicia() {
        return IdPolicia;
    }

    public void setIdPolicia(int IdPolicia) {
        this.IdPolicia = IdPolicia;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getIdEstadoCivil() {
        return IdEstadoCivil;
    }

    public void setIdEstadoCivil(int IdEstadoCivil) {
        this.IdEstadoCivil = IdEstadoCivil;
    }

    public int getIdTipoSangre() {
        return IdTipoSangre;
    }

    public void setIdTipoSangre(int IdTipoSangre) {
        this.IdTipoSangre = IdTipoSangre;
    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int IdGenero) {
        this.IdGenero = IdGenero;
    }
    private String Correo;
    private String Numero;
    private String ONI;
    private String NumeroPlaca;
    private byte[] Foto;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

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

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public int getIdRangoUsuario() {
        return IdRangoUsuario;
    }

    public void setIdRangoUsuario(int IdRangoUsuario) {
        this.IdRangoUsuario = IdRangoUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoPersonasPersonas() {
        return IdTipoPersonasPersonas;
    }

    public void setIdTipoPersonasPersonas(int idPersona) {
        this.IdTipoPersonasPersonas = idPersona;
    }
    
    public boolean  UpdatePolice()
    {
       try{
            String query = "EXEC dbo.ActualizarPolicias\n" +
"           @Nombre = ?,\n" +
"           @Apellido = ?,\n" +
"           @FechaNacimiento = ?,\n" +
"           @Direccion = ?,\n" +
"           @Dui = ?,\n" +
"           @IdEstadoCivil = ?,\n" +
"           @IdTipoSangre = ?,\n" +
"           @IdGenero = ?,\n" +
"           @CorreoElectronico = ?,\n" +
"           @NumeroTel = ?,\n" +
"           @ONI = ?,\n" +
"           @NumeroPlaca = ?,\n" +
"           @Foto = ?, \n" + 
"           @IdPolicia = ?,\n" + 
"           @IdRango = ?,\n" + 
"           @IdNivelUser = ? ";  
            
            PreparedStatement UpdtePolice = conexionSql.getConexion().prepareStatement(query);
            
            UpdtePolice.setString(1, Nombre);
            UpdtePolice.setString(2, Apellido);
            UpdtePolice.setDate(3, new java.sql.Date(FechaNacimiento.getTime()));
            UpdtePolice.setString(4, Direccion);
            UpdtePolice.setString(5, DUI);
            UpdtePolice.setInt(6, IdEstadoCivil);
            UpdtePolice.setInt(7, IdTipoSangre);
            UpdtePolice.setInt(8, IdGenero);
            UpdtePolice.setString(9, Correo);
            UpdtePolice.setString(10, Numero);
            UpdtePolice.setString(11, ONI);
            UpdtePolice.setString(12, NumeroPlaca);
            UpdtePolice.setBytes(13, Foto);
            UpdtePolice.setInt(14, IdPolicia); 
            UpdtePolice.setInt(15, IdRangoUsuario);
            UpdtePolice.setInt(16, IdNivelUsuario);
            
            UpdtePolice.executeUpdate();
            return true;
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public int readCorreoIfExistNUEVOCorreo_Actualizar()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE CorreoElectronico = ? AND\n" +
            "IdPersona != (SELECT IdPersona FROM tbPersonas WHERE IdPersona = (\n" +
            "SELECT TOP 1 IdPersona FROM tbTiposPersonas_Personas WHERE IdTipoPersonas_Personas = (\n" +
            "SELECT TOP 1 IdTipoPersonas_Personas FROM tbPolicias WHERE IdPolicia = ?)))";   
            
            PreparedStatement readCorreoIfExstsCorreo = conexionSql.getConexion().prepareStatement(query);
            readCorreoIfExstsCorreo.setString(1, Correo);
            readCorreoIfExstsCorreo.setInt(2, IdPolicia);
            
            ResultSet rs = readCorreoIfExstsCorreo.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    } 
    
    
    public int readPlacaIfExistNUEVAPlaca_Actualizar()
    {
        try{   
            String query = "SELECT IdPolicia FROM tbPolicias WHERE NumeroPlaca = ? AND IdPolicia != ?";   
            
            PreparedStatement readPLACAIIfExstsPLACA = conexionSql.getConexion().prepareStatement(query);
            readPLACAIIfExstsPLACA.setString(1, NumeroPlaca);
            readPLACAIIfExstsPLACA.setInt(2, IdPolicia);
            
            ResultSet rs = readPLACAIIfExstsPLACA.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPolicia");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    } 
    
    public int readONIIfExistNUEVOONI_Actualizar()
    {
        try{   
            String query = "SELECT IdPolicia FROM tbPolicias WHERE ONI = ? AND IdPolicia != ?";   
            
            PreparedStatement readONIIfExstsONI = conexionSql.getConexion().prepareStatement(query);
            readONIIfExstsONI.setString(1, ONI);
            readONIIfExstsONI.setInt(2, IdPolicia);
            
            ResultSet rs = readONIIfExstsONI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPolicia");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    } 
    
    
    public int readNumeroIfExistNUEVONumero_Actualizar()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE NumeroTel = ? AND\n" +
            "IdPersona != (SELECT IdPersona FROM tbPersonas WHERE IdPersona = (\n" +
            "SELECT TOP 1 IdPersona FROM tbTiposPersonas_Personas WHERE IdTipoPersonas_Personas = (\n" +
            "SELECT TOP 1 IdTipoPersonas_Personas FROM tbPolicias WHERE IdPolicia = ?)))";   
            
            PreparedStatement readNumIfExstsNum = conexionSql.getConexion().prepareStatement(query);
            readNumIfExstsNum.setString(1, Numero);
            readNumIfExstsNum.setInt(2, IdPolicia);
            
            ResultSet rs = readNumIfExstsNum.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    } 
    
    public void CargarDatosPoliciales(Actualizar_Policia vstActuPolice, contrlPolicias cntrPolice)
    {
        try{
            String query = "SELECT poli.IdPolicia, per.Nombre, per.Apellido, per.FechaNacimiento, per.DireccionDomicilio, Per.DUI, per.IdEstadoCivil, per.IdTipoSangre,\n" +
            "per.IdGenero, per.CorreoElectronico, per.NumeroTel, poli.IdRangoTipoUsuario, poli.ONI, poli.NumeroPlaca, poli.Foto FROM tbPersonas per\n" +
            "INNER JOIN tbTiposPersonas_Personas tipoPP ON tipoPP.IdPersona = per.IdPersona\n" +
            "INNER JOIN tbPolicias poli ON tipoPP.IdTipoPersonas_Personas = poli.IdTipoPersonas_Personas \n" +
            "WHERE poli.IdPolicia = ?";
            PreparedStatement chargePolice = conexionSql.getConexion().prepareStatement(query);
            chargePolice.setInt(1, IdPolicia);
            
            ResultSet rs = chargePolice.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                vstActuPolice.txtNombre.setText(rs.getString("Nombre"));
                vstActuPolice.txtApellido.setText(rs.getString("Apellido"));
                vstActuPolice.txtCorreo.setText(rs.getString("CorreoElectronico"));
                vstActuPolice.txtNumero.setText(rs.getString("NumeroTel"));
                vstActuPolice.ActutxtAreaDireccion.setText(rs.getString("DireccionDomicilio"));
                vstActuPolice.cmbEstadoCivil.setSelectedIndex(rs.getInt("IdEstadoCivil") - 1);
                vstActuPolice.cmbGenero.setSelectedIndex(rs.getInt("IdGenero") - 1);
                vstActuPolice.cmbTipoSangre.setSelectedIndex(rs.getInt("IdTipoSangre") - 1);
                vstActuPolice.txtDUI.setText(rs.getString("DUI"));
                vstActuPolice.jdcCalendar.setDate(rs.getDate("FechaNacimiento"));
                vstActuPolice.txtONI.setText(rs.getString("ONI"));
                vstActuPolice.cmbRangoUser.setSelectedIndex(rs.getInt("IdRangoTipoUsuario") - 1);
                vstActuPolice.txtPlaca.setText(rs.getString("NumeroPlaca"));
            } else {          
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString() + IdPolicia + " error en charge datos Actualizar");
        }
    }
    
    public boolean deletetbPolicias()
    {
        try{
            String query = "EXEC dbo.EliminarPolicias "
                    + " @IdPolicia = ?";
            PreparedStatement deletePolice = conexionSql.getConexion().prepareStatement(query);
            deletePolice.setInt(1, IdPolicia);
   
            deletePolice.executeUpdate();
            return true;
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
  
    public boolean InsertPoliceIncludePersonaTipoPUser()
    {//NIVEL DE USUARIO 4 = POLI $$ 2 = JEFE DE POLI
       try{
            String query = "EXEC dbo.InsertarPolicias \n" +
    "       @Nombre = ?,\n" +
    "       @Apellido = ?,\n" +
    "       @FechaNacimiento = ?,\n" +
    "       @Direccion = ?,\n" +
    "       @Dui = ?,\n" +
    "       @IdEstadoCivil = ?,\n" +
    "       @IdTipoSangre = ?,\n" +
    "       @IdGenero = ?,\n" +
    "       @CorreoElectronico = ?,\n" +
    "       @NumeroTel = ?,\n" +
    "       @ONI = ?,\n" +
    "       @NumeroPlaca = ?,\n" +
    "       @Foto = ?,\n" +
    "       @Usuario = ?,\n" +
    "       @Contrasena = ?,\n" +
    "       @IdRangoTipoUsuario  = ?,\n" + 
    "       @IdNivelUsuario = ?"; 
        
            PreparedStatement insertPolice = conexionSql.getConexion().prepareStatement(query);
            insertPolice.setString(1, Nombre);
            insertPolice.setString(2, Apellido);
            insertPolice.setDate(3, new java.sql.Date(FechaNacimiento.getTime()));
            insertPolice.setString(4, Direccion);
            insertPolice.setString(5, DUI);
            insertPolice.setInt(6, IdEstadoCivil);
            insertPolice.setInt(7, IdTipoSangre);
            insertPolice.setInt(8, IdGenero);
            insertPolice.setString(9, Correo);
            insertPolice.setString(10, Numero);
            insertPolice.setString(11, ONI);
            insertPolice.setString(12, NumeroPlaca);
            insertPolice.setBytes(13, Foto);
            insertPolice.setString(14, Usuario);
            insertPolice.setString(15, Contra);
            insertPolice.setInt(16, IdRangoUsuario);
            insertPolice.setInt(17, IdNivelUsuario);

            insertPolice.executeUpdate();
            return true;
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public int readIdPoliIfExistONI()
    {
        try{   
            String query = "SELECT IdPolicia FROM tbPolicias WHERE ONI = ?";    
            PreparedStatement readIdPoliifExistONI = conexionSql.getConexion().prepareStatement(query);
            readIdPoliifExistONI.setString(1, ONI);
             ResultSet rs = readIdPoliifExistONI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPolicia");
            } else {          
                return -1;
            }
        } catch (SQLException e) {            
            return -1;
        }
    }
    
    public int readIdPoliIfExistsNumeroPlaca()
    {
        try{   
            String query = "SELECT IdPolicia FROM tbPolicias WHERE NumeroPlaca = ?";    
            PreparedStatement readIdPoliIfExistsNumeroPlaca = conexionSql.getConexion().prepareStatement(query);
            readIdPoliIfExistsNumeroPlaca.setString(1, NumeroPlaca);
             ResultSet rs = readIdPoliIfExistsNumeroPlaca.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPolicia");
            } else {          
                return -1;
            }
        } catch (SQLException e) {            
            return -1;
        }        
    }
    
    public int readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI()
    {
        try{   
            String query = "SELECT IdPolicia FROM tbPolicias WHERE IdTipoPersonas_Personas = (\n" +
            "SELECT IdTipoPersonas_Personas FROM tbTiposPersonas_Personas WHERE IdPersona = (\n" +
            "SELECT IdPersona FROM tbPersonas WHERE Dui = ?))";    
            PreparedStatement readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI = conexionSql.getConexion().prepareStatement(query);
            readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI.setString(1, DUI);
             ResultSet rs = readIdPoliIfExistsIdTipoPersona_PersonaInTablePOLIWhitDUI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPolicia");
            } else {          
                return -1;
            }
        } catch (SQLException e) {            
            return -1;
        }
    }
    
     public int readUserIfExistUser()
    {
        try{   
            String query = "SELECT IdUsuario FROM tbUsuarios WHERE Usuario = ?";    
            PreparedStatement readUserIfExistUser = conexionSql.getConexion().prepareStatement(query);
            readUserIfExistUser.setString(1, Usuario);
             ResultSet rs = readUserIfExistUser.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {          
                return -1;
            }
        } catch (SQLException e) {            
            return -1;
        }
    }
     
    public int readDUIIfExistNUEVODUI_Actualizar()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE DUI = ? AND \n" +
"           IdPersona != (SELECT IdPersona FROM tbPersonas WHERE IdPersona = (\n" +
"           SELECT TOP 1 IdPersona FROM tbTiposPersonas_Personas WHERE IdTipoPersonas_Personas = (\n" +
"           SELECT TOP 1 IdTipoPersonas_Personas FROM tbPolicias WHERE IdPolicia = ?)))";   
            
            PreparedStatement readDUIIfExistDUI = conexionSql.getConexion().prepareStatement(query);
            readDUIIfExistDUI.setString(1, DUI);
            readDUIIfExistDUI.setInt(2, IdPolicia);
            
            ResultSet rs = readDUIIfExistDUI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    } 
    
    public int readDUIIfExistDUI()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE DUI = ?";    
            PreparedStatement readDUIIfExistDUI = conexionSql.getConexion().prepareStatement(query);
            readDUIIfExistDUI.setString(1, DUI);
             ResultSet rs = readDUIIfExistDUI.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }
     
    public int readCorreoIfExistCorreo()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE CorreoElectronico = ?";    
            PreparedStatement readCorreoIfExistCorreo = conexionSql.getConexion().prepareStatement(query);
            readCorreoIfExistCorreo.setString(1, Correo);
             ResultSet rs = readCorreoIfExistCorreo.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }
    
     public int readNumeroIfExistNumero()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE NumeroTel = ?";    
            PreparedStatement readNumeroIfExistNumero = conexionSql.getConexion().prepareStatement(query);
            readNumeroIfExistNumero.setString(1, Numero);
             ResultSet rs = readNumeroIfExistNumero.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
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
        vstPolicias.IdPolicia = 0;
        Color clrOrang = new Color( 243, 167, 18);
        DefaultTableModel modelo = new DefaultTableModel();
      
        modelo.setColumnIdentifiers(new Object []{"IdPolicia","Apellido", "Dui","Genero", "NumeroTel", "Rango", 
            "ONI", "Placa"});

        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbPoli.IdPolicia, tbPer.Apellido AS Apellidos, tbPer.Dui AS DUI, \n" +
            "tbGenero.Genero, tbPer.NumeroTel AS NumeroTel,\n" +
            "tbRngTPU.Rango, tbPoli.ONI, tbPoli.NumeroPlaca\n" +
            "FROM tbPersonas tbPer\n" +
            "INNER JOIN tbGeneros tbGenero ON tbGenero.IdGenero = tbPer.IdGenero\n" +
            "INNER JOIN tbTiposPersonas_Personas tbTipoP ON tbTipoP.IdPersona = tbPer.IdPersona\n" +
            "INNER JOIN tbPolicias tbPoli ON tbPoli.IdTipoPersonas_Personas = tbTipoP.IdTipoPersonas_Personas\n" +
            "INNER JOIN tbRangosTipoUsuarios tbRngTPU ON tbRngTPU.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
            "WHERE tbTipoP.IdTipoPersona = 1 ORDER BY tbPoli.IdRangoTipoUsuario";
            
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                modelo.addRow(new Object[] {rs.getString("IdPolicia"),rs.getString("Apellidos"),rs.getString("Dui"), rs.getString("Genero"),
                    rs.getString("NumeroTel"), rs.getString("Rango"), rs.getString("ONI"),rs.getString("NumeroPlaca")});//, rs.getString("NumeroDeGrupo")});

            }
            
            Fuentes tipoFuentes = new Fuentes();;
            
            vstPolicias.tbDatosPolicias.setModel(modelo);
            
            JTableHeader header = vstPolicias.tbDatosPolicias.getTableHeader();
            header.setBackground(clrOrang); // Cambia el color del encabezado

        // Ajustar el alto de las filas
        vstPolicias.tbDatosPolicias.setRowHeight(35); // Cambia el alto deseado para todas las filas
        header.setPreferredSize(new Dimension(header.getWidth(), 50)); // Cambia el alto del encabezado

        // Aplicar estilo de fuente personalizado al encabezado
        header.setFont( tipoFuentes.fuente(tipoFuentes.DMSans, 1, 16)); // Aplica el estilo de fuente personalizado

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
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(2).setPreferredWidth(50);
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(3).setPreferredWidth(45); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(4).setPreferredWidth(45); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(5).setPreferredWidth(130); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(6).setPreferredWidth(20); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(7).setPreferredWidth(20); 
        //vstPolicias.tbDatosPolicias.getColumnModel().getColumn(8).setPreferredWidth(10); 
        
        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
    
    public void MostrarTablePoliciasB(Policias_Inicio vstPolicias){
        vstPolicias.IdPolicia = 0;
        Color clrOrang = new Color( 243, 167, 18);
        DefaultTableModel modelo = new DefaultTableModel();
      
        modelo.setColumnIdentifiers(new Object []{"IdPolicia","Apellido", "Dui","Genero", "NumeroTel", "Rango", 
            "ONI", "Placa"});

        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT tbPoli.IdPolicia, tbPer.Apellido AS Apellidos, tbPer.Dui AS DUI, \n" +
                        "tbGenero.Genero, tbPer.NumeroTel AS NumeroTel,\n" +
                        "tbRngTPU.Rango, tbPoli.ONI, tbPoli.NumeroPlaca\n" +
                        "FROM tbPersonas tbPer\n" +
                        "INNER JOIN tbGeneros tbGenero ON tbGenero.IdGenero = tbPer.IdGenero\n" +
                        "INNER JOIN tbTiposPersonas_Personas tbTipoP ON tbTipoP.IdPersona = tbPer.IdPersona\n" +
                        "INNER JOIN tbPolicias tbPoli ON tbPoli.IdTipoPersonas_Personas = tbTipoP.IdTipoPersonas_Personas\n" +
                        "INNER JOIN tbRangosTipoUsuarios tbRngTPU ON tbRngTPU.IdRangoTipoUsuario = tbPoli.IdRangoTipoUsuario\n" +
                        "WHERE tbTipoP.IdTipoPersona = 1 AND \n" 
                           
                    + "IdPolicia like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "Apellido like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "Dui like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "Genero like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "NumeroTel like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "Rango like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "ONI like '%" + vstPolicias.txtBuscar.getText() + "%' or "
                    + "NumeroPlaca like '%" + vstPolicias.txtBuscar.getText() + "%' ; " 
                    + "ORDER BY tbPoli.IdRangoTipoUsuario";
            
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                modelo.addRow(new Object[] {rs.getString("IdPolicia"),rs.getString("Apellidos"),rs.getString("Dui"), rs.getString("Genero"),
                    rs.getString("NumeroTel"), rs.getString("Rango"), rs.getString("ONI"),rs.getString("NumeroPlaca")});//, rs.getString("NumeroDeGrupo")});

            }
            
            Fuentes tipoFuentes = new Fuentes();;
            
            vstPolicias.tbDatosPolicias.setModel(modelo);
            
            JTableHeader header = vstPolicias.tbDatosPolicias.getTableHeader();
            header.setBackground(clrOrang); // Cambia el color del encabezado

        // Ajustar el alto de las filas
        vstPolicias.tbDatosPolicias.setRowHeight(35); // Cambia el alto deseado para todas las filas
        header.setPreferredSize(new Dimension(header.getWidth(), 50)); // Cambia el alto del encabezado

        // Aplicar estilo de fuente personalizado al encabezado
        header.setFont( tipoFuentes.fuente(tipoFuentes.DMSans, 1, 16)); // Aplica el estilo de fuente personalizado

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
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(2).setPreferredWidth(50);
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(3).setPreferredWidth(45); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(4).setPreferredWidth(45); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(5).setPreferredWidth(130); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(6).setPreferredWidth(20); 
        vstPolicias.tbDatosPolicias.getColumnModel().getColumn(7).setPreferredWidth(20); 
        //vstPolicias.tbDatosPolicias.getColumnModel().getColumn(8).setPreferredWidth(10); 
        
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
            insertPolice.setInt(5, IdTipoPersonasPersonas);
            
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
            readIdUsuario.setInt(1, IdTipoPersonasPersonas);
            
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
