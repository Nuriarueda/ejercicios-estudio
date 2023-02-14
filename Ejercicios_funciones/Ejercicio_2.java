/* Crea una funcion que devuelva la suma de 2 numeros, pasados por parametros */

package Ejercicios_funciones;

public class Ejercicio_2 {
    
    
    /* Aqui escribimos lo que se va a mostrar por pantalla */
    public static void main (String[] args){
        
        int num1=2;
        int num2=4;

        int resultado=suma(num1,num2); //tambien se puede quitar esta linea y abajo poner directamente:
        System.out.println("El resultado es " + resultado); //System.out.print("Resultado" +suma(num1,num2));
    }


    /* Aqui tenemos la funcion ( ponemos 'int' cuando es una funcion con parametros y
    * siempre tiene que tener un return ya que siempre nos va a devolver algo */
    public static int suma(int a, int b){

        return a+b; 
    }
}
