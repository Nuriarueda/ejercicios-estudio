package Ejercicios_Bucles;

public class Ejerci {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
        }
    }
}
