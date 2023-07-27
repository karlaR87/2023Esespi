package Modelo;

import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ModeloTransporte {
    //primer combobox
  private int id;
  private String tipotransporte;
   //segundo combobox
  private int id2;
  private String marcas;
    //tercer combobox
  private int id3;
  private int grupo;
  
    //primer combobox
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
  
    //segundo combobox

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }
    
    //tercer combobox

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    
  
    //primer combobox
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
    
    //segundo combobox
    public void llenarComboMarcas(JComboBox<String> comboboxMarcas) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdMarcaDeVehiculo, Marca from tbMarcasDeVehiculos";
        comboboxMarcas.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdMarcaDeVehiculo");
                String nombre = result.getString("Marca");
                comboboxMarcas.addItem(nombre);
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
    
    //tercer combobox
    public void llenarComboGrupos(JComboBox<String> comboboxMarcas) throws SQLException {
         Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

 

        String SSQL = "Select IdGrupoPatrullaje, NumeroDeGrupo from tbGrupoPatrullajes";
        comboboxMarcas.removeAllItems();

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                int id = result.getInt("IdGrupoPatrullaje");
                String nombre = result.getString("NumeroDeGrupo");
                comboboxMarcas.addItem(nombre);
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
    
    
    //retornos de id
    

    public int IdRetorno2(String tiposTransporte) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int tiposTrans = -1; //retornará un valor erróneo en caso de no encontrarse 

 

        String SSQL = "SELECT IdMarcaDeVehiculo FROM tbMarcasDeVehiculos WHERE Marca = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, tiposTransporte);
            result = pst.executeQuery();

 

            if (result.next()) {
                tiposTrans = result.getInt("IdMarcaDeVehiculo");
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
    
    public int IdRetorno(String tiposTransporte) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int tiposTrans = -1; //retornará un valor erróneo en caso de no encontrarse 

 

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
    public int IdRetorno3(String tiposTransporte) throws SQLException {
        Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        int tiposTrans = -1; //retornará un valor erróneo en caso de no encontrarse 

 

        String SSQL = "SELECT IdGrupoPatrullaje FROM tbGrupoPatrullajes WHERE NumeroDeGrupo = ?";

 

        try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            pst.setString(1, tiposTransporte);
            result = pst.executeQuery();

 

            if (result.next()) {
                tiposTrans = result.getInt("IdGrupoPatrullaje");
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