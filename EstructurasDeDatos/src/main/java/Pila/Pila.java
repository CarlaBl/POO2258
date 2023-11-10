package Pila;

import ListasEnlazadas.Nodo;

public class Pila {
    private NodoPila cabeza;
    private int contadorNodo = 0;

    public int getContadorNodo() {
        return contadorNodo;
    }
    public void push(NodoPila nodo){
        contadorNodo ++;
        if (cabeza==null){
            cabeza = nodo;
        } else {
            nodo.setAbajo(cabeza);
            cabeza.setArriba(nodo);
            cabeza = nodo;
        }

    }
    public void pop(){
        if(contadorNodo>0){
            if (cabeza.getAbajo()!= null){
                contadorNodo -- ;
                cabeza = cabeza.getAbajo();
                cabeza.setArriba(null);
            }else{
                cabeza = null;
            }
        }

    }
    public NodoPila peek(){
        return cabeza;

    }








    public void print(){
        NodoPila L = cabeza;
        while (L != null){
            System.out.println(L.getValor());
            L = L.getAbajo();
        }
    }
}
