package VIsta;

import Controlador.ControladorRecuperarContra;
import Modelo.ModeloRegistro;
import com.toedter.calendar.JDateChooser;
import fonts.Fuentes;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Pao
 */
public class Registro_DatosPersonales extends javax.swing.JPanel {
    Fuentes tipoFuentes;
    private Registro registro;
   
     public ControladorRecuperarContra cntrRegistro;
    
    public void setRegistro(Registro registro) {
    this.registro = registro;
}
        ControladorRecuperarContra contrlRegistro;
        ModeloRegistro modeloRegistro = new ModeloRegistro();
         
    public Registro_DatosPersonales() {
        initComponents();
        fontDesign();
             // Llenar el ComboBox de estado civil
        try {
           
//            cntrRegistro = new ControladorRegistro(modeloRegistro, this);
            modeloRegistro.llenarCombo(cmbEstadoCivil1);
            modeloRegistro.llenarCombo2(cmbtipoSangre1);
            modeloRegistro.llenarCombo3(cmbgenero);
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los estados civiles.");
        }
         

    }
 
    
    private void fontDesign()
    { 
        tipoFuentes = new Fuentes();

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
        btn.setFont((tipoFuentes.fuente(tipoFuentes.DMSans, 1, 22)));
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setHorizontalAlignment(JButton.CENTER); 
    }
 
    
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        ContenedorP = new javax.swing.JPanel();
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
        txtDireccion = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        txtNumeroTel = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbgenero = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        MasIdiomas = new javax.swing.JPanel();
        MasNacionalidades = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Mas1 = new javax.swing.JLabel();
        Mas2 = new javax.swing.JLabel();
        cmbEstadoCivil1 = new javax.swing.JComboBox<>();
        cmbtipoSangre1 = new javax.swing.JComboBox<>();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbl4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Nombres ");
        ContenedorP.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lbl5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setText("Apellidios");
        ContenedorP.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lbl6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setText("Fecha de Nacimiento ");
        ContenedorP.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        lbl7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setText("Dirección ");
        ContenedorP.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        lbl8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setText("DUI ");
        ContenedorP.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        lbl9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setText("Número de Telefono ");
        ContenedorP.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        lbl10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setText("Correo Electronico");
        ContenedorP.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        lbl11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setText("Estado civil ");
        ContenedorP.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        lbl12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        lbl12.setText("Tipo de sangre");
        ContenedorP.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

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
        ContenedorP.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 210, 30));

        txtNombres.setText(" ");
        txtNombres.setBorder(null);
        ContenedorP.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, 30));

        txtApellidos.setText(" ");
        txtApellidos.setBorder(null);
        ContenedorP.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 230, 30));

        txtDireccion.setText(" ");
        txtDireccion.setBorder(null);
        ContenedorP.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 30));

        txtDui.setText(" ");
        txtDui.setBorder(null);
        ContenedorP.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 220, 30));

        txtNumeroTel.setText(" ");
        txtNumeroTel.setBorder(null);
        txtNumeroTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelActionPerformed(evt);
            }
        });
        ContenedorP.add(txtNumeroTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 230, 30));

        txtCorreo.setText(" ");
        txtCorreo.setBorder(null);
        ContenedorP.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 50));

        cmbgenero.setBackground(new java.awt.Color(59, 126, 255));
        cmbgenero.setForeground(new java.awt.Color(255, 255, 255));
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbgenero.setBorder(null);
        ContenedorP.add(cmbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 250, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Rectangle 131 (1).png"))); // NOI18N
        ContenedorP.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 50));

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

        cmbEstadoCivil1.setBackground(new java.awt.Color(59, 126, 255));
        cmbEstadoCivil1.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstadoCivil1.setBorder(null);
        cmbEstadoCivil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivil1ActionPerformed(evt);
            }
        });
        ContenedorP.add(cmbEstadoCivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 250, 30));

        cmbtipoSangre1.setBackground(new java.awt.Color(59, 126, 255));
        cmbtipoSangre1.setForeground(new java.awt.Color(255, 255, 255));
        cmbtipoSangre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbtipoSangre1.setBorder(null);
        cmbtipoSangre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtipoSangre1ActionPerformed(evt);
            }
        });
        ContenedorP.add(cmbtipoSangre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 250, 30));

        jdcFecha.setDateFormatString("dd MMM yyyy");
        ContenedorP.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, 30));

        jPanel1.add(ContenedorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 940, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/headerRegistroPersonas.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    String currentGenero;
    String currentTipoSangre;
    String currentEstadoCivil;
    
    public int currentIdGenero;
    public int currentIdTipoSangre;
    public int currentIdEstadoCivil;
    
    private static int calcularDiferenciaEnAnios(java.util.Date fechaInicio, java.util.Date fechaFin) {
        java.util.Calendar calInicio = java.util.Calendar.getInstance();
        calInicio.setTime(fechaInicio);
        java.util.Calendar calFin = java.util.Calendar.getInstance();
        calFin.setTime(fechaFin);
        int diff = calFin.get(java.util.Calendar.YEAR) - calInicio.get(java.util.Calendar.YEAR);
        if (calFin.get(java.util.Calendar.MONTH) < calInicio.get(java.util.Calendar.MONTH)
                || (calFin.get(java.util.Calendar.MONTH) == calInicio.get(java.util.Calendar.MONTH)
                        && calFin.get(java.util.Calendar.DAY_OF_MONTH) < calInicio
                                .get(java.util.Calendar.DAY_OF_MONTH))) {
            diff--;
        }
        return diff;
    }
    
    public boolean isOK()
{
    if (jdcFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    
            JDateChooser dateChooser = new JDateChooser();

        // Obtener la fecha seleccionada del JDateChooser
        java.util.Date fechaSeleccionada = dateChooser.getDate();

        // Obtener la fecha actual
        java.util.Date fechaActual = new java.util.Date();

        // Calcular la diferencia en años entre ambas fechas
        int diferenciaEnAnios = calcularDiferenciaEnAnios(fechaActual, fechaSeleccionada);
         // Verificar si la fecha seleccionada es mayor a la fecha actual
        if (fechaSeleccionada.after(fechaActual)) {
            System.out.println("Error: La fecha seleccionada es mayor a la fecha actual.");
        }

        // Verificar si el usuario tiene al menos 18 años
        if (diferenciaEnAnios < 18) {
            System.out.println("Error: El usuario debe tener al menos 18 años.");
        } else {
            // Llamar al método o realizar la acción deseada
            System.out.println("Fecha válida. El usuario tiene al menos 18 años.");
        }
        
    // Validar campos vacíos
    if(txtNombres.getText().isBlank() || txtApellidos.getText().isBlank() || txtDireccion.getText().isBlank()
            || txtDui.getText().isBlank() || txtNumeroTel.getText().isBlank() || txtCorreo.getText().isBlank())
    {
        JOptionPane.showMessageDialog(this, "No se permiten campos vacíos.");
        return false;
    }
    else
    {
        // Validar longitud de campos
        if(txtNombres.getText().length() > 30 || txtApellidos.getText().length() > 30 || txtDireccion.getText().length() > 40
                || txtDui.getText().length() > 10 || txtNumeroTel.getText().length() > 8 )
        {
            JOptionPane.showMessageDialog(this, "Los campos no deben ser mayores a: Nombres y apellidos = 30, Dirección = 40, Dui = 10, y número de teléfono = 8.");
            return false;
        }
        

        else
        {
            // Validar formato del correo electrónico
            String correoPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(correoPattern);
            Matcher matcher = pattern.matcher(txtCorreo.getText());
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "El formato del correo electrónico no es válido.");
                return false;
            }
            
            // Validar que el DUI contenga solo números
            if (!txtDui.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El DUI debe contener solo números.");
                return false;
            }
            
            // Validar que el número de teléfono contenga solo números
            if (!txtNumeroTel.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "El número de teléfono debe contener solo números.");
                return false;
            } 
            
            else{
                currentGenero=cmbgenero.getSelectedItem().toString().trim();
                System.out.println(currentGenero);
                if(currentGenero.equals("Femenino"))
                {
                    currentIdGenero = 2;
                }
                else
                {
                    currentIdGenero = 1;
                }
                
                currentEstadoCivil=cmbEstadoCivil1.getSelectedItem().toString().trim();
                System.out.println(currentEstadoCivil);
                if(currentEstadoCivil.equals("Soltero"))
                {
                    currentIdEstadoCivil = 1;
                }
                else
                {
                    currentIdEstadoCivil = 2;
                }
                
                currentTipoSangre=cmbtipoSangre1.getSelectedItem().toString().trim();
                System.out.println(currentTipoSangre);
                if(currentTipoSangre.equals("A+"))
                {
                    currentIdTipoSangre = 1;
                }
                else 
                {
                    if(currentTipoSangre.equals("O+"))
                    {currentIdTipoSangre = 2;}
                    else
                    {
                      if(currentTipoSangre.equals("O-"))
                      {currentIdTipoSangre = 3;}
                      else
                      {
                        if(currentTipoSangre.equals("B+"))
                        {currentIdTipoSangre = 4;}
                        else
                        {
                           if(currentTipoSangre.equals("AB+"))
                           {currentIdTipoSangre = 5;}
                           else
                           {
                              if(currentTipoSangre.equals("A-"))
                              {currentIdTipoSangre = 6;}
                              else
                              {
                                if(currentTipoSangre.equals("B-"))
                                {currentIdTipoSangre = 7;}
                                else
                                {
                                    currentIdTipoSangre = 8;
                                }
                              }
                           }
                        }
                      }
                    }
                }    
                return true; // Si todas las validaciones son exitosas, se retorna true.
            }
        }
    }
    
}

    
    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

    }//GEN-LAST:event_lblRegresarMouseClicked
