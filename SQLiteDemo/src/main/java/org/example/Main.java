package org.example;

import org.example.Modelo.Libro;
import org.example.Persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Con Statement");
        /* demo.insertarStatement();
        System.out.println("Con Prepared");
        demo.insertarPreparedStatement(); **/

        DemoLibroDB demo = new DemoLibroDB();
        Libro libro = new Libro(0,"El juego","desconocido");

        /* if(demo.insertarlibro(libro)){
            System.out.println("Se inserto correctamente");
        }else {
            System.out.println("No se inserto");
        } **/

        System.out.println(demo.buscarLibroPorId(100));
        System.out.println("----------------");
        for (Libro tmp: demo.obtenerTodos()) {
            System.out.println("Libro: " + tmp);
            System.out.println("Titulo: " + tmp.getTitulo());

        }

    }
}