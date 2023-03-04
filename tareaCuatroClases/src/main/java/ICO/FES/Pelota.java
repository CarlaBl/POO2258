package ICO.FES;

import java.awt.*;

public class Pelota {
    private String deporte;
    private float diametro;
    private int peso;
    private String material;
    private Color color;
    //constructores
    public Pelota(){
    }

    public Pelota(String deporte, Color color) {
        this.deporte = deporte;
        this.color = color;
    }

    public Pelota(String deporte, float diametro, int peso, String material, Color color) {
        this.deporte = deporte;
        this.diametro = diametro;
        this.peso = peso;
        this.material = material;
        this.color = color;
    }
    //acceso

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
    // utileria


    @Override
    public String toString() {
        return "Pelota{" +
                "deporte='" + deporte + '\'' +
                ", diametro=" + diametro +
                ", peso=" + peso +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
    // de uso general
    public boolean botar(){
        System.out.print( "la pelota de " + deporte + " bota: ");
        boolean resultado = Math.random()>0.51;
        return resultado;
    }
    public boolean patear(){
        System.out.print( "la pelota de " + deporte + " se puede patear: ");
        boolean resultado = Math.random()>0.51;
        return resultado;
    }
    public float rodar(float velocidad,float tiempo){
        System.out.print("la pelota rodo: ");
        float distancia = velocidad * tiempo;
        return distancia;
    }

}
