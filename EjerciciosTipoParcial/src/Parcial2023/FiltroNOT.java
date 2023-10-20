package Parcial2023;

public class FiltroNOT extends Filtro{
    Filtro f1;
    @Override
    public boolean cumple(ContenidoEducativo cc) {
        return !f1.cumple(cc);
    }
}
