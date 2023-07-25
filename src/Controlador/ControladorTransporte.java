package Controlador;

import Modelo.ModeloTransporte;
import Modelo.conexionSql;
import VIsta.VistaAgregarTransporte;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControladorTransporte {
    
        public void getTiposTransporte(JComboBox<String> cbox_tipos) 
        {
            Connection conectar = null;
            String SQL = "select IdTipoTransporteEstacion, TipoTransporte from tbTipoTransportesEstacion";
            ResultSet ressu = null;
            PreparedStatement pst = null;
            cbox_tipos.removeAllItems();
            //ArrayList lista = new ArrayList(); 
            
            try
            {
               
                conexionSql conn = new conexionSql();
                       conectar = conn.getConexion();
            pst = conectar.prepareStatement(SQL);
            ressu = pst.executeQuery();
                 
            //if (result.next()) {
              //  idRegion = result.getInt("id_region");
            //}

                while (ressu.next())
                {
                    ModeloTransporte m = new ModeloTransporte(ressu.getInt(1), ressu.getString(2));
              //      lista.add(m);
                }
            }
            catch (SQLException e)
            {
                
                System.out.println(e);
                //JOptionPane.showMessageDialog(null, e);
            }
            
        }
}
