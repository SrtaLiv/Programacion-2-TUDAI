package Parcial2023;

public class FiltroAND extends Filtro{
    Filtro f1, f2;
    @Override
    public boolean cumple(ContenidoEducativo cc) {
        return f1.cumple(cc) && f2.cumple(cc);
    }
}
