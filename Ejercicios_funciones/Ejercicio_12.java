/* Factorial de un numero que pide por consola */

package Ejercicios_funciones;

import java.util.Scanner;
public class Ejercicio_12 {
    
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);

        System.out.print("¿De que numero quieres saber el factorial?: ");
        int n = sc.nextInt();

        System.out.println("El factorial de "+ n + " es: " + factorial(n));

        sc.close();
    }

    public static int factorial(int n){
        
        if(n<0){
            
            System.out.println("No se puede calcular el factorial de un numero negativo");
            return -1;
        } 

        if (n==0 || n==1) {
            return 1;
        }

        int resultado=n;
        

        for (int i=(n-1) ;i>1;i--){
            resultado*=i;
        }

        return resultado;
    }
}
