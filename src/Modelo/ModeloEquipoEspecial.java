/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                int id = result.getInt("IdCategoriaEquipamiento");
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
    
    
    
    
   
    //Agregar 
  public void agregar(ModeloEquipoEspecial equipo) {
        try {
            String query = "INSERT INTO tdDetallesEquipo (IdTipoEquipamientoEstacion, Detalles, Cantidad) VALUES (?, ?, ?);";
            System.out.println("cadena");
            PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
                        System.out.println("pasa 2");
            
                        
            addDatos.setInt(1, equipo.getIdTipoClasificacion());
                        System.out.println("pasa 4 ");
            addDatos.setString(2, equipo.getDetalles()); 
                        System.out.println("pasa 5 ");
            addDatos.setInt(3, equipo.getCantidad()); 
            System.out.println("pasa despues de pasar los datos ");

            

            addDatos.executeUpdate();
            System.out.println("agrega datos");

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
  
  
  
  
  //MOSTRAR
    
    public void mostrar(Agregar_EquipoEspecial inventa){
        
        DefaultTableModel modelo = new DefaultTableModel();
        System.out.println("a");

        modelo.setColumnIdentifiers(new Object []{"IdDetalleEquipo","IdTipoEquipamientoEstacion", "Detalles", "Cantidad"});
         System.out.println("b");


        try{
            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tdDetallesEquipo";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ti");
                modelo.addRow(new Object[] {rs.getString("IdDetalleEquipo"),rs.getString("IdTipoEquipamientoEstacion"),rs.getString("Detalles"), rs.getString("Cantidad")});
                System.out.println("agregando los datos se supnme");

            }
            inventa.tbEquiposEspeciales.setModel(modelo);
                System.out.println("ya se ven");
        }catch(SQLException ex){

            System.out.println(ex.toString());

        }

    }
    
    
    
    
    
    //Eliminar 
    public void eliminar(Agregar_EquipoEspecial especial){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();
        System.out.println("si");
        //Obtenemos el id de la fila seleccionada
        String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tbCategoriasEquipamiento where id = '" + miId + "'");
            System.out.println("pipipipi");
            deleteUser.executeUpdate();
        } catch (Exception e) {
            System.out.println("pipipipjhdhagdai");
         System.out.println(e.toString());
        }
    }

 //Actualizar 
    
   

//Luego colocamos el método para actualizar
 public void actualizar(Agregar_EquipoEspecial especial){

        //obtenemos que fila seleccionó el usuario

        int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();

        //Obtenemos el id de la fila seleccionada

        String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
        
       String nuevoValorIngresadoTipo =especial.cmbCat.toString();
   
       String nuevoValorIngresadoNombre = especial.txtDetalles.getText();

       String nuevoValorIngresadoCantidad = especial.spCantidad.toString();


        try {

            PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("update tbCategoriasEquipamiento set IdCategoriaEquipamiento = ?, Nombre = ?, Cantidad = ?");

            updateUser.setString(1, nuevoValorIngresadoTipo);

            updateUser.setString(2,(nuevoValorIngresadoNombre)) ;
            
             updateUser.setString(3, ( nuevoValorIngresadoCantidad));

            updateUser.setString(6, miId);

            updateUser.executeUpdate();



        } catch (Exception e) {



            System.out.println(e.toString());



        }

    }
    
}
