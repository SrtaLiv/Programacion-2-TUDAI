package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The type Elemento ab.
 */
public abstract class ElementoAB {
    /**
     * Gets palabras clave.
     *
     * @return the palabras clave
     */
    abstract ArrayList<String> getPalabrasClave();

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    abstract String getCategoria();

    abstract ArrayList<NoticiaSimple> buscar(Filtro ff);
    public ArrayList<NoticiaSimple> buscar(Filtro ff, Comparator<NoticiaSimple> c1){
        ArrayList<NoticiaSimple> reslt = this.buscar(ff);
        Collections.sort(reslt, c1);
        return reslt;
    }

}
