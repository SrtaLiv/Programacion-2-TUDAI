package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtros;

import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.Filtro;
import EjerciciosTipoParcial.src.Parcial2022NoticiasPortal.NoticiaSimple;

/**
 * The type Filtro categoria.
 */
public class FiltroCategoria extends Filtro {
    /**
     * The Categoria.
     */
    String categoria;

    /**
     * Instantiates a new Filtro categoria.
     *
     * @param categoria the categoria
     */
    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Cumple boolean.
     *
     * @param not the not
     * @return the boolean
     */
    @Override
    public boolean cumple(NoticiaSimple not) {
        return not.getCategoria().contains(categoria);
    }
}
