/* Pide un numero y cuenta hasta el numero pedido por consola con un bucle DO WHILE */

package Ejercicios_Bucles;

import java.util.Scanner;
public class CuentaDoWhile {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe un numero entero:");
        int numero = sc.nextInt();
        int i = 1;

        do{
            System.out.print(i + " ");
            i++;
            
        }while (i<=numero);



        sc.close();
    }
}
