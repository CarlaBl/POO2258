package ICO.FES;

import java.awt.*;

public class Silla {
    private double alto;
    private double ancho;
    private String material;
    private Color color;

    public Silla() {
    }

    public Silla(double alto, double ancho, String material, Color color) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.color = color;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if(alto >= 60 && alto <= 120){
            this.alto = alto;
        }else {
            System.out.println("Este valor no es permitido");
        }

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(ancho >= 60 && ancho <= 80){
            this.ancho = ancho;}
        else {
            System.out.println("Este valor no es permitido");
        }
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

    @Override
    public String toString() {
        return "Silla{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
    public boolean mover(double cm){
        if (cm > 0){
            return true;
        }else {
            return false;
        }

    }
}
