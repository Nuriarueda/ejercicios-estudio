/* Devuelve verdadero si el número que se pasa como 
parámetro es capicúa y falso en caso contrario. */

package Ejercicios_funciones;

import java.util.Scanner;
public class NumerosCapicuos {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Que  numero quieres saber si es capicuo o no: ");
        int num = sc.nextInt();

        if (esCapicua(num)) {
            System.out.println ("El numero " + num +  " es capicua");
        } else {
            System.out.print ("El numero " + num + " no es capicua");

        }
        
        sc.close();
    }

    public static boolean esCapicua(long numero) {
        
        
        return numero == voltea(numero);
    
    }
    private static long voltea(long numero) {
        return numero ;
    }

    public static boolean esCapicua (int numero){
        return esCapicua((long) numero);
    }

}
