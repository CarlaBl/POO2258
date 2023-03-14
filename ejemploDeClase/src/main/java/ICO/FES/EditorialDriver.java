package ICO.FES;

public class EditorialDriver {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Trillas", "Mexico","Zocalo 312");
        System.out.println(editorial);
        editorial.publicar();
        editorial.vender();
    }
}
