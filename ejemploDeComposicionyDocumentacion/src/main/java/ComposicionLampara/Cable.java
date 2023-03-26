package ComposicionLampara;

import java.awt.*;

public class Cable {
    private double calibre;
    private Color color;
    private double longitud;

    public Cable() {
    }

    public Cable(double calibre, Color color, double longitud) {
        this.calibre = calibre;
        this.color = color;
        this.longitud = longitud;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cable{" +
                "calibre=" + calibre +
                ", color=" + color +
                ", longitud=" + longitud +
                '}';
    }
}
