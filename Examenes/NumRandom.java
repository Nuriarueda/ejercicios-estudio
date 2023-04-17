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

        int intervalomin = (int)(Math.random()*(max-min+1)+min); //Generando el numero minimo
        int intervalomax = (int)(Math.random()*(min-max+1)+max); //Generando el numero maximo

        System.out.println("Estoy pensando un numero entre " + intervalomin + " y " + intervalomax);

        if (intervalomax < intervalomin){ // Establecemos el numero mas pequeño como min y el mayor como max
            int aux = intervalomin;
            intervalomin = intervalomax;
            intervalomax = aux;
        } 

        int intentos = (int)(Math.log(intervalomax-intervalomin+1) / Math.log(2)); // Calcular el numero de intentos 
        System.out.println("Tienes " + intentos + " intentos");

        



        sc.close();
    }

}
