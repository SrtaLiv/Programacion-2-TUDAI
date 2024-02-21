package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.NoticiaSimple;

/**
 * The type Filtro.
 */
public abstract class Filtro {
    /**
     * Cumple boolean.
     *
     * @param not the not
     * @return the boolean
     */
    public abstract boolean cumple(NoticiaSimple not);
}
