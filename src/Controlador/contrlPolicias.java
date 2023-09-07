package Controlador;

import Modelo.mdlPolicias;
import VIsta.JoptionReplacemnt;
import VIsta.Login;
import VIsta.Programa.JframePrincipal;
import VIsta.Programa.Policias.Agregar_Usuario;
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
    Agregar_Usuario jFrameAddUser;
    
    String currentGenero;
    String currentTipoSangre;
    String currentEstadoCivil;
    String currentRangoUser;
    
    public int currentIdGenero;
    public int currentIdTipoSangre;
    public int currentIdEstadoCivil;
    public int currentIdRangoUser;
    
    public contrlPolicias(Policias_Inicio vstPoli, JframePrincipal jFrameP, mdlPolicias mdlPoli, Agregar_policia jFrameAddPolice, Agregar_Usuario jFrameAddUser)
    {
        this.vstPoli = vstPoli;
        this.jFrameP = jFrameP;
        this.mdlPoli = mdlPoli;
        this.jFrameAddPolice = jFrameAddPolice;
        this.jFrameAddUser = jFrameAddUser;
        
        vstPoli.btnAddPolicia.addActionListener(this);
        jFrameAddPolice.btnGuardar.addActionListener(this);
        jFrameAddPolice.btnCancel.addActionListener(this);
        
        jFrameAddUser.btnGuardar.addActionListener(this);
        jFrameAddUser.btnCancel.addActionListener(this);
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
        
        if(e.getSource() == jFrameAddUser.btnCancel)
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
            
            jFrameAddUser.txtUsuario.setText("");
            jFrameAddUser.txtContra.setText("");
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
                    
                    if(resulIdPCorreo == -1) //si es igual a -1, es que NO hay persona con ese correo
                    {
                        mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
                        int resultIdPNumero = mdlPoli.readNumeroIfExistNumero();
                        
                        if(resultIdPNumero == -1)
                        {
                            //Ya validados, DUI, Correo y Numero, procedemos a insertar
                            mdlPoli.setNombre(jFrameAddPolice.txtNombre.getText());
                            mdlPoli.setApellido(jFrameAddPolice.txtApellido.getText());
                            mdlPoli.setFechaNacimiento(jFrameAddPolice.jdcCalendar.getDate());
                            mdlPoli.setDireccion(jFrameAddPolice.txtAreaDireccion.getText());
                            mdlPoli.setDUI(jFrameAddPolice.txtDUI.getText().trim());
                            mdlPoli.setIdEstadoCivil(returnIdEstadoCivil());
                            mdlPoli.setIdGenero(returnIdGenero());
                            mdlPoli.setIdTipoSangre(returnIdTipoSangre());
                            mdlPoli.setCorreo(jFrameAddPolice.txtCorreo.getText().trim());
                            mdlPoli.setNumero(jFrameAddPolice.txtNumero.getText().trim());
                            mdlPoli.setONI(jFrameAddPolice.txtNumero.getText().trim());
                            mdlPoli.setNumeroPlaca(jFrameAddPolice.txtPlaca.getText().trim());
                            mdlPoli.setIdRangoUsuario(returnIdRangoUser());
                            //Despues de aceptar la info del poli, vamos con el usuario
                            
                            jFrameAddUser.setVisible(true);           
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
        
        if(e.getSource() == jFrameAddUser.btnGuardar)
        {
            
            //Hasta el final, insertamos todo, falta usuario y contra 
            mdlPoli.setUsuario(jFrameAddUser.txtUsuario.getText().trim());
            int resultUser = mdlPoli.readUserIfExistUser();

            if(resultUser == -1)
            {
                //Insertamos todo
                mdlPoli.setUsuario(jFrameAddUser.txtUsuario.getText().trim());
                mdlPoli.setContra(jFrameAddUser.txtContra.getText().trim());

                if(mdlPoli.InsertPoliceIncludePersonaTipoPUser())
                {
                    show("El policía fue agregado correctamente", 17, 1, 0);
                    close1();       
                }
                else
                {
                    show("No se pudo agregar al policía", 17, 1, 0);
                    close1();   
                }
            }
            else
            {
                mdlPoli.setUsuario("0");
                show("Ya existe una persona con ese usuario", 17, 1, 0);
                close1();
            } 
    }
    }
    
     JoptionReplacemnt Jo;
    
    public void show(String msg, int sizeTXT, int img, int type)
    {  
        jFrameAddPolice.setEnabled(false);
        jFrameAddUser.setEnabled(false);
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
            jFrameAddUser.setEnabled(true);
            jFrameP.enable(true);
            jFrameP.jLabel3.setVisible(false);
            jFrameAddPolice.dispose();
        }
        });
        
        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jo.setVisible(false);
            jFrameAddUser.setEnabled(true);
            jFrameAddPolice.setEnabled(true);
        }
        });
    }
    
    
    
