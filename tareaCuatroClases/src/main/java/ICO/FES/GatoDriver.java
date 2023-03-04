package ICO.FES;

import java.awt.*;

public class GatoDriver {
    public static void main(String[] args) {
        Gato cat1 = new Gato();
        System.out.println( cat1.toString() );
        Gato cat2 = new Gato("luna",(byte) 4, Color.gray,"Bengali","Mediano");
        System.out.println( cat2.toString() );
        System.out.println( cat2.cazar() );
        System.out.println( cat2.saltar(3.5f) );
        System.out.println( cat2.dormir((byte)12) );
        System.out.println("--------------------");
        cat2.setEdad((byte)20);
        System.out.println(cat2.toString());
        System.out.println(cat2.getEdad());

    }
}
