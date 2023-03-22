/* Escribe un programa que ordene tres números enteros introducidos por teclado. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class MayorMenor {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Voy a ordenar tres numeros de menos a mayor que introduzcas");

        System.out.print("Escribe el primer numero: ");
        int num1=sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        int num2=sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        int num3=sc.nextInt();

        if (num1>num2 && num2>num3){
            System.out.println("El orden es: " + num1 + "  " + num2 + "  " + num3);
        } else if (num2>num1 && num1>num3){
            System.out.println("El orden es: " + num2 + "  " + num1 + "  " + num3);
        } else if (num3>num2 && num2>num1){
            System.out.println("El orden es: " + num3 + "  " + num2 + "  " + num1);
        } else if (num3>num1 && num1>num2){
            System.out.println("El orden es: " + num3 + "  " + num1 + "  " + num2);
        } else if (num2>num3 && num3>num1){
            System.out.println("El orden es: " + num2 + "  " + num3 + "  " + num1);
        } else {
            System.out.println("El orden es: " + num1 + "  " + num3 + "  " + num2);
        }
        sc.close();
    }
}
