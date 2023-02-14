/* Crea una funcion que devuelva un numero aleatorio entre dos numeros 
enteros que nosotros les demos*/

package Ejercicios;

public class Ejercicio_5 {
    
    public static void main (String[] args){
        
    }

    public static int numeroAleatorio(int numminimo, int nummaximo) {

        return (int)(Math.random()*nummaximo-numminimo);
    }
}

