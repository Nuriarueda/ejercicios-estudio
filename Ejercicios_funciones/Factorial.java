/* Factorial del numero 5 */


package Ejercicios_funciones;

public class Factorial {
    
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static int factorial(int numero){
        
        if(numero<0){
            
            System.out.println("No se puede calcular el factorial de un numero negativo");
            return -1;
        } 

        if (numero==0 || numero==1) {
            return 1;
        }

        int resultado=numero;
        

        for (int i=(numero-1) ;i>1;i--){
            resultado*=i;
        }

        return resultado;
    }
}
