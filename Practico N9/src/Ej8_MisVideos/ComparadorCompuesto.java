package Ej8_MisVideos;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoFV> {
    Comparator<ElementoFV> criterio1, criterio2;

    public ComparadorCompuesto(Comparator<ElementoFV> comparator1, Comparator<ElementoFV> comparator2) {
        this.criterio1 = comparator1;
        this.criterio2 = comparator2;
    }
    @Override
    public int compare(ElementoFV e1, ElementoFV e2) {
        int dif = criterio1.compare(e1, e2);
        if (dif != 0) {
            return dif;
        } else {
            return criterio2.compare(e1, e2);
        }
    }
}
