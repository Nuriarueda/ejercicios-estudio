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
        System.out.printf("Total alumnos: " + cantidad);

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
                case 2:



            }
        }while (!salir);

        Consola.finalizar();
    }
}
