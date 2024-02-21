package CLASES.Parcialito4;

public class CondicionActor extends Condicion{
    private String actor;

    public CondicionActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getActor().equalsIgnoreCase(this.actor);
    }
}
