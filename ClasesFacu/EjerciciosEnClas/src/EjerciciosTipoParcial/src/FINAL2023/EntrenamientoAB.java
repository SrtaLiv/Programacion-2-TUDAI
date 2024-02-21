package EjerciciosTipoParcial.src.FINAL2023;

import java.util.ArrayList;

public abstract class EntrenamientoAB {
    abstract int getDuracion();
    abstract String getActividad();
    abstract ArrayList<EntrenamientoAB> buscar(Filtro ff);
    abstract int getCosto();


}
