/* Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("¿Cuántas horas trabajas a la semana?: ");
        int horas = sc.nextInt();

        if (horas<=40){
            int sueldo1 = horas * 12;
            System.out.println("Vas a ganar este mes: " + sueldo1);
        } else {
            int sueldo2 = horas * 16;
            System.out.println("Vas a ganar este mes: " + sueldo2);

        }

        sc.close();
    }
}
