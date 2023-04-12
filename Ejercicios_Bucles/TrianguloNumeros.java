package Ejercicios_Bucles;

import java.util.Scanner;
public class TrianguloNumeros {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero hasta donde quieras pintar la piramide: ");
        int num = sc.nextInt();
        String espacios = "";
        for (int i = 1; i<=num; i++){
            System.out.print(espacios);
        }

        sc.close();
    }
}
