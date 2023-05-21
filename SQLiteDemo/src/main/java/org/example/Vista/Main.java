package org.example.Vista;

import org.example.Controlador.ControladorLibro;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controller = new ControladorLibro(view);

    }
}
