package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;

/**
 * The type Gestor noticias.
 */
public class GestorNoticias {
    /**
     * The Clasificadores.
     */
    ArrayList<Clasificador> clasificadores;

    /**
     * Instantiates a new Gestor noticias.
     */
    public GestorNoticias() {
        this.clasificadores = new ArrayList<>();
    }

    /**
     * Clasificar noticia.
     *
     * @param noticia the noticia
     */
    public void clasificarNoticia(NoticiaSimple noticia){
        for (int i = 0; i< clasificadores.size();i++){
            clasificadores.get(i).clasificar(noticia);
        }
    }

}
