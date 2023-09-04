package Modelo;
import VIsta.Programa.Inventario.Inventario_Inicio_Transportes;
import VIsta.VistaAgregarTransporte;
import java.sql.*;
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

        } catch (SQLException e) {
           
            System.out.println(e.toString());
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

            System.out.println(ex.toString());

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
"	 where NumeroDeGrupo like '%"+IIT.txtBusqueda.getText()+"%';"; //Parametro + el texto a obtener del textfield

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("idDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("NumeroDeGrupo")});

            }

            

            IIT.tbDatosTransporte.setModel(modelo);



          

        }catch(SQLException ex){

            System.out.println(ex.toString());

        }

    }
    
    public void eliminar(VistaAgregarTransporte IIT2){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = IIT2.tbDatosTransporte.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = IIT2.tbDatosTransporte.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = conexionSql.getConexion().prepareStatement("delete from tbDetallesTransportesEstacion where IdDetalleTransporteEstacion = '" + miId + "'");
            deleteUser.executeUpdate();
        } catch (Exception e) {
         System.out.println(e.toString());
        }
    }
    
                                     

        
    
    public void actualizar(VistaAgregarTransporte IIT3){

        //obtenemos que fila seleccionó el usuario

        int filaSeleccionada = IIT3.tbDatosTransporte.getSelectedRow();

        //Obtenemos el id de la fila seleccionada

        String miId = IIT3.tbDatosTransporte.getValueAt(filaSeleccionada, 0).toString();
   
       String nuevoValorIngresadoDetalle = IIT3.txtDetalles.getText();

       String nuevoValorIngresadoPlaca = IIT3.txtPlaca.getText();

       

        try {

            PreparedStatement updateUser = conexionSql.getConexion().prepareStatement("update tbDetallesTransportesEstacion set DetalleTransporte = ?, Placa = ? where IdDetalleTransporteEstacion = ?");

            updateUser.setString(1, nuevoValorIngresadoDetalle);

            updateUser.setString(2, nuevoValorIngresadoPlaca);
            
         

            updateUser.setString(3, miId);

            updateUser.executeUpdate();



        } catch (Exception e) {



            System.out.println(e.toString());



        }

    }
    
    
}