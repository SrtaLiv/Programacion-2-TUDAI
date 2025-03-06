package FINALES.Final20Diciembre2024;

import java.util.List;

public class Simple extends ElemAB{

    private int tamanio;

    public Simple(String nombre, String fechaCreacion, int tamanio) {
        super(nombre, fechaCreacion); // Llama al constructor de ElemAB
        this.tamanio = tamanio;
    }

    public Simple(int tamanio) {
        this.tamanio = tamanio;
    }

    public Simple(String nombre, String fecha) {
    }

    @Override
    public int calcularTamanio() {
        return tamanio; // Devuelve el tamaño propio
    }

    @Override
    public List<ElemAB> buscar(Filtro ff) {
        return List.of();
    }
}
