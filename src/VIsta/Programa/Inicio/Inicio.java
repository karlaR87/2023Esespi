/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import Modelo.mdl;
import VIsta.Login;
import VIsta.VistaUsers;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Inicio extends javax.swing.JPanel {

    JFreeChart grafico;
    JFreeChart grafico2;
    DefaultCategoryDataset datos = new DefaultCategoryDataset(); //valores para graficar
    DefaultCategoryDataset datos2 = new DefaultCategoryDataset(); //valores para graficar
   
    public Inicio() {
        initComponents();
        MostrarDatosGrafico();
        Grafico();
        MostrarDatosGraficoPat();
        GraficoPat();
    }
    
    //Mostrar datos en la tabla de transporte
    public void MostrarDatosGrafico()
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

            tbMostrar.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    
    }
    
    //Grafico de transporte
    public void Grafico()
    {
        try
        {
            
            for(int i = 0; i<tbMostrar.getRowCount();i++) //recorremos cada fila de la tabla
            {
                //Valor a graficar (se parsea para obtener el valor de la primera fila), identificar del grupo de datos, etiquetas de la columna a graficar
                datos.addValue(Integer.parseInt(tbMostrar.getValueAt(i, 0).toString()), tbMostrar.getValueAt(i, 1).toString(), tbMostrar.getValueAt(i, 2).toString());
            }
            
            //mostrar el gráfico
            
            grafico = ChartFactory.createBarChart("Grafico de transportes asignados", "Cantidad de vehiculos", "NumeroDeGrupo", datos, PlotOrientation.VERTICAL, true, true, false);
            
            ChartPanel panel = new ChartPanel(grafico);
            add(panel);
            panel.setBounds(440, 13, 530, 275);
            panel.setBackground(Color.DARK_GRAY);
            
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
           
    }
    
    
    
    
    //Mostrar datos en la tabla tbPatrullajes
    public void MostrarDatosGraficoPat()
    {
              DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"RecorridoPatrullaje", "NumeroDeGrupo", "Municipio"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select pat.ExtensionKM AS RecorridoPatrullaje, gu.NumeroDeGrupo ,mun.Municipio from tbPatrullajes pat\n" +
            "inner join tbGrupoPatrullajes gu on gu.IdGrupoPatrullaje = pat.IdGrupoPatrullaje\n" +
            "inner join tbMunicipios mun on mun.IdMunicipio = pat.IdMunicipio";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                
                modelo.addRow(new Object[] {rs.getString("RecorridoPatrullaje"),rs.getString("NumeroDeGrupo"), rs.getString("Municipio")});

            }

            tbPatrullajes.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    
    }
    
   //Grafico de patrullajes
        public void GraficoPat()
    {
        try
        {
            
            for(int i = 0; i<tbPatrullajes.getRowCount();i++) //recorremos cada fila de la tabla
            {
                //Valor a graficar (se parsea para obtener el valor de la primera fila), identificar del grupo de datos, etiquetas de la columna a graficar
                datos2.addValue(Integer.parseInt(tbPatrullajes.getValueAt(i, 0).toString()), tbPatrullajes.getValueAt(i, 1).toString(), tbPatrullajes.getValueAt(i, 2).toString());
            }
            
            //mostrar el gráfico
            
            grafico2 = ChartFactory.createBarChart("Grafico de patrullajes", "Grupos de patrullaje", "Recorrido (KM)", datos2, PlotOrientation.VERTICAL, true, true, false);
            
            ChartPanel panel = new ChartPanel(grafico2);
            add(panel);
            panel.setBounds(440, 335, 530, 255);
            panel.setBackground(Color.DARK_GRAY);
            
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
           
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPatrullajes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 710));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbMostrar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        tbMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 40));

        tbPatrullajes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbPatrullajes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 350, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        //Mostrar datos de transporte y actualizar su gráfico
        
        MostrarDatosGrafico();
        Grafico();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //Mostrar datos de patrullaje y actualizar su gráfico
        
        MostrarDatosGraficoPat();
        GraficoPat();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbMostrar;
    public javax.swing.JTable tbPatrullajes;
    // End of variables declaration//GEN-END:variables
}
