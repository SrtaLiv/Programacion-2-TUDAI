package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtros;

import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtro;
import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.NoticiaSimple;

/**
 * The type Filtro contenido.
 */
public class FiltroContenido extends Filtro {
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
