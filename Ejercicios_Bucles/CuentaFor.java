/* Pide un numero y cuenta hasta el numero pedido por consola con un bucle FOR */

package Ejercicios_Bucles;

import java.util.Scanner;
public class CuentaFor {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();

        for (int i=1; i<=numero; i++){
            System.out.print(i + " ");
        }


        sc.close();
    }
}