package Ej1_Futbol;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {

    private Comparator<Socio> primerCriterio;
    private Comparator<Socio> segundoCriterio;

    public ComparadorCompuesto(Comparator<Socio> primerCriterio, Comparator<Socio> segundoCriterio){
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int res = this.primerCriterio.compare(o1, o2);
        if(res != 0){
            return res;
        } else{
            return this.segundoCriterio.compare(o1, o2);
        }
    }
}