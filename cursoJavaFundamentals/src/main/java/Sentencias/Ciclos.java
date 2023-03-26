package Sentencias;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        //ciclo while
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = in.next();
        int primeraPosicion = 0;
        int ultimaPosicion = palabra.length()-1;
        boolean isAPalindrome = true;

        while (primeraPosicion < ultimaPosicion){
            if (palabra.charAt(primeraPosicion)!=palabra.charAt(ultimaPosicion)){
                isAPalindrome = false;
            } //end if
            primeraPosicion++;
            ultimaPosicion--;
        } // end while
        if (isAPalindrome){
            System.out.println("la palabra es un palindromo");
        } else {
            System.out.println("la palabra no es un palindromo");
        }
        System.out.println("-------------------");

        // ciclo do-while
        Scanner in2 = new Scanner(System.in);
        int repetir = 0;
        int suma = 0;
        do {
            System.out.print("Ingresa un numero: ");
            int input = in2.nextInt(); //los usuarios ingresan un numero
            suma+=input;
            System.out.println("¿Quieres ingresar otro numero?");
            System.out.println("Ingresa 1 para si o 2 para no");
            repetir = in2.nextInt();
        } while (repetir==1);
        System.out.println("la suma de los numeros es: "+ suma);
        System.out.println("------------------");

        //ciclo for
        Scanner in3 = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        int numInputs = 10;
        int sum = 0;
        for (int i = 0; i < numInputs; i++) {
            int input = in3.nextInt();
            sum+= input;
        } // end for
        System.out.println("la suma de los numeros es: "+ sum);

    } // end main
}
