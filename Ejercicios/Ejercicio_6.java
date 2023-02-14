/* genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. 
Crea un método donde pasamos como parámetros entre que números queremos que los genere, 
podemos pedirlas por teclado antes de generar los números. 
Este método devolverá un número entero aleatorio. 
Muestra estos números por pantalla. */

package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_6 {
    public static void main(String[] args) {
        //Introducimos los datos necesarios
        String texto=JOptionPane.showInputDialog("Introduce el limite");
        int limite=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero1=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero2=Integer.parseInt(texto);
        //generamos los numeros
        for(int i=0;i<limite;i++){
            System.out.println(generaNumero(numero1, numero2));
        }
    }
   public static int generaNumero(int num1, int num2){
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }
}