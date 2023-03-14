package ComposicionSalon;

import java.awt.*;
import java.util.Scanner;

public class DriverSalon {
    public static void main(String[] args) {
        Salon a216 = new Salon();
        System.out.println(a216); //por defecto
        a216.setPuerta(new Puerta(250,100));
        System.out.println(a216);
        a216.setPantalla(new Tv("Hinsense",50.0,"IPS",true));
        System.out.println(a216);
        a216.setCapacidad(60);
        System.out.println(a216);
        System.out.println("--------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cual es el material de las bancas?: ");
        String material = teclado.nextLine();
        System.out.print("¿Cual es el color de las bancas?: ");
        String color = teclado.nextLine();
        System.out.print("¿Cual es el alto de las bancas?: ");
        String alto = teclado.nextLine();
        System.out.print("¿Cual es el ancho de las bancas?: ");
        String ancho = teclado.nextLine();
        System.out.print("¿la banca esta rota?: ");
        String rota = teclado.nextLine();

        Butaca proto = new Butaca();
        proto.setMaterial(material);
        if (color.equals("gris")){
            proto.setColor(Color.gray);
        } else {
            proto.setColor(Color.orange);
        }
        proto.setAlto(Integer.parseInt(alto));
        proto.setAncho(Integer.parseInt(ancho));
        if(rota.equals("si")){
            proto.setRota(true);
        }
        Butaca[] bancasTmp = new Butaca[a216.getCapacidad()];
        for (int i = 0; i < a216.getCapacidad(); i++) {
            bancasTmp[i] = proto;
        }
        a216.setBancas(bancasTmp);
        System.out.println(a216);

    }
}
