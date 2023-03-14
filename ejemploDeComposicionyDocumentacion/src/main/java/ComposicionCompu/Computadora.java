package ComposicionCompu;

public class Computadora {
    private String marca;
    private String modelo;
    private Cpu procesador;
    private Monitor pantalla;
    private Mouse raton;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Cpu procesador, Monitor pantalla, Mouse raton) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.raton = raton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador=" + procesador +
                ", pantalla=" + pantalla +
                ", raton=" + raton +
                '}';
    }
}
