package ICO.FES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String entrada = teclado.nextLine();
        System.out.println(entrada);
        String[] jugadas = entrada.split("");
        for (int i = 0; i < jugadas.length; i++) {
            System.out.println(jugadas[i]);
        }


    }
}