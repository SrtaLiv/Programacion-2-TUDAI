package Ej_Futbol2.v1;

import java.util.Comparator;

public class ComparatorCompuesto implements Comparator<Socio> {

    // Atributos
    Comparator<Socio> criterio1;
    Comparator<Socio> criterio2;

    // Constructor

    public ComparatorCompuesto(Comparator<Socio> comparator1, Comparator<Socio> comparator2) {
        this.criterio1 = comparator1;
        this.criterio2 = comparator2;
    }

    // Comportamienmto

    @Override
    public int compare(Socio socio1, Socio socio2) {
        int resultadoCriterio = criterio1.compare(socio1, socio2);
        if ( resultadoCriterio != 0) {
            return resultadoCriterio;
        } else {
            return criterio2.compare(socio1, socio2);
        }
    }
}