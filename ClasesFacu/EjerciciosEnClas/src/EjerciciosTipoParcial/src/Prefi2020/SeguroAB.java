package EjerciciosTipoParcial.src.Prefi2020;

import java.util.ArrayList;

public abstract class SeguroAB {
    String dni;

    public abstract int getMonto();
    public abstract int getNroPoliza();
    public abstract int getCosto();
    public abstract ArrayList<SeguroSimple> buscar(Filtro ff);


}
