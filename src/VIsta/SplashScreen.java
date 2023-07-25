
package VIsta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class SplashScreen extends javax.swing.JFrame {

   
    public SplashScreen() {
        initComponents();
        this.setLocationRelativeTo(this);
        CargarNumeroRandom();
        CargarBarraDeProgreso();
    }
    
    public void CargarNumeroRandom()
    {
         String[] Mensajes = {"¿Eres un policía? Nosotros también", "Puedes presionar ENTER al seleccionar un botón para cargarlo", "Los patrullajes revolucionan el país", "Si eres un policía, lee esto este mensaje", "Agrega datos para mostrarlos en las tablas de vistas",
         "Muéstranos tu potencial en la tecnología", "Refresca tu mente después de tu jornada diaria", "Los administradores tienen mucho poder, pero deben saberlo manejar", "¡No cierres el programa forzosamente!", "Reune toda la información policial",
         };
         int indiceAleatorio = (int) (Math.random() * Mensajes.length);
         txtMensajes.setText(Mensajes[indiceAleatorio]);
    }

public void CargarBarraDeProgreso()
{
           Timer time = new Timer(50, (ActionEvent e) -> {
            pbCargar.setValue(pbCargar.getValue()+1);
            pbCargar.setBackground(Color.cyan); 
            pbCargar.setStringPainted(true); 
            pbCargar.setString("Cargando..." + pbCargar.getValue() + "%");
            
          
        }); 
        
        time.start(); //Iinicializamos el progreso de la barra.
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        pbCargar = new javax.swing.JProgressBar();
        txtMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIsta/imagenes/Red Dragon Logo (4) 1.png"))); // NOI18N

        pbCargar.setBackground(new java.awt.Color(102, 255, 255));

        txtMensajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMensajes.setText("jLabel2");
        txtMensajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(pbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(txtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 SplashScreen primera = new SplashScreen();
                Timer tiempo = new Timer(6400, (ActionEvent e) -> {
                        primera.setVisible(false);
                        Bienvenida vista = new Bienvenida();
                        vista.setVisible(true);
                       
                       
                    });
                    tiempo.setRepeats(false);
                    tiempo.start();
                primera .setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JProgressBar pbCargar;
    private javax.swing.JLabel txtMensajes;
    // End of variables declaration//GEN-END:variables
}
