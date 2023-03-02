/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array.  A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.*/


package Ejercicios_arrays;

public class Teclado {
    public static void main(String[] args) {
        int[][] n = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                n[i][j] = (int)(Math.random()*101) + 200;
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nDiagonal desde la esquina superior izquierda ");
        System.out.println("a la esquina inferior derecha: ");
        int maximo = 200;
        int minimo = 300;   
        int suma = 0;
        for(int i = 0; i < 10; i++) {
            int numero = n[i][i];
            System.out.print(numero + " ");
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
        }
        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + ((double)suma / 10));
    }
}
