package ICO.FES;

import java.awt.*;

public class TortugaDriver {
    public static void main(String[] args) {
        Tortuga turtle1 = new Tortuga("Verde","Juan");
        System.out.println( turtle1.toString() );
        System.out.println( turtle1.esconder() );
        System.out.println( turtle1.getNombre() );
        turtle1.setNombre("Jose");
        System.out.println(turtle1);
        System.out.println(turtle1.getNombre());


    }
}
