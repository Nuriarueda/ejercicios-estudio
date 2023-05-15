import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
package Ficheros;

public class Ejercicio1 {

    protected static Scanner sc;
    static void inicializar(){
        sc= new Scanner (System.in);
    }

    public static void finalizar(){
        sc.close();
    }

    public static void menu(){
        System.out.println("1. Mostrar carpeta actual");
        System.out.println("2. Ver contenido del archivo");
        System.out.println("3. Renombrar archivo");
        System.out.println("4. Borrar archivo");
        System.out.println("5. Mostrar ruta actual");
        System.out.println("6. Acceder a carpeta");
        System.out.println("7. Salir");

    }


    public static char leerOpcion(Scanner sc){ 
        return sc.next().charAt(0);
    }

    public static void listarCarpeta(){
        File f = new File(".")
        System.out.println("**** CONTENIDO DE LA CARPETA ****");
        mostrarRutaActual();
        String[] listarArchivo = f.list();
        for (String nombreArchivo : listarArchivos)
        
    }
    
    public static void verArchivo(){
        System.out.println("Introduzca el nombre del archivo: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exist()){
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                Strign line = "";
                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            } catch (IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }

    public static void renombrarArchivo(){
        System.out.println("Introduzca el nombre del archivo a renombrar: ");
        String orig = sc.nextLine();
        File fdest = new File (dest);

    }
    

    public static void mostrarRutaActual(){
        File f = new File(".")
    }

    public static void main(String[] args) {
        
        File f = new File("."); 

        String[] listaArchivos = f.list();
        for(String nombreArchivo : listaArchivos) {
            System.out.println(nombreArchivo);
        }

    }

}
    

