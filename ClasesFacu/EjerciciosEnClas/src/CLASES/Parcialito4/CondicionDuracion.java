package CLASES.Parcialito4;

public class CondicionDuracion extends Condicion{
    int duracion;

    public CondicionDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula peli) { //pelis q al menos duren x minutos
        return peli.getDuracion() <= duracion;
    }
}
