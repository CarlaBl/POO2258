package Pila;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        NodoPila tmp;
        for (int i = 0; i < 8; i++) {
            tmp = new NodoPila();
            tmp.setValor("plato " + i);
            pila.push(tmp);
        }
        pila.print();
        pila.pop();
        System.out.println("\nnueva pila");
        pila.print();
        pila.pop();
        System.out.println("\nnueva pila");
        pila.print();
        System.out.println("\nme devuelve: " + pila.peek().getValor());
    }
}
