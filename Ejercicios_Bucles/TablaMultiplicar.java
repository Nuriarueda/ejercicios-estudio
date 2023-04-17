/*  Muestra la tabla de multiplicar de un número introducido por teclado. */

import java.util.Scanner;
public class TablaMultiplicar {
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
