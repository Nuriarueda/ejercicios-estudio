/* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class UltimaCifra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número entero: ");

        int n = sc.nextInt();
        System.out.println("La última cifra del número introducido es el " + (n % 10));
        
        sc.close();
    }
}
