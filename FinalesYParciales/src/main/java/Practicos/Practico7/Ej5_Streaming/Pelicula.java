package Practicos.Practico7.Ej5_Streaming;

public class Pelicula {
    String nombre;
    String genero;
    String director;
    int anioEstreno;
    int duracion;
    int edadMin;

    public Pelicula(String nombre, String genero,
                    String director, int anioEstreno,
                    int duracion, int edadMin) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    @Override
    public String toString() {
        return nombre + "|" + genero + "|" + director + "|" + anioEstreno
                + "|" + duracion + "|" + edadMin;
    }
}
