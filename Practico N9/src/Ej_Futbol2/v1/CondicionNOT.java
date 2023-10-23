package Ej_Futbol2.v1;

public class CondicionNOT extends Condicion{
    // Atributos
    private Condicion condicion;

    // Constructor

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    // Comportamiento

    @Override
    public boolean filtrar(Socio socio) {
        return !condicion.filtrar(socio);
    }
}
