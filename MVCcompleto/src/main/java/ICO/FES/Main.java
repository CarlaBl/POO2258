package ICO.FES;

import ICO.FES.Controller.ControladorVentana;
import ICO.FES.View.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana view = new Ventana("MVC Completo");
        ControladorVentana controller = new ControladorVentana(view);
    }
}