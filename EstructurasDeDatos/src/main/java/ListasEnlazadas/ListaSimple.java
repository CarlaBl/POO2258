package ListasEnlazadas;

public class ListaSimple {
    private Nodo cabeza;
    private int contadorNodo = 0;

    public int getContadorNodo() {
        return contadorNodo;
    }

    public void add(Nodo nodo){
        Nodo K = cabeza;
        if (K == null){
            cabeza = nodo;
            cabeza.setSiguiente(null);
        } else {
            for (K = cabeza; K.getSiguiente()!= null; K = K.getSiguiente()){
            }
            K.setSiguiente(nodo);
        }
    }
    public void print(){
        Nodo L = cabeza;
        while (L != null){
            System.out.println(L.getValor());
            L = L.getSiguiente();
        }
    }
}
