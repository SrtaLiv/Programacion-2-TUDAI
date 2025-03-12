package FINALES.Final_Diciembre_2024_Trajes;

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
    public abstract TrajeAB copia(Modificador modificador);
}
