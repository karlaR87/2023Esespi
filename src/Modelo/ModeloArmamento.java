/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import VIsta.Programa.Inventario.Agregar_Armamento;
import VIsta.Programa.Inventario.Agregar_EquipoEspecial;
import java.sql.*; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    //Agregar Armas
 public int agregar(ModeloArmamento armas) {
    try {
        // Obtén el valor de IdTiposEquipamientoEstacion que intentas insertar
        int IdTipoArmamentoEstacion = armas.getIdTipoArmamento();

        // El valor existe, puedes proceder con la inserción
        String query = "INSERT INTO tbDetallesArmamentosEstacion (IdTipoArmamentoEstacion, DetalleArmamento, Cantidad) VALUES (?, ?, ?);";
        
        // Agregar el Statement.RETURN_GENERATED_KEYS para obtener las claves generadas automáticamente
        PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        
        addDatos.setInt(1, IdTipoArmamentoEstacion);
        String arma = armas.getArmas();
        addDatos.setString(2, arma);
        addDatos.setInt(3, armas.getCantidad());
        addDatos.executeUpdate();

        // Obtener las claves generadas automáticamente (en este caso, el ID)
        ResultSet generatedKeys = addDatos.getGeneratedKeys();
        if (generatedKeys.next()) {
            int idDetalleArma = generatedKeys.getInt(1);
            System.out.println("Detalle de arma agregado con ID: " + idDetalleArma);
            return idDetalleArma; // Retorna el ID generado
        } else {
            throw new SQLException("No se pudo obtener el ID del detalle de arma.");
        }
    } catch (SQLException e) {
        System.out.println("Error al agregar datos: " + e.toString());
        return -1; // Retorna un valor indicando un error
    }
}
 
 //Agregar relacion
 
 public void agregarRelacionesArmamentoCalibres(int idDetalleArma, List<Integer> idsCalibres) {
    try {
        // Consulta SQL para insertar relaciones en la tabla intermedia
        String query = "INSERT INTO tbMunicionesEstacion (IdDetalleArmamentoEstacion, IdTipoMunicion_Calibre) VALUES (?, ?);";
        
        // Preparar la declaración SQL
        PreparedStatement addRelaciones = conexionSql.getConexion().prepareStatement(query);
        
        // Iterar sobre los IDs de los calibres y agregar las relaciones
        for (int idCalibre : idsCalibres) {
            addRelaciones.setInt(1, idDetalleArma); // Último ID de arma obtenido
            addRelaciones.setInt(2, idCalibre); // ID del calibre actual
            addRelaciones.executeUpdate();
        }
        System.out.println("ID del detalle de arma: " + idDetalleArma);
        System.out.println("IDs de calibres: " + idsCalibres);
        
        System.out.println("Relaciones entre arma y calibre agregadas con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al agregar relaciones: " + e.toString());
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
    //Eliminar 
    public void eliminar(Agregar_Armamento armas){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = armas.tbArmas.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = armas.tbArmas.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tbDetallesArmamentosEstacion where IdDetalleArmamentoEstacion = '" + miId + "'");
            
            deleteUser.executeUpdate();
        } catch (Exception e) {
            
         System.out.println(e.toString());
        }
    }

 //Actualizar 
    
   

//Luego colocamos el método para actualizar
 public void actualizar(Agregar_Armamento armas) {

       
            try {
                
                
                //obtenemos que fila seleccionó el usuario
                
                int filaSeleccionada = armas.tbArmas.getSelectedRow();
                System.out.println("pasa int ");
                //Obtenemos el id de la fila seleccionada
                
                String miId = armas.tbArmas.getValueAt(filaSeleccionada, 0).toString();
                System.out.println("El miId");
                
                String nuevoValorIngresadoNombre = armas.txtDetalles.getText();
                System.out.println("Nuevo nombre ");
                
                int nuevoValorIngresadoCantidad = (int) armas.spCantidad.getValue();
                
                // Obtén el valor seleccionado en el ComboBox (nombre del tipo de equipamiento)
                String nuevoValorIngresadoTipoNombre = armas.cmbTipoArmamento.getSelectedItem().toString();
                
                // Obtén el ID correspondiente al nombre seleccionado
                int nuevoValorIngresadoTipo = IdRetornoTipoArmamento(nuevoValorIngresadoTipoNombre);
                
                
                
                
                try {
                    
                    PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("UPDATE tbDetallesArmamentosEstacion SET DetalleArmamento = ?, Cantidad = ?, IdTipoArmamentoEstacion = ? WHERE IdDetalleArmamentoEstacion = ?");
                    updateUser.setString(1, nuevoValorIngresadoNombre);
                    updateUser.setInt(2, nuevoValorIngresadoCantidad);
                    updateUser.setInt(3, nuevoValorIngresadoTipo);
                    updateUser.setString(4, miId);
                    
                    updateUser.executeUpdate();
                    System.out.println("Se actualiza");
                    
                } catch (Exception e) {
                    
                    System.out.println("Error de conversión a entero: " + e.getMessage());
                    
                    System.out.println(e.toString());
                }
                
            } catch (SQLException ex) {
                
                Logger.getLogger(ModeloArmamento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 

    
    
}
