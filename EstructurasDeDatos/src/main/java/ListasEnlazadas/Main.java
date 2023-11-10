package ListasEnlazadas;

public class Main {
    public static void main(String[] args) {
       /* ListaSimple lista = new ListaSimple();
        Nodo Temp;
        for (int i = 0; i < 10; i++) {
            Temp = new Nodo();
            Temp.setValor("estudiante " + i);
            lista.add(Temp);
        }
        lista.print(); */

        ListaDoble lista2 = new ListaDoble();
        Nodo Temp2;
        for (int i = 0; i < 10; i++) {
            Temp2 = new Nodo();
            Temp2.setValor("estudiante " + i);
            lista2.add(Temp2);
        }
        lista2.print();

        System.out.println("----Nueva lista-----");

        Temp2 = new Nodo();
        Temp2.setValor("estudiante nuevo");
        lista2.addHead(Temp2);
        lista2.remove("estudiante 9");
        lista2.print();

    }
}