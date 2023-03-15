/* Haz un programa que reste el numero que te den por consola del 1-10 */

package Ejercicios_Bucles;

import java.util.Scanner;
public class RestaFor {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Numero que quieras restar: ");
        int num = sc.nextInt();

        for (int i=0; i<=10;i++){
            int resta = num-i;
            System.out.println(num + " - " + i + " = " + resta); 
        }
        sc.close();
    }
}