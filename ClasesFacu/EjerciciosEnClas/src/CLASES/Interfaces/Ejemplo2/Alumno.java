package CLASES.Interfaces.Ejemplo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona implements ElementoComparable {
    int legajo;
    ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, LocalDate nacimiento, int id,
                  int legajo) {
        super(nombre, nacimiento, id);
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }


    @Override
    public boolean esMayor(ElementoComparable elemento) {
        return elemento.esMayor(elemento);
    }
}
