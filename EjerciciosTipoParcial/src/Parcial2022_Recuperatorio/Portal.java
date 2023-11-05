package Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Portal {
    ArrayList<Suscriptor> subs;
    ElementoAB categoriaRaiz;

    public void repartirNoticiaASubs(Noticia noticia){
        for (Suscriptor suscriptor: subs){
            suscriptor.recibirNoticia(noticia);
        }
    }
}
