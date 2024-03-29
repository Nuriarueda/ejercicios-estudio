/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7. */

import java.util.Scanner;
public class Incremento {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe dos numeros enteros");
        System.out.print("Numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("Numero 2: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.print("Tienes que introducir dos numeros distintos");
        } else if (num1>num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for ( int i = num1; i < num2; i += 7){
            System.out.print(i + " ");
        }

        sc.close();
    }
}
