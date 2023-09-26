package VIsta.Programa.Patrullajes;

import com.toedter.calendar.DateUtil;
import fonts.Fuentes;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


public class Patrullajes_Agregar extends javax.swing.JPanel {

    ImageIcon iconoOriginalAdd;
    ImageIcon iconoOriginalAddCLARE;
     
    ImageIcon iconoOriginalCancel;
    ImageIcon iconoOriginalCancelCLARE;
     
    ImageIcon iconoOriginalAddPerson;
    ImageIcon iconoOriginalAddPersonCLARE;
    
    ImageIcon iconoOriginalAddMap;
    ImageIcon iconoOriginalAddMapCLARE;
    
    ImageIcon iconoOriginalAddActPatru;
    ImageIcon iconoOriginalAddActPatruCLARE;
    
    
    Fuentes tipoFuentes;
   
    public Patrullajes_Agregar() {
        initComponents();
        
        iconoOriginalAdd = new ImageIcon("src/VIsta/imagenes/btnAdd.png"); 
        iconoOriginalAddCLARE = new ImageIcon("src/VIsta/imagenes/btnAddCLARE.png");
        
        iconoOriginalCancel = new ImageIcon("src/VIsta/imagenes/btnCancel21.png"); 
        iconoOriginalCancelCLARE = new ImageIcon("src/VIsta/imagenes/btnCancel21CLARE.png"); 
        
        iconoOriginalAddPerson = new ImageIcon("src/VIsta/imagenes/agregar 16.png"); 
        iconoOriginalAddPersonCLARE = new ImageIcon("src/VIsta/imagenes/agregar 16CLARE.png");
        
        iconoOriginalAddMap = new ImageIcon("src/VIsta/imagenes/btnEditMap.png"); 
        iconoOriginalAddMapCLARE = new ImageIcon("src/VIsta/imagenes/btnEditMapCLARE.png");
        
        iconoOriginalAddActPatru = new ImageIcon("src/VIsta/imagenes/btnAddActPatru.png"); 
        iconoOriginalAddActPatruCLARE = new ImageIcon("src/VIsta/imagenes/btnAddActPatruCLARE.png");
        
        //------------------------------------VALIDAR JDATECHOOSERS---------------------------------
        // Configurar el rango mínimo (hoy) para la fecha de inicio
        dpFechaInicio.setMinSelectableDate(new Date());

        // Configurar el rango máximo (1 año en el futuro) para la fecha de inicio
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        dpFechaInicio.setMaxSelectableDate(calendar.getTime());

        // Agregar un listener para validar la fecha de inicio cuando cambia
        dpFechaInicio.getDateEditor().addPropertyChangeListener(e -> {
            validarFechaInicio();
        });

        // Agregar un listener para validar la fecha de finalización cuando cambia
        dpFechaFin.getDateEditor().addPropertyChangeListener(e -> {
//            validarFechaFinalizacion();
        });
      
        dpFechaFin.setEnabled(false);
        NumbersHoursMinutes();
        fontDesign();
    }
    
private void validarFechaInicio() {
    Date fechaInicio = dpFechaInicio.getDate();
    
    if (fechaInicio == null) {
        dpFechaFin.setDate(null);
        dpFechaFin.setEnabled(false);
    } else {
        dpFechaFin.setEnabled(true);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);

        // Configurar el rango mínimo (la fecha de inicio + 1 día) para la fecha de fin
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dpFechaFin.setMinSelectableDate(calendar.getTime());

        // Configurar el rango máximo (1 año en el futuro) para la fecha de fin
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.YEAR, 1);
        dpFechaFin.setMaxSelectableDate(calendar.getTime());

