package Practicos.Practico9.Ej8_MisVideos;

public class FiltroAND extends Filtro{
    Filtro f1, f2;


    @Override
    public boolean cumple(Video elem) {
        return f1.cumple(elem) && f2.cumple(elem);
    }
}
