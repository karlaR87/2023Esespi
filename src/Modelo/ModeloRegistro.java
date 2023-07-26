package Modelo;
import Controlador.ConexionPrueba;
import java.sql.Connection;
import Modelo.conexionSql;
import VIsta.Registro;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModeloRegistro {
    
    private String CorreoElectronico;
    private String numeroTelefonico;
    
    private String Nombre;
    private String Apellidos;
    private String Fecha;
    private String Dirección;
    private String DUI;
    private String Tel;
    private String Correo;
    private String estadocicivl;
    private String tipoSangre;
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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
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
    
    
    //PARTE DE ADRIANA TEL Y CORREO

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
    
       public int readIdTelefono()
    {
        try{   
            String query = "SELECT IdPersona FROM tbPersonas WHERE NumeroTel = ?";    
            PreparedStatement readIdPersonaTelefono = ConexionPrueba.getConnection().prepareStatement(query);
            readIdPersonaTelefono.setString(1, numeroTelefonico);
            
             ResultSet rs = readIdPersonaTelefono.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return -1;

        }
    } 

    public int readIDCorreo()
    {
        try{   
            String query = "Select IdPersona From tbPersonas Where CorreoElectronico = ?";    
            PreparedStatement readIdPersonaCorreo = ConexionPrueba.getConnection().prepareStatement(query);
            readIdPersonaCorreo.setString(1, CorreoElectronico);
            
             ResultSet rs = readIdPersonaCorreo.executeQuery();

            // Verificar si hay alguna fila en el ResultSet
            if (rs.next()) {
                return rs.getInt("IdPersona");
            } else {          
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERROR en el query readIDUsuario: " + e.toString());
            return -1;

        }
    } 
    
    //llenar combobox 
    public static ResultSet CargarTiopoPersona(){
       Connection con; 
       PreparedStatement ps; 
       try{
           con =  conexionSql.getConexion();
           ps = con.prepareStatement("select * from TipoPersona");
           ResultSet rs; 
           rs = ps.executeQuery();
           return rs;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar");
           return null; 
       }
    }
    
    //MOSTRAR DE REGISTRO 
     public boolean agregar(Registro registro){

        try {

            PreparedStatement addVenta = conexionSql.getConexion().prepareStatement("insert into tbVentas(producto, cantidad, precio, cliente, comentario) values(?,?,?,?,?)");
//
//            addVenta.setString(1, ModeloVenta.getProducto());
//
//            addVenta.setInt(2, ModeloVenta.getCantidad());
//
//            addVenta.setDouble(3, ModeloVenta.getPrecio());
//            
//            addVenta.setString(4, ModeloVenta.getCliente());
//            
//            addVenta.setString(5, ModeloVenta.getComentarios());

            addVenta.executeUpdate();
            System.out.println("funciona");
            
            return true;

        } catch (SQLException e) {

            System.out.println(e.toString()); 
            return false;

        }

    }
}
