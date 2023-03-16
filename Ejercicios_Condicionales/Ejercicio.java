/* Realiza un programa que calcule la media de tres notas. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejercicio {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe tus notas para calcular la media de tres notas");

        System.out.print("Nota 1: ");
        int nota1 = sc.nextInt();

        System.out.print("Nota 2: ");
        int nota2 = sc.nextInt();

        System.out.print("Nota 3: ");
        int nota3 = sc.nextInt();

        int notafinal= ((nota1+nota2+nota3)/3);

        System.out.println("Tu nota es: " + notafinal);
        

        if (notafinal<5){
            System.out.println("Lo siento has suspendido");
        } else {
            System.out.println("Enhorabuena has aprobado");
        }


        sc.close();
    }
}
