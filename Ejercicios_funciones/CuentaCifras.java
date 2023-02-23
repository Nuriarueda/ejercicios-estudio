/* Devuelve el numero de digitos que contiene un numero entero */


package Ejercicios_funciones;

import java.util.Scanner;
public class CuentaCifras {
    
    public static void main (String [] args) {
        Scanner sc =  new Scanner (System.in);

        System.out.print("Introduce un numero entero: ");
        int num = sc.nextInt();

        if (num==0){
            System.out.println("El numero tienen 0 cifras");
        } else {
            int resultado = cuentadigitos(num);
            System.out.println("Tiene " + resultado + " cifras");
        }
        sc.close();
    }

    public static int cuentadigitos (int numero) {
        if (numero==0) {
            return 1;
        } else {
            int n = 0;
            while ( numero > 0 ) {
                numero = numero/10;
                n++;
            }
            return n;
        }
    } 
}


