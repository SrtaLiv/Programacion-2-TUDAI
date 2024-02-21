package CLASES.Abstractas.Empresa;

public class FiltroAND extends Filtro{
    Filtro f1;
    Filtro f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Elemento elem) {
        return f1.cumple(elem)&&f2.cumple(elem);
    }
}
