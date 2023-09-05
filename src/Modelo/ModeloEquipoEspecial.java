/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class ModeloEquipoEspecial {
    
    private int IdCategoriaEquipamiento; 
    private String Categoria; 

    private int idTipoClasificacion; 
    private String clasificacion; 
    
    private int Cantidad;
    private String Detalles; 
    

    public int getIdCategoriaEquipamiento() {
        return IdCategoriaEquipamiento;
    }

    public void setIdCategoriaEquipamiento(int IdCategoriaEquipamiento) {
        this.IdCategoriaEquipamiento = IdCategoriaEquipamiento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

 

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIdTipoClasificacion() {
        return idTipoClasificacion;
    }

    public void setIdTipoClasificacion(int idTipoClasificacion) {
        this.idTipoClasificacion = idTipoClasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }
    
    
    
    
    
    
    //LLENAR 
    public void llenarCombo(JComboBox<String> combocat) throws SQLException {
         combocat.removeAllItems();
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdCategoriaEquipamiento, Categoria from tbCategoriasEquipamiento";
        combocat.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                String nombre = result.getString("Categoria");
                combocat.addItem(nombre);
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

 

        String SSQL = "SELECT IdCategoriaEquipamiento FROM tbCategoriasEquipamiento WHERE Categoria = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, genero);
            result = pst.executeQuery();

 

            if (result.next()) {
                gen = result.getInt("IdCategoriaEquipamiento");
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
    
    
        //LLENAR 
    public void llenarComboClasificacion(JComboBox<String> comboClasificacion, int idCategoria) throws SQLException {
     comboClasificacion.removeAllItems(); 
    comboClasificacion.removeAllItems();
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet result = null;

    String SSQL = "SELECT TipoEquipamiento FROM tbTiposEquipamientoEstacion WHERE IdCategoriaEquipamiento = ?";
    comboClasificacion.removeAllItems();

    try {
        conectar = conexionSql.getConexion();
        pst = conectar.prepareStatement(SSQL);
        pst.setInt(1, idCategoria);
        result = pst.executeQuery();

        while (result.next()) {
            String tipoEquipamiento = result.getString("TipoEquipamiento");
            comboClasificacion.addItem(tipoEquipamiento);
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
 
 }
  public int obtenerIdClasificacion(String clasificacion) throws SQLException {
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    int idClasificacion = -1;

    String SSQL = "SELECT IdTiposEquipamientoEstacion FROM tbTiposEquipamientoEstacion WHERE TipoEquipamiento = ?";

    try {
        conectar = conexionSql.getConexion();
        pst = conectar.prepareStatement(SSQL);
        pst.setString(1, clasificacion);
        result = pst.executeQuery();

        if (result.next()) {
            idClasificacion = result.getInt("IdTiposEquipamientoEstacion");
        } else {
            System.out.println("No se encontró ningún ID para " + clasificacion); // Agregamos una salida si no se encuentra el ID
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

    return idClasificacion;
}
    
    public int obtenerIdCategoriaDesdeIdClasificacion(int idClasificacion) throws SQLException {
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    int idCategoria = -1;

    String SSQL = "SELECT IdCategoriaEquipamiento FROM tbTiposEquipamientoEstacion WHERE IdTiposEquipamientoEstacion = ?";

    try {
        conectar = conexionSql.getConexion();
        pst = conectar.prepareStatement(SSQL);
        pst.setInt(1, idClasificacion);
        result = pst.executeQuery();

        if (result.next()) {
            idCategoria = result.getInt("IdCategoriaEquipamiento");
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

    return idCategoria;
}

   public String obtenerNombreCategoriaDesdeId(int idCategoria) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        String nombreCategoria = null;

        String SSQL = "SELECT Categoria FROM tbCategoriasEquipamiento WHERE IdCategoriaEquipamiento = ?";

        try {
            conectar = conexionSql.getConexion(); // Asegúrate de tener una conexión válida
            pst = conectar.prepareStatement(SSQL);
            pst.setInt(1, idCategoria);
            result = pst.executeQuery();

            if (result.next()) {
                nombreCategoria = result.getString("Categoria");
            }

        } catch (SQLException e) {
            // Manejo de errores
            JOptionPane.showMessageDialog(null, e.toString());
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

        return nombreCategoria;
    }

    
   
    //Agregar 
 public void agregar(ModeloEquipoEspecial equipo) {
    try {
        // Obtén el valor de IdTiposEquipamientoEstacion que intentas insertar
        int idTipoEquipamiento = equipo.getIdTipoClasificacion();
        
        // Verifica si el valor de idTipoEquipamiento existe en tbTiposEquipamientoEstacion
        if (existeTipoEquipamiento(idTipoEquipamiento)) {
            // El valor existe, puedes proceder con la inserción
            String query = "INSERT INTO tdDetallesEquipo (IdTiposEquipamientoEstacion, Detalles, Cantidad) VALUES (?, ?, ?);";
            PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
            addDatos.setInt(1, idTipoEquipamiento);
            String detalles = equipo.getDetalles();
            addDatos.setString(2, detalles);
            addDatos.setInt(3, equipo.getCantidad());
            addDatos.executeUpdate();
            System.out.println("Datos agregados exitosamente.");
        } else {
            // El valor no existe en tbTiposEquipamientoEstacion, maneja el error
            System.out.println("El valor de IdTiposEquipamientoEstacion no existe en tbTiposEquipamientoEstacion.");
            // Puedes mostrar un mensaje de error al usuario o tomar alguna otra acción aquí
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}
// Función para verificar si un valor de IdTiposEquipamientoEstacion existe en tbTiposEquipamientoEstacion
private boolean existeTipoEquipamiento(int idTipoEquipamiento) throws SQLException {
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    boolean existe = false;
    
    String SSQL = "SELECT IdTiposEquipamientoEstacion FROM tbTiposEquipamientoEstacion WHERE IdTiposEquipamientoEstacion = ?";
    
    try {
        conectar = conexionSql.getConexion();
        pst = conectar.prepareStatement(SSQL);
        pst.setInt(1, idTipoEquipamiento);
        result = pst.executeQuery();
        
        // Si result tiene al menos una fila, el valor existe
        existe = result.next();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
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
    
    return existe;
}
  
  
  public void mostrarDatos(Agregar_EquipoEspecial IIT){

        

        DefaultTableModel modelo = new DefaultTableModel();

    modelo.setColumnIdentifiers(new Object[]{"IdDetalleEquipo", "IdTiposEquipamientoEstacion", "Detalles", "Cantidad"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

           String filtro = IIT.txtBuscarEP.getText(); 

        String query = "SELECT * FROM tdDetallesEquipo WHERE " +
                       "IdDetalleEquipo LIKE '%" + filtro + "%' OR " +
                       "IdTiposEquipamientoEstacion LIKE '%" + filtro + "%' OR " +
                       "Detalles LIKE '%" + filtro + "%' OR " +
                       "Cantidad LIKE '%" + filtro + "%';";
           
            

            ResultSet rs = statement.executeQuery(query);
            

            

          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdDetalleEquipo"),rs.getString("IdTiposEquipamientoEstacion"),rs.getString("Detalles"), rs.getString("Cantidad")});

            }

            

            IIT.tbEquiposEspeciales.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }

  //MOSTRAR
    
    public void mostrar(Agregar_EquipoEspecial inventa){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(new Object []{"IdDetalleEquipo","IdTiposEquipamientoEstacion", "Detalles", "Cantidad"});
       
        try{
            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT d.IdDetalleEquipo, t.TipoEquipamiento AS NombreTipoEquipamiento, d.Detalles, d.Cantidad FROM tdDetallesEquipo d " +
                       "INNER JOIN tbTiposEquipamientoEstacion t ON d.IdTiposEquipamientoEstacion = t.IdTiposEquipamientoEstacion";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
              
                modelo.addRow(new Object[] {rs.getString("IdDetalleEquipo"),rs.getString("NombreTipoEquipamiento"),rs.getString("Detalles"), rs.getString("Cantidad")});
                
            }
            inventa.tbEquiposEspeciales.setModel(modelo);
                
        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    
    //Metodo para buscar
   public static void buscarEquipo(Agregar_EquipoEspecial inventa, String searchTerm) {
    DefaultTableModel tabla = new DefaultTableModel();
    tabla.setColumnIdentifiers(new Object[]{"IdDetalleEquipo", "NombreTipoEquipamiento", "Detalles", "Cantidad"});

    try {
        String query = "SELECT d.IdDetalleEquipo, t.TipoEquipamiento AS NombreTipoEquipamiento, d.Detalles, d.Cantidad FROM tdDetallesEquipo d " +
                       "INNER JOIN tbTiposEquipamientoEstacion t ON d.IdTipoEquipamientoEstacion = t.IdTiposEquipamientoEstacion " +
                       "WHERE d.idDetallesEquipo LIKE ? OR t.TipoEquipamiento LIKE ? OR d.Cantidad LIKE ?";
        
        PreparedStatement preparedStatement = conexionSql.getConexion().prepareStatement(query);
        preparedStatement.setString(1, "%" + searchTerm + "%");
        preparedStatement.setString(2, "%" + searchTerm + "%");
        preparedStatement.setString(3, "%" + searchTerm + "%");

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            tabla.addRow(new Object[]{rs.getString("IdDetalleEquipo"), rs.getString("NombreTipoEquipamiento"), rs.getString("Detalles"), rs.getString("Cantidad")});
        }

        inventa.tbEquiposEspeciales.setModel(tabla);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}
     
    
    //Eliminar 
    public void eliminar(Agregar_EquipoEspecial especial){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tdDetallesEquipo where IdDetalleEquipo = '" + miId + "'");
            
            deleteUser.executeUpdate();
        } catch (Exception e) {
            
         JOptionPane.showMessageDialog(null, e.toString());;
        }
    }

 //Actualizar 
    
   

//Luego colocamos el método para actualizar
 public void actualizar(Agregar_EquipoEspecial especial) {

        try {
            
            //obtenemos que fila seleccionó el usuario
            
            int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();
            System.out.println("pasa int ");
            //Obtenemos el id de la fila seleccionada
            
            String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
            System.out.println("El miId");
            
            String nuevoValorIngresadoNombre = especial.txtDetalles.getText();
            System.out.println("Nuevo nombre ");
            
            int nuevoValorIngresadoCantidad = (int) especial.spCantidad.getValue();
            
            // Obtén el valor seleccionado en el ComboBox (nombre del tipo de equipamiento)
            String nuevoValorIngresadoTipoNombre = especial.cmbClasificacion.getSelectedItem().toString();
            
            // Obtén el ID correspondiente al nombre seleccionado
            int nuevoValorIngresadoTipo = obtenerIdClasificacion(nuevoValorIngresadoTipoNombre);
            
            
            
            
            try {
                
                PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("UPDATE tdDetallesEquipo SET Detalles = ?, Cantidad = ?, IdTiposEquipamientoEstacion = ? WHERE IdDetalleEquipo = ?");
                updateUser.setString(1, nuevoValorIngresadoNombre);
                updateUser.setInt(2, nuevoValorIngresadoCantidad);
                updateUser.setInt(3, nuevoValorIngresadoTipo);
                updateUser.setString(4, miId);
                
                
                updateUser.executeUpdate();
                System.out.println("Se actualiza");
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
            
        } catch (SQLException ex) {

            Logger.getLogger(ModeloEquipoEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
