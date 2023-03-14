package ComposicionSalon;

import java.awt.*;

public class Butaca {
    private String material;
    private Color color;
    private  int alto; //cm
    private int ancho; //cm
    private boolean rota;

    public Butaca() {
    }

    public Butaca(String material, Color color, int alto, int ancho, boolean rota) {
        this.material = material;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.rota = rota;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public boolean isRota() {
        return rota;
    }

    public void setRota(boolean rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "Butaca{" +
                "material='" + material + '\'' +
                ", color=" + color +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", rota=" + rota +
                '}';
    }
}
