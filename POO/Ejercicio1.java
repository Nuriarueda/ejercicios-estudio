package POO;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio1 {
    public static Scanner sc;

    public static void inicializa(){
        sc = new Scanner(System.in);
    }

    public static void finaliza(){
       if (sc != null){
        sc.close();
       }
    }

    public static void Menu(){
        System.out.println("1.Inicializar");
        System.out.println("2.Insertar");
        System.out.println("3.Modificar");
        System.out.println("4.Borrar");
        System.out.println("5.Ordenar");
        System.out.println("6.Visualizar");
        System.out.println("7.Salir");
    }

    public static int LeeOpcion(){
        return Integer.parseInt(sc.nextLine());
    }

    public static void AnadirElemento(){
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Añade un valor: ");
        int value = Integer.parseInt(sc.nextLine());
        lista.add(value);
        
    }

    public static void InsertarElemento(){
        System.out.println("Añade un valor: ");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca la posicion: ");
        int position = Integer.parseInt(sc.nextLine());
        lista.add(position, value);

    }

    public static void ModificarElemento(){

    }

    public static void VisualizarElemento(){
        for (int i = 0; i<lista.size();i++){
            System.out.println(lista.get(i));

        }
    }
}
