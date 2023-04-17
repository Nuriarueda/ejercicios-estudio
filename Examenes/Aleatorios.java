package Examenes;

import java.util.Scanner;
public class Aleatorios {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.println("-A-L-E-A-T-O-R-I-U-M-");
        System.out.println();
        System.out.println("Aleatorium pensará un número entre los valores que tu decidas");

        System.out.print("Introduce un valor minimo: ");
        int min = sc.nextInt();
        System.out.print("Introduce un valor maximo: ");
        int max = sc.nextInt();

        System.out.println();

        System.out.println("-A-L-E-A-T-O-R-I-U-M-");
        System.out.println();

        boolean salir = false;
        do {
            int intervalomin = (int)(Math.random()*(max-min+1)+min); //Generando el numero minimo
            int intervalomax = (int)(Math.random()*(min-max+1)+max); //Generando el numero maximo
    
            if (intervalomax < intervalomin){ // Establecemos el numero mas pequeño como min y el mayor como max
                int aux = intervalomin;
                intervalomin = intervalomax;
                intervalomax = aux;
            } 
            System.out.println("Estoy pensando un numero entre " + intervalomin + " y " + intervalomax);
    
            
            int intentos = (int)(Math.log(intervalomax-intervalomin+1) / Math.log(2)); // Calcular el numero de intentos 
            System.out.println("Tienes " + intentos + " intentos");

            System.out.println();

            int numcorrecto = (int)(Math.random()*(intervalomax-intervalomin+1) + intervalomin);

            boolean acertado = false;
            do {
                System.out.print("Escribe un numero: ");
                int numintroducido = sc.nextInt();

                if (numintroducido == numcorrecto){
                    System.out.println("Enhorabuena, lo has conseguido");
                    acertado = true;
                    intentos = 0;
                    System.out.println();
                    System.out.println("El numero que habia pensado era: " + numcorrecto);
                } else if (numintroducido>numcorrecto){
                    System.out.println("Uy, te has pasado");
                    intentos --;
                } else if (numintroducido<numcorrecto){
                    System.out.println("Uy, te has quedado corto");
                    intentos --;
                }

            } while (intentos>0);

            if (!acertado) {
                System.out.println();
                System.out.println("Has superado el número de intentos.");
                System.out.println("El número que había pensado era: " + numcorrecto );
    
            }
            System.out.println();

            System.out.println("Elige una opción");
            System.out.println("1. Volver a jugar.");
            System.out.println("2. Salir del juego.");
            System.out.print("Opcion: ");
            System.out.println();
            int opcion = sc.nextInt();

            if (opcion == 2)
                salir = true;

        } while (!salir);
        

        sc.close();
    }

}
