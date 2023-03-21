package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejer {
  
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Hola bienvenido a la pasteleria");
        System.out.print("¿De qué sabor quieres el pastel?: ");

        String sabores = sc.nextLine();

        switch (sabores){
            case "Chocolate": // SABOR CHOCOLATE
                int chocolate = 15;
                System.out.println("Le costará " + chocolate + " euros");

                System.out.print("¿Desea añadir algun toping extra?: ");
                String respuesta1 = sc.nextLine();

                if (respuesta1.equals ("si")){
                    System.out.println("Okey, se le añadira 10 euros al precio de tu pastel");
                    System.out.println("El precio final sera: " + (chocolate+10) + " euros");
                } else {
                    System.out.println("De acuerdo ");
                }        

            break;


            case "Limon": // SABOR LIMÓN
            int limon = 13;
                System.out.println("Le costará " + limon + " euros");

                System.out.print("¿Desea añadir algun toping extra?: ");
                String respuesta2 = sc.nextLine();

                if (respuesta2.equals ("si")){
                    System.out.println("Okey, se le añadira 10 euros al precio de tu pastel");
                    System.out.println("El precio final sera: " + (limon+10) + " euros");
                } else {
                    System.out.println("De acuerdo ");
                }        

            break;


            case "Vainilla": // SABOR VAINILLA
                int vainilla = 16;
                System.out.println("Le costará " + vainilla + " euros");

                System.out.print("¿Desea añadir algun toping extra?: ");
                String respuesta3 = sc.nextLine();
                
                if (respuesta3.equals ("si")){
                    System.out.println("Okey, se le añadira 10 euros al precio de tu pastel");
                    System.out.println("El precio final sera: " + (vainilla+10) + " euros");
                } else {
                    System.out.println("De acuerdo ");
                }        

            break;


            case "Fresa": // SABOR FRESA 
                int fresa = 15;
                System.out.println("Le costará" + fresa + " euros");

                System.out.print("¿Desea añadir algun toping extra?: ");
                String respuesta4 = sc.nextLine();
                
                if (respuesta4.equals ("si")){
                    System.out.println("Okey, se le añadira 10 euros al precio de tu pastel");
                    System.out.println("El precio final sera: " + (fresa+10) + " euros");
                } else {
                    System.out.println("De acuerdo ");
                }        

            break;
        }
        sc.close();
    }
}
