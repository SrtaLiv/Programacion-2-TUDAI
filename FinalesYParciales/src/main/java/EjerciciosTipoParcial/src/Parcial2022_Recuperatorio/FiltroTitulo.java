package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

/**
 * The type Filtro titulo.
 */
public class FiltroTitulo extends Filtro{
    /**
     * The Titulo.
     */
    String titulo;

    /**
     * Instantiates a new Filtro titulo.
     *
     * @param titulo the titulo
     */
    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Cumple boolean.
     *
     * @param noticia the noticia
     * @return the boolean
     */
    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().contains(titulo);
    }
}
