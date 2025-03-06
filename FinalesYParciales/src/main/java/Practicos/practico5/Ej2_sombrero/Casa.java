package Practicos.practico5.Ej2_sombrero;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    public static final int MAX = 10;
    private String nombre;
    private ArrayList<String> cualidadesRequeridas;
    int capacidad;
    ArrayList<Alumno> alumnos;



    //necesito que cada casa tenga cualidades requeridas..

    public Casa(String nombre) {
        this.nombre = nombre;
        this.cualidadesRequeridas = new ArrayList<>();
    }
}



  /*  public void aceptarAlumno(Alumno alumno){
        if () ){
            System.out.println("El alumno puede pertenecer a " );
        }
    }

    public boolean cualidadesRequeridas(String cualidad){
        if ()
        return true;
    }

}*/
