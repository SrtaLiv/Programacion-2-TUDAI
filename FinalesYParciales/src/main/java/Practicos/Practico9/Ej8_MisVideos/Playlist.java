package Practicos.Practico9.Ej8_MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Playlist extends ElementoFV{
    ArrayList<ElementoFV> elementos;

    public Playlist(String titulo, LocalDate fecha) {
        super(titulo, fecha);
        this.elementos = new ArrayList<>();
    }

    @Override
    public boolean buscarPalabra(FiltroPalabra filtro) {
        return false;
    }

    public void addElemento(ElementoFV v){
        elementos.add(v);
    }

    @Override
    public ArrayList<Video> buscar(Filtro f, Comparator<ElementoFV> orden) {
        ArrayList<Video> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++){
            ElementoFV hijo = elementos.get(i);
            resultado.addAll(hijo.buscar(f, orden));
        }
        if (orden!=null){
            Collections.sort(resultado, orden);
        }/* else
            Collections.sort(resultado);*/
        return resultado;
    }

    @Override
    public int getCantVideos() {
        int cant = super.getCantVideos();
        for (int i = 0; i < elementos.size() ; i++) {
            cant += elementos.get(i).getCantVideos();
        }
        return cant;
    }

    @Override
    public int getDuracion() {
        return 0;
    }


}
