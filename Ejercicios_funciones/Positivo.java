/* Realizar una funcion que nos indique en numero de cifras de un numero entero positivo */

package Ejercicios_funciones;


import java.util.Scanner;
public class Positivo {
    
    public static void main (String[] args) {
        Scanner sc =  new Scanner (System.in);

        int numero;

        do{
            System.out.print("Escribe un numero positivo: ");
            numero = sc.nextInt();
        } while (numero<0);

        int cifras=cuentaCifras(numero);
        System.out.println("Hay " + cifras + " cifra/s");

        sc.close();
    }

    public static int cuentaCifras (int numero){
        int cifras=1;
        for (int i=numero; i>10;i/=10) {
            cifras++;
        }

        return cifras;

    }

}
