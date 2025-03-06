package FINALES.Final20Diciembre2024;

import java.util.ArrayList;
import java.util.List;

public class Recurso extends Simple {
    private String tematica;

    public Recurso(String nombre, String fechaCreacion, int tamanio, String tematica) {
        super(nombre, fechaCreacion, tamanio); // Llama al constructor de Simple
        this.tematica = tematica; 
    }

    @Override
    public int calcularTamanio() {
        return 0;
    }

    @Override
    public List<ElemAB> buscar(Filtro ff) {
        List<ElemAB> elems = new ArrayList<>();
        if (ff.cumple(this)){
            elems.add(this);
            return elems;
        }
        return List.of();
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
