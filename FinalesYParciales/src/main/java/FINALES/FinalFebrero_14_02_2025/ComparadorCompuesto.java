package FINALES.FinalFebrero_14_02_2025;

public class ComparadorCompuesto extends Calculador {
    //Este comparador puede resolver el porcentaje de su valor mas el monto fijo
    private Calculador c1, c2;

    public ComparadorCompuesto(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public double calcularCosto(ElemAB elemAB) {
        return c1.calcularCosto(elemAB) + c2.calcularCosto(elemAB);
    }
}
