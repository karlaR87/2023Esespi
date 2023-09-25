package Modelo;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import VIsta.VistaAgregarTransporte;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ModeloDatosTransporte {
    private String detalles;
     private String placa;
     private int tipo;
     private int Marca;
     private int Grupo;

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getMarca() {
        return Marca;
    }

    public void setMarca(int Marca) {
        this.Marca = Marca;
    }

    public int getGrupo() {
        return Grupo;
    }

    public void setGrupo(int Grupo) {
        this.Grupo = Grupo;
    }
     
     
    
    public void agregar(ModeloTransporte modeloTransporte, ModeloDatosTransporte modeloDatost) {
        try {
            String query = "Insert into tbDetallesTransportesEstacion (DetalleTransporte, Placa, IdTipoTransporteEstacion, IdMarcaDeVehiculo, IdGrupoPatrullaje) VALUES(?,?, ?, ?, ?);";
            PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
            addDatos.setString(1, modeloDatost.getDetalles());
            addDatos.setString(2, modeloDatost.getPlaca());
            addDatos.setInt(3, modeloTransporte.getId()); 
            addDatos.setInt(4, modeloTransporte.getId2()); 
            addDatos.setInt(5, modeloTransporte.getId3()); 
           

            

            addDatos.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro agregado");

        } catch (SQLException e) {
           
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    
    //Mostrar datos en las tablas
    public void mostrar(VistaAgregarTransporte IIT){
   
       

        DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"idDetalleTransporteEstacion","DetalleTransporte", "Placa", "TipoTransporte", "Marca", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT        dbo.tbDetallesTransportesEstacion.IdDetalleTransporteEstacion, dbo.tbDetallesTransportesEstacion.DetalleTransporte, dbo.tbDetallesTransportesEstacion.Placa, dbo.tbTipoTransportesEstacion.TipoTransporte, \n" +
"                         dbo.tbMarcasDeVehiculos.Marca, dbo.tbGrupoPatrullajes.NumeroDeGrupo\n" +
"FROM            dbo.tbDetallesTransportesEstacion INNER JOIN\n" +
"                         dbo.tbTipoTransportesEstacion ON dbo.tbDetallesTransportesEstacion.IdTipoTransporteEstacion = dbo.tbTipoTransportesEstacion.IdTipoTransporteEstacion INNER JOIN\n" +
"                         dbo.tbMarcasDeVehiculos ON dbo.tbDetallesTransportesEstacion.IdMarcaDeVehiculo = dbo.tbMarcasDeVehiculos.IdMarcaDeVehiculo INNER JOIN\n" +
"                         dbo.tbGrupoPatrullajes ON dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje = dbo.tbGrupoPatrullajes.IdGrupoPatrullaje";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                System.out.println("ddddd");
                modelo.addRow(new Object[] {rs.getString("idDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("NumeroDeGrupo")});

            }

            

            IIT.tbDatosTransporte.setModel(modelo);



          

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    //Barra de busqueda
    public void mostrarDatos(VistaAgregarTransporte IIT){ //Parametro de la busqueda

        

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"idDetalleTransporteEstacion","DetalleTransporte", "Placa", "TipoTransporte", "Marca", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT        dbo.tbDetallesTransportesEstacion.IdDetalleTransporteEstacion, dbo.tbDetallesTransportesEstacion.DetalleTransporte, dbo.tbDetallesTransportesEstacion.Placa, dbo.tbTipoTransportesEstacion.TipoTransporte,\n" +
"                        dbo.tbMarcasDeVehiculos.Marca, dbo.tbGrupoPatrullajes.NumeroDeGrupo\n" +
"FROM            dbo.tbDetallesTransportesEstacion INNER JOIN\n" +
"                        dbo.tbTipoTransportesEstacion ON dbo.tbDetallesTransportesEstacion.IdTipoTransporteEstacion = dbo.tbTipoTransportesEstacion.IdTipoTransporteEstacion INNER JOIN\n" +
"                         dbo.tbMarcasDeVehiculos ON dbo.tbDetallesTransportesEstacion.IdMarcaDeVehiculo = dbo.tbMarcasDeVehiculos.IdMarcaDeVehiculo INNER JOIN\n" +
"                         dbo.tbGrupoPatrullajes ON dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje = dbo.tbGrupoPatrullajes.IdGrupoPatrullaje\n" +
"\n" +
"	 where NumeroDeGrupo like '%"+IIT.txtBusqueda.getText()+"%' OR "
                    + "IdDetalleTransporteEstacion LIKE '%" +IIT.txtBusqueda.getText()+ "%' OR "
                    + "DetalleTransporte LIKE '%" + IIT.txtBusqueda.getText()+ "%' OR "
                    + "Placa like '%"+ IIT.txtBusqueda.getText() +"%' OR "
                    + "TipoTransporte like '%" +IIT.txtBusqueda.getText() + "%' or "
                    + "Marca like '%"+ IIT.txtBusqueda.getText() +"%';"; //Parametro + el texto a obtener del textfield

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("idDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("NumeroDeGrupo")});

            }

            

            IIT.tbDatosTransporte.setModel(modelo);



          

        }catch(SQLException ex){

           JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
    
    //Mostrar datos seleccionados
    public void SeleccionarDato(JTable paramtable, JTextField paramDetalles, JTextField paramPlaca, JComboBox paramTipo, JComboBox paramMarca, JComboBox paramGrupo){
        
        try {
            int fila = paramtable.getSelectedRow();
            
            if(fila >= 0){
                // Obtener los valores de las celdas seleccionadas
            String detalles = paramtable.getValueAt(fila, 0).toString();
            String placa = paramtable.getValueAt(fila, 1).toString();
            String tipo = paramtable.getValueAt(fila, 2).toString();
            String marca = paramtable.getValueAt(fila, 3).toString();
            String grupo = paramtable.getValueAt(fila, 4).toString();

            // Establecer los valores en los componentes de la interfaz
            paramDetalles.setText(detalles);
            paramPlaca.setText(placa);
            paramTipo.setSelectedItem(tipo);
            paramMarca.setSelectedItem(marca);
            paramGrupo.setSelectedItem(grupo);
            
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
    
    
    //Eliminar
    public void eliminar(VistaAgregarTransporte IIT2){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = IIT2.tbDatosTransporte.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = IIT2.tbDatosTransporte.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tbDetallesTransportesEstacion where IdDetalleTransporteEstacion = '" + miId + "'");
            deleteUser.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    
                                     

        
    
    public void actualizar(VistaAgregarTransporte IIT3) throws SQLException{
        ModeloTransporte n = new ModeloTransporte();

        //obtenemos que fila seleccionó el usuario

        int filaSeleccionada = IIT3.tbDatosTransporte.getSelectedRow();

        //Obtenemos el id de la fila seleccionada

        String miId = IIT3.tbDatosTransporte.getValueAt(filaSeleccionada, 0).toString();
   
       String nuevoValorIngresadoDetalle = IIT3.txtDetalles.getText();

       String nuevoValorIngresadoPlaca = IIT3.txtPlaca.getText();

       String combo1 =IIT3.cmbTipos.getSelectedItem().toString();
       int var1 = n.IdRetorno(combo1);
       
       String combo2 = IIT3.cmbMarcas.getSelectedItem().toString();
       int var2 = n.IdRetorno2(combo2);
       
       String combo3 = IIT3.cmbGrupos.getSelectedItem().toString();
       int var3 = n.IdRetorno3(combo3);

        try {

            PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("update tbDetallesTransportesEstacion set DetalleTransporte = ?, Placa = ?, IdTipoTransporteEstacion = ?, IdMarcaDeVehiculo = ?, IdGrupoPatrullaje = ? where IdDetalleTransporteEstacion = ?");

            updateUser.setString(1, nuevoValorIngresadoDetalle);

            updateUser.setString(2, nuevoValorIngresadoPlaca);
            
            updateUser.setInt(3, var1);
            
            updateUser.setInt(4, var2);
            
            updateUser.setInt(5, var3);


            updateUser.setString(6, miId);
              

            updateUser.executeUpdate();
               

            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (Exception e) {



            JOptionPane.showMessageDialog(null,e.toString());



        }

    }
    
    
}