package Ej_Futbol2.v1;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Socio> {
    @Override

    public int compare(Socio socio1, Socio socio2) {
        return socio1.getNombre().compareTo(socio2.getNombre());
    }
}
