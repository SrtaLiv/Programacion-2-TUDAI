package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

/**
 * The type Noticia privada.
 */
public class NoticiaPrivada extends Noticia{
    public NoticiaPrivada(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria, 100);
    }

    @Override
    public ElementoAB copiaRestringida(Filtro ff) {
        return null;
    }
}
