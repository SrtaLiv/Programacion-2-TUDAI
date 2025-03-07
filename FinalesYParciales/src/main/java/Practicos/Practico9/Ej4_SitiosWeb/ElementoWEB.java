package Practicos.Practico9.Ej4_SitiosWeb;

import java.util.ArrayList;

public abstract class ElementoWEB {
    String titulo;
    String descripcion;
    char imagen;
    ArrayList<Noticia> noticias;

    @Override
    public boolean equals(Object o) {
        ElementoWEB otro = (ElementoWEB) o;
        try{
            return otro.getTitulo().equals(this.getTitulo()) &&
            otro.getDescripcion().equals(this.getDescripcion());
        }
        catch (Exception e){
            return false;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getImagen() {
        return imagen;
    }

    public void setImagen(char imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
