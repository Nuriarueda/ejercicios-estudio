/* Crea una funcion que nos devuelva el numero ASCII 
de un caracter padado por parametro*/

package Ejercicios_funciones;

public class NumeroASCII {
    
    public static void main(String[] args) {

        char caracter='a';
        

        System.out.println("El caracter " +caracter+ " tiene asociado el codigo "+devuelveCodigoASCII(caracter));
    }

    public static int devuelveCodigoASCII (char caracter){

        return (int)caracter;
    }
}

