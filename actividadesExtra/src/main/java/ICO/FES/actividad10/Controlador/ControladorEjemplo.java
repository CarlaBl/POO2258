package ICO.FES.actividad10.Controlador;

import ICO.FES.actividad10.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() ==view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icon = new ImageIcon("iconGanador.png");
            JOptionPane.showMessageDialog(view,
                    "Hola desde el ejemplo",
                    "Titilo Ganador",
                    JOptionPane.WARNING_MESSAGE,
                    icon);

        }
        if (e.getSource() ==view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view,
                    "Ejemplo entrada",
                    "Titulo personalizado",
                    JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);

        }
        if (e.getSource() ==view.getBtnOpcion()){
            //System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(view,
                    "Seguro de borrar el registro?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste Si");
            } else {
                view.getLblResultado().setText("Elegiste No");
            }

        }
    }
}
