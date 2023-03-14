package ICO.FES;

import java.awt.*;

public class PlumaDriver {
    public static void main(String[] args) {
        Pluma pluma = new Pluma();
        System.out.println(pluma);
        pluma.setMarca("Bic");
        System.out.println(pluma);
        pluma.setModelo("sencillo");
        System.out.println(pluma);
        pluma.setColor(Color.red);
        System.out.println(pluma);
        pluma.setPunta("fino");
        System.out.println(pluma);
        pluma.escribir();

    }
}
