/* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos.  */

package Ejercicios_Condicionales;

import java.util.Scanner;
public class TestFidelidad {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("------- Detector de infilidades -------");
        System.out.println();
        System.out.println("Ahora te haremos unas preguntas, tienes que responder verdadero o falso.");
        System.out.println("Si es verdadero se sumará 3 puntos, si es falso no se sumara nada.");
        System.out.println("Las preguntas son las siguientes: ");
        System.out.println();

        int puntos = 0;

        // PREGUNTA 1
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        String respuesta = sc.nextLine();

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        //PREGUNTA 2
        System.out.print("2. Ha aumentado sus gastos de vestuario: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 3
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 4
        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 5
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 6
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 7
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 8
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 9
        System.out.print("9. Has notado que últimamente se perfuma más: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }


        // PREGUNTA 10
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");

        if (respuesta.equals("verdadero")){
            puntos += 3;
        }

        System.out.println("Tu total de puntos: " + puntos);

        if (puntos>=0 && puntos<=10){
            System.out.println("Enhorabuena, tu pareja es totalmente fiel.");
        } else if (puntos>=11 && puntos<=22){
            System.out.println(" : Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntos>22 && puntos<=30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }


        sc.close();
    }
}
