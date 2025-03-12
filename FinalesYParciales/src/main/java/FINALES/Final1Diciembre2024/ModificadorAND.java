package FINALES.Final1Diciembre2024;

public class ModificadorAND extends Modificador{
    private Modificador m1, m2;

    public ModificadorAND(Modificador m1, Modificador m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public TrajeAB modificar(Traje elemAB) {
       m1.modificar(elemAB);
       m2.modificar(elemAB);
       return elemAB;
    }
}
