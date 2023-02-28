package ICO.FES;

import java.util.Scanner;

public class juegoGato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su jugada en 9 caracteres: ");
        String entrada = teclado.nextLine();
        System.out.println("Su jugada fue: " + entrada);
        // Solo acepte 9 caracteres
        if (entrada.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres.");
            return;
        }
        // Panel del juego del gato
        String[] jugadas = entrada.split("");
        System.out.println("| " + jugadas[0] + " | " + jugadas[1] + " | " + jugadas[2] + " |");
        System.out.println("----+---+----");
        System.out.println("| " + jugadas[3] + " | " + jugadas[4] + " | " + jugadas[5] + " |");
        System.out.println("----+---+----");
        System.out.println("| " + jugadas[6] + " | " + jugadas[7] + " | " + jugadas[8] + " |");
    }
}
