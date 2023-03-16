/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0). */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Vamos a hacer una ecuación de primer grado ax + b");

        System.out.print("Escribe el valor de a: ");
        int a = sc.nextInt();

        if (a==0){
            System.out.println("La ecuacion no va a tener solucion ya que a = 0");
        } else {
            System.out.print("Esribe el valor de b: ");
            int b = sc.nextInt();
    
            System.out.println("x = " + (-b/a));
        }
        sc.close();
    }
}
