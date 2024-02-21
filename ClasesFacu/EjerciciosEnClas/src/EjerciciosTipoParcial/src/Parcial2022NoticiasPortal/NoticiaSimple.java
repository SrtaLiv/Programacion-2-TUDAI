package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;

/**
 * The type Noticia simple.
 */
public class NoticiaSimple extends ElementoAB {
    /**
     * The Contenido.
     */
    String contenido;
    /**
     * The Titulo.
     */
    String titulo;
    /**
     * The Autor.
     */
    String autor;
    /**
     * The Categoria.
     */
    String categoria;
    /**
     * The Palabras clave.
     */
    ArrayList<String> palabrasClave;

    /**
     * Instantiates a new Noticia simple.
     *
     * @param contenido the contenido
     * @param titulo    the titulo
     * @param autor     the autor
     * @param categoria the categoria
     */
    public NoticiaSimple(String contenido, String titulo, String autor,
                         String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
    }

    /**
     * Add palabra clave.
     *
     * @param s the s
     */
    public void addPalabraClave(String s){ //Control de repetidos y no implemento equals
        if (!palabrasClave.contains(s)){
            palabrasClave.add(s);
        }
    }

    /**
     * Gets contenido.
     *
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Gets titulo.
     *
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Gets autor.
     *
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }


    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    ArrayList<NoticiaSimple> buscar(Filtro ff) {
        ArrayList<NoticiaSimple> salida = new ArrayList<NoticiaSimple>();
        if (ff.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    /**
     * Sets autor.
     *
     * @param autor the autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Sets categoria.
     *
     * @param categoria the categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Sets contenido.
     *
     * @param contenido the contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
