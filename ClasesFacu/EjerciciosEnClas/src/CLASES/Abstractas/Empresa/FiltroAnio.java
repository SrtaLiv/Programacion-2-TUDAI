package CLASES.Abstractas.Empresa;

public class FiltroAnio extends Filtro{
    int anio;

    public FiltroAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Elemento elem) {
        return elem.getAnioFabricacion() == this.anio;
    }
}
