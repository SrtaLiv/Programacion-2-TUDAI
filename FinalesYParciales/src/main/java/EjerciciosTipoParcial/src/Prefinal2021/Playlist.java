package EjerciciosTipoParcial.src.Prefinal2021;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist extends AB{
    ArrayList<AB> elementos;

    public Playlist(ArrayList<AB> elementos) {
        this.elementos = new ArrayList<>();
    }

    public AB copiaRestringida(Condicion cc){
        ArrayList<AB> elemQueCumplen = new ArrayList<>();
        for (AB elem : elementos){
            AB hijos = elem.copiaRestringida(cc);
            if (hijos != null){
                elemQueCumplen.add(hijos);
            }
        }
        if (elemQueCumplen.size()>0){
            Playlist copia = new Playlist(this.elementos);
            for (AB hijos : elemQueCumplen){
                copia.agregarElemento(hijos);
            }
            return copia;
        }
        else return null;
    }

    @Override
    public int cantVideos() {
        return 0;
    }

    @Override
    public ArrayList<Video> buscar(Filtro ff) {
        ArrayList<Video> result = new ArrayList<>();
        for (AB elem : elementos){
            result.addAll(elem.buscar(ff));
        }
        Collections.sort(result);
        return result;
    }

    public void agregarElemento(AB elem){
        elementos.add(elem);
    }
}
