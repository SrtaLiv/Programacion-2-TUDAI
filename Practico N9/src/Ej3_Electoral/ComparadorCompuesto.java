package Ej3_Electoral;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Candidato> {
    private Comparator<Candidato> primerCriterio;
    private Comparator<Candidato> segundoCriterio;

    public ComparadorCompuesto(Comparator<Candidato> primerCriterio, Comparator<Candidato> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }

    @Override
    public int compare(Candidato o1, Candidato o2) {
        int res = primerCriterio.compare(o1, o2);
        if (res != 0) {
            return res;  // -1 o 1
        } else {
            int res2 = segundoCriterio.compare(o1, o2);
            return res2;
        }
    }
}