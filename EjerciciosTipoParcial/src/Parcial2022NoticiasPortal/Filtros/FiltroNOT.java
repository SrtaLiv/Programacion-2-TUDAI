package Parcial2022NoticiasPortal.Filtros;

import Parcial2022NoticiasPortal.NoticiaSimple;

public class FiltroNOT extends Filtro {
    Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(NoticiaSimple not) {
        return false;
    }
}
