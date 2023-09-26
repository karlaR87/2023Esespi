/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import VIsta.Programa.Inventario.Agregar_Armamento;
import VIsta.Programa.Inventario.Agregar_Municion_Armas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import VIsta.Programa.Inventario.Agregar_calibre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author karla
 */
public class ModeloCalibre {
    private int idCalibre;
    private String Calibre; 
    private int Cantidad; 

    public int getIdCalibre() {
        return idCalibre;
    }

    public void setIdCalibre(int idCalibre) {
        this.idCalibre = idCalibre;
    }

    public String getCalibre() {
        return Calibre;
    }

    public void setCalibre(String Calibre) {
        this.Calibre = Calibre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
     public void agregar(ModeloCalibre modelo) {
    try {
        String query = "INSERT INTO tbTipoMuniciones_Calibre ( Calibre, Cantidad) VALUES ( ?, ?);";

        System.out.println("QUERY");

        PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
        System.out.println("PREPARE");

        String cal = modelo.getCalibre();

        addDatos.setString(1, cal);
        System.out.println("DATO 1" + cal);
        

        addDatos.setInt(2, modelo.getCantidad());
        System.out.println("DATO 2");

        addDatos.executeUpdate();
        System.out.println("agrega datos");
        JOptionPane.showMessageDialog(null, "Datos agregados correctamente");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}
      //Agregar 
            public void agregarCalibreaArmas(int idArma, int idCalibre) {
          try {
              String query = "INSERT INTO tbMunicionesEstacion (IdDetalleArmamentoEstacion, IdTipoMunicion_Calibre) VALUES (?, ?);";
              PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
              addDatos.setInt(1, idArma);
              addDatos.setInt(2, idCalibre);
              addDatos.executeUpdate();
              JOptionPane.showMessageDialog(null,"Datos agregados exitosamente");
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e.toString());
          }
      }

              
  //MOSTRAR
    
    public void mostrar(Agregar_calibre calibre){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(new Object []{"IdTipoMunicion_Calibre","Calibre", "Cantidad"});
       
        try{
            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT * FROM tbTipoMuniciones_Calibre" ;
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
              
                modelo.addRow(new Object[] {rs.getString("IdTipoMunicion_Calibre"),rs.getString("Calibre"),rs.getString("Cantidad")});
                
            }
            calibre.tbCalibre.setModel(modelo);
                
        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null, ex.toString());

        }

    }
    
    
      //MOSTRAR
    
    public void mostrarParaSeleccion(Agregar_Municion_Armas calibre){
        
       System.out.println("mostrar");
        //Definir un modelo de datos para la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        //Agregar columnas o encabezado de la tabla
        modelo.setColumnIdentifiers(new Object[] {"IdTipoMunicion_Calibre", "Calibre", "Checbox"});
        
        
        //Hacer select a la base de datos
        try{
            Statement statement = conexionSql.getConexion().createStatement();
            
            ResultSet rs = statement.executeQuery("SELECT IdTipoMunicion_Calibre, Calibre FROM tbTipoMuniciones_Calibre");
            
            
            
            //Recorrer los resultados
            while(rs.next()){
                modelo.addRow(new Object[] {rs.getInt("IdTipoMunicion_Calibre"), rs.getString("Calibre"), null} );
                
            }
            calibre.tbMuniconSelecccion.setModel(modelo);
            
//            calibre.addCheckBox(2, calibre.tbMuniconSelecccion);

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    
    //Mostrar datos seleccionados
    public void SeleccionarDato(JTable paramtable, JTextField paramCalibre, JSpinner paramCantidad){
        
        try {
            int fila = paramtable.getSelectedRow();
            
            if(fila >= 0){
                // Obtener los valores de las celdas seleccionadas
            String calibre = paramtable.getValueAt(fila, 1).toString();
            int cantidad = Integer.parseInt(paramtable.getValueAt(fila, 2).toString());

            // Establecer los valores en los componentes de la interfaz
            paramCalibre.setText(calibre);
            paramCantidad.setValue(cantidad);
            
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
    }
    
    //Eliminar 
    public void eliminar(Agregar_calibre calibre){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = calibre.tbCalibre.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = calibre.tbCalibre.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tbTipoMuniciones_Calibre where IdTipoMunicion_Calibre = '" + miId + "'");
            
            deleteUser.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        } catch (Exception e) {
            
         JOptionPane.showMessageDialog(null, e.toString());
        }
    }

 //Actualizar 
    
   

//Luego colocamos el método para actualizar
 public void actualizar(Agregar_calibre calibre) {

       
            
            //obtenemos que fila seleccionó el usuario
            
            int filaSeleccionada = calibre.tbCalibre.getSelectedRow();
           
            //Obtenemos el id de la fila seleccionada
            
            String miId = calibre.tbCalibre.getValueAt(filaSeleccionada, 0).toString();
           
            
            String nuevoValorIngresadoNombre = calibre.txtCalibre.getText();
            
            
            int nuevoValorIngresadoCantidad = (int) calibre.spCantidad.getValue();
            
           
            
            
            
            try {
                
                PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("UPDATE tbTipoMuniciones_Calibre SET Calibre = ?, Cantidad = ? WHERE IdTipoMunicion_Calibre = ?");
                updateUser.setString(1, nuevoValorIngresadoNombre);
                updateUser.setInt(2, nuevoValorIngresadoCantidad);
                updateUser.setString(3, miId);
                
                updateUser.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e.toString());
            }
            

    }

 
    public void mostrarDatos(Agregar_calibre IIT){

        

        DefaultTableModel modelo = new DefaultTableModel();

    modelo.setColumnIdentifiers(new Object[]{"IdTipoMunicion_Calibre", "Calibre", "Cantidad",});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

           String filtro = IIT.txtbuscarC.getText(); 

        String query = "SELECT * FROM tbTipoMuniciones_Calibre WHERE " +
                       "IdTipoMunicion_Calibre LIKE '%" + filtro + "%' OR " +
                       "Cantidad LIKE '%" + filtro + "%' OR " +
                       "Calibre LIKE '%" + filtro + "%' " ;
                       
           
            

            ResultSet rs = statement.executeQuery(query);
            

            

          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdTipoMunicion_Calibre"),rs.getString("Calibre"),rs.getString("Cantidad")});

            }

            

                        IIT.tbCalibre.setModel(modelo);



          

        }catch(SQLException ex){

            System.out.println(ex.toString());

}

} 
}
