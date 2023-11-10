package ListasEnlazadas;

public class ListaDoble {
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
            nodo.setAnterior(K);
            K.setSiguiente(nodo);
        }
    }
    public void addHead(Nodo nodo){
        contadorNodo ++;
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            nodo.setSiguiente(cabeza);
            cabeza = nodo;
        }
    }
    public  void remove(String valor){
        Nodo K;
        if (contadorNodo>0){
            for (K = cabeza; K.getSiguiente() != null; K = K.getSiguiente()){
                if (K.getValor().trim().equals(valor.trim())){
                    if (cabeza == K){
                        cabeza = cabeza.getSiguiente();
                    } else {
                        K.getAnterior().setSiguiente(K.getSiguiente());
                        K.getSiguiente().setAnterior(K.getAnterior());
                    }
                }
            }
            if (K.getSiguiente() == null){
                if (K.getValor().trim().equals(valor.trim())){
                    K.getAnterior().setSiguiente(null);
                    K.setAnterior(null);
                }

            }
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
