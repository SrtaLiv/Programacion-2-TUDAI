package FINALES.FinalDiciembre2024_Cursos;

import java.util.ArrayList;

public abstract class ElemAB {
    private String nombre;

    public ElemAB(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPrecio();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<String> getDocentesACargo();
    public abstract int getCantHoras();
    public abstract int getCantCursos();
    public abstract ElemAB getCopia(Filtro ff);
    public abstract Curso cursoMasCaro();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
