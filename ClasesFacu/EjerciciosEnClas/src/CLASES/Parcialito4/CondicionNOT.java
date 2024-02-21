package CLASES.Parcialito4;

public class CondicionNOT extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return !(c1.cumple(peli));
    }
}
