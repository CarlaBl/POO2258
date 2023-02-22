package ICO.FES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "Hola mundo";
        System.out.println(msg);
        System.out.println(msg.charAt(9));
        System.out.println("Tamaño: " + msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println("---------------------");
        String carrera = "   Ingenieria en Computación #1 !   ";
        System.out.println(carrera.substring(7));
        System.out.println(carrera.substring(7,15));
        System.out.println(" ---- carrera ---- ");
        System.out.println(carrera);
        System.out.println(carrera.trim());
        System.out.println("------------------");
        String [] separado = carrera.trim().split(" ");
        System.out.println("---- inicio separdo ----");
        for (int i = 0; i < separado.length ; i++) {
            System.out.println(separado[i]);
        }
        System.out.println("-----------------");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesion y nacionalidad: ");
        String entrada = teclado.nextLine();
        String [] salida = entrada.toUpperCase().split(" ");
        System.out.println( "nombre:" + salida[0]);
        System.out.println( "profesion:" + salida[1]);
        System.out.println( "nacionalidad:" + salida[2]);
         /*for (int i = 0; i < salida.length ; i++) {
            if (i == 0) {
                System.out.println( "nombre:" + salida[i]);
            } else if (i == 1) {
                System.out.println( "profesion:" + salida[i]);
            } else {
                System.out.println( "nacionalidad:" + salida[i]);
            }
        }*/






    }
}