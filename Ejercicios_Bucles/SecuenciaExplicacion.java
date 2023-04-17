
public class SecuenciaExplicacion {
    
    public static void main(String[] args) {

        int principio=1; // Empezamos con uno

        for(int i=1; i<=5; i++){

            int siguiente=principio+1; // Estos serán los números que se imprimirán a continuación del primero

            for(int j=1; j<=i; j++){ // Imprimimos los espacios antes de cada línea
                System.out.print(" ");
            }

            System.out.print(principio+" "); // Imprimimos el primer número

            for(int k=1; k<=4; k++){ // A continuación todos los demás, en este caso 4
                System.out.print(siguiente+" "); // Se imprime
                siguiente++; // Y sumamos uno
            }

            principio++; // Hacemos que el número inicial sume una posición
            System.out.println(); // Y saltamos de línea
        }
    }
}