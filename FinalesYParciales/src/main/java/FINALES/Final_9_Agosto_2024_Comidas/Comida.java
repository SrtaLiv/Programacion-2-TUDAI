package FINALES.Final_9_Agosto_2024_Comidas;

import java.util.ArrayList;
import java.util.Objects;

public class Comida extends ElemAB {
    private int tiempo;
    private int precio;
    private int calorias;
    private ArrayList<String> ingredientes;

    public Comida(String name, int tiempo, int precio, int calorias) {
        super(name);
        this.tiempo = tiempo;
        this.precio = precio;
        this.calorias = calorias;
        this.ingredientes = new ArrayList<>();
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> cumplen = new ArrayList<>();
        if (ff.cumplen(this)) {
            cumplen.add(this);
        }
        return cumplen;
    }

    // me falto:
    public boolean tieneIngrediente(String ss) {
        return ingredientes.contains(ss);
    }

    @Override
    public int getTiempoPreparacion() {
        return this.tiempo;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public ArrayList<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public boolean equals(Object object) {
        ElemAB comida = (Comida) object;
        return tiempo == comida.getTiempoPreparacion() &&
                precio == comida.getPrecio() &&
                calorias == comida.getCalorias() &&
                Objects.equals(ingredientes, comida.getIngredientes());  // Aquí comparas los ingredientes
    }
}
