package ICO.FES;

import java.awt.*;

public class Gato {
    private String nombre;
    private byte edad;
    private Color pelaje;
    private String raza;
    private String tamanio;
    //constructores
    public Gato(){
    }
    public Gato(String nombre, byte edad, Color pelaje, String raza, String tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.raza = raza;
        this.tamanio = tamanio;
    }
    //metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad>0 && edad<=25){
        this.edad = edad;
        } else {
            System.out.println(" Error: esa edad no es correcta");
        }
    }

    public Color getPelaje() {
        return pelaje;
    }

    public void setPelaje(Color pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    //utileria

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pelaje=" + pelaje +
                ", raza='" + raza + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
    // de uso general
    public float saltar(float salto){
        System.out.print(nombre + " Salto: " + salto + " metros"+ " o " );
        float alturaSalto = salto * 100;
        return alturaSalto;
    }
    public byte dormir(byte horas){
        System.out.println(nombre + " Durmio: " + horas + " horas");
        return horas;
    }
    public boolean cazar(){
        System.out.print(nombre + " esta cazando...");
        boolean resultado = Math.random()>0.51;
        return resultado;
    }
}
