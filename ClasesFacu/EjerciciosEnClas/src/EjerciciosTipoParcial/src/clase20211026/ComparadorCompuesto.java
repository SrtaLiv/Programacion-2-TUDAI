package EjerciciosTipoParcial.src.clase20211026;

import EjerciciosTipoParcial.src.clase20211026.SeguroSimple;

import java.util.Comparator;

/**
 * The type Comparador compuesto.
 */
public class ComparadorCompuesto implements Comparator<SeguroSimple>{
    /**
     * The C 1.
     */
    Comparator<SeguroSimple> c1, /**
     * The C 2.
     */
    c2;

    public ComparadorCompuesto(Comparator<SeguroSimple> c1, Comparator<SeguroSimple> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    /**
     * Compare int.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        int res = c1.compare(o1,o2);
        if (res == 0)
            return c2.compare(o1,o2);
        return res;
    }
}
