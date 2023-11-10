package Pila;

public class NodoPila {
    private String valor;
    private NodoPila arriba;
    private NodoPila abajo;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoPila getArriba() {
        return arriba;
    }

    public void setArriba(NodoPila arriba) {
        this.arriba = arriba;
    }

    public NodoPila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPila abajo) {
        this.abajo = abajo;
    }
}
