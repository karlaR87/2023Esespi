/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta;

import fonts.Fuentes;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Pao
 */
public class Registro_DatosPersonales extends javax.swing.JPanel {
    
    Fuentes tipoFuentes;
    public Registro_DatosPersonales() {
        initComponents();

        fontDesign();
        jLabel1.setVisible(false);
    }
      private void fontDesign()
    { 
        tipoFuentes = new Fuentes();

        lbl3.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl6.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl7.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl8.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl9.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl10.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl11.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl12.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl13.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl14.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        lbl15.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 18));
        
        btnSiguiente.setText("<html> <font color='white'> Siguiente </font> </html>");
        caracBtn(btnSiguiente);  
    }
    
    private void caracBtn(JButton btn)
    {
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 0, 24)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        ContenedorP = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        txtNumeroTel = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtSangre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> cmbTipoPersona = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        MasIdiomas = new javax.swing.JPanel();
        MasNacionalidades = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Mas1 = new javax.swing.JLabel();
        Mas2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent1.png.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RegresarImg.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 50));

        ContenedorP.setBackground(new java.awt.Color(70, 70, 70));
        ContenedorP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("Tipo de Persona");
        ContenedorP.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        lbl4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Nombres ");
        ContenedorP.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        lbl5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setText("Apellidios");
        ContenedorP.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lbl6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setText("Fecha de Nacimiento ");
        ContenedorP.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        lbl7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setText("Dirección ");
        ContenedorP.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        lbl8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setText("DUI ");
        ContenedorP.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        lbl9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setText("Número de Telefono ");
        ContenedorP.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        lbl10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setText("Correo Electronico");
        ContenedorP.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        lbl11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setText("Estado civil ");
        ContenedorP.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        lbl12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        lbl12.setText("Tipo de sangre");
        ContenedorP.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        lbl13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl13.setForeground(new java.awt.Color(255, 255, 255));
        lbl13.setText("Idiomas");
        ContenedorP.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 120, 40));

        lbl14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl14.setForeground(new java.awt.Color(255, 255, 255));
        lbl14.setText("Nacionalidad ");
        ContenedorP.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 130, 30));

        lbl15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl15.setForeground(new java.awt.Color(255, 255, 255));
        lbl15.setText("Genero ");
        ContenedorP.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, 30));

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setText(" ");
        txtNombres.setBorder(null);
        ContenedorP.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, 30));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setText(" ");
        txtApellidos.setBorder(null);
        ContenedorP.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 230, 30));

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setText(" ");
        txtFechaNacimiento.setBorder(null);
        ContenedorP.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 230, 30));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setText(" ");
        txtDireccion.setBorder(null);
        ContenedorP.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 230, 30));

        txtDui.setBackground(new java.awt.Color(255, 255, 255));
        txtDui.setForeground(new java.awt.Color(0, 0, 0));
        txtDui.setText(" ");
        txtDui.setBorder(null);
        ContenedorP.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 220, 30));

        txtNumeroTel.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroTel.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroTel.setText(" ");
        txtNumeroTel.setBorder(null);
        txtNumeroTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelActionPerformed(evt);
            }
        });
        ContenedorP.add(txtNumeroTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 230, 30));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setText(" ");
        txtCorreo.setBorder(null);
        ContenedorP.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 230, 30));

        txtSangre.setBackground(new java.awt.Color(255, 255, 255));
        txtSangre.setForeground(new java.awt.Color(0, 0, 0));
        txtSangre.setText(" ");
        txtSangre.setBorder(null);
        ContenedorP.add(txtSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 230, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 50));

        cmbEstadoCivil.setBackground(new java.awt.Color(59, 126, 255));
        cmbEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstadoCivil.setBorder(null);
        ContenedorP.add(cmbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 250, 30));

        cmbTipoPersona.setBackground(new java.awt.Color(59, 126, 255));
        cmbTipoPersona.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoPersona.setBorder(null);
        cmbTipoPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbTipoPersona.setEditor(null);
        cmbTipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPersonaActionPerformed(evt);
            }
        });
        ContenedorP.add(cmbTipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 50));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        ContenedorP.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 50, 40));

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("F");
        jRadioButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        ContenedorP.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 50, 60));

        MasIdiomas.setBackground(new java.awt.Color(70, 70, 70));
        MasIdiomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasIdiomasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MasIdiomasLayout = new javax.swing.GroupLayout(MasIdiomas);
        MasIdiomas.setLayout(MasIdiomasLayout);
        MasIdiomasLayout.setHorizontalGroup(
            MasIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        MasIdiomasLayout.setVerticalGroup(
            MasIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ContenedorP.add(MasIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 50, 50));

        MasNacionalidades.setBackground(new java.awt.Color(70, 70, 70));
        MasNacionalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasNacionalidadesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MasNacionalidadesLayout = new javax.swing.GroupLayout(MasNacionalidades);
        MasNacionalidades.setLayout(MasNacionalidadesLayout);
        MasNacionalidadesLayout.setHorizontalGroup(
            MasNacionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        MasNacionalidadesLayout.setVerticalGroup(
            MasNacionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ContenedorP.add(MasNacionalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 50, 50));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R77.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        ContenedorP.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 170, 60));

        jLabel34.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R7.png"))); // NOI18N
        ContenedorP.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, 70));

        Mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Mas.png"))); // NOI18N
        Mas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mas1MouseClicked(evt);
            }
        });
        ContenedorP.add(Mas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 50, 50));

        Mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Mas.png"))); // NOI18N
        Mas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mas2MouseClicked(evt);
            }
        });
        ContenedorP.add(Mas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 50, 50));

        jPanel1.add(ContenedorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 940, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/HeaderRDTPRS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

    }//GEN-LAST:event_lblRegresarMouseClicked
