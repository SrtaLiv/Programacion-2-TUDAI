package Practicos.Practico9.Ej1_Futbol;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
    
}
