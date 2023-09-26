package Modelo;
import java.sql.Connection;
import Modelo.conexionSql;
import VIsta.Login;
import VIsta.Programa.Usuario.Usuario;
import VIsta.Registro;
import VIsta.Registro_DatosPersonales;
import VIsta.VistaAgregarTransporte;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
                
            }
        return -1;
    
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
    
         //LLENAR COMBOBOX DE RANGOS DE USUARIO
    public void llenarCombo4(JComboBox<String> comboboRangoU) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "SELECT IdRangoTipoUsuario, Rango FROM tbRangosTipoUsuarios";
        comboboRangoU.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdRangoTipoUsuario");
                String nombre = result.getString("Rango");
                comboboRangoU.addItem(nombre);
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
    
////    // Método para insertar los datos de registro y asociar idiomas a la persona
//    public boolean agregarRegistroYAsociarIdiomas(ArrayList<Boolean> idiomasSeleccionados) {
//        try {
//            Connection conectar = conexionSql.getConexion();
//
//            // Insertar datos en la tabla tbPersonas
//            String sqlInsertPersona = "INSERT INTO tbPersonas (Nombre, Apellido, FechaNacimiento, DireccionDomicilio, DUI, NumeroTel, CorreoElectronico, IdEstadoCivil, IdTipoSangre, IdGenero) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement pstInsertPersona = conectar.prepareStatement(sqlInsertPersona, PreparedStatement.RETURN_GENERATED_KEYS);
//            pstInsertPersona.setString(1, Nombre);
//            pstInsertPersona.setString(2, Apellidos);
//            pstInsertPersona.setDate(3, new java.sql.Date(Fecha.getTime())); // Convirtiendo la fecha util.Date a sql.Date
//            pstInsertPersona.setString(4, Dirección);
//            pstInsertPersona.setString(5, DUI);
//            pstInsertPersona.setString(6, Tel);
//            pstInsertPersona.setString(7, Correo);
//            pstInsertPersona.setInt(8, Idestadocicivl);
//            pstInsertPersona.setInt(9, IdtipoSangre);
//            pstInsertPersona.setInt(10, Idgenero);
//            pstInsertPersona.executeUpdate();
//
//            // Obtener el ID generado para la persona insertada
//            ResultSet generatedKeys = pstInsertPersona.getGeneratedKeys();
//            int idPersonaInsertada = -1;
//            if (generatedKeys.next()) {
//                idPersonaInsertada = generatedKeys.getInt(1);
//            } else {
//                throw new SQLException("No se pudo obtener el ID de la persona insertada.");
//            }
//
//            // Llamar a la función SQL para asociar idiomas a la persona
//            String sqlAsociarIdioma = "SELECT * FROM buscar_y_reemplazar_idioma_persona(?, ?)";
//            PreparedStatement pstAsociarIdioma = conectar.prepareStatement(sqlAsociarIdioma);
//
//            // Para cada idioma seleccionado, llamar a la función con el idioma y el ID de la persona insertada
//            for (int i = 0; i < idiomasSeleccionados.size(); i++) {
//                boolean idiomaSeleccionado = idiomasSeleccionados.get(i);
//                pstAsociarIdioma.setString(1, idiomaSeleccionado ? "Idioma " + (i + 1) : ""); 
//                pstAsociarIdioma.setInt(2, idPersonaInsertada);
//                pstAsociarIdioma.executeUpdate();
//            }
//
//            conectar.close();
//
//            return true;
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//            return false;
//        }
//    }
    
    
    public int agregarRegistroYObtenerID( ) {
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
        if (generatedKeys.next()) {
            int idPersonaInsertada = generatedKeys.getInt(1);
            System.out.println("Persona agregada con ID: " + idPersonaInsertada);
            return idPersonaInsertada; // Retorna el ID generado
        } else {
            throw new SQLException("No se pudo obtener el ID de la persona insertada.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        return -1; // Retorna un valor indicando un error
    }
    }
    
    
 public void agregarRelacionesIdiomas(List<Integer> idIdiomas,  int idPersona ) {
    try {
        // Consulta SQL para insertar relaciones en la tabla intermedia
        String query = "INSERT INTO tbPersonas_Idiomas (IdIdioma, IdPersona) VALUES (?, ?);";
        
        // Preparar la declaración SQL
        PreparedStatement addRelaciones = conexionSql.getConexion().prepareStatement(query);
        
        // Iterar sobre los IDs de los calibres y agregar las relaciones
        for (int idIdioma : idIdiomas) {
            addRelaciones.setInt(1, idIdioma); 
            addRelaciones.setInt(2, idPersona); 
            
            addRelaciones.executeUpdate();
        }
        
        System.out.println("IDs de idioma: " + idIdiomas + " Del id Persona: " +idPersona);
       
        
        
        JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}
 
  public void agregarRelacionesNacionalidades( List<Integer> idNacionalidades, int idPersona ) {
    try {
        // Consulta SQL para insertar relaciones en la tabla intermedia
        String query = "INSERT INTO tbNacionalidades_Personas (IdNacionalidad, IdPersona) VALUES (?, ?);";
        
        // Preparar la declaración SQL
        PreparedStatement addRelaciones = conexionSql.getConexion().prepareStatement(query);
        
        // Iterar sobre los IDs de los calibres y agregar las relaciones
        for (int idNacionalidad : idNacionalidades) {
            addRelaciones.setInt(1, idNacionalidad); 
            addRelaciones.setInt(2, idPersona); 
            
            addRelaciones.executeUpdate();
        }
        
        System.out.println("IDs de nacionalidades: " + idNacionalidades + " Del id Persona: " +idPersona);
       
        
        
        JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}
  
  
  
  // Define un método llamado obtenerDatosActualizar que recibe un int (idUser) como parámetro y lanza una excepción SQLException.
    public boolean obtenerDatosPerfil(int IdPersona) throws SQLException {
        // Declara e inicializa las variables de conexión, sentencia preparada y conjunto de resultados a null.
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        boolean resultado = false;
        // Define la consulta SQL para seleccionar el nombre de usuario, la imagen, el nombre completo, el número de teléfono, el correo electrónico y el nombre de la región.
        // La consulta hace uso de INNER JOIN para obtener datos de tres tablas diferentes (usuarios, personas y regiones) relacionadas por id_user e id_region.
        // Se utiliza la cláusula WHERE para filtrar los registros según el id_user proporcionado.
        
        System.out.println("aca");
        String SSQL = "select t.IdPersona ,t.Nombre, t.Apellido, t.Dui, t.FechaNacimiento, t.DireccionDomicilio, t.CorreoElectronico, t.NumeroTel, e.EstadoCivil, ts.TipoSangre, g.Genero from tbPersonas t " +
        "inner join tbEstadosCivil e on e.IdEstadoCivil = t.IdEstadoCivil " +
        "inner join tbTiposSangre ts on ts.IdTipoSangre = t.IdTipoSangre " +
        "inner join tbGeneros g on g.IdGenero = t.IdGenero " +
        "inner join tbTiposPersonas_Personas ti on ti.IdPersona = t.IdPersona " +
        "inner join tbPolicias op on op.IdTipoPersonas_Personas = ti.IdTipoPersonas_Personas " +
        "inner join tbUsuarios u on u.IdUsuario = op.IdUsuario " +
        "where u.IdUsuario = ?";

          System.out.println("aca");

        try {
            // Obtiene una conexión a la base de datos a través del método getConexion() de la clase ConexionSQL.
            conectar = conexionSql.getConexion();
            // Prepara la consulta SQL para su ejecución.
            pst = conectar.prepareStatement(SSQL);
            // Establece los valores de los parámetros en la consulta SQL.
            pst.setInt(1, IdPersona);
            // Ejecuta la consulta SQL y almacena el resultado en la variable result.
            result = pst.executeQuery();

 

            // Verifica si el conjunto de resultados tiene al menos un registro.
            if (result.next()) {
                // Obtiene los valores de las columnas y los almacena en variables locales.
                String nombreUser = result.getString("Nombre");
                setNombre(nombreUser);
                
                String Apellidos = result.getString("Apellido");
                setApellidos(Apellidos);
                
                String Dui = result.getString("Dui");
                setDUI(Dui);
                
                Date Fecha_Nacimiento = result.getDate("FechaNacimiento");
                setFecha(Fecha_Nacimiento);
                
                String Direccion = result.getString("DireccionDomicilio");
                setDirección(Direccion);
                
                String Correo = result.getString("CorreoElectronico");
                setCorreo(Correo);
                
                  String Telefono = result.getString("NumeroTel");
                setCorreo(Telefono);
                
                String EstadoCivil = result.getString("EstadoCivil");
                setEstadocicivl(EstadoCivil);
                
                
                String TipodeSangre = result.getString("TipoSangre");
                setTipoSangre(TipodeSangre);
                
                String Genero = result.getString("Genero");
                setGenero(Genero);

 

                resultado = true;
            }

 

        } catch (SQLException e) {
            // Imprime el mensaje de error en caso de que se produzca una excepción SQLException.
            System.out.println(e.toString());
        } finally {
            // Bloque finally para cerrar los recursos utilizados.
            // Cierra el conjunto de resultados si no es nulo.
            if (result != null) {
                result.close();
            }
            // Cierra la sentencia preparada si no es nula.
            if (pst != null) {
                pst.close();
            }
            // Cierra la conexión si no es nula.
            if (conectar != null) {
                conectar.close();
            }
        }

 

        // Retorna el objeto usuario.
        return resultado;
    }
    
    
    
    public void IdUsuarioTomar(Usuario u)
    {
        try{   
            
              
            String query = "select u.IdUsuario, u.Usuario, ttt.Rango, t.IdPersona ,CONCAT (t.Nombre, ' ', t.Apellido) as Nombre , t.Dui, t.FechaNacimiento, t.CorreoElectronico, t.NumeroTel, t.DireccionDomicilio, t.CorreoElectronico, t.NumeroTel, e.EstadoCivil, ts.TipoSangre, g.Genero from tbPersonas t\n" +
            "inner join tbEstadosCivil e on e.IdEstadoCivil = t.IdEstadoCivil\n" +
            "inner join tbTiposSangre ts on ts.IdTipoSangre = t.IdTipoSangre\n" +
            "inner join tbGeneros g on g.IdGenero = t.IdGenero\n" +
            "inner join tbTiposPersonas_Personas ti on ti.IdPersona = t.IdPersona\n" +
            "inner join tbPolicias op on op.IdTipoPersonas_Personas = ti.IdTipoPersonas_Personas\n" +
            "inner join tbRangosTipoUsuarios ttt on ttt.IdRangoTipoUsuario = op.IdRangoTipoUsuario\n" +
            "inner join tbUsuarios u on u.IdUsuario = op.IdUsuario\n" +
            "where u.Usuario = 'ivansote'";  

              
            PreparedStatement readIdUltimaPersona = conexionSql.getConexion().prepareStatement(query);
            
             ResultSet rs = readIdUltimaPersona.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                String retorno = rs.getString("Usuario");
                String retorno1 = rs.getString("Rango");
                String retorno2 = rs.getString("Dui");
                String retorno3 = rs.getString("FechaNacimiento");
                String retorno4 = rs.getString("TipoSangre");
                String retorno5 = rs.getString("EstadoCivil");
                String retorno6 = rs.getString("Genero");
                String retorno7 = rs.getString("CorreoElectronico");
                String retorno8 = rs.getString("NumeroTel");
                String nombre = rs.getString("Nombre");
                
                u.txtUser.setText(retorno);
                 u.lblRango.setText(retorno1);
                u.txtDui.setText(retorno2);
                u.txtFechaNacimiento.setText(retorno3);
                u.txtTipoS.setText(retorno4);
                u.txtEstadoC.setText(retorno5);
                u.txtGenero.setText(retorno6);
                u.txtMostrarTel.setText(retorno8);
                u.txtCorreoM.setText(retorno7);
                u.lblNombre.setText(nombre);
            } 
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
           
        }
        
        
       
    }
    
    //Aquí se mostrará el codigo de seguridad para ingresar a la aplicación movil.
    
    public void MostrarCosve(Usuario u)
    {
        try{   
            
              
            String query = "Select cosve from cosve";  

              
            PreparedStatement readIdUltimaPersona = conexionSql.getConexion().prepareStatement(query);
            
             ResultSet rs = readIdUltimaPersona.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                String retorno = rs.getString("cosve");
                
                
                u.jLabel10.setText("COSVE: " + retorno);
                 
            } 
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
           
        }
        
        
       
    }
    
    public void MostrarUser(String usuario)
    {
        try{   
            
            
              
            String query = "select Usuario from tbUsuarios where Usuario = '" + usuario + "'";  

              
            PreparedStatement readIdUltimaPersona = conexionSql.getConexion().prepareStatement(query);
            
             ResultSet rs = readIdUltimaPersona.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                String retorno = rs.getString("Usuario");
   
            } 
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
           
        }
        
        
       
    }

    
    public void mOstrarPatUser(Usuario u)
    {
           
       

        DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"ExtensionKM", "Fecha_Hora_Inicio", "Fecha_Hora_Fin"});



        try{

            java.sql.Statement statement = conexionSql.getConexion().createStatement();

            String query = "select pat.ExtensionKM, pol.IdGrupoPatrullaje, pat.Fecha_Hora_Inicio, pat.Fecha_Hora_Fin \n" +
            "from tbPatrullajes pat\n" +
            "inner join tbPolicias pol on pol.IdGrupoPatrullaje = pat.IdGrupoPatrullaje\n" +
            "inner join tbUsuarios u on u.IdUsuario = pol.IdUsuario\n" +
            "inner join tbTiposPersonas_Personas itp on itp.IdTipoPersonas_Personas = pol.IdTipoPersonas_Personas\n" +
            "inner join tbPersonas p on p.IdPersona = itp.IdPersona\n" +
            "where Usuario = 'ivansote' ";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("ExtensionKM"),rs.getString("Fecha_Hora_Inicio"),rs.getString("Fecha_Hora_Fin")});

            }

            

            u.tbPat.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    
    public void mOstrarReferencias(Usuario u)
    {
           
       

        DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"NombreReferencia", "NumeroTel", "CorreoElectronico"});



        try{

            java.sql.Statement statement = conexionSql.getConexion().createStatement();

            String query = "select CONCAT (pp.Nombre, ' ', pp.Apellido) as NombreReferencia , pp.NumeroTel, pp.CorreoElectronico from tbPolicias_Referencias pr\n" +
            "inner join tbReferenciasPersonales piR on piR.IdReferenciaPersonal = pr.IdReferenciaPersonal\n" +
            "inner join tbPersonas pp on pp.IdPersona = piR.IdPersona\n" +
            "inner join tbPolicias ppR on ppR.IdPolicia = pr.IdPolicia\n" +
            "inner join tbUsuarios pUs on pUs.IdUsuario = ppR.IdUsuario\n" +
            "where Usuario = 'ivansote'";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("NombreReferencia"),rs.getString("NumeroTel"),rs.getString("CorreoElectronico")});

            }

            

            u.tbRef.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    
    public void actualizarU(Usuario u) throws SQLException{
        ModeloTransporte n = new ModeloTransporte();

        //obtenemos que fila seleccionó el usuario

        String nombre = u.lblNombre.getText();
        String dui = u.txtDui.getSelectedText();
         String nac = u.txtUser.getSelectedText();
        /*String sangre = u.txtDui.getSelectedText();
         String estado = u.txtUser.getSelectedText();
        String genero = u.txtDui.getSelectedText();*/
        //Obtenemos el id de la fila seleccionada

        

        try {

            /*PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("update tbPersonas set Dui = ?, FechaNacimiento = ?, "
                    + "TipoSangre = ?, EstadoCivil = ?, Genero = ? , CorreoElectronico = ?, Numerotel = ? where Usuario = ?");*/

            PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("update tbPersonas set Dui = ?, FechaNacimiento = ? where Nombre = ?");
            
            updateUser.setString(1, dui);

            updateUser.setString(2, nac);

            updateUser.setString(3, nombre);
              

            updateUser.executeUpdate();
               

            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (Exception e) {



            JOptionPane.showMessageDialog(null,e.toString());



        }

    }
    
    
    

}


