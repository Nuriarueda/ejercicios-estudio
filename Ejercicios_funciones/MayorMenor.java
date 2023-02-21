/* Crea una funcion que indique si un numero es mayor o menor que cero */

package Ejercicios_funciones;

import java.util.Scanner;
public class MayorMenor {
    

    /* Aqui escribimos lo que se va a mostrar por pantalla */
    public static void main(String[]args){

        Scanner sc =  new Scanner (System.in);
        
        System.out.print("Que numero quieres saber si es mayor o menos que cero: ");
        int n = sc.nextInt();

        if (mayorQue0(n)){
            System.out.println("El numero " + n + " es mayor que cero.");

        } else {
            System.out.println("El numero " + n + " es menor que cero");

        }
        sc.close();
    }

    /*Escribimos 'boolean' pra que devuelva true or false, en este caso si numero 
    es mayor que cero devuelve true si no nos devolveria falso*/
    public static boolean mayorQue0(int num){ 
        return num>0;

    }
}
