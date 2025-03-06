package FINALES.Final20Diciembre2024;

import java.util.ArrayList;
import java.util.List;

public class RecursoCompuesto extends Compuesto {
    private List<ElemAB> recursos;

    public RecursoCompuesto() {
        this.recursos = new ArrayList<>();
    }

    public List<ElemAB> getRecursos() {
        return new ArrayList<>(recursos);
    }

    public void setRecursos(List<ElemAB> recursos) {
        this.recursos = recursos;
    }

    @Override
    public int calcularTamanio() {
        int suma = 0;
        for (ElemAB elem : recursos){
            suma += elem.calcularTamanio();
        }
        return suma;
    }

    @Override
    public List<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> result = new ArrayList<>();
        for (ElemAB recurso : recursos){
            result.addAll(recurso.buscar(ff));
        }
        return List.of();
    }

}
