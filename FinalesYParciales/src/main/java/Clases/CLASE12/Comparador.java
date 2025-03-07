package Clases.CLASE12;

import Practicos.Practico9.SistemasArchivosYo2025.ElemAB;

import java.util.Comparator;

public abstract class Comparador implements Comparator<ElemAB> {
    private Comparator<ElemAB> siguienteCriterio;

    public Comparador(Comparator<ElemAB> siguienteCriterio) {
        this.siguienteCriterio = siguienteCriterio;
    }

    public abstract int comparar(ElemAB o1, ElemAB o2);

    @Override
    public int compare(ElemAB o1, ElemAB o2) {
        int resultado = comparar(o1,o2);
        if (resultado==0 && siguienteCriterio!=null)
            return siguienteCriterio.compare(o1,o2);
        return resultado;
    }
}
