package Examenes;

import java.util.Scanner;
public class NumRandom {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.println("-A-L-E-A-T-O-R-I-U-M-");
        System.out.println("Aleatorium pensará un número entre los valores que tu decidas");

        System.out.print("Introduce un valor minimo: ");
        int min = sc.nextInt();
        System.out.print("Introduce un valor maximo: ");
        int max = sc.nextInt();

        System.out.println("-A-L-E-A-T-O-R-I-U-M-");

        int intervalomin = (int)(Math.random()*(max-min+1)+min);
        int intervalomax = (int)(Math.random()*(min-max+1)+max);

        System.out.println("Estoy pensando un numero entre " + intervalomin + " y " + intervalomax);

        if (intervalomax < intervalomin){
            int aux = intervalomin;
            intervalomin = intervalomax;
            intervalomax = aux;

        } 




        sc.close();
    }

}
