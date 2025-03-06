package Practicos.Practico7.Ej5_Streaming;

public class FiltroGenero extends Filtro{
    String genero;

    public FiltroGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public boolean cumple(Pelicula p) {
        return p.getGenero().equalsIgnoreCase(genero);
    }
}