Registro_Idiomas idiomas = new Registro_Idiomas();
    public void ViewIdiomas()
    {
    idiomas.setRegistro(registro); // Establecer la referencia a la instancia de Registro en Registro_Idiomas
 idiomas.init();// Utilizar la referencia a registro para agregar el idioma seleccionado
      System.out.println("Se ejectua ");
         setFocus0(false);
        
         idiomas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                idiomas.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
                         setFocus0(true);
                    }
         });

    }
    
    public boolean status = true;
    Registro_Nacionalidades nacio = new Registro_Nacionalidades();
    public void ViewNacio()
    {
    nacio.setRegistro(registro); // Establecer la referencia a la instancia de Registro en Registro_Idiomas
    nacio.init();
       setFocus0(false);
       
         nacio.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                nacio.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
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

    private void MasIdiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasIdiomasMouseClicked

    }//GEN-LAST:event_MasIdiomasMouseClicked

    private void MasNacionalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasNacionalidadesMouseClicked
                
    }//GEN-LAST:event_MasNacionalidadesMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
  
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void Mas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas1MouseClicked
          if(idiomas.isVisible()){} else { setFocus0(false); }
          ViewIdiomas();
    }//GEN-LAST:event_Mas1MouseClicked

    private void Mas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mas2MouseClicked
         if(nacio.isVisible()){} else { setFocus0(false); }
         ViewNacio();
    }//GEN-LAST:event_Mas2MouseClicked

    private void cmbEstadoCivil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivil1ActionPerformed
        
    }//GEN-LAST:event_cmbEstadoCivil1ActionPerformed

    private void cmbtipoSangre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtipoSangre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtipoSangre1ActionPerformed

    public void setFocus0(boolean status)
    {
       txtNombres.setFocusable(status);
       txtApellidos.setFocusable(status);
       
       txtDireccion.setFocusable(status);
       txtDui.setFocusable(status);
       txtNumeroTel.setFocusable(status);
       txtCorreo.setFocusable(status);
      
       cmbgenero.setFocusable(status);   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorP;
    public javax.swing.JLabel Mas1;
    public javax.swing.JLabel Mas2;
    private javax.swing.JPanel MasIdiomas;
    private javax.swing.JPanel MasNacionalidades;
    public javax.swing.JButton btnSiguiente;
    public javax.swing.JComboBox<String> cmbEstadoCivil1;
    public javax.swing.JComboBox<String> cmbgenero;
    public javax.swing.JComboBox<String> cmbtipoSangre1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblRegresar;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDui;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtNumeroTel;
    // End of variables declaration//GEN-END:variables
}
