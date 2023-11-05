package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;

import java.util.ArrayList;

public class NoticiaSimple extends ElementoAB {
    String contenido;
    String titulo;
    String autor;
    String categoria;
    ArrayList<String> palabrasClave;

    public NoticiaSimple(String contenido, String titulo, String autor,
                         String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
    }

    public void addPalabraClave(String s){ //Control de repetidos y no implemento equals
        if (!palabrasClave.contains(s)){
            palabrasClave.add(s);
        }
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

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
