package ICO.FES;

import java.awt.*;

public class PerroDriver {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Salchicha", "Pequeño", Color.black);
        System.out.println(perro1);
        perro1.ladrar();
        perro1.comer();
        perro1.dormir(3);
    }
}
