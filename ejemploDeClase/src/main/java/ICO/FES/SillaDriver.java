package ICO.FES;

public class SillaDriver {
    public static void main(String[] args) {
        Silla sillita = new Silla();
        System.out.println(sillita);
        sillita.setAlto(1000);
        sillita.setAncho(1000);
        System.out.println(sillita);
        System.out.println(sillita.mover(2));
    }
}
