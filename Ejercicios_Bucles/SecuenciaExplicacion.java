package Ejercicios_Bucles;

public class SecuenciaExplicacion {
    
    public static void main(String[] args) {

        int inicio=1; // Empezamos con uno

        for(int i=1; i<=5; i++){

            int siguiente=inicio+1; // Estos serán los números que se imprimirán a continuación del primero

            for(int k=1; k<=i; k++){ // Imprimimos los espacios antes de cada línea
                System.out.print(" ");
            }

            System.out.print(inicio+" "); // Imprimimos el primer número

            for(int j=1; j<=4; j++){ // A continuación todos los demás, en este caso 4
                System.out.print(siguiente+" "); // Se imprime
                siguiente++; // Y sumamos uno
            }

            inicio++; // Hacemos que el número inicial sume una posición
            System.out.println(); // Y saltamos de línea
        }
    }
}