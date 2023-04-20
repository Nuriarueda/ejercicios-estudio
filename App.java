import Alumnado.Alumnos;
import Lectura.Consola;
public class App {

    public static String[] inicializarAlumnos(){
        System.out.println("¿Cuántos alumnos máximos quiere tener?");
        int cantidad = Integer.parseInt (Consola.sc.nextLine());
        String[] alumnos = new String[cantidad];
        return alumnos;
        
    }

    public static void imprimirAlumnos(String[] alumnos){
        int cantidad = 0;
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i]!=null){
                cantidad++;
                System.out.printf("%d. %s\n" ,i+1, alumnos[i]);

            }
        }
        System.out.println("Total alumnos: " + cantidad);

    }
    public static void muestraMenu(){
        System.out.println("1. Imprime la lista de alumnos");
        System.out.println("2. Añade un alumno");
        System.out.println("3. Modifica un alumno");
        System.out.println("4. Elimina un alumnos");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(){
        return Integer.parseInt(Consola.sc.nextLine());
    }



    public static void  main (String[] args) throws Exception {
        Consola.inicializar();
        int opcion = -1;
        boolean salir = false;
        String[] alumnos = inicializarAlumnos();
        do{
            muestraMenu();
            opcion = leerOpcion();
            switch (opcion){    
                case 1:
                    imprimirAlumnos(alumnos);
                    break;
                case 2: {
                        Alumnos.anadirAlumno(alumnos);
                    }
                    break;
                case 3:{
                        System.out.print("Introduzca el indice del alumno a modificar ");
                        int index = Integer.parseInt(Consola.sc.nextLine());
                        Alumnos.modificarAlumno(alumnos, index-1);
                    }
                    break;
                case 4: {
                        System.out.println("Introduzca el indice del alumno a borrar ");
                        int index = Integer.parseInt(Consola.sc.nextLine());
                        Alumnos.borrarAlumnoporPosicion(alumnos, index-1);
                    }
                    break;
                case 5:{
                        salir = true;
                    }
                    break;
                    default:
                    System.out.println("Opcion no valida: ");
                    break;
            }
        }while (!salir);
        Consola.finalizar();
    }
}
