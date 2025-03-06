package Practicos.Practico9.SistemasArchivosYo2025;

public class FiltroNombre extends Filtro{

    private String nombre;

    @Override
    public boolean cumple(ElemAB elemAB) {
        return elemAB.getNomrbe().contains(nombre);
    }
}
