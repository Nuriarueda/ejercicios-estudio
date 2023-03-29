package Ejercicio_NumAleatorios;

public class RandomBasico2 {
    
    public static void main (String[] args){

        System.out.println("20 numeros aleatorios de 0 - 10:");

        for (int i = 1; i <=20; i++){ // Generamos los 20 numeros que nos van a salir
            System.out.println(Math.random()*10 + " "); // Numeros aleatorios de 0 a 10 pero sin contar el 10
        }
    } 
}
