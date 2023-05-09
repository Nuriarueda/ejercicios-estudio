package POO;

import java.util.Scanner;

public class Ejercicio2 {

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
        System.out.println("1.Añadir");
        System.out.println("2.Buscar");
        System.out.println("3.Modificar");
        System.out.println("4.Borrar");
        System.out.println("5.Listar");
        System.out.println("7.Salir");
    }

    public static int LeeOpcion(){
        return Integer.parseInt(sc.nextLine());
    }

    public static void Buscar(){
        System.out.print("Introduzca DNI: ");
        String dni = sc.nextLine();
        if (lista.containsKey(dni)){
            System.out.println(lista.get(dni));
        } else {
            System.out.println("No existe");
        }
    }





}
