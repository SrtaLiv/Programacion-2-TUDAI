package Ej2_sombrero;

import java.util.ArrayList;
import java.util.List;

public class Familia {
    ArrayList<Alumno> miembros;
    String apellido;

    //la familia tambie  debe tener casa?
    public Familia(String apellido) {
        this.apellido = apellido;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Alumno alumno) {
        if (alumno != null) {
            this.miembros.add(alumno);
        } else {
            System.out.println("NO HAY MIEMBROS");
        }
    }

    public void mostrarMiembros() {
        if (miembros.isEmpty()){
            System.out.println("NO HAY MIEMBROS EN LA FAMILIA");
        } else for (int i = 0; i < miembros.size();i++){
            System.out.println(miembros.get(i));
        }
    }

//alumno cuente con un familiar que pertenezca en este momento a la misma
//casa
    public void getCasaDeFamilia(){

    }

}
