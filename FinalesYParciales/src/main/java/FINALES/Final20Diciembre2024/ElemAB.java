package FINALES.Final20Diciembre2024;

import java.util.List;

public abstract class ElemAB {
    private String nombre;
    private String fechaCreacion;

    public ElemAB(String nombre, String fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public ElemAB() {
    }

    public abstract int calcularTamanio();
    public abstract List<ElemAB> buscar(Filtro ff);
}
