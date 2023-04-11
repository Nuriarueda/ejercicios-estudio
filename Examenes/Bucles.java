package Examenes;


import java.util.Scanner;
public class Bucles {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe la anchura de la carta: ");

        int anchuracarta = sc.nextInt();

        for (int i = 0; i<=anchuracarta; i++){
            System.out.print("* ");
        }
        


        sc.close();
    }
}
