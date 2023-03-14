package ICO.FES;

public class Libro {
    private String titulo;
    private String precio;
    private String  sipnosis;

    public Libro() {
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public Libro(String titulo, String precio, String sipnosis) {
        this.titulo = titulo;
        this.precio = precio;
        this.sipnosis = sipnosis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio='" + precio + '\'' +
                ", sipnosis='" + sipnosis + '\'' +
                '}';
    }

    public void guardar(){
        System.out.println("El libro " + titulo + " se guardo");
    }
}
