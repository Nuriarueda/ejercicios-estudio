/* Haz un programa que sume el numero que te den por consola del 1-10 */

package Ejercicios_Bucles;

import java.util.Scanner;
public class SumaFor {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Numero que quieras sumar: ");
        int num = sc.nextInt();

        for (int i=1; i<=10;i++){
            System.out.println(num + " + " + i + " = "); 
        }
        sc.close();
    }
}
