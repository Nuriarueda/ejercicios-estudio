/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */

import java.util.Scanner;
public class Piramide {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Vamos a hacer una piramide");
        System.out.print("¿De qué altura quieres la piramide? ");
        int altura = sc.nextInt();

        int planta = 1;
        int LongLinea = 1;
        int espacios = altura-1;

        while ( planta <= altura){

            for (int i = 1; i<espacios; i++){ // Los espacios 
                System.out.print(" ");
            }

            for (int i = 1; i< LongLinea; i++){ // Escribir las lineas
                System.out.print("*");
            }

            System.out.println("");

            planta++;
            espacios--;
            LongLinea+=2;
        }
        sc.close();
    }
}
