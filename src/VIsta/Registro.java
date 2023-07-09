
package VIsta;

import fonts.Fuentes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Registro extends javax.swing.JFrame {
    
    Idiomas Idioma = new Idiomas();  // Instancia de la clase Idiomas para manejar los idiomas
    Ncionalidad Nacio = new Ncionalidad();  // Instancia de la clase Ncionalidad (¿Nacionalidad?) para manejar la nacionalidad
    private ArrayList<Boolean> idiomasSeleccionados = new ArrayList<>();  // ArrayList para almacenar los idiomas seleccionados
    private ArrayList<Boolean> nacionalidadesSelecionadas = new ArrayList<>();  // ArrayList para almacenar los idiomas seleccionados
    
     // Método para agregar un idioma seleccionado a la lista
    void agregarIdiomaSeleccionado(Boolean idioma) {
        idiomasSeleccionados.add(idioma);  // Agrega el idioma seleccionado al ArrayList idiomasSeleccionados
        Idioma.setRegistro(this);  // Establece la referencia a la instancia de Registro existente en la clase Idiomas
    }
    
     // Método para agregar un idioma seleccionado a la lista
    void nacionalidadesSelecionadas(Boolean Nacionalidad) {
        idiomasSeleccionados.add(Nacionalidad);  // Agrega el idioma seleccionado al ArrayList idiomasSeleccionados
        Idioma.setRegistro(this);  // Establece la referencia a la instancia de Registro existente en la clase Idiomas
    }

    Fuentes tipoFuentes;
    public Registro() {
        initComponents();
        fontDesign();
        Idioma.setRegistro(this);  // Establece la referencia a la instancia de Registro en la clase Idiomas
        Nacio.setRegistro(this);  
    }

      private void fontDesign()
    { 
        tipoFuentes = new Fuentes();
        btnSiguiente.setText("<html><font color='white'> Siguiente </font></html>");
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
        jLabel2 = new javax.swing.JLabel();
        Regres = new javax.swing.JPanel();
        Regresar = new javax.swing.JLabel();
        p = new javax.swing.JPanel();
        ContenedorP = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        MasIdiomas = new javax.swing.JPanel();
        Mas1 = new javax.swing.JLabel();
        MasNacionalidades = new javax.swing.JPanel();
        Mas2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 730));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRARSE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        Regres.setBackground(new java.awt.Color(51, 51, 51));
        Regres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresMouseClicked(evt);
            }
        });
        Regres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RegresarImg.png"))); // NOI18N
        Regres.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel1.add(Regres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 30, 40));

        p.setBackground(new java.awt.Color(70, 70, 70));
        p.setPreferredSize(new java.awt.Dimension(950, 570));
        p.setRequestFocusEnabled(false);
        p.setLayout(new java.awt.BorderLayout());

        ContenedorP.setBackground(new java.awt.Color(70, 70, 70));
        ContenedorP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText(" ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        ContenedorP.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, 50));

        jTextField2.setText(" ");
        jTextField2.setBorder(null);
        ContenedorP.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 230, 30));

        jTextField3.setText(" ");
        jTextField3.setBorder(null);
        ContenedorP.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 50));

        jTextField4.setText(" ");
        jTextField4.setBorder(null);
        ContenedorP.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 50));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dirección ");
        ContenedorP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genero ");
        ContenedorP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellidios");
        ContenedorP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de Nacimiento ");
        ContenedorP.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jTextField5.setText(" ");
        jTextField5.setBorder(null);
        ContenedorP.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 230, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 50));

        jLabel12.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de Persona");
        ContenedorP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Datos personales ");
        ContenedorP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombres ");
        ContenedorP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        ContenedorP.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 250, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.setEditor(null);
        ContenedorP.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 50));

        jTextField8.setText(" ");
        jTextField8.setBorder(null);
        ContenedorP.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 230, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 50));

        jTextField7.setText(" ");
        jTextField7.setBorder(null);
        ContenedorP.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 230, 30));

        jLabel23.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Correo Electronico");
        ContenedorP.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, 50));

        jLabel31.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("DUI ");
        ContenedorP.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel32.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Número de Telefono ");
        ContenedorP.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estado civil ");
        ContenedorP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo de sangre");
        ContenedorP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        jLabel33.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Tipo de sangre");
        ContenedorP.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        jLabel35.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Nacionalidad ");
        ContenedorP.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        ContenedorP.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 40, 30));

        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        ContenedorP.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 40, 30));

        MasIdiomas.setBackground(new java.awt.Color(70, 70, 70));
        MasIdiomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasIdiomasMouseClicked(evt);
            }
        });

        Mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Mas.png"))); // NOI18N

        javax.swing.GroupLayout MasIdiomasLayout = new javax.swing.GroupLayout(MasIdiomas);
        MasIdiomas.setLayout(MasIdiomasLayout);
        MasIdiomasLayout.setHorizontalGroup(
            MasIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MasIdiomasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Mas1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MasIdiomasLayout.setVerticalGroup(
            MasIdiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasIdiomasLayout.createSequentialGroup()
                .addComponent(Mas1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ContenedorP.add(MasIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 50));

        MasNacionalidades.setBackground(new java.awt.Color(70, 70, 70));
        MasNacionalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasNacionalidadesMouseClicked(evt);
            }
        });

        Mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Mas.png"))); // NOI18N

        javax.swing.GroupLayout MasNacionalidadesLayout = new javax.swing.GroupLayout(MasNacionalidades);
        MasNacionalidades.setLayout(MasNacionalidadesLayout);
        MasNacionalidadesLayout.setHorizontalGroup(
            MasNacionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasNacionalidadesLayout.createSequentialGroup()
                .addComponent(Mas2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MasNacionalidadesLayout.setVerticalGroup(
            MasNacionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MasNacionalidadesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Mas2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ContenedorP.add(MasNacionalidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 50));

        jLabel36.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Idiomas");
        ContenedorP.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R77.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
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
        ContenedorP.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 170, 60));

        jLabel34.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/R7.png"))); // NOI18N
        ContenedorP.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, 70));

        p.add(ContenedorP, java.awt.BorderLayout.CENTER);

        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 950, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
    private void MasIdiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasIdiomasMouseClicked
        
        //primeo vamos a ocultar las ventanas que no queremos que se muestrn
        ContenedorP.setVisible(false);
        Nacio.setVisible(false);
        //visible el que se quiere ver
        Idioma.setVisible(true);
        p.add(Idioma);
    }//GEN-LAST:event_MasIdiomasMouseClicked

    private void MasNacionalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasNacionalidadesMouseClicked
         //primeo vamos a ocultar las ventanas que no queremos que se muestrn
        ContenedorP.setVisible(false);
        Idioma.setVisible(false);
        //visible el que se quiere ver
        Nacio.setVisible(true);
        p.add(Nacio);
    }//GEN-LAST:event_MasNacionalidadesMouseClicked
    
    private void RegresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresMouseClicked

           if (p.isAncestorOf(Idioma) || p.isAncestorOf(Nacio)) {
            // Ocultar los paneles de idioma y nacionalidad
            Idioma.setVisible(false);
            Nacio.setVisible(false);
            // Mostrar el panel de registro
            ContenedorP.setVisible(true);
            // Agregar el panel de registro al contenedor principal
            p.add(ContenedorP);
            } else if (p != Idioma || p != Nacio) {
            Login log = new Login();
            log.setVisible(true);
            this.setVisible(false);
            } 
            else {
            // Otras condiciones o acciones que puedas tener
            }
    }//GEN-LAST:event_RegresMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorP;
    private javax.swing.JLabel Mas1;
    private javax.swing.JLabel Mas2;
    private javax.swing.JPanel MasIdiomas;
    private javax.swing.JPanel MasNacionalidades;
    private javax.swing.JPanel Regres;
    private javax.swing.JLabel Regresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel p;
    // End of variables declaration//GEN-END:variables

    
}
