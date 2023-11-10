package Cola;

public class NodoCola {
    private String valor;
    private NodoCola siguiente;
    private NodoCola anterior;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }
}
