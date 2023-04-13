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

        public static int digitos (long valor){
            int dig = 0;
            while(valor!=0){
                valor = valor / 10;
                dig ++;
            }
            return dig;
        }
}

