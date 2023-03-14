package ComposicionSalon;

import ICO.FES.Ventana;

import java.util.Arrays;

public class Salon {
    private int capacidad;
    private int largo; //cm
    private int ancho; //cm
    private String id;
    private Tv pantalla;
    private Puerta puerta;
    private Pizarron pizarron;
    private Butaca[] bancas;
    private Ventana[] ventanas;

    public Salon() {
        this.bancas = new Butaca[60]; // por defecto 60 bancas
        this.ventanas = new Ventana[11]; //por defecto 11 ventanas
    }

    public Salon(int capacidad, Ventana[] ventanas) {
        this.capacidad = capacidad;
        this.bancas = new Butaca[this.capacidad]; // se crea una banca dependiendo la capacidad del salon
        this.ventanas = ventanas;
    }

    public Salon(int capacidad, int largo, int ancho, String id, Tv pantalla, Puerta puerta, Pizarron pizarron, Butaca[] bancas, Ventana[] ventanas) {
        this.capacidad = capacidad;
        this.largo = largo;
        this.ancho = ancho;
        this.id = id;
        this.pantalla = pantalla;
        this.puerta = puerta;
        this.pizarron = pizarron;
        this.bancas = bancas;
        this.ventanas = ventanas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tv getPantalla() {
        return pantalla;
    }

    public void setPantalla(Tv pantalla) {
        this.pantalla = pantalla;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Pizarron getPizarron() {
        return pizarron;
    }

    public void setPizarron(Pizarron pizarron) {
        this.pizarron = pizarron;
    }

    public Butaca[] getBancas() {
        return bancas;
    }

    public void setBancas(Butaca[] bancas) {
        this.bancas = bancas;
    }

    public Ventana[] getVentanas() {
        return ventanas;
    }

    public void setVentanas(Ventana[] ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "capacidad=" + capacidad +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", id='" + id + '\'' +
                ", pantalla=" + pantalla +
                ", puerta=" + puerta +
                ", pizarron=" + pizarron +
                ", bancas=" + Arrays.toString(bancas) +
                ", ventanas=" + Arrays.toString(ventanas) +
                '}';
    }
}
