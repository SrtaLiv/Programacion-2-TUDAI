package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

/**
 * The type Portal.
 */
public class Portal {
    ArrayList<Suscriptor> subs;
    ElementoAB categoriaRaiz;

    public Portal(ElementoAB categoriaRaiz) {
        this.subs = new ArrayList<>();
        this.categoriaRaiz = categoriaRaiz;
    }

    public void repartirNoticiaASubs(Noticia noticia){
        for (Suscriptor suscriptor: subs){
            suscriptor.recibirNoticia(noticia);
        }
    }
}
