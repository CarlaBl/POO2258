package ICO.FES;

import java.awt.*;

public class PelotaDriver {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota();
        System.out.println(pelota1.toString());
        Pelota pelota2 = new Pelota("basquetbol", Color.orange);
        System.out.println(pelota2.toString());
        Pelota pelota3 = new Pelota("futbol",21.5f,420,"cuero",Color.black);
        System.out.println(pelota3.toString());
        System.out.println(pelota3.botar());
        System.out.println(pelota3.patear());
        System.out.println(pelota3.rodar(10,5));
        System.out.println("-------------------");
        pelota2.setDeporte("beisbol");
        System.out.println(pelota2.getDeporte());
    }
}
