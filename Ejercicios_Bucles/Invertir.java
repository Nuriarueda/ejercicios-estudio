package Ejercicios_Bucles;

public class Invertir {
    
    public static void main (String[] args){
        int num = 1;

        for (int j=1; j<=6;j++){
            for (int i=num; i<=6; i++){
                System.out.print(i + " ");
            }
    
            for (int i=num; i>1; i--){
                System.out.print(i + " ");
            }
            num++;
    
            System.out.println(j);
        }

    }
}