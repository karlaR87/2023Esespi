/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inicio;

import Modelo.conexionSql;
import Modelo.mdl;
import VIsta.Login;
import VIsta.VistaUsers;
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
    DefaultCategoryDataset datos = new DefaultCategoryDataset(); //valores para graficar
   
    public Inicio() {
        initComponents();
        MostrarDatosGrafico();
        
    }
    
    public void MostrarDatosGrafico()
    {
              DefaultTableModel modelo = new DefaultTableModel();
       

        modelo.setColumnIdentifiers(new Object []{"idDetalleTransporteEstacion", "Marca", "NumeroDeGrupo"});



        try{

            Statement statement = conexionSql.getConexion().createStatement();

            String query = "select t.IdDetalleTransporteEstacion, y.Marca, g.NumeroDeGrupo from tbDetallesTransportesEstacion t\n" +
"inner join tbMarcasDeVehiculos y on y.IdMarcaDeVehiculo = t.IdMarcaDeVehiculo\n" +
"inner join tbGrupoPatrullajes g on g.IdGrupoPatrullaje = t.IdGrupoPatrullaje";

            ResultSet rs = statement.executeQuery(query);



          

            while(rs.next()){
                System.out.println("ddddd");
                modelo.addRow(new Object[] {rs.getString("idDetalleTransporteEstacion"),rs.getString("Marca"), rs.getString("NumeroDeGrupo")});

            }

            tbMostrar.setModel(modelo);

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrar = new javax.swing.JTable();
        btnGen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, 440));

        btnGen.setText("Generar grafica");
        btnGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenMouseClicked(evt);
            }
        });
        jPanel1.add(btnGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 30, 40));

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

    private void btnGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenMouseClicked
        //Generar la grafica
        
        try
        {
            
            for(int i = 0; i<tbMostrar.getRowCount();i++) //recorremos cada fila de la tabla
            {
                //Valor a graficar (se parsea para obtener el valor de la primera fila), identificar del grupo de datos, etiquetas de la columna a graficar
                datos.addValue(Integer.parseInt(tbMostrar.getValueAt(i, 0).toString()), tbMostrar.getValueAt(i, 1).toString(), tbMostrar.getValueAt(i, 2).toString());
            }
            
            //mostrar el gráfico
            
            grafico = ChartFactory.createBarChart("Grafico de transportes asignados", "NumeroDeGrupo", "Cantidad de vehiculos", datos, PlotOrientation.VERTICAL, true, true, false);
            
            ChartPanel panel = new ChartPanel(grafico);
            add(panel);
            panel.setBounds(500, 50, 400, 450);
            
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGenMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MostrarDatosGrafico();
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbMostrar;
    // End of variables declaration//GEN-END:variables
}
