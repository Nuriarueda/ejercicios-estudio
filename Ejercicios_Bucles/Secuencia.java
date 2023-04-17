
public class Secuencia {
    
    public static void main (String [] args){

        int principio = 1;
        
        for (int i = 1; i <= 5 ; i++){

            int siguiente = principio+1;
            
            for (int j = 1; j<i; j++){
                System.out.print( " ");
            }

            System.out.print(principio + " ");

            for (int k = 1; k <= 4; k++ ){
                System.out.print(siguiente + " ");
                siguiente ++;
            }

            principio ++;
            System.out.println();
        }
    }
}