        // Establecer la fecha de fin predeterminada como un día después de la fecha de inicio
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        dpFechaFin.setDate(calendar.getTime());
    }
}
    

    public void NumbersHoursMinutes()
    {

            ((AbstractDocument) txtHora1.getDocument()).setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                    if (newText.matches("0?[1-9]|1[0-9]|2[0-4]")) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                }
            });

            ((AbstractDocument) txtMin1.getDocument()).setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                    if (newText.matches("[0-5]?[0-9]")) {
                        super.replace(fb, offset, length, text, attrs);
                    }
                }
            });
        
    }
    public void OriginalIcon()
    {
        btnAddPatrullaje.setIcon(iconoOriginalAdd);
        btnCancelPatrullaje.setIcon(iconoOriginalCancel);
        btnAddPersonal.setIcon(iconoOriginalAddPerson);
        btnAddUbi.setIcon(iconoOriginalAddMap);
        btnAddActPatru.setIcon(iconoOriginalAddActPatru);
    }
    
   private void fontDesign()
    {      
        tipoFuentes = new Fuentes();
        // jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.DMSans, 0, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHora1 = new javax.swing.JTextField();
        txtMin1 = new javax.swing.JTextField();
        txtHora2 = new javax.swing.JTextField();
        txtMin2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAddUbi = new javax.swing.JButton();
        dpFechaFin = new com.toedter.calendar.JDateChooser();
        dpFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddPersonal = new javax.swing.JButton();
        lblMAPImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddActPatru = new javax.swing.JButton();
        pnlPersonal = new javax.swing.JPanel();
        btnCancelPatrullaje = new javax.swing.JButton();
        btnAddPatrullaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora1.setBackground(new java.awt.Color(70, 70, 70));
        txtHora1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHora1.setForeground(new java.awt.Color(255, 255, 255));
        txtHora1.setToolTipText("");
        txtHora1.setBorder(null);
        txtHora1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHora1KeyTyped(evt);
            }
        });
        add(txtHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 374, 34, 18));

        txtMin1.setBackground(new java.awt.Color(70, 70, 70));
        txtMin1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMin1.setForeground(new java.awt.Color(255, 255, 255));
        txtMin1.setToolTipText("");
        txtMin1.setBorder(null);
        txtMin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMin1KeyTyped(evt);
            }
        });
        add(txtMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 374, 34, 18));

        txtHora2.setBackground(new java.awt.Color(70, 70, 70));
        txtHora2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHora2.setForeground(new java.awt.Color(255, 255, 255));
        txtHora2.setToolTipText("");
        txtHora2.setBorder(null);
        txtHora2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHora2KeyTyped(evt);
            }
        });
        add(txtHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 549, 34, 18));

        txtMin2.setBackground(new java.awt.Color(70, 70, 70));
        txtMin2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMin2.setForeground(new java.awt.Color(255, 255, 255));
        txtMin2.setToolTipText("");
        txtMin2.setBorder(null);
        txtMin2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMin2KeyTyped(evt);
            }
        });
        add(txtMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 549, 34, 18));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKSELECTTIME.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 535, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 335, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/BACKSELECTTIME.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        btnAddUbi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnEditMap.png"))); // NOI18N
        btnAddUbi.setBorderPainted(false);
        btnAddUbi.setContentAreaFilled(false);
        btnAddUbi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddUbiMouseExited(evt);
            }
        });
        add(btnAddUbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 215, 40, -1));

        dpFechaFin.setDateFormatString("dd MMM yyyy");
        add(dpFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 170, 70));

        dpFechaInicio.setDateFormatString("dd MMM yyyy");
        add(dpFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 335, 170, 70));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 335, -1, -1));

        btnAddPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/agregar 16.png"))); // NOI18N
        btnAddPersonal.setBorderPainted(false);
        btnAddPersonal.setContentAreaFilled(false);
        btnAddPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPersonalMouseExited(evt);
            }
        });
        add(btnAddPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 15, 30, 31));

        lblMAPImage.setBackground(new java.awt.Color(70, 70, 70));
        lblMAPImage.setForeground(new java.awt.Color(70, 70, 70));
        lblMAPImage.setText("jLabel12");
        add(lblMAPImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 400, 200));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> NO EXISTE <br> PERSONAL <br> ASIGNADO </html>");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 145, 130, -1));

        btnAddActPatru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddActPatru.png"))); // NOI18N
        btnAddActPatru.setBorderPainted(false);
        btnAddActPatru.setContentAreaFilled(false);
        btnAddActPatru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddActPatru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddActPatruMouseExited(evt);
            }
        });
        add(btnAddActPatru, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 343, 250, -1));

        pnlPersonal.setBackground(new java.awt.Color(70, 70, 70));
        pnlPersonal.setLayout(new java.awt.BorderLayout());
        add(pnlPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 230, 200));

        btnCancelPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancel21.png"))); // NOI18N
        btnCancelPatrullaje.setBorderPainted(false);
        btnCancelPatrullaje.setContentAreaFilled(false);
        btnCancelPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelPatrullajeMouseExited(evt);
            }
        });
        add(btnCancelPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 518, 250, -1));

        btnAddPatrullaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAdd.png"))); // NOI18N
        btnAddPatrullaje.setBorderPainted(false);
        btnAddPatrullaje.setContentAreaFilled(false);
        btnAddPatrullaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPatrullaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPatrullajeMouseExited(evt);
            }
        });
        add(btnAddPatrullaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 436, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnAddShadow.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 436, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/btnCancel21Shadow.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 518, -1, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/PersonaleBack.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backFinishPatrullaje.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 440, -1, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/RBACKAddUbi.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 10, -1, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backInitPatrullaje.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 265, -1, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseClicked

    }//GEN-LAST:event_btnCancelPatrullajeMouseClicked

    private void btnAddPatrullajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatrullajeMouseClicked

    private void btnAddPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPersonalMouseClicked

    private void btnAddUbiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUbiMouseClicked

    private void btnAddPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseEntered
        OriginalIcon();
        btnAddPersonal.setIcon(iconoOriginalAddPersonCLARE);
    }//GEN-LAST:event_btnAddPersonalMouseEntered

    private void btnAddPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseEntered
        OriginalIcon();
        btnAddPatrullaje.setIcon(iconoOriginalAddCLARE);
    }//GEN-LAST:event_btnAddPatrullajeMouseEntered

    private void btnCancelPatrullajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseEntered
        OriginalIcon();
        btnCancelPatrullaje.setIcon(iconoOriginalCancelCLARE);
    }//GEN-LAST:event_btnCancelPatrullajeMouseEntered

    private void btnAddUbiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseEntered
      OriginalIcon();
      btnAddUbi.setIcon(iconoOriginalAddMapCLARE);
    }//GEN-LAST:event_btnAddUbiMouseEntered

    private void btnAddPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPersonalMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddPersonalMouseExited

    private void btnAddPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatrullajeMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddPatrullajeMouseExited

    private void btnCancelPatrullajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPatrullajeMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnCancelPatrullajeMouseExited

    private void btnAddUbiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUbiMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddUbiMouseExited

    private void btnAddActPatruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActPatruMouseClicked

    private void btnAddActPatruMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseEntered
        OriginalIcon();
        btnAddActPatru.setIcon(iconoOriginalAddActPatruCLARE);
    }//GEN-LAST:event_btnAddActPatruMouseEntered

    private void btnAddActPatruMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddActPatruMouseExited
        OriginalIcon();
    }//GEN-LAST:event_btnAddActPatruMouseExited

    private void txtHora1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
        
        if (txtHora1.getText().length() >= 2) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
        
    }//GEN-LAST:event_txtHora1KeyTyped

    private void txtHora2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
        
        if (txtHora2.getText().length() >= 2) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtHora2KeyTyped

    private void txtMin1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMin1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
        
        if (txtMin1.getText().length() >= 2) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtMin1KeyTyped

    private void txtMin2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMin2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Descarta caracteres que no son números
        }
        
        if (txtMin2.getText().length() >= 2) {
            evt.consume(); // Bloquea la entrada de texto adicional
        }
    }//GEN-LAST:event_txtMin2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddActPatru;
    public javax.swing.JButton btnAddPatrullaje;
    public javax.swing.JButton btnAddPersonal;
    public javax.swing.JButton btnAddUbi;
    public javax.swing.JButton btnCancelPatrullaje;
    public com.toedter.calendar.JDateChooser dpFechaFin;
    public com.toedter.calendar.JDateChooser dpFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMAPImage;
    public javax.swing.JPanel pnlPersonal;
    public javax.swing.JTextField txtHora1;
    public javax.swing.JTextField txtHora2;
    public javax.swing.JTextField txtMin1;
    public javax.swing.JTextField txtMin2;
    // End of variables declaration//GEN-END:variables
}
