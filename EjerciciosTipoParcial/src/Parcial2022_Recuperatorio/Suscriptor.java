package Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Suscriptor {
    String nombre;
    String apelido;
    String email;
    ArrayList<ElementoAB> noticias; //o NOticia?
    Filtro intereses;

    public void recibirNoticia(Noticia noticia){
        if (intereses.cumple(noticia)){
            this.noticias.add(noticia);
        }
    }

    public void cambiarInteres(Filtro nuevo){
        this.intereses = nuevo;
    }


}
