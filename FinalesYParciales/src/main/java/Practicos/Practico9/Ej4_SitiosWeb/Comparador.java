package Practicos.Practico9.Ej4_SitiosWeb;

import java.util.Comparator;

public abstract class Comparador implements Comparator<ElementoWEB> {
    private Comparator<ElementoWEB> siguienteCriterio;

    public Comparador(Comparator<ElementoWEB> siguienteCriterio) {
        this.siguienteCriterio = siguienteCriterio;
    }

    public abstract int comparar(ElementoWEB o1, ElementoWEB o2);

    @Override
    public int compare(ElementoWEB o1, ElementoWEB o2) {
        int resultado = comparar(o1,o2);
        if (resultado==0 && siguienteCriterio!=null)
            return siguienteCriterio.compare(o1,o2);
        return resultado;
    }

}
