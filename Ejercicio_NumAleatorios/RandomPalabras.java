// Palabras random

package Ejercicio_NumAleatorios;

public class RandomPalabras {
    
    public static void main (String[] args){

        System.out.println("Generea al azar una palabra");

        int palabra = (int)(Math.random()*3); // 0-2

        switch (palabra){
            case 0:
                System.out.println("Hola");
                break;
            case 1:
                System.out.println("Adios");
                break;
            case 2: 
                System.out.println("Hasta luego");
                break;
            default:
        }
    }
}
