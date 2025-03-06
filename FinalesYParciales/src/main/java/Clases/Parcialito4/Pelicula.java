package Clases.Parcialito4;

public class Pelicula {
    String titulo;
    String sinopsis;
    String generos;
    String director;
    String actor;
    int anio;
    double duracion;
    int edadMin;


    public Pelicula(String titulo, String sinopsis, String gen, String director,
                    String actor, int anio, double duracion, int edadMin) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = gen;
        this.director = director;
        this.actor = actor;
        this.anio = anio;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }


    @Override
    public String toString() {
        return titulo + "|" + sinopsis + "|"+ generos + "|"+ director + "|"
                + actor + "|"+ anio + "|"+ duracion+ "|" + edadMin;
    }


    public void setGeneros(String generos) {
        this.generos = generos;
    }

    //

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getGeneros() {
        return generos;
    }
}
