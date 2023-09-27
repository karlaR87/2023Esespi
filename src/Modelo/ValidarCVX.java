/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Saraí
 */
public class ValidarCVX {
    
    public static void deshabilitarCVX(JComponent campo){
        
        campo.getInputMap().put(KeyStroke.getKeyStroke("control C"), "null");
        campo.getInputMap().put(KeyStroke.getKeyStroke("control V"), "null");
        campo.getInputMap().put(KeyStroke.getKeyStroke("control X"), "null");
        campo.getInputMap().put(KeyStroke.getKeyStroke("shift INSERT"), "null");
        
    }
    
}
