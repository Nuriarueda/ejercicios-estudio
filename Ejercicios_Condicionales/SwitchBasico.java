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
                System.out.println("Ese dia toca: Quimica");
                break;
            case "martes": 
                System.out.println("Ese dia toca: Lengua");
                break;
                case "miercoles": 
                System.out.println("Ese dia toca: Matemáticas");
                break;
                case "jueves": 
                System.out.println("Ese dia toca: filosofia");
                break;
                case "viernes": 
                System.out.println("Ese dia toca: historia");
                break;
            default:
                System.out.println("Ese dia no hay clase");

        }

        sc.close();
    }
}
