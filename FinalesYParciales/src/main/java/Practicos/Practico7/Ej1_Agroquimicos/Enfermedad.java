package Practicos.Practico7.Ej1_Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {

    String nombre;
    ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre, ArrayList<String> estadosPatologicos) {
        this.nombre = nombre;
        this.estadosPatologicos = estadosPatologicos;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

    public void setEstadosPatologicos(ArrayList<String> estadosPatologicos) {
        this.estadosPatologicos = estadosPatologicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
