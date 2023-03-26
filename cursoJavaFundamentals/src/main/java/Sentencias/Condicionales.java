package Sentencias;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        System.out.print("Ingrese su nombre: ");
        name = input.nextLine(); //lee todo el texto

        if(name.equals("Elvis")){
            System.out.println("Es el rey del rock and roll");
        } else if (name.equals("Michael Jackson")){
            System.out.println("Es el rey del pop");
        } else {
            System.out.println("no es rey");
        }

        //Sentencias switch
        Scanner in = new Scanner(System.in);
        System.out.println("¿cuantas membresias vendiste?");
        int ventas = in.nextInt();
        switch (ventas){
            case 6: System.out.println("Ganaste $1000");
            case 5: System.out.println("Ganaste un Samsung Galaxy 71");
            case 4: System.out.println("Ganaste una Laptop");
            case 3: System.out.println("Ganaste un iPod");
            case 2: System.out.println("Ganaste una engrapadora");
            case 1: System.out.println("Ganaste un quitagrapas");
            break;
            default: System.out.println("sin regalo");
        }//end switch

    }//end main
}
