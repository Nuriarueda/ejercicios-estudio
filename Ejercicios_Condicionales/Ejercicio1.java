/* El usuario introducirá un número por teclado y el programa dirá 
si se trata de un número positivo o negativo. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe un numero ya sea positivo o negativo: ");
        int num = sc.nextInt();

        if (num<0){
            System.out.println("El numero que has introducido es negativo");
        } else {
            System.out.println("El numero que has introducido es positivo");
        }
        sc.close();
    }
}
