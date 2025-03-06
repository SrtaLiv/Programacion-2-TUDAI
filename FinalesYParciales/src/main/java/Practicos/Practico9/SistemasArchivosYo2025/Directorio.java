package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends ElemAB{
    private List<ElemAB> elems;

    public Directorio(String name, LocalDate fecha) {
        super(name, fecha);
        this.elems = new ArrayList<>();
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        return null;
    }

    @Override
    public int getTamanio() {
        int suma = 0;
        for (ElemAB elem : elems){
            suma += elem.getTamanio();
        }
        return suma;
    }

    public List<ElemAB> getElems() {
        return new ArrayList<>(elems);
    }

    public void setElems(List<ElemAB> elems) {
        this.elems = elems;
    }
}
