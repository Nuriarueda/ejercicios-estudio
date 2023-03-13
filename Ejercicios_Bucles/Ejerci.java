/*  Muestra la tabla de multiplicar de un número introducido por teclado. */

package Ejercicios_Bucles;


import java.util.Scanner;
public class Ejerci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
        int numIntroducido = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numIntroducido + " x " + i + " = " + numIntroducido * i);
        }
        sc.close();
    }
}
