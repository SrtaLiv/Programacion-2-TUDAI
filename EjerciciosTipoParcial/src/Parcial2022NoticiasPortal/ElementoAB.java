package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoAB {
    abstract ArrayList<String> getPalabrasClave();
    abstract String getCategoria();

    abstract ArrayList<NoticiaSimple> buscar(Filtro ff);

}
