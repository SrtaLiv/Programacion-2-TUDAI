package FINALES.Final1Diciembre2024;

import FINALES.Final_9_Agosto_2024_Comidas.ElemAB;

import java.util.ArrayList;

public abstract class TrajeAB {
    private String nombre;

    public TrajeAB(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getTalle();
    public abstract ArrayList<String> getMetales();
    public abstract ArrayList<TrajeAB> buscar(Filtro ff, Miembro miembro);
    public abstract TrajeAB copia(Traje traje, Modificador modificador);
}
