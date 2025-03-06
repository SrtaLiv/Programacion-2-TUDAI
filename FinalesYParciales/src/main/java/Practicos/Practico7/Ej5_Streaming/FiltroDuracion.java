package Practicos.Practico7.Ej5_Streaming;

public class FiltroDuracion extends Filtro{
    int duracion;

    public FiltroDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDuracion() == duracion;
    }
}
