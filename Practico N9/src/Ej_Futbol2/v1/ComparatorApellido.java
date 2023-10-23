package Ej_Futbol2.v1;

import java.util.Comparator;

public class ComparatorApellido implements Comparator<Socio>{
    
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getApellido().compareTo(socio2.getApellido());
    }
}
