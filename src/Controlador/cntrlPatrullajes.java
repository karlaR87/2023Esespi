package Controlador;

import Modelo.ModeloPatrullajes;
import VIsta.Programa.JframePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class cntrlPatrullajes implements MouseListener {

    private ModeloPatrullajes modelPatrullajes;
    private JframePrincipal JframePrincipal;

    public cntrlPatrullajes(ModeloPatrullajes modelPatrullajes, JframePrincipal JframePrincipal) {
        this.modelPatrullajes = modelPatrullajes;
        this.JframePrincipal = JframePrincipal;
        this.JframePrincipal.lblPatrullajes.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == JframePrincipal.lblPatrullajes) {
//            modelPatrullajes.readAllPatrullajes(modelPatrullajes);
            System.out.println("A");
        }else{System.out.println("B");}
    }

    // Los siguientes métodos del MouseListener deben estar presentes, aunque no los estemos usando
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
