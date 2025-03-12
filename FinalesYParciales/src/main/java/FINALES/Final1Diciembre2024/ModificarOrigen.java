package FINALES.Final1Diciembre2024;

public class ModificarOrigen extends Modificador{

    private String origen;

    public ModificarOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public TrajeAB modificar(Traje elemAB) {
        elemAB.setPlanetaOrigen(origen);
        return elemAB;
    }
}
