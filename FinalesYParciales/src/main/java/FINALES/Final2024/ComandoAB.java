package FINALES.Final2024;

import java.util.ArrayList;

public abstract class ComandoAB {

    public abstract double getGastoBateria();
    public abstract int getCantTiempo();
    public abstract ComandoAB copia(Filtro ff);
    public abstract ArrayList<ComandoAB> buscar(Filtro ff);
    public abstract int getConsumo();
}
