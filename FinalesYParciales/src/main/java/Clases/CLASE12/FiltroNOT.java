package Clases.CLASE12;

public class FiltroNOT extends Filtro{
    Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Archivo dado) {
        return !f1.cumple(dado);
    }
}
