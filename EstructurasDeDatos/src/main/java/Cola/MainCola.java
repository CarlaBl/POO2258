package Cola;

public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        NodoCola Temp;
        for (int i = 0; i < 6; i++) {
            Temp = new NodoCola();
            Temp.setValor("cliente " + i);
            cola.enqueue(Temp);
        }
        cola.print();
        System.out.println("\nnueva cola");
        cola.dequeue();
        cola.print();
        System.out.println("\nnueva cola");
        cola.dequeue();
        cola.print();

        System.out.println("\nme devuele: " + cola.peek().getValor());

    }
}