//    public void close2()
//    {   
//        //Agregar evento click
//        Jo.SIbutton.addActionListener(new java.awt.event.ActionListener() {
//        public void actionPerformed(java.awt.event.ActionEvent evt) {
//            Jo.setVisible(false);
//            jFrameAddPolice.setEnabled(true);
//            jFrameAddUser.setEnabled(true);
//            jFrameP.enable(true);
//            jFrameP.jLabel3.setVisible(false);
//            jFrameAddPolice.dispose();
//            jFrameAddUser.dispose();
//        }
//        });
//        
//        Jo.NObutton.addActionListener(new java.awt.event.ActionListener() {
//        public void actionPerformed(java.awt.event.ActionEvent evt) {
//            Jo.setVisible(false);
//            jFrameAddUser.setEnabled(true);
//            jFrameAddPolice.setEnabled(true);
//        }
//        });
//    }
//    
//    public void close3()
//    {
//        //Agregar evento click
//        Jo.OKbutton.addActionListener(new java.awt.event.ActionListener() {
//        public void actionPerformed(java.awt.event.ActionEvent evt) {
//            Jo.dispose();
//            jFrameAddUser.dispose();
//            jFrameAddPolice.dispose();
//             jFrameAddUser.setEnabled(true);
//            jFrameAddPolice.setEnabled(true);
//            
//        }
//        });
//    }
    
    public int returnIdEstadoCivil()
    {
        currentEstadoCivil=jFrameAddPolice.cmbEstadoCivil.getSelectedItem().toString().trim();
       
       if(currentEstadoCivil.equals("Soltero"))
       {
           currentIdEstadoCivil = 1;
           return currentIdEstadoCivil;
       }
       else
       {
           currentIdEstadoCivil = 2;
           return currentIdEstadoCivil;
       }
    }
    
    public int returnIdGenero()
    {
        currentGenero=jFrameAddPolice.cmbGenero.getSelectedItem().toString().trim();
        if(currentGenero.equals("Femenino"))
        {
            currentIdGenero = 2;
            return currentIdGenero;
        }
        else
        {
            currentIdGenero = 1;
            return currentIdGenero;
        }
    }
    
    public int returnIdRangoUser()
    {
        currentRangoUser=jFrameAddPolice.cmbRangoUser.getSelectedItem().toString().trim();
        if(currentRangoUser.equals("Comisionado General"))
        {
            currentIdRangoUser = 1;
            return currentIdRangoUser;
        }
        else 
        {
            if(currentRangoUser.equals("Comisionado"))
            {currentIdRangoUser = 2; return currentIdRangoUser;}
            else
            {
              if(currentRangoUser.equals("SubComisionado"))
              {currentIdRangoUser = 3; return currentIdRangoUser;}
              else
              {
                if(currentRangoUser.equals("Inspector Jefe"))
                {currentIdRangoUser = 4; return currentIdRangoUser;}
                else
                {
                   if(currentRangoUser.equals("Inspector"))
                   {currentIdRangoUser = 5; return currentIdRangoUser;}
                   else
                   {
                      if(currentRangoUser.equals("SubInspector"))
                      {currentIdRangoUser = 6; return currentIdRangoUser;}
                      else
                      {
                        if(currentRangoUser.equals("Sargento"))
                        {currentIdRangoUser = 7; return currentIdRangoUser;}
                        else
                        {
                            if(currentRangoUser.equals("Cabo"))
                            {currentIdRangoUser = 8; return currentIdRangoUser;}
                            else
                            {
                                currentIdRangoUser = 9; return currentIdRangoUser;
                            }
                        }
                      }
                   }
                }
              }
            }
        }  
    }
    
    public int returnIdTipoSangre()
    {
       currentTipoSangre=jFrameAddPolice.cmbTipoSangre.getSelectedItem().toString().trim();
        if(currentTipoSangre.equals("A+"))
        {
            currentIdTipoSangre = 1;
            return currentIdTipoSangre;
        }
        else 
        {
            if(currentTipoSangre.equals("O+"))
            {currentIdTipoSangre = 2; return currentIdTipoSangre;}
            else
            {
              if(currentTipoSangre.equals("O-"))
              {currentIdTipoSangre = 3; return currentIdTipoSangre;}
              else
              {
                if(currentTipoSangre.equals("B+"))
                {currentIdTipoSangre = 4; return currentIdTipoSangre;}
                else
                {
                   if(currentTipoSangre.equals("AB+"))
                   {currentIdTipoSangre = 5; return currentIdTipoSangre;}
                   else
                   {
                      if(currentTipoSangre.equals("A-"))
                      {currentIdTipoSangre = 6; return currentIdTipoSangre;}
                      else
                      {
                        if(currentTipoSangre.equals("B-"))
                        {currentIdTipoSangre = 7; return currentIdTipoSangre;}
                        else
                        {
                            currentIdTipoSangre = 8; return currentIdTipoSangre;
                        }
                      }
                   }
                }
              }
            }
        } 
    }
}
