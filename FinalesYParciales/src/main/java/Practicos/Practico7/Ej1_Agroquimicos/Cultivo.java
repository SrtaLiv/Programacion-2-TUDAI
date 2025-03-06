package Practicos.Practico7.Ej1_Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    String nombre;
    ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre, ArrayList<Enfermedad> enfermedades) {
        this.nombre = nombre;
        this.enfermedades = enfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }



}
