/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Usuario;

import Modelo.ModeloRegistro;
import Modelo.ModeloVistaDeUsuarios;
import Modelo.conexionSql;
import VIsta.Login;
import VIsta.Programa.JframePrincipal;
import java.awt.CardLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


/**
 *
 * @author Pao
 */

 

public class Usuario extends javax.swing.JPanel {
    ModeloRegistro m = new ModeloRegistro();
    Login l = new Login();
    
    public Usuario() {
        initComponents();
        PanelsShowInit();

        
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
    
               
    
                String nombreUser = m.getNombre();
                String Apellidos = m.getApellidos();
                Date Fecha_Nacimiento = (Date) m.getFecha();
                
                String Dui = m.getDUI();
                
                
                
                String Direccion = m.getNombre();
                String Correo = m.getNombre();
                String Telefono = m.getNombre();
                String EstadoCivil = m.getNombre();
                String TipodeSangre = m.getNombre();
                String Genero = m.getNombre();
                
               /* String nombreUser = result.getString("Nombre");
                setNombre(nombreUser);
                
                String Apellidos = result.getString("Apellido");
                setApellidos(Apellidos);
                
                java.util.Date Fecha_Nacimiento = result.getDate("FechaNacimiento");
                setFecha(Fecha_Nacimiento);
                
                String Direccion = result.getString("DireccionDomicilio");
                setDirección(Direccion);
                
                String Correo = result.getString("CorreoElectronico");
                setCorreo(Correo);
                
                  String Telefono = result.getString("NumeroTel");
                setCorreo(Telefono);
                
                String EstadoCivil = result.getString("EstadoCivil");
                setEstadocicivl(EstadoCivil);
                
                
                String TipodeSangre = result.getString("TipoSangre");
                setTipoSangre(TipodeSangre);
                
                String Genero = result.getString("Genero");
                setGenero(Genero);*/
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        txtTipoS = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtEstadoC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblRango = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        pnlContenedor.setBackground(new java.awt.Color(51, 51, 51));
        pnlContenedor.setLayout(new java.awt.CardLayout());

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1010, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("COSVE");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/pedroPascal.png"))); // NOI18N
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        txtGenero.setBackground(new java.awt.Color(51, 51, 51));
        txtGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenero.setEnabled(false);
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 370, 30));

        txtDui.setBackground(new java.awt.Color(51, 51, 51));
        txtDui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDui.setForeground(new java.awt.Color(255, 255, 255));
        txtDui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDui.setCaretColor(new java.awt.Color(51, 51, 51));
        txtDui.setEnabled(false);
        txtDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiActionPerformed(evt);
            }
        });
        add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 410, 30));

        txtTipoS.setBackground(new java.awt.Color(51, 51, 51));
        txtTipoS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTipoS.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoS.setEnabled(false);
        add(txtTipoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 310, 30));

        txtFechaNacimiento.setBackground(new java.awt.Color(51, 51, 51));
        txtFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setEnabled(false);
        add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 340, 30));

        txtEstadoC.setBackground(new java.awt.Color(51, 51, 51));
        txtEstadoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEstadoC.setForeground(new java.awt.Color(255, 255, 255));
        txtEstadoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstadoC.setEnabled(false);
        add(txtEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 340, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Género:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DUI:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nacimiento:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de sangre:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado civil:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("USUARIO");
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 290, 30));

        lblRango.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRango.setForeground(new java.awt.Color(255, 255, 255));
        lblRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRango.setText("RANGO");
        add(lblRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 280, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 20911 (1).png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DUI:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btneditBig.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFoto;
    public javax.swing.JLabel lblRango;
    public javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContenedor;
    public javax.swing.JTextField txtDui;
    public javax.swing.JTextField txtEstadoC;
    public javax.swing.JTextField txtFechaNacimiento;
    public javax.swing.JTextField txtGenero;
    public javax.swing.JTextField txtTipoS;
    // End of variables declaration//GEN-END:variables
}
