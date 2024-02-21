package Ej4_CandyCrush;

public class FiltroNOT extends Filtro{
    Filtro f1;

    @Override
    public boolean cumple(Ficha f) {
        return !f1.cumple(f);
    }
}
