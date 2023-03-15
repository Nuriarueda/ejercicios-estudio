/* Pide un numero y cuenta hasta el numero pedido por consola con un bucle WHILE */

package Ejercicios_Bucles;

import java.util.Scanner;
public class CuentaWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i<=numero){
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
