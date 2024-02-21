package CLASES.Parcialito4;

public class CondicionDirector extends Condicion{

    private String director;

    public CondicionDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getDirector().equalsIgnoreCase(this.director);
    }
}
