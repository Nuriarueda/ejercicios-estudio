/* Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("¿Qué hora es?: ");
        int hora = sc.nextInt();

        if (hora>=6&&hora<=12){
            System.out.println("Buenos dias");
        } else if (hora>=13&&hora<=20){
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        

        sc.close();
    }
}
