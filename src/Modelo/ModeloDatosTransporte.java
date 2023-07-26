
package Modelo;
import java.sql.*;


public class ModeloDatosTransporte {
    private String TipoTransporte;
    private int Cantidad;

    public String getTipoTransporte() {
        return TipoTransporte;
    }

    public void setTipoTransporte(String TipoTransporte) {
        this.TipoTransporte = TipoTransporte;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void agregar(ModeloTransporte modeloTransporte, ModeloDatosTransporte modeloDatost) {
        try {
            String query = "Insert into tbTipoTransportesEstacion (TipoTransporte, Cantidad) VALUES(?,?);";
            PreparedStatement addDatos = conexionSql.getConexion().prepareStatement(query);
            addDatos.setString(1, modeloTransporte.getTipotransporte());
            addDatos.setInt(2, modeloDatost.getCantidad());

            

            addDatos.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
