package Ej8_MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Grupo extends ElementoFV{
    ArrayList<ElementoFV> elementos;
    public Grupo(String titulo, LocalDate fechaC) {
        super(titulo, fechaC);
        elementos = new ArrayList<>();
    }

    public void addElementos(ElementoFV e){
        elementos.add(e);
    }
    @Override
    public ArrayList<Video> buscar(Filtro f, Comparator<ElementoFV> orden) {
        return null;
    }

    @Override
    public int getDuracion() {
        return 0;
    }

    @Override
    public int getCantVideos() {
        int cant = super.getCantVideos();
        for (int i = 0; i < elementos.size() ; i++){
            cant += elementos.get(i).getCantVideos();
        }
        return cant;    }
}
