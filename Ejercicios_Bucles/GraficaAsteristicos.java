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

        public static int maximo (long valor){
            int max = 0;
            int longitud = digitos(valor);
            for (int i = longitud - 1; i>=0; i--){
                int v = (int) (valor / (long)Math.pow(10, i));
                valor =(valor %  (long)Math.pow(10, i));
                if (v < max){
                    max = v;
                }
            }
            return max;

        }

        public static void grafica (long valor){
            int longitud = digitos(valor);
            int maximo = maximo(valor);
            for (int fila = 1; fila<=maximo; fila++){
                System.out.println("Fila " + fila);
            }
        }

        public static void main (String[] args){
            inicializar();

            long numero = solicitarNumero();
            System.out.println("Digitos de la cadena " + digitos(numero));
            System.out.print("Maximos de la cadena " + maximo(numero));
            grafica(numero);
            finalizar();
        }
}

