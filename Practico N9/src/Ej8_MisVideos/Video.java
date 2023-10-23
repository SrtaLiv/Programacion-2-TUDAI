package Ej8_MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Video extends ElementoFV{
    Usuario user;
    int visualizacion;
    int duracion;
    int likes;
    int dislikes;
    ArrayList<String> palabrasClave;

    public Video(String titulo, LocalDate fecha, Usuario user, int visualizacion, int duracion, int likes,
                 int dislikes) {
        super(titulo, fecha);
        this.user = new Usuario();
        this.visualizacion = visualizacion;
        this.duracion = duracion;
        this.likes = 0;
        this.dislikes = 0;
        this.palabrasClave = new ArrayList<>();
    }

    public void addPalabraClave(String s){
        palabrasClave.add(s);
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(int visualizacion) {
        this.visualizacion = visualizacion;
    }

    @Override
    /**
     * Retorna una lista con un(1) elemento, si el archivo
     * cumple con la condición o una lista vacía en caso
     * contrario
     */
    public ArrayList<Video> buscar(Filtro f, Comparator<ElementoFV> orden) {
        ArrayList<Video> resultado = new ArrayList<>();
        if (f.cumple(this))
            resultado.add(this);
        return resultado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    @Override
    public String toString() {
        return super.toString()
                +" ("+this.getDuracion()+" segundos)";
    }
}
