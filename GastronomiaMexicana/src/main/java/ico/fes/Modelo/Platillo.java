package ico.fes.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Platillo {
    private int id;
    private String nombre;
    private String region;
    private String ingredientes;
    private String tecnica;
    private String foto; //url

    public Platillo() {
    }

    public Platillo(int id, String nombre, String region, String ingredientes, String tecnica, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
        this.ingredientes = ingredientes;
        this.tecnica = tecnica;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Platillo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", region='" + region + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", tecnica='" + tecnica + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImage = new URL(this.foto);
        return new ImageIcon(urlImage);
    }
}
