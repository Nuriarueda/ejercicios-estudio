/* Crear una funcion que nos devuelva un arrays de un numero a otro,
ambos incluidos. Por ejemplo, si introduzco de 5 a 7, el array tendra los
numeros 5, 6, 7 pero si inserto de 7 a 5 el array tendra los numeros 7, 6, 5*/

package Ejercicios_funciones;

public class Array2 {
    
    public static void main (String[] args) {

        int [] array1 = serie(5,7);
        int [] array2 = serie(7,5);
        int [] array3 = serie(5,5);


        System.out.println("Inicio 5 y final 7");
        mostrar(array1);
        System.out.println("");
        System.out.println("Inicio 5 y final 3");
        mostrar(array2);
        System.out.println("");
        System.out.println("Inicio 5 y final 5");
        mostrar(array3);

    }

    public static int[] serie(int inicio_num, int final_num){

        int tamanio = Math.abs(inicio_num - final_num) + 1;
        int[] serie = new int[tamanio];
        
        if(inicio_num<final_num){
            for (int i=0, j=inicio_num; i<serie.length; i++, j++){
                serie[i] = j;
            }
        } else {
            for (int i=0, j=final_num; i<serie.length; i++, j--){
                serie[i] = j;
            }

        }
        return serie;
    }

    public static void mostrar(int [] array) {

        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
