package EjerciciosTipoParcial.src.Prefinal2020;

import java.util.ArrayList;

/**
 * The type Programador.
 */
public class Programador extends EmpleadoAB {
    ArrayList<String> palabrasClave;

    public Programador(String nombre, String apellido,
                       int edad, EstrategiaSueldo sueldo) {
        super(nombre, apellido, edad, sueldo);
        palabrasClave = new ArrayList<>();
    }


    public void addPalabraClave(String ss){
        if (!palabrasClave.contains(ss))
            palabrasClave.add(ss);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }


    @Override
    public double getSueldo() {
        return sueldo.getSueldo();
    }
}
