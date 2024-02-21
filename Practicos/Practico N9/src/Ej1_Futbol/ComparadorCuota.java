package Ej1_Futbol;

import java.util.Comparator;

public class ComparadorCuota implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return -Integer.compare(o1.obtenerCuota(), o2.obtenerCuota());
    }
    
}
