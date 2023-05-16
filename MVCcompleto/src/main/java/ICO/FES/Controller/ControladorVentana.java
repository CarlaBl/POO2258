package ICO.FES.Controller;

import ICO.FES.Model.Persona;
import ICO.FES.View.Ventana;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorVentana implements MouseListener {
    private Ventana vista;
    private ArrayList<Persona> personas;


    //constructor
    public ControladorVentana(Ventana vista) {
        this.vista = vista;
        this.vista.getBtnBoton().addMouseListener(this);
        this.vista.getLblSaludo().addMouseListener(this);
        personas = new ArrayList<>();
    }
    //implements
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola desde el controlador...");

        if (e.getSource()==this.vista.getBtnBoton()){
            System.out.println("Evento del raton sobre el boton");
            vista.getLblSaludo().setText("Hola "+ vista.getTxtNombre().getText());
            personas.add(new Persona(vista.getTxtNombre().getText()));
            this.limpiar();
        }
        if (e.getSource()==this.vista.getLblSaludo()){
            System.out.println("Evento del raton sobre la etiqueta");
            for (Persona p:personas) {
                System.out.println(p);
            }
        }

    }

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
    private void limpiar(){
        vista.getTxtNombre().setText("");
    }
}
