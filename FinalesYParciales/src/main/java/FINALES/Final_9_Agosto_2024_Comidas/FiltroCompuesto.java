package FINALES.Final_9_Agosto_2024_Comidas;

public class FiltroCompuesto extends Filtro{
    private Filtro f1, f2;
    @Override
    public boolean cumplen(ElemAB elemAB) {
        return f1.cumplen(elemAB) && f2.cumplen(elemAB);
    }
}
