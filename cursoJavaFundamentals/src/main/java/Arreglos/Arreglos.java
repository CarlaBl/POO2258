package Arreglos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        String [] miRamo = new String[6];
        miRamo[0] = "rosa";
        miRamo[1] = "girasol";
        miRamo[2] = "margarita";
        miRamo[3] = "diente de leon";
        miRamo[4] = "violeta";
        miRamo[5] = "lirio";
        for (int i = 0; i < miRamo.length; i++) {
            System.out.println(miRamo[i]);
        }
        System.out.println("----------------");
        for (String miFlor:miRamo) {
            System.out.println(miFlor);
        } //end for-each
        System.out.println("----------------");

        //arreglo bidimensional
        String[][] miRamo2 = {{"Rojo","Duranzo","Amarilo"},
                            {"Amarillo","Blanco","Azul"},
                            {"Verde","Azul","Purpura"},
                            {"Blanco","Blanco","Blanco"},
                            {"Purpura","Rosa","Violeta"},
                            {"Rosa","Naranja","Blanco"}};
        System.out.println(miRamo2[0][1]+" Rosa");
        System.out.println(miRamo2[5][2]+" Lirio");

        System.out.println("--------------------");
        Scanner in = new Scanner(System.in);
        int [][] num = new int[3][2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Ingresa un valor para la fila "+ i +" columna "+ j);
                num [i][j] = in.nextInt();
            }
        }
        //imprimir la matriz
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }// end main
}
