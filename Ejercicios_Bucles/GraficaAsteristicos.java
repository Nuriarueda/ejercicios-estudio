package Ejercicios_Bucles;

import java.util.Scanner;
public class GraficaAsteristicos {
    
        protected static Scanner sc;
        static void inicializar(){
            sc= new Scanner (System.in);
        }

        public static void finalizar(){
            sc.close();
        }

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

        public static void main (String[] args){
            inicializar();
            long numero = solicitarNumero();
            System.out.print("Digitos de la cadena " + digitos(numero));
            finalizar();
        }
}

