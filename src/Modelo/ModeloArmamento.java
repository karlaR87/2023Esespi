/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import VIsta.Programa.Inventario.Agregar_Armamento;
import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import java.sql.*; 
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karla
 */
public class ModeloArmamento {
    
    private String Armas; 
    private int Cantidad; 
    private int idTipoArmamento;
    private String tipoArmamento; 

    public String getTipoArmamento() {
        return tipoArmamento;
    }

    public void setTipoArmamento(String tipoArmamento) {
        this.tipoArmamento = tipoArmamento;
    }

    public String getArmas() {
        return Armas;
    }

    public void setArmas(String Armas) {
        this.Armas = Armas;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIdTipoArmamento() {
        return idTipoArmamento;
    }

    public void setIdTipoArmamento(int idTipoArmamento) {
        this.idTipoArmamento = idTipoArmamento;
    }
     public void mostrarDatos(Agregar_Armamento IIT){

        

        DefaultTableModel modelo = new DefaultTableModel();

    modelo.setColumnIdentifiers(new Object[]{"DetalleArmamento", "IdTipoArmamentoEstacion", "Cantidad", "IdDetalleArmamentoEstacion"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

           String filtro = IIT.txtbuscarArm.getText(); 

        String query = "SELECT * FROM  tbDetallesArmamentosEstacion WHERE " +
                       "IdTipoArmamentoEstacion LIKE '%" + filtro + "%' OR " +
                       "DetalleArmamento LIKE '%" + filtro + "%' OR " +
                       "Cantidad LIKE '%" + filtro + "%' OR " +
                       "IdDetalleArmamentoEstacion LIKE '%" + filtro + "%';";
           
            

            ResultSet rs = statement.executeQuery(query);
            

            

          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("IdTipoArmamentoEstacion"),rs.getString("DetalleArmamento"),rs.getString("Cantidad"), rs.getString("IdDetalleArmamentoEstacion")});

            }

            

            IIT.tbArmas.setModel(modelo);



          

        }catch(SQLException ex){

            System.out.println(ex.toString());

        }

    }
    //LLENAR 
    public void llenarComboTipoArmamento(JComboBox<String> combocat) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdTipoArmamentoEstacion, TipoArmamento from tbTipoArmamentosEstacion";
        combocat.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdTipoArmamentoEstacion");
                String nombre = result.getString("TipoArmamento");
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
    
    public int IdRetornoTipoArmamento(String genero) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int gen = -1; 

 

        String SSQL = "SELECT IdTipoArmamentoEstacion FROM tbTipoArmamentosEstacion WHERE TipoArmamento = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, genero);
            result = pst.executeQuery();

 

            if (result.next()) {
                gen = result.getInt("IdTipoArmamentoEstacion");
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
 public void agregar(ModeloArmamento armas) {
    try {
        // Obtén el valor de IdTiposEquipamientoEstacion que intentas insertar
        int IdTipoArmamentoEstacion = armas.getIdTipoArmamento();
        
       
            // El valor existe, puedes proceder con la inserción
            String query = "INSERT INTO tbDetallesArmamentosEstacion (IdTipoArmamentoEstacion, DetalleArmamento, Cantidad) VALUES (?, ?, ?);";
            PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
            addDatos.setInt(1, IdTipoArmamentoEstacion);
            String arma = armas.getArmas();
            addDatos.setString(2, arma);
            addDatos.setInt(3, armas.getCantidad());
            addDatos.executeUpdate();
            System.out.println("Datos agregados exitosamente.");
       
    } catch (SQLException e) {
        System.out.println("Error al agregar datos: " + e.toString());
        }
    }
 
 //MOSTRAR
    
    public void mostrar(Agregar_Armamento armamento){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(new Object []{"IdDetalleArmamentoEstacion","DetalleArmamento", "Cantidad", "IdTipoArmamentoEstacion"});
       
        try{
            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select * from tbDetallesArmamentosEstacion";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
              
                modelo.addRow(new Object[] {rs.getString("IdDetalleArmamentoEstacion"),rs.getString("DetalleArmamento"),rs.getString("Cantidad"), rs.getString("IdTipoArmamentoEstacion")});
                
            }
            armamento.tbArmas.setModel(modelo);
                
        }catch(SQLException ex){

            System.out.println(ex.toString());

        }

    }
    
    
    
    
//    
//    //Eliminar 
//    public void eliminar(Agregar_EquipoEspecial especial){
//    
//        //obtenemos que fila seleccionó el usuario
//        int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();
//        
//        //Obtenemos el id de la fila seleccionada
//        String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
//        //borramos 
//        try {
//            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tdDetallesEquipo where IdDetalleEquipo = '" + miId + "'");
//            
//            deleteUser.executeUpdate();
//        } catch (Exception e) {
//            
//         System.out.println(e.toString());
//        }
//    }
//
// //Actualizar 
//    
//   
//
////Luego colocamos el método para actualizar
// public void actualizar(Agregar_EquipoEspecial especial) {
//
//        try {
//            
//            //obtenemos que fila seleccionó el usuario
//            
//            int filaSeleccionada = especial.tbEquiposEspeciales.getSelectedRow();
//            System.out.println("pasa int ");
//            //Obtenemos el id de la fila seleccionada
//            
//            String miId = especial.tbEquiposEspeciales.getValueAt(filaSeleccionada, 0).toString();
//            System.out.println("El miId");
//            
//            String nuevoValorIngresadoNombre = especial.txtDetalles.getText();
//            System.out.println("Nuevo nombre ");
//            
//            int nuevoValorIngresadoCantidad = (int) especial.spCantidad.getValue();
//            
//            // Obtén el valor seleccionado en el ComboBox (nombre del tipo de equipamiento)
//            String nuevoValorIngresadoTipoNombre = especial.cmbClasificacion.getSelectedItem().toString();
//            
//            // Obtén el ID correspondiente al nombre seleccionado
//            int nuevoValorIngresadoTipo = obtenerIdClasificacion(nuevoValorIngresadoTipoNombre);
//            
//            
//            
//            
//            try {
//                
//                PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("UPDATE tdDetallesEquipo SET Detalles = ?, Cantidad = ?, IdTiposEquipamientoEstacion = ? WHERE IdDetalleEquipo = ?");
//                updateUser.setString(1, nuevoValorIngresadoNombre);
//                updateUser.setInt(2, nuevoValorIngresadoCantidad);
//                updateUser.setInt(3, nuevoValorIngresadoTipo);
//                updateUser.setString(4, miId);
//                
//                updateUser.executeUpdate();
//                System.out.println("Se actualiza");
//                
//            } catch (Exception e) {
//                
//                System.out.println("Error de conversión a entero: " + e.getMessage());
//                
//                System.out.println(e.toString());
//            }
//            
//        } catch (SQLException ex) {
//
//            Logger.getLogger(ModeloEquipoEspecial.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//    
}
