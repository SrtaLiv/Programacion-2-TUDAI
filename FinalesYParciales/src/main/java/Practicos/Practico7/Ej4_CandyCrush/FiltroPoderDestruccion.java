package Practicos.Practico7.Ej4_CandyCrush;

public class FiltroPoderDestruccion extends Filtro{
    int poder;

    public FiltroPoderDestruccion(int poder) {
        this.poder = poder;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDestruccion() > this.poder;
    }
}
