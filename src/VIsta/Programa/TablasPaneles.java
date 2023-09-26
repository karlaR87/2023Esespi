/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIsta.Programa;

import Modelo.conexionSql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIEL SALGUERO
 */
public class TablasPaneles extends javax.swing.JFrame {

    /**
     * Creates new form TablasPaneles
     */
    public TablasPaneles() {
        initComponents();
        MostrarDatos();
        MostrarDatosPat();
    }

    //Mostrar datos en la tabla de transporte
    
    public void MostrarDatos()
    {
              DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"IdDetalleTransporteEstacion", "Marca", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select t.IdDetalleTransporteEstacion, y.Marca, g.NumeroDeGrupo from tbDetallesTransportesEstacion t\n" +
"inner join tbMarcasDeVehiculos y on y.IdMarcaDeVehiculo = t.IdMarcaDeVehiculo\n" +
"inner join tbGrupoPatrullajes g on g.IdGrupoPatrullaje = t.IdGrupoPatrullaje";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("IdDetalleTransporteEstacion"), rs.getString("Marca"), rs.getString("NumeroDeGrupo")});

            }

            tbMostrarDatosT.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    }
    
    
    public void MostrarDatosPat()
    {
              DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"NumeroDeGrupo", "RecorridoPatrullaje", "Municipio"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select gu.NumeroDeGrupo ,pat.ExtensionKM AS RecorridoPatrullaje ,mun.Municipio from tbPatrullajes pat\n" +
            "inner join tbGrupoPatrullajes gu on gu.IdGrupoPatrullaje = pat.IdGrupoPatrullaje\n" +
            "inner join tbMunicipios mun on mun.IdMunicipio = pat.IdMunicipio";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("NumeroDeGrupo"),rs.getString("RecorridoPatrullaje"), rs.getString("Municipio")});

            }

            tbMostrarDatosP.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    
    }
    
    public void MostrarDatosPat2()
    {
              DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"NumeroDeGrupo", "RecorridoPatrullaje", "Municipio"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select gu.NumeroDeGrupo ,pat.ExtensionKM AS RecorridoPatrullaje ,mun.Municipio from tbPatrullajes pat\n" +
            "inner join tbGrupoPatrullajes gu on gu.IdGrupoPatrullaje = pat.IdGrupoPatrullaje\n" +
            "inner join tbMunicipios mun on mun.IdMunicipio = pat.IdMunicipio";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("NumeroDeGrupo"),rs.getString("RecorridoPatrullaje"), rs.getString("Municipio")});

            }

            tbMostrarDatosP.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrarDatosT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrarDatosP = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbMostrarDatosT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMostrarDatosT);

        tbMostrarDatosP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbMostrarDatosP);

        tbMos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbMos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablasPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablasPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablasPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablasPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablasPaneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tbMos;
    public javax.swing.JTable tbMostrarDatosP;
    public javax.swing.JTable tbMostrarDatosT;
    // End of variables declaration//GEN-END:variables
}
