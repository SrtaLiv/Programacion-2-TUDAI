package Parcial2022NoticiasPortal.Filtros;

import Parcial2022NoticiasPortal.NoticiaSimple;

public class FiltroCategoria extends Filtro{
    String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(NoticiaSimple not) {
        return not.getCategoria().contains(categoria);
    }
}
