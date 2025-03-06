package EjerciciosTipoParcial.src.Prefinal2020;

import java.util.ArrayList;

public abstract class EmpleadoAB extends EstrategiaSueldo {
    String nombre;
    String apellido;
    int edad;
    EstrategiaSueldo sueldo;
    public abstract ArrayList<String> getPalabrasClave();

    public EmpleadoAB(String nombre,
                      String apellido, int edad,
                      EstrategiaSueldo sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    @Override
    public abstract double getSueldo();
}
