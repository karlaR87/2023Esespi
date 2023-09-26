/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import Modelo.mdl;
import VIsta.Login;
import VIsta.Programa.TablasPaneles;
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
    
    
    Login l = new Login();
 TablasPaneles p = new TablasPaneles();
    
    
   
    public Inicio() {
        initComponents();
        
        
        p.MostrarDatos();
        p.MostrarDatosPat();
        
        
        //Grafico();
        //MostrarDatosGraficoPat();
        GraficoPat();
        
    }
    
    
   
    
   //Grafico de patrullajes
        public void GraficoPat()
    {
        try
        {
            
            for(int i = 0; i<p.tbMostrarDatosP.getRowCount();i++) //recorremos cada fila de la tabla
            {
                //Valor a graficar (se parsea para obtener el valor de la primera fila), identificar del grupo de datos, etiquetas de la columna a graficar
                datos2.addValue(Integer.parseInt(p.tbMostrarDatosP.getValueAt(i, 1).toString()), p.tbMostrarDatosP.getValueAt(i, 0).toString(), p.tbMostrarDatosP.getValueAt(i, 2).toString());
            }
            
            //mostrar el gráfico
            
            grafico2 = ChartFactory.createBarChart("Grafico de patrullajes", "Grupos de patrullaje", "Recorrido (KM)", datos2, PlotOrientation.VERTICAL, true, true, false);
            
            ChartPanel panel = new ChartPanel(grafico2);
            add(panel);
            panel.setBounds(60, 10, 910, 580);
            panel.setBackground(Color.DARK_GRAY);
            
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
           
    }
        
         
    
    
    
    //Grafico de transporte
    /*public void Grafico()
    {
        try
        {
            
            for(int i = 0; i<p.tbMostrarDatosT.getRowCount();i++) //recorremos cada fila de la tabla
            {
                //Valor a graficar (se parsea para obtener el valor de la primera fila), identificar del grupo de datos, etiquetas de la columna a graficar
                datos.addValue(Integer.parseInt(p.tbMostrarDatosT.getValueAt(i, 0).toString()), p.tbMostrarDatosT.getValueAt(i, 1).toString(), p.tbMostrarDatosT.getValueAt(i, 2).toString());
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
           
    }*/
    
    
    
    
    //Mostrar datos en la tabla tbPatrullajes
    /*public void MostrarDatosGraficoPat()
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

    
    
    }*/
        
        
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 710));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 40));

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

    
    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //Mostrar datos de patrullaje y actualizar su gráfico
        
        //MostrarDatosGraficoPat();
        GraficoPat();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
