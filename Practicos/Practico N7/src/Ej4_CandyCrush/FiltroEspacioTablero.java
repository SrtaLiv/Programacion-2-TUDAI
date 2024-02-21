package Ej4_CandyCrush;

public class FiltroEspacioTablero extends Filtro{
    int espacio;

    public FiltroEspacioTablero(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacioTablero() > this.espacio;
    }
}
