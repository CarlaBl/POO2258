package ICO.FES.actividad10;

import ICO.FES.actividad10.Controlador.ControladorEjemplo;
import ICO.FES.actividad10.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Ejemplo JOptionPane");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);
    }
}
