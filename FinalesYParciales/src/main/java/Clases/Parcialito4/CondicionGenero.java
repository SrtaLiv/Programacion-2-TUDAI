package Clases.Parcialito4;

public class CondicionGenero extends Condicion{
    String genero;
    public CondicionGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getGeneros().equalsIgnoreCase(this.genero);
    }
}
