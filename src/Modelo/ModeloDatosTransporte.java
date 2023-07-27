package Modelo;
import VIsta.VistaAgregarTransporte;
import java.sql.*;


public class ModeloDatosTransporte {
    private String detalles;
     private String placa;

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
    
    
}