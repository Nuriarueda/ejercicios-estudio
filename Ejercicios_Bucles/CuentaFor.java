/* Pide un numero y cuenta hasta el numero pedido por consola con un bucle FOR */

import java.util.Scanner;
public class CuentaFor {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe un numero entero: ");
        int numero = sc.nextInt();

        for (int i=1; i<=numero; i++){
            System.out.print(i + " ");
        }


        sc.close();
    }
}
