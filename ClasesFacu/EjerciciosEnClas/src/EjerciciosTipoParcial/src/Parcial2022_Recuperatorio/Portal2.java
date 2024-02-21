package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Portal2 {
    ArrayList<Suscriptor2> sucriptores;

    public Portal2() {
        this.sucriptores = new ArrayList<Suscriptor2>();
    }

    public ArrayList<Suscriptor2> getSucriptores() {
        return new ArrayList<>(sucriptores);
    }

    public void entregarNoticia(Noticia noticia){
        for (Suscriptor2 sub : sucriptores){
            sub.recibirNoticia(noticia);
        }
    }
}
