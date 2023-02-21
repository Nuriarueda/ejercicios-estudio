/* Crear una funcion que nos devuelva la suma de un array que te pide por consola y otra que
nos devuelva la media */

package Ejercicios_funciones;

import java.util.Scanner;
public class SumaMediaScanner {
    

    public static void main (String[] args){

        Scanner sc =  new Scanner (System.in);

        System.out.print("Introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        int n3 = sc.nextInt();
        System.out.print("Introduzca el cuarto numero: ");
        int n4 = sc.nextInt();

        int [] numeros={n1,n2,n3,n4};
        System.out.println("La summa es: " + suma(numeros));

        System.out.println("La media es: " + media(numeros));

        sc.close();
    }

    // Como te pide una funcion que devuelva la suma y la media creamos 2 funciones:

    public static int suma(int[] numeros){ // FUNCION DE LA SUMA
        
        int suma=0;
        for (int i=0;i<numeros.length;i++){
            suma+=numeros[i];
        }

        return suma;
    }

    public static double media(int[] numeros) { // FUNCION DE LA MEDIA 

        double suma = suma(numeros);

        return suma/numeros.length;

    }

}
