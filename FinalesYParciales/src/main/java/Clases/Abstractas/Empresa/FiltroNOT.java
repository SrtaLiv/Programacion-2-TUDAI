package CLASES.Abstractas.Empresa;

public class FiltroNOT extends Filtro{
    Filtro f1;

    @Override
    public boolean cumple(Elemento elem) {
        return !this.f1.cumple(elem);
    }
}
