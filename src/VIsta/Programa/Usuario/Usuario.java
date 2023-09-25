/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta.Programa.Usuario;

import Modelo.ModeloRegistro;
import Modelo.ModeloVistaDeUsuarios;
import Modelo.conexionSql;
import VIsta.Login;
import Modelo.mdlUsuarios;
import VIsta.Programa.JframePrincipal;
import java.awt.CardLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Pao
 */

 

public class Usuario extends javax.swing.JPanel {
    ModeloRegistro m = new ModeloRegistro();
    Login l = new Login();
    mdlUsuarios u = new mdlUsuarios();
    
    public boolean butEstado = true;
    
    public Usuario() {
        initComponents();
        PanelsShowInit();

        m.IdUsuarioTomar(this);

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
    
               
    
                /*String nombreUser = m.getNombre();
                String Apellidos = m.getApellidos();
                Date Fecha_Nacimiento = (Date) m.getFecha();
                
                String Dui = m.getDUI();
                
                
                
                String Direccion = m.getNombre();
                String Correo = m.getNombre();
                String Telefono = m.getNombre();
                String EstadoCivil = m.getNombre();
                String TipodeSangre = m.getNombre();
                String Genero = m.getNombre();*/
                
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
    
                public long ultimoClic = 0; // Variable para rastrear el tiempo del último clic
                public final long intervaloDobleClic = 300; // Intervalo en milisegundos para considerar un doble clic
                
                
                public void btnActionPerformed(ActionEvent evt) {
                long tiempoActual = System.currentTimeMillis();

                if (tiempoActual - ultimoClic <= intervaloDobleClic) {
                // Doble clic detectado
                txtDui.setEnabled(true);
                txtFechaNacimiento.setEnabled(true);
                txtTipoS.setEnabled(true);
                txtEstadoC.setEnabled(true);
                txtGenero.setEnabled(true);
        }

        ultimoClic = tiempoActual;
    }

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
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoM = new javax.swing.JTextField();
        txtMostrarTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
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
        add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        txtGenero.setBackground(new java.awt.Color(51, 51, 51));
        txtGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenero.setEnabled(false);
        txtGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGeneroMouseEntered(evt);
            }
        });
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 250, 30));

        txtDui.setBackground(new java.awt.Color(51, 51, 51));
        txtDui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDui.setForeground(new java.awt.Color(255, 255, 255));
        txtDui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDui.setCaretColor(new java.awt.Color(51, 51, 51));
        txtDui.setEnabled(false);
        txtDui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDuiMouseEntered(evt);
            }
        });
        txtDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiActionPerformed(evt);
            }
        });
        add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 290, 30));

        txtTipoS.setBackground(new java.awt.Color(51, 51, 51));
        txtTipoS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTipoS.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoS.setEnabled(false);
        txtTipoS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTipoSMouseEntered(evt);
            }
        });
        add(txtTipoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, 30));

        txtFechaNacimiento.setBackground(new java.awt.Color(51, 51, 51));
        txtFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setEnabled(false);
        txtFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFechaNacimientoMouseEntered(evt);
            }
        });
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 30));

        txtEstadoC.setBackground(new java.awt.Color(51, 51, 51));
        txtEstadoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEstadoC.setForeground(new java.awt.Color(255, 255, 255));
        txtEstadoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstadoC.setEnabled(false);
        txtEstadoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEstadoCMouseEntered(evt);
            }
        });
        add(txtEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 220, 30));

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
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 290, 30));

        lblRango.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRango.setForeground(new java.awt.Color(255, 255, 255));
        lblRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRango.setText("RANGO");
        add(lblRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 280, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DUI:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btneditBig.png"))); // NOI18N
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, -1, 60));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 202.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        txtCorreoM.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreoM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCorreoM.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoM.setEnabled(false);
        txtCorreoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoMMouseEntered(evt);
            }
        });
        add(txtCorreoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 190, 30));

        txtMostrarTel.setBackground(new java.awt.Color(51, 51, 51));
        txtMostrarTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMostrarTel.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrarTel.setEnabled(false);
        txtMostrarTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMostrarTelMouseEntered(evt);
            }
        });
        add(txtMostrarTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 185.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 260, 240));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 186.png"))); // NOI18N
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, -1, -1));

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 270, 140));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 490, 130));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 189.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 560, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Group 193.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 290, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiActionPerformed
         
    }//GEN-LAST:event_txtDuiActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        
        //aquí se ejecutará la sentencia UPDATE
        if(butEstado)
        {
            txtDui.setEnabled(false);
            txtFechaNacimiento.setEnabled(false);
            txtTipoS.setEnabled(false);
            txtEstadoC.setEnabled(false);
            txtGenero.setEnabled(false);
        }
        
        
        
        
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
          
    }//GEN-LAST:event_btnEditMousePressed

    private void txtDuiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDuiMouseEntered
       txtDui.setEnabled(true);
            txtFechaNacimiento.setEnabled(true);
            txtTipoS.setEnabled(true);
            txtEstadoC.setEnabled(true);
            txtGenero.setEnabled(true);
    }//GEN-LAST:event_txtDuiMouseEntered

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void txtFechaNacimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaNacimientoMouseEntered
        txtDui.setEnabled(true);
            txtFechaNacimiento.setEnabled(true);
            txtTipoS.setEnabled(true);
            txtEstadoC.setEnabled(true);
            txtGenero.setEnabled(true);
    }//GEN-LAST:event_txtFechaNacimientoMouseEntered

    private void txtTipoSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoSMouseEntered
        txtDui.setEnabled(true);
            txtFechaNacimiento.setEnabled(true);
            txtTipoS.setEnabled(true);
            txtEstadoC.setEnabled(true);
            txtGenero.setEnabled(true);
    }//GEN-LAST:event_txtTipoSMouseEntered

    private void txtEstadoCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstadoCMouseEntered
        txtDui.setEnabled(true);
            txtFechaNacimiento.setEnabled(true);
            txtTipoS.setEnabled(true);
            txtEstadoC.setEnabled(true);
            txtGenero.setEnabled(true);
    }//GEN-LAST:event_txtEstadoCMouseEntered

    private void txtGeneroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneroMouseEntered
        txtDui.setEnabled(true);
            txtFechaNacimiento.setEnabled(true);
            txtTipoS.setEnabled(true);
            txtEstadoC.setEnabled(true);
            txtGenero.setEnabled(true);
    }//GEN-LAST:event_txtGeneroMouseEntered

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        if(butEstado)
        {
               txtDui.setEnabled(false);
            txtFechaNacimiento.setEnabled(false);
            txtTipoS.setEnabled(false);
            txtEstadoC.setEnabled(false);
            txtGenero.setEnabled(false);
            txtCorreoM.setEnabled(false);
        txtMostrarTel.setEnabled(false);
        }
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void txtCorreoMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMMouseEntered
        txtCorreoM.setEnabled(true);
        txtMostrarTel.setEnabled(true);
    }//GEN-LAST:event_txtCorreoMMouseEntered

    private void txtMostrarTelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMostrarTelMouseEntered
       txtCorreoM.setEnabled(true);
        txtMostrarTel.setEnabled(true);
    }//GEN-LAST:event_txtMostrarTelMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFoto;
    public javax.swing.JLabel lblRango;
    public javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JTextField txtCorreoM;
    public javax.swing.JTextField txtDui;
    public javax.swing.JTextField txtEstadoC;
    public javax.swing.JTextField txtFechaNacimiento;
    public javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtMostrarTel;
    public javax.swing.JTextField txtTipoS;
    // End of variables declaration//GEN-END:variables
}
