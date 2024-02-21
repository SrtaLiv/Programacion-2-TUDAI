package CLASES.CLASE12;

public class FiltroNombre extends Filtro{
    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Archivo dado) {
        return dado.getNombre().contains(nombre);
    }
}
