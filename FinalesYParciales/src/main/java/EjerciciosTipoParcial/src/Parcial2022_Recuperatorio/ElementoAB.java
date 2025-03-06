package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

/**
 * The type Elemento ab.
 */
public abstract class ElementoAB implements Comparable<ElementoAB> {
    /**
     * The Categoria.
     */
    String categoria;

    public abstract ArrayList<String> getPalabrasClave();

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    public abstract String getCategoria();

    /**
     * Copia restringida elemento ab.
     *
     * @param ff the ff
     * @return the elemento ab
     */
    public abstract ElementoAB copiaRestringida(Filtro ff);

    /**
     * Compare to int.
     *
     * @param nuevo the nuevo
     * @return the int
     */
    @Override
    public int compareTo(ElementoAB nuevo){
        return this.getCategoria().compareTo(nuevo.getCategoria());
    }

    //////////////otros por las dudas////////////////
    abstract ArrayList<ElementoAB> buscar(Filtro ff);
    public abstract Noticia noticiaMenorPrecio();
}
