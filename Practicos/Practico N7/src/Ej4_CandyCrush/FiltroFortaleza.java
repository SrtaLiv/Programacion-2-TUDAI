package Ej4_CandyCrush;

public class FiltroFortaleza extends Filtro{
    int fortaleza;

    public FiltroFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza() > this.fortaleza;
    }
}
