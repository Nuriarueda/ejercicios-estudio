

public class Abecedario {
    
    public static void main (String[] args){

        char letras;
        char c = 90;
        String espacios = "";
        for (int i = 0; i <= 25; i++){
            System.out.print(espacios);
            for (letras = c; letras >= 65; letras--){
                System.out.print(letras + " ");
            }
            c-=1;
            System.out.println();
        }
    }
}
