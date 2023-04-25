package ICO.FES.tareaSiete;

public class Motocicleta implements Vehiculo{
    public int cc;
    public String marca;

    public Motocicleta() {
    }

    public Motocicleta(int cc, String marca) {
        this.cc = cc;
        this.marca = marca;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cc=" + cc +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de "+this.cc +" cc");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de "+this.cc +" cc");


    }
}
