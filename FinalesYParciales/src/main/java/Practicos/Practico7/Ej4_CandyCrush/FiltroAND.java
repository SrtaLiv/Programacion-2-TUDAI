package Practicos.Practico7.Ej4_CandyCrush;

public class FiltroAND extends Filtro{
    Filtro f1;
    Filtro f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f1.cumple(f) && f2.cumple(f);
    }
}
