package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;

/**
 * The type Clasificador.
 */
public class Clasificador {
    ArrayList<String> palabras;
    Filtro cond;

    /**
     * Instantiates a new Clasificador.
     *
     * @param cond the cond
     */
    public Clasificador(Filtro cond) {
        this.palabras = new ArrayList<>();
        this.cond = cond;
    }

    /**
     * Clasificar.
     *
     * @param not the not
     */
    void clasificar(NoticiaSimple not){
        if (cond.cumple(not)){
            for (String palabra : palabras) {
                not.addPalabraClave(palabra);
            }
        }
    }
}
