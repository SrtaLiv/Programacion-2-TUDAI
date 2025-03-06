package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Filtro and.
 */
public class FiltroAND extends Filtro{
    private Filtro f1, f2;

    /**
     * Instantiates a new Filtro and.
     *
     * @param f1 the f 1
     * @param f2 the f 2
     */
    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    /**
     * Cumple boolean.
     *
     * @param seguro the seguro
     * @return the boolean
     */
    @Override
    public boolean cumple(SeguroSimple seguro) {
        return f1.cumple(seguro) && f2.cumple(seguro);
    }
}
