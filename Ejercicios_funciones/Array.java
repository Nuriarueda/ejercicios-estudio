/* Crear una funcion que nos muestre por pantalla un array que hayamos creado */

package Ejercicios_funciones;

public class Array {
    
    public static void main (String[] args) {
        int[] numeros={1,2,3,4,5};
        mostrar (numeros);
    }


    public static void mostrar(int [] array) {

        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
