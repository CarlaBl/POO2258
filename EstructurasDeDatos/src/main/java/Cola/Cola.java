package Cola;
public class Cola {
    private NodoCola cabeza;
    private int contadorNodo = 0;

    public int getContadorNodo() {
        return contadorNodo;
    }

    public void enqueue(NodoCola nodo){
        NodoCola K = cabeza;
        if (K == null){
            cabeza = nodo;
            cabeza.setSiguiente(null);
        } else {
            for (K = cabeza; K.getSiguiente()!= null; K = K.getSiguiente()){
            }
            nodo.setAnterior(K);
            K.setSiguiente(nodo);
        }

    }
    public void dequeue(){
        cabeza = cabeza.getSiguiente();
        if (contadorNodo > 0){
            cabeza.setAnterior(null);
        }

    }
    public NodoCola peek(){
        return cabeza;

    }
    public void print(){
        NodoCola L = cabeza;
        while (L != null){
            System.out.println(L.getValor());
            L = L.getSiguiente();
        }
    }
}
