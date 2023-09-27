/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Inventario;

import Modelo.ModeloArmamento;
import Modelo.ModeloDatosTransporte;
import Modelo.ModeloEquipoEspecial;
import Modelo.ModeloTransporte;
import Modelo.TextPrompt;
import Modelo.conexionSql;
import Modelo.mdl;
import VIsta.Bienvenida;
import VIsta.Programa.JframePrincipal;
import VIsta.VistaAgregarTransporte;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inventario_Inicio extends javax.swing.JPanel {

  
    public Inventario_Inicio() {
        initComponents();
        
        //Agregar un placeholder
        TextPrompt placeholder = new TextPrompt("Buscar", txtBusqueda);
        
        mdl mo = new mdl();
        mo.mostrar(this);
        ModeloEquipoEspecial c = new ModeloEquipoEspecial();
        c.mostrar1(this);
        ModeloArmamento v = new ModeloArmamento();
        v.mostrar1(this);
       
    }
    
    public void MostrarDatosdelgranselect()
    {
       DefaultTableModel modelo = new DefaultTableModel();
      

        modelo.setColumnIdentifiers(new Object []{"idDetalleTransporteEstacion","DetalleTransporte", "Placa", "TipoTransporte", "Marca", "NumeroDeGrupo"});
        


        try{

            //Datos del modelo 1
            Statement statement = conexionSql.getConexion().createStatement();

            String query = "SELECT        dbo.tbDetallesTransportesEstacion.IdDetalleTransporteEstacion, dbo.tbDetallesTransportesEstacion.DetalleTransporte, dbo.tbDetallesTransportesEstacion.Placa, dbo.tbTipoTransportesEstacion.TipoTransporte,\n" +
"                        dbo.tbMarcasDeVehiculos.Marca, dbo.tbGrupoPatrullajes.NumeroDeGrupo\n" +
"FROM            dbo.tbDetallesTransportesEstacion INNER JOIN\n" +
"                        dbo.tbTipoTransportesEstacion ON dbo.tbDetallesTransportesEstacion.IdTipoTransporteEstacion = dbo.tbTipoTransportesEstacion.IdTipoTransporteEstacion INNER JOIN\n" +
"                         dbo.tbMarcasDeVehiculos ON dbo.tbDetallesTransportesEstacion.IdMarcaDeVehiculo = dbo.tbMarcasDeVehiculos.IdMarcaDeVehiculo INNER JOIN\n" +
"                         dbo.tbGrupoPatrullajes ON dbo.tbDetallesTransportesEstacion.IdGrupoPatrullaje = dbo.tbGrupoPatrullajes.IdGrupoPatrullaje\n" +
"\n" +
"	 where NumeroDeGrupo like '%"+txtBusqueda.getText()+"%' OR "
                    + "IdDetalleTransporteEstacion LIKE '%" +txtBusqueda.getText()+ "%' OR "
                    + "DetalleTransporte LIKE '%" +txtBusqueda.getText()+ "%' OR "
                    + "Placa like '%"+ txtBusqueda.getText() +"%' OR "
                    + "TipoTransporte like '%" +txtBusqueda.getText() + "%' or "
                    + "Marca like '%"+txtBusqueda.getText() +"%';"; //Parametro + el texto a obtener del textfield

            ResultSet rs = statement.executeQuery(query);


            
          

            while(rs.next()){

                modelo.addRow(new Object[] {rs.getString("idDetalleTransporteEstacion"),rs.getString("DetalleTransporte"),rs.getString("Placa"), rs.getString("TipoTransporte"), rs.getString("Marca"), rs.getString("NumeroDeGrupo")});
                 
            }

            
            
            tbMostrarDatosTransporte.setModel(modelo);



          

        }catch(SQLException ex){

           JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    //tabla de equipo especial
    public void MostrarDatosdelgranselect2()
    {
       
       DefaultTableModel modelo2 = new DefaultTableModel();
      

        
        modelo2.setColumnIdentifiers(new Object[]{"IdDetalleEquipo", "TipoEquipamiento", "Detalles", "Cantidad"});
        


        try{

            
            Statement statement = conexionSql.getConexion().createStatement();

            //datos del modelo 2
            

        String query2 = "select t.IdDetalleEquipo, o.TipoEquipamiento, t.Detalles, t.Cantidad from tdDetallesEquipo t\n" +
        "inner join tbTiposEquipamientoEstacion o on o.IdTiposEquipamientoEstacion = t.IdTiposEquipamientoEstacion "
                + "WHERE IdDetalleEquipo LIKE '%" + txtBusqueda.getText() + "%' OR " +
                       "TipoEquipamiento LIKE '%" + txtBusqueda.getText() + "%' OR " +
                       "Detalles LIKE '%" + txtBusqueda.getText() + "%' OR " +
                       "Cantidad LIKE '%" + txtBusqueda.getText() + "%';";
           
            
    ResultSet rs = statement.executeQuery(query2);
            
          

            while(rs.next()){

               
                 modelo2.addRow(new Object[] {rs.getString("IdDetalleEquipo"),rs.getString("TipoEquipamiento"),rs.getString("Detalles"), rs.getString("Cantidad")});
            }

            
            tbMostrarDatosEquipoEsp.setModel(modelo2);
            



          

        }catch(SQLException ex){

           JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    
    public void MostrarDatosdelgranselect3()
    {
       
       DefaultTableModel modelo3 = new DefaultTableModel();
      

        
         modelo3.setColumnIdentifiers(new Object []{"IdDetalleArmamentoEstacion","DetalleArmamento", "Cantidad", "TipoArmamento"});
        


        try{

            
            Statement statement = conexionSql.getConexion().createStatement();

            //datos del modelo 2
            

        String query3 = "select m.IdDetalleArmamentoEstacion, m.DetalleArmamento, m.Cantidad, u.TipoArmamento from tbDetallesArmamentosEstacion m\n" +
"						  inner join tbTipoArmamentosEstacion u on u.IdTipoArmamentoEstacion = m.IdTipoArmamentoEstacion "
                + "where IdDetalleArmamentoEstacion like '%" + txtBusqueda.getText() +"%' or "
                + "DetalleArmamento like '%" + txtBusqueda.getText() +"%' or "
                + "Cantidad like '%" + txtBusqueda.getText() +"%' or "
                + "TipoArmamento like '%"+ txtBusqueda.getText()+"$'";
           
            
    ResultSet rs = statement.executeQuery(query3);
            
          

            while(rs.next()){

               
                 modelo3.addRow(new Object[] {rs.getString("IdDetalleArmamentoEstacion"),rs.getString("DetalleArmamento"),rs.getString("Cantidad"), rs.getString("TipoArmamento")});
            }

            
            tbMostrarDatosArmamento.setModel(modelo3);
            



          

        }catch(SQLException ex){

           JOptionPane.showMessageDialog(null,ex.toString());

        }

    
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnAddEquipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMostrarDatosTransporte = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrarDatosEquipoEsp = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMostrarDatosArmamento = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 710));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(1010, 710));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddPolicia.png"))); // NOI18N
        btnAddEquipo.setBorderPainted(false);
        btnAddEquipo.setContentAreaFilled(false);
        btnAddEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEquipoMouseClicked(evt);
            }
        });
        jPanel4.add(btnAddEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 60, 60));

        tbMostrarDatosTransporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMostrarDatosTransporte);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 820, 170));

        tbMostrarDatosEquipoEsp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbMostrarDatosEquipoEsp);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 820, 160));

        tbMostrarDatosArmamento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbMostrarDatosArmamento);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 820, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Refresh1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 30, 40));

        txtBusqueda.setBorder(null);
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 390, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BusquedaGrande.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1040, 690));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEquipoMouseClicked
        
        ElecION_Equipo JFP = new ElecION_Equipo();
        JFP.setVisible(true);
        
    }//GEN-LAST:event_btnAddEquipoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        mdl mo = new mdl();
        mo.mostrar(this);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       ModeloEquipoEspecial c = new ModeloEquipoEspecial();
        c.mostrar1(this);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ModeloArmamento v = new ModeloArmamento();
        v.mostrar1(this);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
         
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
       MostrarDatosdelgranselect(); MostrarDatosdelgranselect2(); MostrarDatosdelgranselect3();
    }//GEN-LAST:event_txtBusquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEquipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTable tbMostrarDatosArmamento;
    public javax.swing.JTable tbMostrarDatosEquipoEsp;
    public javax.swing.JTable tbMostrarDatosTransporte;
    public javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
