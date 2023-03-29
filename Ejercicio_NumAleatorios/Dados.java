/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */

package Ejercicio_NumAleatorios;

public class Dados {
    
    public static void main (String [] args){

        // PRIMER DADO
        int tirada1 = (int)(Math.random()*7) + 1;
        System.out.println("Dado1: " + tirada1);

        // SEGUNDO DADO 
        int tirada2 = (int)(Math.random()*7) + 1;
        System.out.println("Dado2: " + tirada2);

        // SEGUNDO DADO 
        int tirada3 = (int)(Math.random()*7) + 1;
        System.out.println("Dado3: " + tirada3);


        //SUMA 
        int suma = tirada1 + tirada2 + tirada3;

        System.out.print("La suma de los resultados de cada dado es: " + suma);

    } 
}
