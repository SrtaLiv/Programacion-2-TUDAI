package Ej1_Futbol;

import java.util.Comparator;

public class ComparadorCancha implements Comparator<Socio> {

    private int param;

    public ComparadorCancha(int param){
        this.param = param;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o1.contarCanchas(param), o2.contarCanchas(param));
    }
    
}
