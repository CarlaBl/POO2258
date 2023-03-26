package ConceptosBasicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tipos de datos y operadores
        double x = 3.25;
        double y = -4.5;
        int m = 23;
        int n = 9;
        System.out.println(x + m * y -(y + n) * x);
        System.out.println(m / n + m % n);
        System.out.println(m/5);
        System.out.println( Math.sqrt(Math.sqrt(n)) );
        System.out.println((int)x);
        System.out.println(Math.round(y));
        System.out.println((int)Math.round(x) + (int)Math.round(y));
        System.out.println(m + n);
        int j=7,k=5,l=8;
        int result = j/l*k;
        System.out.println(result);
        System.out.println("------------------");

        //operaciones de Strings
        String string1 = "Hola";
        String string2 = "Carla";
        String string3 = "";
        string3 = "Como estas ".concat(string2);
        System.out.println("string3: " + string3);
        System.out.println("Longitud: " + string1.length());
        System.out.println("Sub:"+ string3.substring(0,4));
        System.out.println("Upper: " + string3.toUpperCase());
        System.out.println("Replace: " + string1.replace('a','i'));

        String s1 = "Esto es un ";
        String s2 = "string";
        String s3 = s1 + s2;
        String s4 = "Esto es un " + s2;
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);

        String sa = "abc";
        String sb = "ABC";
        System.out.println(sa.compareTo(sb));
        System.out.println(sa.equals(sb));

        String email = "jon@oracle.com";
        String dominio = "";
        int posicion = email.indexOf('@');
        dominio =email.substring(posicion+1);
        System.out.println(dominio);

        //Clase Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = in.next(); // lee el texto hasta un espacio
        System.out.print("Ingrese un numero: ");
        int numero = in.nextInt(); // lee el valor entero
        System.out.println(nombre + " el numero ingresado es " + numero);

    }
}