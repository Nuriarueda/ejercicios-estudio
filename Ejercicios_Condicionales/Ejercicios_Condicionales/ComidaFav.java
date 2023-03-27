package Ejercicios_Condicionales;

import java.util.Scanner;
public class ComidaFav {
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Cual es la comida favorita de Simon: ");

        String comida = sc.nextLine();

        if (comida.equals("Pollo con setas")){
            System.out.println("Error");
            
        } else {
            System.out.println("Enhorabuena has acertado!!");
        }
        sc.close();

        
    } 

}
