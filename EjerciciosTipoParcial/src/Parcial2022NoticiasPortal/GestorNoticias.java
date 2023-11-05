package Parcial2022NoticiasPortal;

import java.util.ArrayList;

public class GestorNoticias {
    ArrayList<Clasificador> clasificadores;

    public GestorNoticias() {
        this.clasificadores = new ArrayList<>();
    }

    public void clasificarNoticia(NoticiaSimple noticia){
        for (int i = 0; i< clasificadores.size();i++){
            clasificadores.get(i).clasificar(noticia);
        }
    }

}
