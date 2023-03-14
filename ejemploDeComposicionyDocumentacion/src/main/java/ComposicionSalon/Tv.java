package ComposicionSalon;

public class Tv {
    private String marca;
    private double pulgadas;
    private String tecnologia;
    private boolean smart;

    public Tv() {
    }

    public Tv(String marca, double pulgadas, String tecnologia, boolean smart) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.tecnologia = tecnologia;
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                ", tecnologia='" + tecnologia + '\'' +
                ", smart=" + smart +
                '}';
    }
}
