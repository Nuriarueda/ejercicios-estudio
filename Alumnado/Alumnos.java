package Alumnado;

import Lectura.Consola;
public class Alumnos {

    private static int numAlumnos(String[] alumnos){
        int cantidad = 0;
        for (int i = 0; i < alumnos.length; i++)
            if (alumnos[i]!=null)
            cantidad++;
        return cantidad;
    }
    
    public static int buscarHuecoenArray (Object[] array){
        for (int i=0; i<array.length; i++ ){
            if (array[i]==null){
                return i;
            }
        }
        return -1;
    }


    public static int anadirAlumno(String[] alumnos, int cantidad) {
        if (cantidad < alumnos.length){
            System.out.print("Introduzca el nombre del alumno: ");
            String nombre = Consola.sc.nextLine();
            int index;
            if ((index=buscarHuecoenArray(alumnos))!=-1)
                alumnos[index]=nombre;
            return index;
        }
        return -1;
    }


    public static int borrarAlumnoporPosicion(String [] alumnos, int index) {
        if (index>=0 && index<alumnos.length && alumnos[index]!=null){
            alumnos[index]=null;
            return index;
        }
        return -1;
    }


    public static int buscarAlumnos(String[] alumnos, String alumno){
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i]!=null && alumnos[i].equals(alumno))
                return i;
        }
        return -1;
    }
    

    public static int borrarAlumnoporNombre(String[] alumnos, String nombre){
        int index = buscarAlumnos(alumnos, nombre);
        return borrarAlumnoporPosicion(alumnos, index);
    }


    public static String modificarAlumno (String[]alumnos, int cantidad, int index) {

    }
}
