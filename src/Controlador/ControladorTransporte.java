package Controlador;

import Modelo.ModeloTransporte;
import Modelo.conexionSql;
import VIsta.VistaAgregarTransporte;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorTransporte {
    
        public ArrayList getTiposTransporte()
        {
            String SQL = "select IdTipoTransporteEstacion, TipoTransporte from tbTipoTransportesEstacion";
            ResultSet ressu = null;
            ArrayList lista = new ArrayList(); ;
            
            try
            {
               
                conexionSql conn = new conexionSql();
                       conn.getConexion();
                Statement sta = conn.createStatement();
                ressu = sta.executeQuery(SQL);
                
                while (ressu.next())
                {
                    ModeloTransporte m = new ModeloTransporte(ressu.getInt(1), ressu.getString(2));
                    lista.add(m);
                }
            }
            catch (SQLException e)
            {
                
                System.out.println(e);
                //JOptionPane.showMessageDialog(null, e);
            }
            return lista;
        }
}
