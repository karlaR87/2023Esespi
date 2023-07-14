package VIsta.Programa;

import VIsta.Login;
import VIsta.Programa.Inicio.Inicio;
import VIsta.Programa.Inventario.Inventario_Inicio;
import VIsta.Programa.Patrullajes.Patrullajes_Inicio;
import VIsta.Programa.Policias.Policias_Inicio;
import VIsta.Programa.Reportes.Reportes_Inicio;
import VIsta.Programa.Usuario.Usuario;
import desplazable.Desface;
import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author Pao
 */
public class JframePrincipal extends javax.swing.JFrame {
      Color colorChange = new Color(255, 98, 98);
    public JframePrincipal() {       
        initComponents();
        slideMenu.setSize(0, 600);
        jLabel1.setVisible(false);
         iconChange();
        PanelsShowInit();
    }
    
    private CardLayout cardLayout;
    Usuario user = new Usuario();
    Inicio home = new Inicio();
    Policias_Inicio policiasInicio = new Policias_Inicio();
    Patrullajes_Inicio patrullajesInicio = new Patrullajes_Inicio();
    Inventario_Inicio inventarioInicio = new Inventario_Inicio();
    Reportes_Inicio reportesInicio = new Reportes_Inicio();
    private void PanelsShowInit()
    {

       cardLayout = new CardLayout();
        jPanel1.setLayout(cardLayout);
        
        jPanel1.add(home, "inicio");
        jPanel1.add(user, "usuario");
        jPanel1.add(policiasInicio, "policias");
        jPanel1.add(patrullajesInicio, "patrullajes");
        jPanel1.add(inventarioInicio, "inventario");
        jPanel1.add(reportesInicio, "reportes");
        
        cardLayout.show(jPanel1, "inicio");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        iconUsuario = new javax.swing.JLabel();
        iconUsuario1 = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        iconInicio1 = new javax.swing.JLabel();
        iconPolicias = new javax.swing.JLabel();
        iconPolicias1 = new javax.swing.JLabel();
        iconPatrullajes = new javax.swing.JLabel();
        iconPatrullajes1 = new javax.swing.JLabel();
        iconInventario = new javax.swing.JLabel();
        iconInventario1 = new javax.swing.JLabel();
        iconReportes = new javax.swing.JLabel();
        iconReportes1 = new javax.swing.JLabel();
        iconSalir = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        slideMenu = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblPolicias = new javax.swing.JLabel();
        lblPatrullajes = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 710));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/userIcon.png"))); // NOI18N
        jPanel2.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, 60, -1));

        iconUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 70, 70, -1));

        iconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/homeIcon.png"))); // NOI18N
        jPanel2.add(iconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, 70, 90));

        iconInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, 90));

        iconPolicias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/policeIcon.png"))); // NOI18N
        jPanel2.add(iconPolicias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 60, 80));

        iconPolicias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconPolicias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 70, 80));

        iconPatrullajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/carIcon.png"))); // NOI18N
        jPanel2.add(iconPatrullajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 321, 50, 70));

        iconPatrullajes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconPatrullajes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 321, 70, 70));

        iconInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/gunIcon.png"))); // NOI18N
        jPanel2.add(iconInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 415, 70, 60));

        iconInventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 415, 70, 60));

        iconReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/docIcon.png"))); // NOI18N
        jPanel2.add(iconReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 50, 70));

        iconReportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/backIconSelected.png"))); // NOI18N
        jPanel2.add(iconReportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 70, 70));

        iconSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/exitIcon.png"))); // NOI18N
        jPanel2.add(iconSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 40, 40));

        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/menuBack1.png.png"))); // NOI18N
        lblMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuPrincipalMouseExited(evt);
            }
        });
        jPanel2.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        slideMenu.setBackground(new java.awt.Color(70, 70, 70));
        slideMenu.setOpaque(false);
        slideMenu.setPreferredSize(new java.awt.Dimension(0, 600));
        slideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slideMenuMouseExited(evt);
            }
        });
        slideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setBackground(new java.awt.Color(70, 70, 70));
        lblUsuario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("  Usuario");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.setOpaque(true);
        lblUsuario.setPreferredSize(new java.awt.Dimension(180, 25));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseExited(evt);
            }
        });
        slideMenu.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 183, 30));

        lblInicio.setBackground(new java.awt.Color(70, 70, 70));
        lblInicio.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("  Inicio");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.setOpaque(true);
        lblInicio.setPreferredSize(new java.awt.Dimension(180, 25));
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
        });
        slideMenu.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 119, 183, 30));

        lblPolicias.setBackground(new java.awt.Color(70, 70, 70));
        lblPolicias.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblPolicias.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicias.setText("  Policias");
        lblPolicias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPolicias.setOpaque(true);
        lblPolicias.setPreferredSize(new java.awt.Dimension(180, 25));
        lblPolicias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPoliciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPoliciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPoliciasMouseExited(evt);
            }
        });
        slideMenu.add(lblPolicias, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 205, 183, 30));

        lblPatrullajes.setBackground(new java.awt.Color(70, 70, 70));
        lblPatrullajes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblPatrullajes.setForeground(new java.awt.Color(255, 255, 255));
        lblPatrullajes.setText("  Patrullajes");
        lblPatrullajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPatrullajes.setOpaque(true);
        lblPatrullajes.setPreferredSize(new java.awt.Dimension(180, 25));
        lblPatrullajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPatrullajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPatrullajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPatrullajesMouseExited(evt);
            }
        });
        slideMenu.add(lblPatrullajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 290, 183, 30));

        lblInventario.setBackground(new java.awt.Color(70, 70, 70));
        lblInventario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("  Inventario");
        lblInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInventario.setOpaque(true);
        lblInventario.setPreferredSize(new java.awt.Dimension(180, 25));
        lblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInventarioMouseExited(evt);
            }
        });
        slideMenu.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 375, 183, 30));

        lblReportes.setBackground(new java.awt.Color(70, 70, 70));
        lblReportes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("  Reportes");
        lblReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReportes.setOpaque(true);
        lblReportes.setPreferredSize(new java.awt.Dimension(180, 25));
        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportesMouseExited(evt);
            }
        });
        slideMenu.add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 459, 183, 30));

        lblSalir.setBackground(new java.awt.Color(70, 70, 70));
        lblSalir.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setText("  Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setOpaque(true);
        lblSalir.setPreferredSize(new java.awt.Dimension(180, 25));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        slideMenu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 536, 183, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/v.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        slideMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        jPanel2.add(slideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 0, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/blackTransparent2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 710));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 1010, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int x = 0;

    private void lblMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseEntered
       
    }//GEN-LAST:event_lblMenuPrincipalMouseEntered

    private void lblMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseExited
    }//GEN-LAST:event_lblMenuPrincipalMouseExited

    private void slideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideMenuMouseExited
                   
    }//GEN-LAST:event_slideMenuMouseExited

    private void lblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseEntered
        lblUsuario.setBackground(colorChange);
    }//GEN-LAST:event_lblUsuarioMouseEntered

    private void lblUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseExited
        changeColor(); 
    }//GEN-LAST:event_lblUsuarioMouseExited

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        lblInicio.setBackground(colorChange);
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        changeColor(); 
    }//GEN-LAST:event_lblInicioMouseExited

    private void lblPoliciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoliciasMouseExited
         changeColor(); 
            
    }//GEN-LAST:event_lblPoliciasMouseExited

    private void lblPatrullajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatrullajesMouseExited
        changeColor();  
    }//GEN-LAST:event_lblPatrullajesMouseExited

    private void lblInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventarioMouseExited
       changeColor(); 
    }//GEN-LAST:event_lblInventarioMouseExited

    private void lblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseExited
         changeColor();  
    }//GEN-LAST:event_lblReportesMouseExited

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
         changeColor(); 
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblPoliciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoliciasMouseEntered
          lblPolicias.setBackground(colorChange);
          

    }//GEN-LAST:event_lblPoliciasMouseEntered

    private void lblPatrullajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatrullajesMouseEntered
       lblPatrullajes.setBackground(colorChange);

    }//GEN-LAST:event_lblPatrullajesMouseEntered

    private void lblInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventarioMouseEntered
          lblInventario.setBackground(colorChange); 

    }//GEN-LAST:event_lblInventarioMouseEntered

    private void lblReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseEntered
          lblReportes.setBackground(colorChange);

    }//GEN-LAST:event_lblReportesMouseEntered

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
         lblSalir.setBackground(colorChange);  
    }//GEN-LAST:event_lblSalirMouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
 
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited

    }//GEN-LAST:event_jLabel2MouseExited

    private void slideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideMenuMouseEntered

    }//GEN-LAST:event_slideMenuMouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited

    }//GEN-LAST:event_jPanel1MouseExited

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
       iconChange();
       iconUsuario1.setVisible(true);
       cardLayout.show(jPanel1, "usuario");
       ShowHide();  
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void iconChange()
    {
       iconUsuario1.setVisible(false);
       iconInicio1.setVisible(false);
       iconPolicias1.setVisible(false);
       iconPatrullajes1.setVisible(false);
       iconInventario1.setVisible(false);
       iconReportes1.setVisible(false);
    }
    
    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked

        iconChange();
        iconInicio1.setVisible(true);
            cardLayout.show(jPanel1, "inicio");
             ShowHide();
          
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblPoliciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoliciasMouseClicked

        iconChange();
        iconPolicias1.setVisible(true);
            cardLayout.show(jPanel1, "policias");
             ShowHide();
    }//GEN-LAST:event_lblPoliciasMouseClicked

    private void lblPatrullajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatrullajesMouseClicked

        iconChange();
        iconPatrullajes1.setVisible(true);
            cardLayout.show(jPanel1, "patrullajes");
             ShowHide();

    }//GEN-LAST:event_lblPatrullajesMouseClicked

    private void lblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventarioMouseClicked

         iconChange();
        iconInventario1.setVisible(true);
            cardLayout.show(jPanel1, "inventario");
             ShowHide();
    }//GEN-LAST:event_lblInventarioMouseClicked

    private void lblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseClicked

         iconChange();
        iconReportes1.setVisible(true);
            cardLayout.show(jPanel1, "reportes");
             ShowHide();
    }//GEN-LAST:event_lblReportesMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
       Login LG = new Login();
       LG.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_lblSalirMouseClicked
    
    private void lblMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseClicked
      ShowHide();
    }//GEN-LAST:event_lblMenuPrincipalMouseClicked

    private void changeColor()
    {
        Color color = new Color(70, 70, 70);
        lblUsuario.setBackground(color);
        lblInicio.setBackground(color);
        lblPolicias.setBackground(color);
        lblPatrullajes.setBackground(color);
        lblInventario.setBackground(color);
        lblReportes.setBackground(color);
        lblSalir.setBackground(color);
        
        
    }
    
    private void ShowHide()
    {
          if(x == 200)
        {
            slideMenu.setSize(200, 600); jLabel1.setVisible(false); 
            Thread th = new Thread() {
                @Override
                public void run()
                {
                    try
                    {
                        for(int i = 200; i >= 0; i--)
                        {
                            Thread.sleep(1);
                            slideMenu.setSize(i, 600);
                        }
                    } 
                    catch(Exception e)
                    {
                        System.out.println("Algo paso en el thread");
                    }
                }
            }; th.start();
            x = 0;
        }
        else
        { jLabel1.setVisible(true);  slideMenu.setSize(200, 600);

            if(x == 0)
            { 
                slideMenu.show();
                slideMenu.setSize(200, 600);
                Thread th = new Thread () {
                    @Override
                    public void run()
                    {

                        try
                        {
                            for (int i = 0; i<= x; i++)
                            {
                                Thread.sleep(1);
                                slideMenu.setSize(i, 600);
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Algo paso en el thread2");
                        }                     } 
                };th.start();
                x = 200;
                
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframePrincipal().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconInicio;
    private javax.swing.JLabel iconInicio1;
    private javax.swing.JLabel iconInventario;
    private javax.swing.JLabel iconInventario1;
    private javax.swing.JLabel iconPatrullajes;
    private javax.swing.JLabel iconPatrullajes1;
    private javax.swing.JLabel iconPolicias;
    private javax.swing.JLabel iconPolicias1;
    private javax.swing.JLabel iconReportes;
    private javax.swing.JLabel iconReportes1;
    private javax.swing.JLabel iconSalir;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel iconUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblPatrullajes;
    private javax.swing.JLabel lblPolicias;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel slideMenu;
    // End of variables declaration//GEN-END:variables
}
