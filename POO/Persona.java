package POO;

public class Persona {
    
    @Override
    public int compareTo(Persona P){
        return p.nombre.compareTo(this.nombre);

    }

    @Override
    public boolean equals(Object obj){
        return obj.getClass()==this.getClass() && ((Persona)obj).getDni().equals(this.dni);
    }
}
