package Practicos.Practico9.SistemasArchivosYo2025;

public class FiltroAND extends Filtro{

    private Filtro f1, f2;

    @Override
    public boolean cumple(ElemAB elemAB) {
        return f1.cumple(elemAB) && f2.cumple(elemAB);
    }
}
