package org.example;

import org.example.Controlador.ControladorCompus;
import org.example.Vista.VentanaCompu;

public class Main {
    public static void main(String[] args) {
        VentanaCompu ventanaCompu = new VentanaCompu("Ejemplo2 MVC");
        ControladorCompus controller = new ControladorCompus(ventanaCompu);
    }
}