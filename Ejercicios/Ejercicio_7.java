/* que nos cuente el número de cifras de un número entero positivo 
(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, 
pasando el número por parámetro, devolverá el número de cifras. */


package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        String binario=decimalBinario(numero);
        System.out.println("El numero "+numero+ " en binario es "+binario);
    }
   public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
            //Se añade el digito al principio (mira la imagen del post)
            binario=digito+binario;
        }
        return binario;
    }
}

