/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*; 
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
}
