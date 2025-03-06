package CLASES.Interfaces.SistemaEscolar;

import java.util.ArrayList;

public class Alumno implements Aprobable{
    String dni;
    String apellido;
    String nombre;
    ArrayList<Examen> examen;

    public Alumno(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examen = new ArrayList<>();
    }

    public void addExamen(Examen e){
        this.examen.add(e);
    }

    @Override
    public boolean aprobo() {
        int i=0;
        while ( i < examen.size() && examen.get(i).aprobo() ){
            i++;
        }
        return i == examen.size(); //Si llego al final de la lista
        //si la i del ciclo llego al final es pq corto por llegar al tamanio
    }

    public String toString(){
        return nombre + "," + apellido + ", " + dni;
    }
}
