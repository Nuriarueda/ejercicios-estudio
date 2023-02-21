/* Crear una funcion que nos indique si un numero es primo o no */

package Ejercicios_funciones;

public class Primo {
    
    public static void main (String [] args) {

        System.out.println(esPrimo(10));
    }

    public static boolean esPrimo(int numero){

        if (numero<=1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;    
    }
}
