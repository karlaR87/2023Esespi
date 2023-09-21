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
       
       MostrarCosve();
        
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
    
    public void MostrarCosve()
    {
        
        
         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtSangre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();

        pnlContenedor.setBackground(new java.awt.Color(51, 51, 51));
        pnlContenedor.setLayout(new java.awt.CardLayout());

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1010, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("COSVE");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/pedroPascal.png"))); // NOI18N
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 250, 30));
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 250, 30));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 250, 30));
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 220, 70));
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 200, 70));
        add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 210, 60));
        add(txtSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 200, 60));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 210, 20));

        btnActualizar.setText("Actualizar");
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 210, 70));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 250, 30));
        add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pnlContenedor;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEstadoCivil;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtGenero;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtSangre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
