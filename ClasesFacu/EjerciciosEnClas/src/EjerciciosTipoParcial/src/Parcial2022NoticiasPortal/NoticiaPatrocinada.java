package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;

/**
 * The type Noticia patrocinada.
 */
public class NoticiaPatrocinada extends NoticiaSimple{
    /**
     * Instantiates a new Noticia patrocinada.
     *
     * @param contenido the contenido
     * @param titulo    the titulo
     * @param autor     the autor
     * @param categoria the categoria
     */
    public NoticiaPatrocinada(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria);
    }

    /**
     * Buscar array list.
     *
     * @param ff the ff
     * @return the array list
     */
    public ArrayList<NoticiaSimple> buscar(Filtro ff){
        ArrayList<NoticiaSimple> salida = new ArrayList<NoticiaSimple>();
        salida.add(this);
        return salida;
    }
}
