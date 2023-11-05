package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;
import Parcial2022NoticiasPortal.Filtros.FiltroCategoria;

public class Main {
    public static void main(String[] args) {
        GestorNoticias gestorNoticias = new GestorNoticias();
        Filtro categoria = new FiltroCategoria("A");

        Clasificador clasificador = new Clasificador(categoria);

        NoticiaSimple noticia = new NoticiaSimple("a", "Culo1", "S", "A");
        NoticiaSimple noticia2 = new NoticiaSimple("a", "Culo2", "S", "B");

        noticia.addPalabraClave("Buenas");
        noticia.addPalabraClave("Buenas2");
        noticia.addPalabraClave("Buenas");

        gestorNoticias.clasificadores.add(clasificador);


    }
}
