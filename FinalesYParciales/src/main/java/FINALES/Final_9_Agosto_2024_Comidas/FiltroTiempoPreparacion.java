package FINALES.Final_9_Agosto_2024_Comidas;

public class FiltroTiempoPreparacion extends Filtro{

    private int tiempo;

    @Override
    public boolean cumplen(ElemAB elemAB) {
        return elemAB.getTiempoPreparacion() < tiempo;
    }
}
