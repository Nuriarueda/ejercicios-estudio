// Ahora vamos a generar numeros random que sean del 1 al 10 contando el 10


package Ejercicio_NumAleatorios;

public class RandomBasico4 {
    
    public static void main (String[] args){

        System.out.println("20 numero random del 1-10:");

        for (int i=1; i<=20; i++){
            System.out.print((int)(Math.random()* 10 + 1) + " "); // Cuando añadimos el (+1) estamos sumando 9 + 1 = 10
        }

        /* La otra forma de hacerlo es poniendo directamente 11 asi nos saldra del 0-10 */
    }
}
