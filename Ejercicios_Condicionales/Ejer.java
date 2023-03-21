package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejer {
  
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Hola bienvenido a la pasteleria");
        System.out.print("¿De qué sabor quieres el pastel?: ");

        String sabores = sc.nextLine();

        switch (sabores){
            case "Chocolate":
                int chocolate = 15;
                System.out.println("Le costará " + chocolate + " euros");
            break;
            case "Limon":
            int limon = 13;
                System.out.println("Le costará " + limon + " euros");
            break;
            case "Vainilla":
                int vainilla = 16;
                System.out.println("Le costará " + vainilla + " euros");
            break;
            case "Fresa":
                System.out.println("Le costará 18 euros");
                int fresa = 15;
            break;
        }

        System.out.print("Desea añadir ");
        sc.close();
    }
}
