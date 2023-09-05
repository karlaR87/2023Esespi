package Modelo;
import java.sql.Connection;
import Modelo.conexionSql;
import VIsta.Registro;
import VIsta.Registro_DatosPersonales;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ModeloRegistro {
    
    private String CorreoElectronico;
    private String numeroTelefonico;
    //registro
    private String Nombre;
    private String Apellidos;
    private Date Fecha;
    private String Dirección;
    private String DUI;
    private String Tel;
    private String Correo;
    
    //para comboboxexs 
    private int Idestadocicivl;
    private String estadocicivl;
    
    private int IdtipoSangre;
    private String tipoSangre;
    
    private int Idgenero;
    private String genero;
    
    
    
    //PARA EL REGISTRO

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEstadocicivl() {
        return estadocicivl;
    }

    public void setEstadocicivl(String estadocicivl) {
        this.estadocicivl = estadocicivl;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdestadocicivl() {
        return Idestadocicivl;
    }

    public void setIdestadocicivl(int Idestadocicivl) {
        this.Idestadocicivl = Idestadocicivl;
    }

    public int getIdtipoSangre() {
        return IdtipoSangre;
    }

    public void setIdtipoSangre(int IdtipoSangre) {
        this.IdtipoSangre = IdtipoSangre;
    }

    public int getIdgenero() {
        return Idgenero;
    }

    public void setIdgenero(int Idgenero) {
        this.Idgenero = Idgenero;
    }
    

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    
    public int readIdTipoUsuarioFromCorreo()
    {
        try{   
            String query = "SELECT IdNivelUsuario FROM tbUsuarios WHERE IdUsuario = (\n" +
            "SELECT IdUsuario FROM tbPolicias WHERE IdTipoPersonas_Personas =\n" +
            "(SELECT IdTipoPersonas_Personas FROM tbTiposPersonas_Personas WHERE IdPersona = (\n" +
            "SELECT IdPersona FROM tbPersonas WHERE CorreoElectronico = ?)))";    
            PreparedStatement readIdTipoUser = conexionSql.getConexion().prepareStatement(query);
            readIdTipoUser.setString(1, CorreoElectronico);
            ResultSet rs = readIdTipoUser.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdNivelUsuario");
            } else {          
                return -1;
                
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }
    
   public int readIdUltimaPersona()
    {
        try{   
            String query = "SELECT MAX(IdPersona) as IdPersona FROM tbPersonas";    
            PreparedStatement readIdUltimaPersona = conexionSql.getConexion().prepareStatement(query);
            
             ResultSet rs = readIdUltimaPersona.executeQuery();

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
   
    
    public int readIdTelefono()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE NumeroTel = ?";    
            PreparedStatement readIdPersonaTelefono = conexionSql.getConexion().prepareStatement(query);
            readIdPersonaTelefono.setString(1, numeroTelefonico);
            
             ResultSet rs = readIdPersonaTelefono.executeQuery();

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
    
    public int readDUI()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE Dui = ?";    
            PreparedStatement readIdPersonaTelefono = conexionSql.getConexion().prepareStatement(query);
            readIdPersonaTelefono.setString(1, DUI);
            
             ResultSet rs = readIdPersonaTelefono.executeQuery();

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

    public int readIDCorreo()
    {
        try{   
            String query = "Select IdPersona From tbPersonas Where CorreoElectronico = ?";    
            PreparedStatement readIdPersonaCorreo = conexionSql.getConexion().prepareStatement(query);
            readIdPersonaCorreo.setString(1, CorreoElectronico);
            
             ResultSet rs = readIdPersonaCorreo.executeQuery();

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
    
   
    
    //LLENAR COMBOBOX DE ESTADO CIVIL 
    public void llenarCombo(JComboBox<String> comboboxEstadoCivil) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdEstadoCivil, EstadoCivil from tbEstadosCivil";
        comboboxEstadoCivil.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

            while (result.next()) {
                int id = result.getInt("IdEstadoCivil");
                String nombre = result.getString("EstadoCivil");
                comboboxEstadoCivil.addItem(nombre);
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
    
    public int IdRetorno(String EstadoCivil) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int Estado = -1; 

 

        String SSQL = "SELECT IdEstadoCivil FROM tbEstadosCivil WHERE EstadoCivil = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, EstadoCivil);
            result = pst.executeQuery();

 

            if (result.next()) {
                Estado = result.getInt("IdEstadoCivil");
            }

 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
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
        return Estado;
    }
    
     //LLENAR COMBOBOX DE TIPO DE SANGRE
    public void llenarCombo2(JComboBox<String> comboboxSangre) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdTipoSangre, TipoSangre from tbTiposSangre";
        comboboxSangre.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdTipoSangre");
                String nombre = result.getString("TipoSangre");
                comboboxSangre.addItem(nombre);
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
    
    public int IdRetorno2(String TipoSangre) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int sangre = -1; 

 

        String SSQL = "SELECT IdTipoSangre FROM tbTiposSangre WHERE TipoSangre = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, TipoSangre);
            result = pst.executeQuery();

 

            if (result.next()) {
                sangre = result.getInt("IdTipoSangre");
            }

 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
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

 

        return sangre;
    }
    
         //LLENAR COMBOBOX DE TIPO DE SANGRE
    public void llenarCombo3(JComboBox<String> comboboGenero) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdGenero, Genero from tbGeneros";
        comboboGenero.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdGenero");
                String nombre = result.getString("Genero");
                comboboGenero.addItem(nombre);
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
    
    public int IdRetorno3(String genero) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int gen = -1; 

 

        String SSQL = "SELECT IdGenero FROM tbGeneros WHERE Genero = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, genero);
            result = pst.executeQuery();

 

            if (result.next()) {
                gen = result.getInt("IdGenero");
            }

 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
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

 

        return gen;
    }
    
    // Método para insertar los datos de registro y asociar idiomas a la persona
    public boolean agregarRegistroYAsociarIdiomas(ArrayList<Boolean> idiomasSeleccionados) {
        try {
            Connection conectar = conexionSql.getConexion();

            // Insertar datos en la tabla tbPersonas
            String sqlInsertPersona = "INSERT INTO tbPersonas (Nombre, Apellido, FechaNacimiento, DireccionDomicilio, DUI, NumeroTel, CorreoElectronico, IdEstadoCivil, IdTipoSangre, IdGenero) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstInsertPersona = conectar.prepareStatement(sqlInsertPersona, PreparedStatement.RETURN_GENERATED_KEYS);
            pstInsertPersona.setString(1, Nombre);
            pstInsertPersona.setString(2, Apellidos);
            pstInsertPersona.setDate(3, new java.sql.Date(Fecha.getTime())); // Convirtiendo la fecha util.Date a sql.Date
            pstInsertPersona.setString(4, Dirección);
            pstInsertPersona.setString(5, DUI);
            pstInsertPersona.setString(6, Tel);
            pstInsertPersona.setString(7, Correo);
            pstInsertPersona.setInt(8, Idestadocicivl);
            pstInsertPersona.setInt(9, IdtipoSangre);
            pstInsertPersona.setInt(10, Idgenero);
            pstInsertPersona.executeUpdate();

            // Obtener el ID generado para la persona insertada
            ResultSet generatedKeys = pstInsertPersona.getGeneratedKeys();
            int idPersonaInsertada = -1;
            if (generatedKeys.next()) {
                idPersonaInsertada = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de la persona insertada.");
            }

            // Llamar a la función SQL para asociar idiomas a la persona
            String sqlAsociarIdioma = "SELECT * FROM buscar_y_reemplazar_idioma_persona(?, ?)";
            PreparedStatement pstAsociarIdioma = conectar.prepareStatement(sqlAsociarIdioma);

            // Para cada idioma seleccionado, llamar a la función con el idioma y el ID de la persona insertada
            for (int i = 0; i < idiomasSeleccionados.size(); i++) {
                boolean idiomaSeleccionado = idiomasSeleccionados.get(i);
                pstAsociarIdioma.setString(1, idiomaSeleccionado ? "Idioma " + (i + 1) : ""); // Puedes cambiar "Idioma" por algún otro identificador
                pstAsociarIdioma.setInt(2, idPersonaInsertada);
                pstAsociarIdioma.executeUpdate();
            }

            conectar.close();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
