package Ejercicio_NumAleatorios;

// Ahora vamos a generar numeros random que sean del 1 al 10 contando el 10
public class RandomBasico4 {
    
    public static void main (String[] args){

        System.out.println("20 numero random del 1-10:");

        for (int i=1; i<=20; i++){
            System.out.print((int)(Math.random()* 9 + 1) + " ");
        }
    }
}
