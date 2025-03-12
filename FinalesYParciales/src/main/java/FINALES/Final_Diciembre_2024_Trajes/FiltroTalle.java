package FINALES.Final_Diciembre_2024_Trajes;

public class FiltroTalle extends Filtro{
    private int talle;

    @Override
    public boolean cumple(Miembro miembro) {
        return miembro.getAltura() == talle;
    }
}
