package ICO.FES;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String input = teclado.nextLine(); // ABC
        System.out.println("Tecleaste: " + input);

        System.out.println("---------------");

        char uno = input.charAt(0); // A
        int decimal = (int) uno;
        System.out.println("El valor decimal de " + uno + " es " + decimal);

        char dos = input.charAt(1);
        int decimal2 = (int) dos;
        System.out.println(decimal2);

        for (int i = 0; i < input.length() ; i++) {
            System.out.println( (int)input.charAt(i) );

        }
        System.out.println("-------------------");


    }
}