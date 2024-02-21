package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class Suscriptor2 {
    String nombre;
    String apellido;
    String email;
    ArrayList<Noticia> noticias;
    Filtro ff;

    public Suscriptor2(String nombre, String apellido,
                       String email, Filtro ff) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.noticias = new ArrayList<>();
        this.ff = ff;
    }

    public void cambiarInteres(Filtro interes){
        this.ff = interes;
    }

    public void recibirNoticia(Noticia not){
        if (ff.cumple(not))
            this.noticias.add(not);
    }

}
