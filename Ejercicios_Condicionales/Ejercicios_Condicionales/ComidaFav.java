package Ejercicios_Condicionales;

import java.util.Scanner;
public class ComidaFav {
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Cual es la comida favorita de Nuria: ");

        String comida = sc.nextLine();

        if (comida.equals("Pizza")){
            System.out.println("Error");
            
        } else if (comida.equals("Hamburguesa")){
            System.out.println("Enhorabuena has acertado!!");
        }
        sc.close();

        
    } 

}