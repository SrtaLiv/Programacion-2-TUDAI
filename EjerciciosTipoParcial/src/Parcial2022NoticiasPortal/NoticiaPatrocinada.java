package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;

import java.util.ArrayList;

public class NoticiaPatrocinada extends NoticiaSimple{
    public NoticiaPatrocinada(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria);
    }

    public ArrayList<NoticiaSimple> buscar(Filtro ff){
        ArrayList<NoticiaSimple> salida = new ArrayList<NoticiaSimple>();
        salida.add(this);
        return salida;
    }
}
