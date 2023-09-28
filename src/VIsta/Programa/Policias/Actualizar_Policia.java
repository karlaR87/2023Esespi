package VIsta.Programa.Policias;

import Modelo.ModeloRegistro;
import com.toedter.calendar.JTextFieldDateEditor;
import fonts.Fuentes;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Pao
 */
public class Actualizar_Policia extends javax.swing.JFrame {

    ModeloRegistro modeloRegistro = new ModeloRegistro();
    Fuentes tipoFuentes;
    
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoClareCancel;
     
    ImageIcon iconoOriginalSave;
    ImageIcon iconoClareSave;
    
    public Actualizar_Policia() {
        initComponents();
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnCancelBlockRed3.png"); 
        iconoClareCancel = new ImageIcon("src/VIsta/imagenes/btnCancelBlockRed3CLARE.png");
        
        iconoOriginalSave = new ImageIcon("src/VIsta/imagenes/btnGuardarBlockBlue.png"); 
        iconoClareSave = new ImageIcon("src/VIsta/imagenes/btnGuardarBlockBlueCLARE.png"); 
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18); // Restar 18 años a la fecha actual
        Date fechaMaxima = cal.getTime();

        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -90); // Restar 90 años a la fecha actual
        Date fechaMinima = cal.getTime();

        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) jdcCalendar.getDateEditor();
        // Deshabilitar la edición
        editor1.setEditable(false);
        
        // Configurar el JDateChooser con las fechas mínima y máxima
        jdcCalendar.setMaxSelectableDate(fechaMaxima);
        jdcCalendar.setMinSelectableDate(fechaMinima);
        
        jLabel11.setVisible(false);
        NOSPACE();
         try {
            modeloRegistro.llenarCombo(cmbEstadoCivil);
            modeloRegistro.llenarCombo2(cmbTipoSangre);
            modeloRegistro.llenarCombo3(cmbGenero);
            modeloRegistro.llenarCombo4(cmbRangoUser);

        } catch (SQLException e) {
             System.out.println("Error en cmb y clndr");
        }
          ImageIcon icono = new ImageIcon("src/VIsta/imagenes/R100.png"); this.setIconImage(icono.getImage());
        this.setBackground(new Color(0, 0, 0, 0)); 
        fontDesign();
    }
    
     public void NOSPACE()
    {
        PlainDocument document = new PlainDocument();
        PlainDocument document2 = new PlainDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Evitar la inserción de espacios en blanco
                if (!string.contains(" ")) {
                    super.insertString(fb, offset, string, attr);
                }
            }
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Evitar la sustitución de espacios en blanco
                if (!text.contains(" ")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
         document2.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Evitar la inserción de espacios en blanco
                if (!string.contains(" ")) {
                    super.insertString(fb, offset, string, attr);
                }
            }
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Evitar la sustitución de espacios en blanco
                if (!text.contains(" ")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        // Asignar el PlainDocument al JTextField
        txtNumero.setDocument(document);
        txtCorreo.setDocument(document2);
    
    }
       
    private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
         
       lblNombre.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre2.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre3.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre4.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre5.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre6.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre7.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre8.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre9.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre10.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
       lblNombre11.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 15));
    }
    
    public void OriginialIcon()
    {
        this.btnCancel.setIcon(iconoOriginalCancel);
        this.btnGuardar.setIcon(iconoOriginalSave);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cmbRangoUser = new javax.swing.JComboBox<>();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        cmbTipoSangre = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JTextField();
        txtONI = new javax.swing.JTextField();
        txtDUI = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jdcCalendar = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        ActutxtAreaDireccion = new javax.swing.JTextArea();
        lblNombre12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre11 = new javax.swing.JLabel();
        lblNombre10 = new javax.swing.JLabel();
        lblNombre9 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BLACKTRANSPARENT980X707.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnGuardarBlockBlue.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 506, 110, 90));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancelBlockRed3.png"))); // NOI18N
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 506, 110, 90));

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbRangoUser.setBackground(new java.awt.Color(59, 126, 255));
        cmbRangoUser.setForeground(new java.awt.Color(255, 255, 255));
        cmbRangoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRangoUser.setBorder(null);
        jPanel1.add(cmbRangoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 200, 25));

        cmbEstadoCivil.setBackground(new java.awt.Color(59, 126, 255));
        cmbEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstadoCivil.setBorder(null);
        cmbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 128, 25));

        cmbTipoSangre.setBackground(new java.awt.Color(59, 126, 255));
        cmbTipoSangre.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoSangre.setBorder(null);
        jPanel1.add(cmbTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 420, 128, 25));

        cmbGenero.setBackground(new java.awt.Color(59, 126, 255));
        cmbGenero.setForeground(new java.awt.Color(255, 255, 255));
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGenero.setBorder(null);
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 128, 25));

        txtPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPlaca.setToolTipText("");
        txtPlaca.setBorder(null);
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 227, 180, 20));

        txtONI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtONI.setToolTipText("");
        txtONI.setBorder(null);
        txtONI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtONIKeyTyped(evt);
            }
        });
        jPanel1.add(txtONI, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 156, 180, 20));

        txtDUI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDUI.setToolTipText("");
        txtDUI.setBorder(null);
        txtDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDUIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDUIKeyTyped(evt);
            }
        });
        jPanel1.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 180, 123, 20));

        txtNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumero.setToolTipText("");
        txtNumero.setBorder(null);
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 265, 180, 20));

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 227, 180, 20));

        txtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellido.setToolTipText("");
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 189, 180, 20));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 151, 180, 20));

        jdcCalendar.setDateFormatString("dd MMM yyyy");
        jPanel1.add(jdcCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 260, 155, 70));

        ActutxtAreaDireccion.setColumns(20);
        ActutxtAreaDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ActutxtAreaDireccion.setRows(5);
        ActutxtAreaDireccion.setBorder(null);
        ActutxtAreaDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        ActutxtAreaDireccion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ActutxtAreaDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActutxtAreaDireccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(ActutxtAreaDireccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 303, 192, 71));

        lblNombre12.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre12.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre12.setText("Rango:");
        jPanel1.add(lblNombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 195, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 227, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 156, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtDUI.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 156, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtAreaWhite.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 303, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 265, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 227, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 189, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKtxtWhite.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 151, -1, -1));

        lblNombre11.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre11.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre11.setText("Número de placa:");
        jPanel1.add(lblNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 227, -1, -1));

        lblNombre10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre10.setText("ONI:");
        jPanel1.add(lblNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 156, -1, -1));

        lblNombre9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre9.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre9.setText("<html> <center> Fecha de <br> nacimiento: </center> </html>");
        lblNombre9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 221, -1, -1));

        lblNombre8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre8.setText("DUI:");
        jPanel1.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 161, -1, -1));

        lblNombre7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre7.setText("Tipo de Sangre:");
        jPanel1.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 397, -1, -1));

        lblNombre6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre6.setText("Género:");
        jPanel1.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 397, -1, -1));

        lblNombre5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre5.setText("Estado civil:");
        jPanel1.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 397, -1, -1));

        lblNombre4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre4.setText("Dirección:");
        jPanel1.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 303, -1, -1));

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre3.setText("Número:");
        jPanel1.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 265, -1, -1));

        lblNombre2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Correo:");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 227, -1, -1));

        lblNombre1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Apellidos:");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 189, -1, -1));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 151, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/HEADERActualizarPolicia.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKAddInfoPolice.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 102, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void cmbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivilActionPerformed

    }//GEN-LAST:event_cmbEstadoCivilActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        if (txtPlaca.getText().length() >= 5) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtONIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtONIKeyTyped
        if (txtONI.getText().length() >= 8) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
    }//GEN-LAST:event_txtONIKeyTyped

    private void txtDUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyTyped
        if (txtDUI.getText().length() >= 9) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
    }//GEN-LAST:event_txtDUIKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }

        if (txtNumero.getText().length() >= 8) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >= 200) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (txtApellido.getText().length() >= 30) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 30) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void ActutxtAreaDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActutxtAreaDireccionKeyTyped
        if (ActutxtAreaDireccion.getText().length() >= 50) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_ActutxtAreaDireccionKeyTyped

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
      OriginialIcon();
      btnCancel.setIcon(iconoClareCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        OriginialIcon();
        btnGuardar.setIcon(iconoClareSave);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        OriginialIcon();
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
         OriginialIcon();
    }//GEN-LAST:event_btnCancelMouseExited

    private void txtDUIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyReleased
        String texto = txtDUI.getText();

    // Eliminar todos los caracteres que no sean dígitos
    texto = texto.replaceAll("[^0-9]", "");

    // Limitar la longitud del texto a 9 caracteres
    if (texto.length() > 9) {
        // Si se ingresaron más de 9 caracteres, recortar el texto
        texto = texto.substring(0, 9);
    }

    // Insertar un guion después del octavo dígito si aún no existe
    if (texto.length() >= 8 && !texto.contains("-")) {
        texto = texto.substring(0, 8) + "-" + texto.substring(8);
    }

    // Actualizar el texto en el campo de texto
    txtDUI.setText(texto);
    }//GEN-LAST:event_txtDUIKeyReleased

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
            java.util.logging.Logger.getLogger(Actualizar_Policia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Policia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Policia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Policia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Policia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea ActutxtAreaDireccion;
    public javax.swing.JButton btnCancel;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> cmbEstadoCivil;
    public javax.swing.JComboBox<String> cmbGenero;
    public javax.swing.JComboBox<String> cmbRangoUser;
    public javax.swing.JComboBox<String> cmbTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdcCalendar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre10;
    private javax.swing.JLabel lblNombre11;
    private javax.swing.JLabel lblNombre12;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblNombre9;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDUI;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtONI;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
