package Ej8_MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoFV {
    String titulo;
    LocalDate fechaC;

    public ElementoFV(String titulo, LocalDate fechaC) {
        this.titulo = titulo;
        this.fechaC = fechaC;
    }

    //PEdidos:
    public abstract boolean buscarPalabra(FiltroPalabra filtro);
    //los agrego aca?

    public abstract ArrayList<Video> buscar(Filtro f, Comparator<ElementoFV> orden);

    public int getCantVideos() {
        return 1; //pq el video es 1
    }

    public abstract int getDuracion();




    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public void setFechaC(LocalDate fechaC) {
        this.fechaC = fechaC;
    }
}
