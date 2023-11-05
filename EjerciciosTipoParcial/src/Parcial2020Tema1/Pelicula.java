package Parcial2020Tema1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Pelicula {
    String titulo;
    int puntaje;
    LocalDate fechaLanzamiento;
    int oscars;
    ArrayList<Actor> actors;

    public Pelicula(String titulo, int puntaje, LocalDate fechaLanzamiento, int oscars) {
        this.titulo = titulo;
        this.puntaje = puntaje;
        this.fechaLanzamiento = fechaLanzamiento;
        this.oscars = oscars;
        this.actors = new ArrayList<>();
    }
}
