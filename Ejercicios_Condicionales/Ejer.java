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
                System.out.println("Le costará 15 euros");
            break;
            case "Limon":
                System.out.println("Le costará 13 euros");
                int limon = 13;
            break;
            case "Vainilla":
                System.out.println("Le costará 16 euros");
                int vainilla = 16;
            break;
            case "Fresa":
                System.out.println("Le costará 18 euros");
                int chocolate = 15;
            break;
        }

        System.out.print("Desea añadir ");
        sc.close();
    }
}
