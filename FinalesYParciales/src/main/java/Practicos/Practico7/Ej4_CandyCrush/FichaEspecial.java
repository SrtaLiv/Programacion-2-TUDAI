package Practicos.Practico7.Ej4_CandyCrush;

public class FichaEspecial extends Ficha{
    public FichaEspecial(String nombreFicha, int fortaleza,
                         int espacioTablero, int poderDestruccion) {
        super(nombreFicha, fortaleza, espacioTablero, poderDestruccion);
    }

    @Override
    public int getPoderDestruccion() {
        return super.getFortaleza()/super.getEspacioTablero();
    }
}
