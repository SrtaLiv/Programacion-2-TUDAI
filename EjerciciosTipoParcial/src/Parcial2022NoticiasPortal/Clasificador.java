package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;

import java.util.ArrayList;

public class Clasificador {
    ArrayList<String> palabras;
    Filtro cond;

    public Clasificador(Filtro cond) {
        this.palabras = new ArrayList<>();
        this.cond = cond;
    }

    void clasificar(NoticiaSimple not){
        if (cond.cumple(not)){
            for (int i=0; i<palabras.size();i++){
                not.addPalabraClave(palabras.get(i));
            }
        }
    }
}
