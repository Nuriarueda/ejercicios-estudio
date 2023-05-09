package POO;

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

}
