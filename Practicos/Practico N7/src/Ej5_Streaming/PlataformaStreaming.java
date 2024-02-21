package Ej5_Streaming;

import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<Pelicula> catalogo;

    public PlataformaStreaming() {
        this.catalogo = new ArrayList<>();
    }

    public void addPelicula(Pelicula p){
        catalogo.add(p);
    }

    public ArrayList<Pelicula> buscar(Filtro f){
        ArrayList<Pelicula> encontradas = new ArrayList<>();
        for (int i = 0; i < catalogo.size() ; i++){
            if (f.cumple(catalogo.get(i))){
                encontradas.add(catalogo.get(i));
            }
        }
        return encontradas;
    }
}


