package CLASES.Parcialito4;

public class CondicionAND extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(Pelicula peli) {
        return c1.cumple(peli) && c2.cumple(peli);
    }
}
