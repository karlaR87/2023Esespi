package Controlador;

import Modelo.mdlPolicias;
import VIsta.JoptionReplacemnt;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Policias.Agregar_policia;
import VIsta.Programa.Policias.Policias_Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contrlPolicias implements ActionListener{

    private Policias_Inicio vstPoli;
    private JframePrincipal jFrameP;
    private mdlPolicias mdlPoli;
    
    Agregar_policia jFrameAddPolice;
    
    String currentGenero;
    String currentTipoSangre;
    String currentEstadoCivil;
    
    public int currentIdGenero;
    public int currentIdTipoSangre;
    public int currentIdEstadoCivil;
    
    public contrlPolicias(Policias_Inicio vstPoli, JframePrincipal jFrameP, mdlPolicias mdlPoli, Agregar_policia jFrameAddPolice)
    {
        this.vstPoli = vstPoli;
        this.jFrameP = jFrameP;
        this.mdlPoli = mdlPoli;
        this.jFrameAddPolice = jFrameAddPolice;
        
        vstPoli.btnAddPolicia.addActionListener(this);
        jFrameAddPolice.btnGuardar.addActionListener(this);
        jFrameAddPolice.btnCancel.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vstPoli.btnAddPolicia)
        {
            jFrameP.enable(false);
            jFrameP.jLabel3.setVisible(true);
            jFrameAddPolice.setVisible(true);
            jFrameAddPolice.setVisible(true);
        }
        
        if(e.getSource() == jFrameAddPolice.btnCancel)
        {
           //Mostrar JOption - borrar todo
            show("¿Seguro que quieres cancelar? se eliminarán los datos", 14, 1, 1);
            close1();
            
            jFrameAddPolice.txtApellido.setText("");
            jFrameAddPolice.txtAreaDireccion.setText("");
            jFrameAddPolice.txtCorreo.setText("");
            jFrameAddPolice.txtDUI.setText("");
            jFrameAddPolice.txtNombre.setText("");
            jFrameAddPolice.txtNumero.setText("");
            jFrameAddPolice.txtONI.setText("");
            jFrameAddPolice.txtPlaca.setText("");
        }  
        
        if(e.getSource() == jFrameAddPolice.btnGuardar)
        {
            String correoPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(correoPattern);
            Matcher matcher = pattern.matcher(jFrameAddPolice.txtCorreo.getText());
            if (!matcher.matches()) {
            show("El formato del correo electrónico no es válido", 17, 1, 0);
            close1();                                    
            }
            else
            {
                //Validar que NO exista el DUI
                mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                int resultIdPDUI = mdlPoli.readDUIIfExistDUI();
                
                if(resultIdPDUI == -1) //si es igual a -1, es que NO hay persona con ese dui
                {
                    mdlPoli.setCorreo(jFrameAddPolice.txtCorreo.getText().trim());
                    int resulIdPCorreo = mdlPoli.readCorreoIfExistCorreo();
                    
                    if(resulIdPCorreo ==-1) //si es igual a -1, es que NO hay persona con ese correo
                    {
                         mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
                        int resultIdPNumero = mdlPoli.readNumeroIfExistNumero();
                        
                        if(resultIdPNumero == -1)
                        {
                            //Ya validados, DUI, Correo y Numero, procedemos a insertar
                            //mdlPoli.set
                        }
                        else
                        {
                            mdlPoli.setCorreo("0");
                            show("Ya existe una persona con ese Número", 17, 1, 0);
                            close1();
                        }                     
                    }
                    else
                    {
                        mdlPoli.setCorreo("0");
                        show("Ya existe una persona con ese Correo", 17, 1, 0);
                        close1();   
                    }
                }
                else
                {
                    mdlPoli.setDUI("0");
                    show("Ya existe una persona con ese DUI", 17, 1, 0);
                    close1();   
                }
                                              
            }
        }
    }
    
     JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img, int type)
    {  
        jFrameAddPolice.setEnabled(false);
        Jo = new JoptionReplacemnt(type,img, msg, sizeTXT);
        Jo.setVisible(true);
    }
    
    public void close1()
    {   
        //Agregar evento click
        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameAddPolice.setEnabled(true);
            jFrameP.enable(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameAddPolice.dispose();
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameAddPolice.setEnabled(true);
        }
        });
    }
    
}
