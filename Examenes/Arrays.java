package Examenes;

import java.util.Scanner;
public class Arrays {
    
    public static void limpiarTablero(char[][] tablero){  // 
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


    public static void abajo(char[][] tablero, char modo, int[] posicion){
        int longitud = tablero.length;
        if (modo == 'P') {
            tablero[posicion[1]][posicion[0]] = 'X';
        } else if (modo == 'B') {
            tablero[posicion[1]][posicion[0]] = ' ';
        }
        if (posicion[1] != longitud - 2)
            posicion[1]++;
    }

    public static void arriba(char[][] tablero, char modo, int[] posicion){

        if (modo == 'P') {
            tablero[posicion[1]][posicion[0]] = 'X';
        } else if (modo == 'B') {
            tablero[posicion[1]][posicion[0]] = ' ';
        }
        if (posicion[1] != 1)
            posicion[1]--;
    }

    public static char pintar(){
        return 'P';
    }

    public static char borrar(){
        return 'B';
    }

    public static char mover(){
        return 'M';
    }

    public static void copiaArray(char[][] destino, char[][]origen){
        int longitud = destino.length;
        int i = 0;
        int j = 0;
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                destino[i][j] = origen[i][j];
            }
        }
    }


    public static void rotar(char[][] tablero){
        int longitud = tablero.length;
        int i = 0;
        int j = 0;
        char arrayAux [][] = new char [longitud][longitud];
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                arrayAux[longitud -j - 1][i] = tablero[i][j];
            }
        }
        copiaArray(tablero, arrayAux);
    }

    public static void espejo(char[][] tablero){
        int longitud = tablero.length;
        int i = 0;
        int j = 0;
        char arrayAux [][] = new char [longitud][longitud];
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                arrayAux[i][j] = tablero[i][longitud-j-1];
                
            }
        }
        copiaArray(tablero, arrayAux);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char array [][] = new char [11][11];
        int[] posicion = new int[2]; 
        posicion[0] = array.length/2;
        posicion[1] = array.length/2;
        char cabezal = 'M';
        char opcion = 'x';
        limpiarTablero(array);
        do {
            imprimirTablero(array, posicion, cabezal);
            muestraMenu();
            opcion = leerOpcion(sc);
            switch (opcion) {
                case 'a':
                    izquierda(array, cabezal, posicion);
                    break;
                case 'd':
                    derecha(array, cabezal, posicion);
                    break;
                case 's':
                    abajo(array, cabezal, posicion);
                    break;
                case 'w':
                    arriba(array, cabezal, posicion);
                    break;
                case 'p':
                    cabezal = pintar();
                    break;
                    case 'b':
                    cabezal = borrar();
                    break;
                case 'm':
                    cabezal = mover();
                    break;
                case 'r':
                    rotar(array);
                    break;
                case 'e':
                    espejo(array);
                    break;
                case 'l':
                    limpiarTablero(array);
                    break;
                case 'q':
                    break;
                default:
            }   
        } while (opcion != 'q');
        sc.close();
    }
}
