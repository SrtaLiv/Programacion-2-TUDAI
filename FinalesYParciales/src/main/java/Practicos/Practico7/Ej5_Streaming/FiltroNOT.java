package Practicos.Practico7.Ej5_Streaming;

public class FiltroNOT extends Filtro {
    Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return !f1.cumple(p);
    }
}
