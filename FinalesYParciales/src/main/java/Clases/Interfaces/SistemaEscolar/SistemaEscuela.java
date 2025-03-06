package CLASES.Interfaces.SistemaEscolar;

import java.util.ArrayList;

public class SistemaEscuela {
    ArrayList<Alumno> alumnos;

    public SistemaEscuela() {
        this.alumnos = new ArrayList<>();
    }

    public int cantAprobados(){
        int cant =0;
        for (Alumno alumno : alumnos){
            if (alumno.aprobo()){
                cant++;
            }
        }
        return cant;
    }

    public void addAlumno(Alumno a){
        alumnos.add(a);
    }
}
