package Examenes;

import java.util.Scanner;
public class Arrays {
    
    public static void limpiarTablero(char[][] tablero){
        int i;
        int j;
        int longitud = tablero.length;
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

}
