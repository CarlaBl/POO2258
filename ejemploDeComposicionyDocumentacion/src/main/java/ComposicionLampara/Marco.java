package ComposicionLampara;

public class Marco {
    private String material;
    private double largo;
    private double ancho;

    public Marco() {
    }

    public Marco(String material, double largo, double ancho) {
        this.material = material;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    @Override
    public String toString() {
        return "Marco{" +
                "material='" + material + '\'' +
                ", largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
