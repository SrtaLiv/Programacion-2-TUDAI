package Ej5_Streaming;

public class FiltroNombre extends Filtro{
    String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getNombre().equalsIgnoreCase(nombre);
    }
}
