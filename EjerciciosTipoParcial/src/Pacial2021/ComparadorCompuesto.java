package Pacial2021;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Viaje> {
    private Comparator<Viaje> primerCriterio;
    private Comparator<Viaje> segundoCriterio;

    public ComparadorCompuesto(Comparator<Viaje> primerCriterio, Comparator<Viaje> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }


    // id = 4 -> Cancun
    // id = 4 -> Buenos Aires


    // id = 4 -> Buenos Aires
    // id = 4 -> Cancun

    // id = 5 -> Miami
    @Override
    public int compare(Viaje o1, Viaje o2) {
         int res = primerCriterio.compare(o1,o2);  // me devuelve 0 si son iguales, 1 si uno es mayor  o -1 si el otro es mayor
         if(res != 0)
        {
            return res;  // -1 o 1
        }
         else
         {
             int res2 = segundoCriterio.compare(o1,o2);
             return res2;
         }
    }
}
