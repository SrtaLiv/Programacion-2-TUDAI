package EjerciciosTipoParcial.src.Prefinal2020;

import java.util.ArrayList;

/**
 * The type Empleado.
 */
public class Empleado extends EmpleadoAB{
    int antiguedad;
    ArrayList<EmpleadoAB> elementos;
    SueldoFijo sueldo;

    public Empleado(String nombre, String apellido, int edad,
                    SueldoFijo sueldo, int antiguedad) {
        super(nombre, apellido, edad, sueldo);
        this.antiguedad = antiguedad;
        elementos = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> result = new ArrayList<>();
        for (EmpleadoAB elem : elementos){
            ArrayList<String> aux = new ArrayList<>(elem.getPalabrasClave());
            for (String a : aux)
            if (!result.contains(a)){
                result.add(a);
            }
        }
        return result;
    }

    @Override
    public double getSueldo() {
        double suma = this.sueldo.getSueldo();
        for (EmpleadoAB emp : elementos){
            suma += emp.getSueldo();
        }
        return 0;
    }
}
