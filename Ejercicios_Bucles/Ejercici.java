package Ejercicios_Bucles;

import java.util.Scanner;
public class Ejercici {
    
    public static void main (String[] args){
        Scanner sc = new Scanner    (System.in);

        int negativos = 0;
        int positivos = 0;

        for (int i=0; i<10; i++){
            if ( (int num = sc.nextInt())>0 ){
                negativos ++;
            } else {
                positivos ++;
            }
        }

        System.out.print("Has introducido " + negativos + " negativos y " + positivos + " positivos");


        sc.close();
    }
}