Registro_Idiomas idiomas = new Registro_Idiomas();
    public void ViewIdiomas()
    {
       idiomas.setVisible(true);
       jLabel1.setVisible(true);
         setFocus0(false);
        
         idiomas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                idiomas.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
                         jLabel1.setVisible(false);
                         setFocus0(true);
                    }
         });

    }
    
    public boolean status = true;
    Registro_Nacionalidades nacio = new Registro_Nacionalidades();
    public void ViewNacio()
    {
       nacio.setVisible(true);
       jLabel1.setVisible(true);
       setFocus0(false);
       
         nacio.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                nacio.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
                         jLabel1.setVisible(false);
                         setFocus0(true);
                    }
         });       
    }

    public JLabel getlblBack()
    {
        return lblRegresar;
    }
    
   public JButton getBtnSiguiente()
    {
        return btnSiguiente;
    }
    
    private void txtNumeroTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelActionPerformed

    private void cmbTipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoPersonaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void MasIdiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasIdiomasMouseClicked

    }//GEN-LAST:event_MasIdiomasMouseClicked

    private void MasNacionalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasNacionalidadesMouseClicked

    }//GEN-LAST:event_MasNacionalidadesMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked


    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void Mas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas1MouseClicked
        if(idiomas.isVisible()){} else {setFocus0(false); ViewIdiomas(); }
    }//GEN-LAST:event_Mas1MouseClicked

    private void Mas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas2MouseClicked
         if(nacio.isVisible()){} else { setFocus0(false); ViewNacio();}
    }//GEN-LAST:event_Mas2MouseClicked

    public void setFocus0(boolean status)
    {
       txtNombres.setFocusable(status);
       txtApellidos.setFocusable(status);
       txtFechaNacimiento.setFocusable(status);
       txtDireccion.setFocusable(status);
       txtDui.setFocusable(status);
       txtNumeroTel.setFocusable(status);
       txtCorreo.setFocusable(status);
       txtSangre.setFocusable(status);
       cmbEstadoCivil.setFocusable(status);   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorP;
    private javax.swing.JLabel Mas1;
    private javax.swing.JLabel Mas2;
    private javax.swing.JPanel MasIdiomas;
    private javax.swing.JPanel MasNacionalidades;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroTel;
    private javax.swing.JTextField txtSangre;
    // End of variables declaration//GEN-END:variables
}
