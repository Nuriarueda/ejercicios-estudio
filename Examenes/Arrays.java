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

    public static void imprimirTablero(char[][] tablero, int[] posicion, char modo){
        int i;
        int j;
        int longitud = tablero.length;
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                if (i == 0 || j == 0 || i == longitud - 1 || j == longitud - 1) {
                    System.out.print("* ");
                } else if (posicion[1] == i && posicion[0] == j) {
                    System.out.print(modo + " ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void muestraMenu(){
        System.out.println("a. Izquierda");
        System.out.println("d. Derecha");
        System.out.println("s. Abajo");
        System.out.println("w. Arriba");
        System.out.println("p. Pintar");
        System.out.println("b. Borrar");
        System.out.println("m. Mover");
        System.out.println("r. Rotar sentido antihorario");
        System.out.println("e. Espejo horizontal");
        System.out.println("l. Limpiar tablero");
        System.out.println("q. Salir");
    }

    public static char leerOpcion(Scanner sc){
        return sc.next().charAt(0);
    }


    public static void izquierda(char[][] tablero, char modo, int[] posicion){
        if (modo == 'P') {
            tablero[posicion[1]][posicion[0]] = 'X';
        } else if (modo == 'B') {
            tablero[posicion[1]][posicion[0]] = ' ';
        }
        if (posicion[0] != 1) {
            posicion[0]--;
        } 
    }


    public static void derecha(char[][] tablero, char modo, int[] posicion){
        int longitud = tablero.length;
        if (modo == 'P') {
            tablero[posicion[1]][posicion[0]] = 'X';
        } else if (modo == 'B') {
            tablero[posicion[1]][posicion[0]] = ' ';
        }
        if (posicion[0] != longitud - 2) 
            posicion[0]++;
    }




}
