package ICO.FES;

public class LibroDriver {
    public static void main(String[] args) {
        Libro libro = new Libro("La historia interminable");
        System.out.println(libro);
        libro.guardar();
        libro.setPrecio("400");
        System.out.println(libro);
        libro.setSipnosis("El reino de fantasia esta en un serio peligro: pronto va a desaparecer sin que sus habitantes puedad evitarlo");
        System.out.println(libro);
    }
}
