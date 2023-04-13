package Ejercicios_Bucles;

import java.util.Scanner;
public class GraficaAsteristicos {
    
        protected static Scanner sc;
        public static long solicitarNumero(){
            long valor = -1;
            System.out.print("Introduce un numero: ");
            valor = Long.parseLong(sc.nextLine());
            return valor;
        }
}

