package FINALES.FinalFebrero_14_02_2025;

public class CalculadorPorcentajeConMonto extends Calculador {
    // Cobrar Porcentaje de su valor mas un monto fijo a modo de seguro
    double porcentajeDeSuValor;

    public CalculadorPorcentajeConMonto(double porcentajeDeSuValor) {
        this.porcentajeDeSuValor = porcentajeDeSuValor;
    }

    @Override
    public double calcularCosto(ElemAB elemAB) {
        return elemAB.getValor() + (elemAB.getValor()*porcentajeDeSuValor);
    }
}
