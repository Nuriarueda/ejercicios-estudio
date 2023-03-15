/* Arrays bidimensionales: Escribe un programa que, dada una posición en un tablero de ajedrez,
nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición. */

package Ejercicios_arrays;

public class PosicionAfil {
    public static void main(String[] args) {
        System.out.print("Introduzca la posición del alfil, por ejemplo d5: ");
        String posicionAlfil = System.console().readLine();
        int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
        System.out.print("El alfil puede moverse a las siguientes posiciones: ");
        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
