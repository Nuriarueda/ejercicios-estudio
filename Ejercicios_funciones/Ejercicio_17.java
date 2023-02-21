/* Crear una funcion que nos devuelva la suma de un array y otra que
nos devuelva la media */

package Ejercicios_funciones;

public class Ejercicio_17 {
    

    public static void main (String[] args){

        int [] numeros={1,2,3,4,5};
        System.out.println("La summa es: " + suma(numeros));

        System.out.println("La media es: " + media(numeros));

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

        int suma = suma(numeros);

        return suma/numeros.length;

    }

}
