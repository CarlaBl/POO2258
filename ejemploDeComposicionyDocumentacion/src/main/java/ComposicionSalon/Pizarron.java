package ComposicionSalon;

public class Pizarron {
    private int largo; //cm
    private  int ancho; //cm

    public Pizarron() {
    }

    public Pizarron(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Pizarron{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
