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
    private String Nombre; 
    private int Cantidad;

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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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
    
   
    //Agregar 
    
    public boolean agregar(ModeloEquipoEspecial equipo){

        try {

            PreparedStatement add = conexionSql.getConexion().prepareStatement("insert into tbCategoriasEquipamiento(IdCategoriaEquipamiento, Nombre, Cantidad) values(?,?,?)");

            add.setInt(1, equipo.getIdCategoriaEquipamiento());

            add.setString(2, equipo.getNombre());
            
            add.setInt(3, equipo.getCantidad());
            

            add.executeUpdate();
            System.out.println("funciona");
            
            return true;

        } catch (SQLException e) {

            System.out.println(e.toString()); 
            return false;

        }

    }
    
    
     //Mostrar
    
    public void mostrar(Agregar_EquipoEspecial especial){

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"IdTiposEquipamientoEstacion","IdCategoriaEquipamiento", "Nombre", "Cantidad"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tbCategoriasEquipamiento";

            ResultSet rs = statement.executeQuery(query);

            
            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdTiposEquipamientoEstacion"),rs.getString("IdCategoriaEquipamiento"),rs.getInt("Cantidad"), rs.getString("Nombre") });

            }

            especial.tbEquiposEspeciales.setModel(modelo);
            

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
   
       String nuevoValorIngresadoNombre = especial.jTextField1.getText();

       String nuevoValorIngresadoCantidad = especial.jSpinner1.toString();


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
