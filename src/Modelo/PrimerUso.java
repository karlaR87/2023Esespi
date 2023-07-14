/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import VIsta.Bienvenida;
import VIsta.Login;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author karla
 */
public class PrimerUso {
    private static final String PRIMER_USO_FILE_PATH = "FilePrimerUso/primer_uso.txt";

    public static void verificarPrimerUso() {
        File file = new File(PRIMER_USO_FILE_PATH);

        if (file.exists()) {
            // No es la primera ejecución, abrir la aplicación principal
            iniciarAplicacion();
        } else {
            // Es la primera ejecución, mostrar la ventana de primer uso y crear el archivo
            Bienvenida ventanaPrimerUso = new Bienvenida();
            ventanaPrimerUso.setVisible(true);

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ventanaPrimerUso.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    iniciarAplicacion();
                }
            });
        }
    }

    private static void iniciarAplicacion() {
        Login miAplicacion = new Login();
        miAplicacion.setVisible(true);
    }
    
}
