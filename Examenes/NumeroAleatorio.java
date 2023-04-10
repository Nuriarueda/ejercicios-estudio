/* Crea una funcion que devuelva un numero aleatorio entre dos numeros 
enteros que nosotros les demos*/

package Examenes;

public class NumeroAleatorio {
    
    public static void main (String[] args){
        
    }

    public static int numeroAleatorio(int numminimo, int nummaximo) {

        return (int)(Math.random()*nummaximo-numminimo);
    }
}

