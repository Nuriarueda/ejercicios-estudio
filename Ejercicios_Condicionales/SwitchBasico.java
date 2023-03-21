/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class SwitchBasico {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe un dia de la semana: ");
        String dia = sc.nextLine();

        switch (dia) {
            case "lunes": 
                System.out.println("Ese dia toca: quimica");
                break;
            case "martes": 
                System.out.println("Ese dia toca: lengua");
                break;
                case "miercoles": 
                System.out.println("Ese dia toca: matematicas");
                break;
                case "jueves": 
                System.out.println("Ese dia toca: historia");
                break;
                case "viernes": 
                System.out.println("Ese dia toca: fisica");
                break;
            default:
                System.out.println("Ese dia no hay clase");

        }

        sc.close();
    }
}
