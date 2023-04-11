package Examenes;


import java.util.Scanner;
public class Bucles1 {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe la anchura de la carta: ");

        int anchura = sc.nextInt();
        if(anchura%2==0){
            anchura++;
        }

        for (int i = 1; i <= (anchura/2)+1; i++) {
            for (int j = 1; j <= anchura; j++) {
                if(i==1 || j==1 || i==anchura || j==anchura || i==j || i-1==anchura-j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i < anchura+1; i++) {
            System.out.print("* ");
        }
        
        /*for (int i = 0; i<anchuracarta; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i<anchuracarta; i++){
            System.out.print("* ");
            for (int j = 0; j<anchuracarta-2;j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i<anchuracarta; i++){
            System.out.print("* ");
        }
        sc.close();*/

    }
}
