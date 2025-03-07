package Practicos.Practico9.SistemasArchivosYo2025;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElemAB> {
    @Override
    public int compare(ElemAB o1, ElemAB o2) { // comparar si el tamanio es double c:
        return Double.compare(o1.getTamanio(), o2.getTamanio());
    }
}
