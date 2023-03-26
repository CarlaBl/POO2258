package ComposicionLampara;

import java.awt.*;

public class Foco {
    private double largo;
    private double diametro;
    private Color color;
    private boolean encendido;

    public Foco() {
    }

    public Foco(double largo, double diametro, Color color, boolean encendido) {
        this.largo = largo;
        this.diametro = diametro;
        this.color = color;
        this.encendido = encendido;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Foco{" +
                "largo=" + largo +
                ", diametro=" + diametro +
                ", color=" + color +
                ", encendido=" + encendido +
                '}';
    }
    public boolean encender() {
        this.encendido=true;
        return this.encendido;
    }
    public  boolean apagar(){
        this.encendido=false;
        return this.encendido;
    }
}
