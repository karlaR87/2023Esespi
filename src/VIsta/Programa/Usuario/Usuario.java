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
        ModeloVistaDeUsuarios m = new ModeloVistaDeUsuarios();
        m.MostrarDatoDUI(this);
        
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
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        lblDui = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblSangre = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1010, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("COSVE");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblDui.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblDui.setForeground(new java.awt.Color(255, 255, 255));
        add(lblDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 180, 30));

        lblNacimiento.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblNacimiento.setText("Nacimiento");
        add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        lblSangre.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSangre.setForeground(new java.awt.Color(255, 255, 255));
        lblSangre.setText("Tipo de sangre");
        add(lblSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        lblEstadoCivil.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoCivil.setText("Estado civil");
        add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        lblGenero.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Genero");
        add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Genero:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Estado civil:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Tipo de Sangre:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nacimiento: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedro Pascal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/pedroPascal.png"))); // NOI18N
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Rango Policial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/fotoUserBack.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContenedor.setBackground(new java.awt.Color(51, 51, 51));
        pnlContenedor.setLayout(new java.awt.CardLayout());
        add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 690, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblSangre;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
