package Parcial2023;

public class FiltroHorasCatedra extends Filtro{
    int horaCatedra;

    public FiltroHorasCatedra(int horaCatedra) {
        this.horaCatedra = horaCatedra;
    }

    @Override
    public boolean cumple(ContenidoEducativo cc) {
        return cc.getCantHorasCatedra() == horaCatedra;
    }
}
