package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public abstract class TrajeAB {
    private String nombre;

    public TrajeAB(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getTalle();
    public abstract ArrayList<String> getMetales();
    public abstract ArrayList<TrajeAB> buscar(Filtro ff, Miembro miembro);
    public abstract String getNombre();
}
