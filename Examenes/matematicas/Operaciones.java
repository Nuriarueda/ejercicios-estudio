package Examenes.matematicas;

public class Operaciones {
    public static int suma(int a,int b){
        return a+b;
    }

    public static int resta(int a ,int b){
        return suma(a,-b);
    }

    public static int dec(int a){
        return resta(a, 1);
    }

    public static int inc(int a){
        return suma(a, 1);
    }

    public static boolean esMayor(int a, int b){
        return resta(a, b) >0;
    }

    public static boolean esMenor(int a, int b){
        return 0 > resta(a, b);
    }

    public static boolean esIgual(int a,int b){
        return !esMayor(a,b) && !esMenor(a, b);
    }

    public static int multiplica(int a, int b){
        if(esIgual(a, 0)||esIgual(b, 0))
            return 0;
        int auxA = a;
        int auxB = b;
        if(esMenor(a, 0))
            auxA =-a;
        if(esMenor(b, 0))
            auxB =-b;
        for(int i = 1 ;esMenor(i, auxB)&&!esIgual(i, auxB);i=inc(i)){
            auxA= suma(auxA, a);
        }
        return ((esMenor(a,0)&&esMayor(b,0))||(esMenor(b, 0)&&esMayor(a, 0)))?-auxA:auxA;
    } 

    public static int divide(int a, int b)throws ArithmeticException{
        if(esIgual(b, 0))
            throw new ArithmeticException();
        int auxA = a;
        int auxB = b;
        if(esMenor(a, 0))
            auxA =-a;
        if(esMenor(b, 0))
            auxB =-b;
        int cociente =0;
        while(esMayor(auxA, auxB)||esIgual(auxA, auxB)){
            auxA = resta(auxA, auxB);
            cociente= inc(cociente);
        }
        return ((esMenor(a,0)&&esMayor(b,0))||(esMenor(b, 0)&&esMayor(a, 0)))?-cociente:cociente;
    }

    public static int resto(int a, int b)throws ArithmeticException{
        if(esIgual(b, 0))
            throw new ArithmeticException();
        int cociente = divide(a, b);
        int resto = resta(a,multiplica(cociente, b));
        return resto;
    }

    public static int potencia(int a , int b){
        int resultado =1;
        for(int i = 0 ; esMenor(i, b);i= inc(i)){
            resultado= multiplica(resultado, a);
        }
        return resultado;
    } 

    public static int cuadrado(int a){
        return potencia(a, 2);
    }

    public static int cubo(int a){
        return potencia(a, 3);
    }

    public static boolean esMultiplo(int a , int b){
        if(esMayor(b, a)){
            return false;
        }
        if(esIgual(resto(a, b),0)){
            return true;
        }
        return false;
    }

    public static boolean esDivisor(int a ,int b){
        return esMultiplo(b, a);
    }

    public static boolean esPrimo(int a){
        if(esMenor(a, 2))
         return false;
         int i = 2;
        int mitad = divide(a, 2);
        while(esMenor(i,mitad)||esIgual(i, mitad)){
            if(esDivisor(i, a))
                return false;
            i=inc(i);
        }
        return true;
    }
    
    public static boolean esCuadradoPerfecto(int a){
        if(esIgual(a, 1))
        return true;
        int i = 2;
        int mitad = divide(a, 2);
        while(esMenor(i,mitad)||esIgual(i, mitad)){
            if(esIgual(multiplica(i,i), a))
                return true;
            i=inc(i);
        }
        return false;
    }
}
