package ICO.FES;

import java.awt.*;

public class Perro {
    private String raza;
    private String tamano;
    private Color color;

    public Perro() {
    }

    public Perro(String raza, String tamano, Color color) {
        this.raza = raza;
        this.tamano = tamano;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamano='" + tamano + '\'' +
                ", color=" + color +
                '}';
    }
    public int dormir(int horas){
        int minutos = horas* 60;
        System.out.println("El perro durmio: " + minutos + " minutos");
        return minutos;
    }
    public void comer(){
        System.out.println("El perro esta comiendo...");
    }
    public void ladrar(){
        System.out.println("El perro esta ladrando...");
    }
}
