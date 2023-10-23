package Ej_Futbol2.v1;

import java.util.Comparator;

public class ComparatorCuotaPaga implements Comparator<Socio>{
    
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return Boolean.valueOf(socio1.isUltimaCuotaPaga()).compareTo(socio2.isUltimaCuotaPaga());
    }
}
