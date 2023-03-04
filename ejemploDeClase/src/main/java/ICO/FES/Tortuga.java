package ICO.FES;

import java.awt.*;

public class Tortuga {
    private String especie;
    private float tamanio;
    private Color color;
    private byte edad;
    private String nombre;

    // constructor por defecto
    public Tortuga (){
    }
    //constructor sobre cargado completo
    public Tortuga(String especie, float tamanio, Color color, byte edad, String nombre) {
        this.especie = especie;
        this.tamanio = tamanio;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }
    //constructor sobre cargado
    public Tortuga(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }
    //metodos de acceso

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if(edad > 0 && edad <= 200){
        this.edad = edad;
        }else{
            System.out.println("Esa edad no es correcta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos de utileria
    @Override
    public String toString() {
        return "Tortuga{" +
                "especie='" + especie + '\'' +
                ", tamanio=" + tamanio +
                ", color=" + color +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    // metodos de uso general
    public boolean esconder(){
        System.out.println(nombre + " se esta escondiendo... ");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }

}
