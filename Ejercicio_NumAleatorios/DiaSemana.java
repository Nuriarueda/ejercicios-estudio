package Ejercicio_NumAleatorios;


public class DiaSemana {
    
    public static void main (String[] args){

        System.out.println("Muestra un dia de la semana al azar: ");

        int dia = (int)(Math.random()*7) + 1;

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;
        }
    }
}
