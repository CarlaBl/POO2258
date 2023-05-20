package ICO.FES;

import java.util.Scanner;

public class OperacionesConMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas de la matriz A: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz A: ");
        int columnasA = scanner.nextInt();
        int[][] matrizA = new int[filasA][columnasA];
        System.out.println("Ingrese los valores de la primera matriz: ");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j]=scanner.nextInt();
            }
        }
        System.out.println("la matriz A es: ");
        mostrarMatriz(matrizA);
        System.out.print("Ingrese el numero de filas de la matriz B: ");
        int filasB = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz B: ");
        int columnasB = scanner.nextInt();
        int[][] matrizB = new int[filasB][columnasB];
        System.out.println("Ingrese los valores de la segunda matriz: ");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j]=scanner.nextInt();
            }
        }
        System.out.println("la matriz B es: ");
        mostrarMatriz(matrizB);
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Resta de matrices");
        System.out.println("3. Producto de matrices");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                try {
                    int[][] suma = sumarMatrices(matrizA, matrizB);
                    System.out.println("La suma de las matrices es:");
                    mostrarMatriz(suma);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    int[][] resta = restarMatrices(matrizA, matrizB);
                    System.out.println("La resta de las matrices es:");
                    mostrarMatriz(resta);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try {
                    int[][] producto = productoMatrices(matrizA, matrizB);
                    System.out.println("El producto de las matrices es:");
                    mostrarMatriz(producto);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            System.out.print("| ");
            for (int j = 0; j < columnas; j++) {
                System.out.print( matriz[i][j] + " " );
            }
            System.out.println("|");
        }
    }
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) throws IllegalArgumentException {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (filasA != filasB || columnasA != columnasB) {
            throw new IllegalArgumentException("Las matrices no tienen las mismas dimensiones. No se pueden sumar.");
        }
        int[][] resultado = new int[filasA][columnasA];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                resultado [i][j] = matrizA[i][j] + matrizB [i][j];
            }
        }
        return resultado;
    }
    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) throws IllegalArgumentException {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (filasA != filasB || columnasA != columnasB) {
            throw new IllegalArgumentException("Las matrices no tienen las mismas dimensiones. No se pueden restar.");
        }
        int[][] resultado = new int[filasA][columnasA];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                resultado [i][j] = matrizA[i][j] - matrizB [i][j];
            }
        }
        return resultado;
    }
    public static int[][] productoMatrices(int[][] matrizA, int[][] matrizB) throws IllegalArgumentException{
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;
        if (columnasA != filasB) {
            throw new IllegalArgumentException("No se pueden multiplicar las matrices. Las dimensiones no son válidas.");
        }
        int[][] resultado = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
}//end
