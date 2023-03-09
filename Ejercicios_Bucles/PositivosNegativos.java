package Ejercicios_Bucles;

import java.util.Scanner;
public class PositivosNegativos {
    
    public static void main (String[] args){
        Scanner sc = new Scanner    (System.in);

        System.out.println("Escribe 10 numeros enteros, tanto positivos como negativos: ");
        int negativos = 0;
        int positivos = 0;

        for (int i=0; i<10; i++){
            if ( (sc.nextInt())>0 ){
                positivos ++;
            } else {
                negativos ++;
            }
        }

        System.out.print("Has introducido " + negativos + " negativos y " + positivos + " positivos");


        sc.close();
    }
}
