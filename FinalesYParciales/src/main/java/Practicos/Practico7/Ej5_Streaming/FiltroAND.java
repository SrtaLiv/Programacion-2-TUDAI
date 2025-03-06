package Practicos.Practico7.Ej5_Streaming;

public class FiltroAND extends Filtro{
    Filtro f1, f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return f1.cumple(p) && f2.cumple(p);
    }
}
