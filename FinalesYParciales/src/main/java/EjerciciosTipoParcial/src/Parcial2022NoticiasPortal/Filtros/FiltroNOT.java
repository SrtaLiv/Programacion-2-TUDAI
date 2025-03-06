package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtros;

import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtro;
import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.NoticiaSimple;

/**
 * The type Filtro not.
 */
public class FiltroNOT extends Filtro {
    /**
     * The F 1.
     */
    Filtro f1;

    /**
     * Instantiates a new Filtro not.
     *
     * @param f1 the f 1
     */
    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }

    /**
     * Cumple boolean.
     *
     * @param not the not
     * @return the boolean
     */
    @Override
    public boolean cumple(NoticiaSimple not) {
        return false;
    }
}
