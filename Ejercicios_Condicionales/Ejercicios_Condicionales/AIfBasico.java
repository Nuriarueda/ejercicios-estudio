/* Un programa que te pida cual es su comida favorita y te diga error si no has acertado
y enhorabuena si has acertado */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class AIfBasico {
     
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Cual es mi comida favorita: ");
        String comidafav = sc.nextLine();

        if (comidafav.equals ("hamburguesas")){
            System.out.println("Enhorabuena, has acertado");
        } else {
            System.out.println("Lo siento has fallado");
        }
        
        sc.close();

    }
}
