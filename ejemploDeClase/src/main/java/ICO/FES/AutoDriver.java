package ICO.FES;

import java.awt.*;

public class AutoDriver {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("VW","Vento",2020, Color.red);
        System.out.println( auto1.toString() );
        System.out.println( auto2.toString() );
        System.out.println( auto2.encender());

    }
}
