package ICO.FES.actividadDos;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        leerArchivos lectura = new leerArchivos();
        lectura.leer("datos.txt");

        System.out.println("-----pilaDeLlamadas-----");
        try {
            lectura.metodoUno("datos.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}