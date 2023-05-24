package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Computadora {
    private String marca;
    private String modelo;
    private double frecuenciaProcesador;
    private String url ;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, double frecuenciaProcesador,String url) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuenciaProcesador = frecuenciaProcesador;
        this.url = url;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuenciaProcesador() {
        return frecuenciaProcesador;
    }

    public void setFrecuenciaProcesador(double frecuenciaProcesador) {
        this.frecuenciaProcesador = frecuenciaProcesador;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuenciaProcesador=" + frecuenciaProcesador +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImage = new URL(this.url);
        return new ImageIcon(urlImage);
    }

}
