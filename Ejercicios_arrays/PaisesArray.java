/* Media, minimo y maximo de estos paises: España, Rusia, Japón y Australia */

package Ejercicios_arrays;

public class PaisesArray {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }
        }
        System.out.printf("%64s", "MED MIN MAX");
        for (int i = 0; i < 4; i++) {
            int maximo = 140;
            int minimo = 210;
            int suma = 0;
            System.out.printf("%9s:", pais[i]);
            for (int estatura : estaturas[i]) {
                System.out.printf("%4d", estatura);
                maximo = estatura > maximo ? estatura : maximo;
                minimo = estatura < minimo ? estatura : minimo;
                suma += estatura;
            }
            System.out.printf(" |%4d%4d%4d", suma / 10, minimo, maximo);
        }
    }
}
