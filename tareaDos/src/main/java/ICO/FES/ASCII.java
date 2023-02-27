package ICO.FES;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("ingresa una cadena de caracteres: ");
    String texto = teclado.nextLine();
    boolean valor = true;

        for (int i = 0; i < texto.length() ; i++) {
            if (i != 0) {
                if ( (int)texto.charAt(i-1) + 1  != (int)texto.charAt(i) ) {
                    valor = false;
                    break;
                }
            }
        }
    System.out.println("La cadena es consecutiva: " + valor);



    }
}

