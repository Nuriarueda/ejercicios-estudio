/* Haz un programa que divida el numero que te den por consola del 1-10 */

package Ejercicios_Bucles;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Numero que quieras dividir: ");
        int num = sc.nextInt();

        for (int i=1; i<=10;i++){
            int division = num/i;
            System.out.println(num + " / " + i + " = " + division); 
        }
        sc.close();
    }

}
