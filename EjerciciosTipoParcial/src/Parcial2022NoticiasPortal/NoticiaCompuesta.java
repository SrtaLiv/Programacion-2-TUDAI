package Parcial2022NoticiasPortal;

import Parcial2022NoticiasPortal.Filtros.Filtro;
import Parcial2022_Recuperatorio.Noticia;

import java.util.ArrayList;

public class NoticiaCompuesta extends ElementoAB{
    private ArrayList<ElementoAB> elementos;
    private int posicion;
    private static String defecto;
    private ArrayList<Clasificador> clasif;

    public NoticiaCompuesta(int posicion) {
        this.elementos = new ArrayList<>();
        this.posicion = posicion;
        this.clasif = new ArrayList<>();
    }

    public void clasificarNoticia(NoticiaSimple noticia){
        for (int i = 0; i<clasif.size();i++){
            clasif.get(i).clasificar(noticia);
        }
    }

    @Override
    /* la unión de todas las palabras claves
     de los elementos que contiene, sin incluir
     palabras repetidas */
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (int i = 0 ; i < elementos.size() ; i++){
            ArrayList<String> aux = elementos.get(i).getPalabrasClave();
            for (int j = 0; j < aux.size() ; j++ ){
                if (!resultado.contains(aux.get(i))){
                    resultado.add(aux.get(i));
                }
            }
        }
        return resultado;
    }


    @Override
    public String getCategoria() {
        if (posicion < elementos.size()){
            return elementos.get(posicion).getCategoria();
        }
        return defecto;
    }

    @Override
    public ArrayList<NoticiaSimple> buscar(Filtro ff) {
        ArrayList<NoticiaSimple> salida = new ArrayList<NoticiaSimple>();
        for (int i = 0; i < elementos.size();i++){
            salida.addAll(elementos.get(i).buscar(ff));
        }
        return salida;
    }
}
