package EjerciciosTipoParcial.src.clase20211026;

import EjerciciosTipoParcial.src.clase20211026.SeguroSimple;

import java.util.Comparator;

/**
 * The type Comparador nro poliza.
 */
public class ComparadorNroPoliza implements Comparator<SeguroSimple> {
    /**
     * Compare int.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getNroPoliza() - o2.getNroPoliza();
    }
}
