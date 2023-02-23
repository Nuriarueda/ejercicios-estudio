package Ejercicios_funciones;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] n = new int[6][9];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 9; j++) {
                n[i][j] = (int)(Math.random()*100000);
            }
        }
        muestraArrayIntBi(n);
    }
    private static void muestraArrayIntBi(int[][] n) {
    }
}
