package Practicos.practico5.Ej2_sombrero;

import java.util.ArrayList;

public class Alumno {
    //agregar cualidades a alumnos
    Casa casa;
    String nombre;
    Familia familia;

    ArrayList<String> cualidades;
    //recorro sus cualidades.., hasta 2

    public Alumno(String nombre, Familia apellido) {
        this.nombre = nombre;
        this.familia = apellido;
        this.cualidades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\nFAMILIA: " + familia + "\n CUALIDADES: " + cualidades;
    }


    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void addCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void agregarFamilia(Familia nuevaFamilia){
        this.familia = nuevaFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }
}
