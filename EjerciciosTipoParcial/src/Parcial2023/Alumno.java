package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Alumno {
    String nombre;
    String apellido;
    ArrayList<Curso> cursos;
    ArrayList<Curso> cursosRendidos; //Curso, fecha y nota.

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cursos = new ArrayList<>();
        this.cursosRendidos = new ArrayList<>();
    }


    public void agregarCurso(Curso c, LocalDate fecha, int nota){
        cursosRendidos.add(c);
    }


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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Curso> getCursosRendidos() {
        return cursosRendidos;
    }

    public void setCursosRendidos(ArrayList<Curso> cursosRendidos) {
        this.cursosRendidos = cursosRendidos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cursos=" + cursos +
                ", cursosRendidos=" + cursosRendidos +
                '}';
    }
}
