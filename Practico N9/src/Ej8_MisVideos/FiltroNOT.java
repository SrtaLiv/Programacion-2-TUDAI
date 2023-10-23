package Ej8_MisVideos;

public class FiltroNOT extends Filtro {
    Filtro f1;
    @Override
    public boolean cumple(Video elem) {
        return !f1.cumple(elem);
    }

}
