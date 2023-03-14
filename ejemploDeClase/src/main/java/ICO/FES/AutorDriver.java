package ICO.FES;

public class AutorDriver {
    public static void main(String[] args) {
        Autor autor = new Autor("Michael Andreas Helmut Ende","Michael Ende","Alemania");
        System.out.println(autor);
        autor.escribir();
        autor.promociones();
    }
}
