package Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Noticia extends ElementoAB{
    String contenido;
    String titulo;
    String autor;
    ArrayList<String> palabrasClave;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
    }

    public void addPalabrasClave(String s){
        if (!palabrasClave.contains(s)){
            palabrasClave.add(s);
        }
    }
    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public ElementoAB copiaRestringida(Filtro ff) {
        if (ff.cumple(this)) {
            Noticia copia = new Noticia(this.titulo,
                    this.contenido, this.autor, this.getCategoria());
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

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
