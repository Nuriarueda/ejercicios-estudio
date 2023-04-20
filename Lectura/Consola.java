package Lectura;

import java.util.Scanner;
public class Consola {
    public static Scanner sc;
    public static void inicializar(){
        sc = new Scanner (System.in);
    }

    public static void finalizar (){
        sc.close();
    }
}
