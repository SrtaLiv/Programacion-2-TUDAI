package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Alumno {
    String nombre;
    String apellido;
    ArrayList<ContenidoEducativo> contenidoEducativos;
    ArrayList<ContenidoEducativo> cursosRendidos; //Curso, fecha y nota.
    boolean aprobado;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contenidoEducativos = new ArrayList<>();
        this.cursosRendidos = new ArrayList<>();
    }


    public void agregarCursoRendido(ContenidoEducativo c, LocalDate fecha, int nota){
       cursosRendidos.add(c);
    }


    //un alumno esta aprobado si aprobo TODOS los cursos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cursos=" + contenidoEducativos +
                ", cursosRendidos=" + cursosRendidos +
                '}';
    }

    public ArrayList<ContenidoEducativo> getContenidoEducativos() {
        return contenidoEducativos;
    }

    public ArrayList<ContenidoEducativo> getCursosRendidos() {
        return cursosRendidos;
    }

    public void setContenidoEducativos(ArrayList<ContenidoEducativo> contenidoEducativos) {
        this.contenidoEducativos = contenidoEducativos;
    }
}
