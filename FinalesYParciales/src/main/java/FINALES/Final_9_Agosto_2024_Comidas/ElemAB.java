package FINALES.Final_9_Agosto_2024_Comidas;

import Clases.Abstractas.SistemaArchivos.ElementoSA;
import EjerciciosTipoParcial.src.Prefi2023.Objeto;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ElemAB {
    private String name;

    public ElemAB(String name) {
        this.name = name;
    }

    public abstract ArrayList<ElemAB> buscar(Filtro ff);
    public abstract int getTiempoPreparacion();
    public abstract int getCalorias();
    public abstract ArrayList<String> getIngredientes();
    public abstract double getPrecio();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        ElemAB otro = (ElemAB) o;
        try{
            return otro.getName().equals(this.getName());
        }
        catch (Exception e){
            return false;
        }
    }

}
