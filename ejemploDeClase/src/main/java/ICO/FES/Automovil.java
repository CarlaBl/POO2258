package ICO.FES;

import java.awt.*;

public class Automovil {
    private String marca;
    private String submarca;
    private int modelo;
    private Color color;

    // constructores
    public Automovil(){
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }
    // metodos de acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
    // metodos de uso general
    public boolean encender(){
        System.out.print("Encendio el auto " + marca +" : ");
        return true;
    }
}
