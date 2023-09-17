/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Usuario;

import Modelo.ModeloVistaDeUsuarios;
import Modelo.conexionSql;
import VIsta.Login;
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Pao
 */
public class Usuario extends javax.swing.JPanel {
public Usuario() {
        initComponents();
        PanelsShowInit();
       MostrarDatosLabels();
       
        
    }

    private CardLayout cardLayout;
    verInfo info = new verInfo();
    
    private void PanelsShowInit()
    {
       cardLayout = new CardLayout();
       pnlContenedor.setLayout(cardLayout);
        
        pnlContenedor.add(info, "viewInfo");
       
        cardLayout.show(pnlContenedor, "viewInfo");
    }
    
    //aqui se mostrarán los DUIs de todos los usuario ingresados
    
    public void MostrarDatosLabels()
   {
       Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
         
        
        String SSQL = "select tbU.Usuario, tbR.Rango, y.Dui, y.FechaNacimiento, x.EstadoCivil, z.Genero, a.TipoSangre from tbPolicias tbPo\n" +
"inner join tbUsuarios tbU on tbU.IdUsuario = tbPo.IdUsuario\n" +
"inner join tbRangosTipoUsuarios tbR on tbR.IdRangoTipoUsuario = tbPo.IdRangoTipoUsuario\n" +
"inner join tbTiposPersonas_Personas tbid on tbid.IdTipoPersonas_Personas = tbPo.IdTipoPersonas_Personas\n" +
"inner join tbPersonas y on y.IdPersona = tbid.IdPersona\n" +
"inner join tbEstadosCivil x on x.IdEstadoCivil = y.IdEstadoCivil\n" +
"inner join tbGeneros z on z.IdGenero = y.IdGenero\n" +
"inner join tbTiposSangre a on a.IdTipoSangre = y.IdTipoSangre\n" +
"where tbU.Usuario = 'Ivansote'";

       
       try {
            conectar = conexionSql.getConexion();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();

 


            while (result.next()) {
                /*Datos del usuario ingresado*/
                
                 //Mandar los datos del campo usuario
               String Valor1 = result.getString("Usuario");
               //mostrar los datos obtenido en su respectivo Label
               lblusuario.setText(Valor1);
               
               /*Datos del rango del usuario*/
                 //Mandar los datos del campo Rango
               String Valor2 = result.getString("Rango");
               //mostrar los datos obtenido en su respectivo Label
               lblRango.setText(Valor2);
               
               /*Datos del DUI del usuario*/
                 //Mandar los datos del campo Dui
               String Valor3 = result.getString("Dui");
               //mostrar los datos obtenido en su respectivo Label
               lblDui.setText("DUI: " + Valor3);
               
                /*Datos de la fecha de nacimiento del usuario*/
                 //Mandar los datos del campo FechaNacimiento
               String Valor4 = result.getString("FechaNacimiento");
               //mostrar los datos obtenido en su respectivo Label
               lblNacimiento.setText("Fecha de nacimiento: " + Valor4);
               
                /*Datos del Tipo de sangre del usuario*/
                 //Mandar los datos del campo TipoSangre
               String Valor5 = result.getString("TipoSangre");
               //mostrar los datos obtenido en su respectivo Label
               lblSangre.setText("Tipo de sangre: " + Valor5);
               
                /*Datos del estado civil del usuario*/
                 //Mandar los datos del campo EstadoCivil
               String Valor6 = result.getString("EstadoCivil");
               //mostrar los datos obtenido en su respectivo Label
               lblEstadoCivil.setText("Estado civil: " + Valor6);
               
                /*Datos de la fecha de nacimiento del usuario*/
                 //Mandar los datos del campo FechaNacimiento
               String Valor7 = result.getString("Genero");
               //mostrar los datos obtenido en su respectivo Label
               lblGenero.setText("Género: " + Valor7);
               
            }
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    
    
   
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblDui = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblSangre = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblRango = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pnlContenedor.setBackground(new java.awt.Color(51, 51, 51));
        pnlContenedor.setLayout(new java.awt.CardLayout());

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1010, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("COSVE");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblDui.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblDui.setForeground(new java.awt.Color(255, 255, 255));
        add(lblDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 30));

        lblNacimiento.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 410, 250, 30));

        lblSangre.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSangre.setForeground(new java.awt.Color(255, 255, 255));
        add(lblSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 260, 30));

        lblEstadoCivil.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 260, 30));

        lblGenero.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 270, 30));

        lblusuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 310, 30));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/pedroPascal.png"))); // NOI18N
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblRango.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRango.setForeground(new java.awt.Color(204, 204, 204));
        lblRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 310, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fotoUserBack.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 620));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblDui;
    public javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFoto;
    public javax.swing.JLabel lblGenero;
    public javax.swing.JLabel lblNacimiento;
    public javax.swing.JLabel lblRango;
    public javax.swing.JLabel lblSangre;
    public javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
