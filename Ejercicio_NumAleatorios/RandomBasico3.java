package Ejercicio_NumAleatorios;

public class RandomBasico3 {
    
public static void main (String[] args){

    System.out.println("20 numeros aleatorios de 0 - 10:");

    for (int i = 1; i<=20; i++){
        System.out.print((int)(Math.random()*10) + " "); // Aqui no queremos numeros decimales asi que metemos el INT
        // Hay que tener en cuenta de que estamos generando numeros de 0 al 10, pero sin contar el 10 
    }
} 
}
