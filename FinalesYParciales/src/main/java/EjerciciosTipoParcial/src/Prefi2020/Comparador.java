package EjerciciosTipoParcial.src.Prefi2020;

import java.util.Comparator;

public class Comparador implements Comparator<SeguroSimple> {

    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getMonto() - o2.getMonto();
    }
}
