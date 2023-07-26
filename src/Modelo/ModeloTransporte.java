package Modelo;

import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ModeloTransporte {
    
  private int id;
  private String tipotransporte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipotransporte() {
        return tipotransporte;
    }

    public void setTipotransporte(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }
  
  
    public void llenarCombo(JComboBox<String> comboboxTipos) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdTipoTransporteEstacion, TipoTransporte from tbTipoTransportesEstacion";
        comboboxTipos.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdTipoTransporteEstacion");
                String nombre = result.getString("TipoTransporte");
                comboboxTipos.addItem(nombre);
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
    
    public int IdRetorno(String tiposTransporte) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int tiposTrans = -1; 

 

        String SSQL = "SELECT IdTipoTransporteEstacion FROM tbTipoTransportesEstacion WHERE TipoTransporte = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, tiposTransporte);
            result = pst.executeQuery();

 

            if (result.next()) {
                tiposTrans = result.getInt("IdTipoTransporteEstacion");
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

 

        return tiposTrans;
    }
}
