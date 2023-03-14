/* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. */

package Ejercicios_Bucles;

public class E {
    public static void main (System []args) {
        System.out.print("Números primos entre 2 y 100: ");
            boolean esPrimo = true;
            for (int n = 2; n <= 100; n++) {
                esPrimo = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    System.out.print(n + " ");
                }
            }
        System.out.println();
    }
}
