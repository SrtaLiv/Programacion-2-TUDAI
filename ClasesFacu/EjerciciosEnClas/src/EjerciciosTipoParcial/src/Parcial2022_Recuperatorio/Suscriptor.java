package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

/**
 * The type Suscriptor.
 */
public class Suscriptor {
    String nombre;
    String apelido;
    String email;
    ArrayList<ElementoAB> noticias;
    Filtro intereses;

    public Suscriptor(String nombre, String apelido, String email, ArrayList<ElementoAB> noticias, Filtro intereses) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.email = email;
        this.noticias = noticias;
        this.intereses = intereses;
    }

    /**
     * Recibir noticia.
     *
     * @param noticia the noticia
     */

    public void recibirNoticia(Noticia noticia){
        if (intereses.cumple(noticia)){
            this.noticias.add(noticia);
        }
    }

    public void cambiarInteres(Filtro nuevo){
        this.intereses = nuevo;
    }

  /*  public void agregarInteres(Filtro nuevo){
        Filtro and = new FiltroAnd(this.intereses, nuevo);
    }

*/


}
