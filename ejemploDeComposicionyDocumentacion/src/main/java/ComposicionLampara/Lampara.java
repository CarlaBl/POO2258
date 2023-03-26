package ComposicionLampara;

import java.util.Arrays;

public class Lampara {
    public static final int NUM_LAMPS= 3;
    private String marca;
    private double largo;
    private double ancho;
    private  double alto;
    private Marco marco;
    private Foco[] focos;
    private Cable[] cables;

    public Lampara() {
        cables = new Cable[Lampara.NUM_LAMPS];
        focos = new Foco[Lampara.NUM_LAMPS];
    }

    public Lampara(String marca, double largo, double ancho, double alto, Marco marco, Foco[] focos, Cable[] cables) {
        this.marca = marca;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.marco = marco;
        this.focos = focos;
        this.cables = cables;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public Foco[] getFocos() {
        return focos;
    }

    public void setFocos(Foco[] focos) {
        this.focos = focos;
    }

    public Cable[] getCables() {
        return cables;
    }

    public void setCables(Cable[] cables) {
        this.cables = cables;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", marco=" + marco +
                ", focos=" + Arrays.toString(focos) +
                ", cables=" + Arrays.toString(cables) +
                '}';
    }
    public void iluminar(){
        System.out.println("La lampara se esta encendiendo...");
        for (int i = 0; i < Lampara.NUM_LAMPS; i++) {
                focos[i].encender();
        }
    }
    public void apagar(){
        System.out.println("La lampara se esta apagando...");
        for (int i = 0; i < Lampara.NUM_LAMPS; i++) {
            focos[i].apagar();
        }
    }
    public void decorar(){
        System.out.println("Iluminando con el color "+focos[0].getColor());
    }

}// end class
