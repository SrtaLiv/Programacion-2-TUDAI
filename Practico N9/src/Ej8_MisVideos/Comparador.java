package Ej8_MisVideos;

import java.util.Comparator;

public abstract class Comparador implements Comparator<ElementoFV> {
    private Comparator<ElementoFV> siguienteCriterio;

    public Comparador(Comparator<ElementoFV> siguienteCriterio){
        this.siguienteCriterio = siguienteCriterio;
    }
    public abstract int comparar(ElementoFV o1, ElementoFV o2);
    @Override
    public int compare(ElementoFV o1, ElementoFV o2) {
        int dif = comparar(o1, o2);
        if (dif == 0 && siguienteCriterio!=null){
            return siguienteCriterio.compare(o1, o2);
        }
        return dif;
    }
}
