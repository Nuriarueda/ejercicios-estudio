package Ejercicio_NumAleatorios;

public class RandomBasico {
    
    public static void main (String [] args){

        System.out.println("Diez numeros aleatorios:");

        for (int i = 1; i < 11; i++){ // En el bucle generamos cuantos numeros nos saldran en este caso 10
            System.out.println(Math.random());
            /* Este Math Rando genereara numeros aleatorios entre 0 - 1 */
        }
    }
}
