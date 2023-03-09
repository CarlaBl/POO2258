package ICO.FES;
/**
 * @author carlaBl
 * @version 0.1
 *
 * Esta es una clase que representa ventanas..
 *
 * Ejemplo de uso:
 *      Ventana ven1 = new Ventana();
 *      ven1.abrir();
 * */
public class Ventana {
    private int alto; //cm
    private int ancho; //cm
    private int espesor; //cm
    private String material;

    public Ventana() {
    }

    public Ventana(int alto, int ancho, int espesor, String material) {
        this.alto = alto;
        this.ancho = ancho;
        this.espesor = espesor;
        this.material = material;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getEspesor() {
        return espesor;
    }

    public void setEspesor(int espesor) {
        this.espesor = espesor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", espesor=" + espesor +
                ", material='" + material + '\'' +
                '}';
    }
    /**
     * Este metodo ejemplifica la apertura de la ventana
     * @return void no regresa nada
     * @author carlaBl
     */
    public void abrir(){
        System.out.println("la ventana se esta abriendo");
    }
    /**
     * Este metodo ejemplifica cuando la ventana se cierra
     * @return void no regresa nada
     * @author carlaBl
     */
    public void cerrar(){
        System.out.println("la ventana se esta cerrando");
    }

}
