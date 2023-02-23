/* Muestra los numeros primos que hay entre 1 y 1000 */


package Ejercicios_funciones;

public class Primos2 {
    
    public static void main (String[] args) {

        for (int i = 1; i < 1001; i++){
            if (numeroprimo(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean numeroprimo (int numero) {

        if (numero <= 2){
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
