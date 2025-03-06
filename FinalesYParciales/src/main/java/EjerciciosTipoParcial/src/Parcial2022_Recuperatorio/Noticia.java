package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Noticia extends ElementoAB{
    String contenido;
    String titulo;
    String autor;
    int precio;
    ArrayList<String> palabrasClave;

    public Noticia(String contenido, String titulo, String autor, String categoria, int prec) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
        this.precio = prec;
    }

    public void addPalabrasClave(String s){
        if (!palabrasClave.contains(s)){
            palabrasClave.add(s);
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Gets palabras clave.
     *
     * @return the palabras clave
     */
    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    @Override
    public String getCategoria() {
        return this.categoria;
    }

    /**
     * Copia restringida elemento ab.
     *
     * @param ff the ff
     * @return the elemento ab
     */
    @Override
    public ElementoAB copiaRestringida(Filtro ff) {
        if (ff.cumple(this)) {
            Noticia copia = new Noticia(this.titulo,
                    this.contenido, this.autor, this.getCategoria(), this.precio);
            for (String s: this.palabrasClave){
                copia.addPalabrasClave(s);
            }
            return copia;
        }
        return null;
    }

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

    /**
     * Sets contenido.
     *
     * @param contenido the contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //otros para practicar
    public ArrayList<ElementoAB> buscar(Filtro ff){
        ArrayList<ElementoAB> result = new ArrayList<>();
        if (ff.cumple(this)){
            result.add(this);
        }
        return result;
    }

    @Override
    public Noticia noticiaMenorPrecio() {
        return this;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "contenido='" + contenido + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", palabrasClave=" + palabrasClave +
                '}';
    }
}
