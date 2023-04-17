/* Escribe un programa que calcule el factorial de un número entero leído por
teclado. */


import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int numIntroducido;
        do {
            System.out.print("Por favor, introduzca un número entero: ");
            numIntroducido = sc.nextInt();
            if (numIntroducido < 0) {
                System.out.println("El número introducido no es correcto.");
            }
        } while (numIntroducido < 0);
        int factorial = numIntroducido;
        if (numIntroducido == 0) {
            System.out.println("El factorial del " + numIntroducido + " es 1.");
        } else {
            for (int i = 1; i < numIntroducido; i++) {
                factorial *= i;
            }
            System.out.println(numIntroducido + "! = " + factorial);
        }
        sc.close();
    }
}
