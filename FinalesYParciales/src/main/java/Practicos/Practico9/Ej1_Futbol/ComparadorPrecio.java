package Practicos.Practico9.Ej1_Futbol;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Socio> {

    private int param;

    public ComparadorPrecio(int param){
        this.param = param;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return Double.compare(o1.canchaPrecio(param), o2.canchaPrecio(param));
    }
    
}
