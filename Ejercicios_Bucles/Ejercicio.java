package Ejercicios_Bucles;

public class Ejercicio {
    public static void main(String[] args) {
        int numIntroducido;
        do {
            System.out.print("Por favor, introduzca un número entero: ");
            numIntroducido = Integer.parseInt(System.console().readLine());
            if (numIntroducido < 0) {
                System.out.println("El número introducido no es correcto.");
            }
        } while (numIntroducido < 0);
        int factorial = numIntroducido;
        if (numIntroducido == 0) {
            System.out.println("El factorial del " + numIntroducido + " es 1.");
        } else {
            for (int i = 1; i < numIntroducido; i++) {
                factorial *= i;
            }
            System.out.println(numIntroducido + "! = " + factorial);
        }
    }
}
