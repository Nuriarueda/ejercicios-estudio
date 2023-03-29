package Ejercicio_NumAleatorios;

public class RandomBasico5 {
    
    // Ahora vamos a generar 20 numero aleatorios entre 50 y 60

    public static void main (String[] args){

        System.out.println("20 numeros aleatorios entre 50 y 60:");
        
        for (int i = 1; i<=20; i++){
            System.out.print(((int)(Math.random()*11) + 50) + " "); 
        }
    }
}

//EXPLICACION
/* En el primer parentesis vamos a generar numeros random de 0-10, a continuacion le sumamos 50 pero FUERA
del parentesis para que sea de 50 a 60. */