package FINALES.FinalFebrero_14_02_2025;

public class CalculadorCostoFijo extends Calculador{
    double montoFijoAlquiler;

    public CalculadorCostoFijo(double montoFijoAlquiler) {
        this.montoFijoAlquiler = montoFijoAlquiler;
    }

    @Override
    public double calcularCosto(ElemAB elemAB) {
        return elemAB.getValor() + montoFijoAlquiler;
    }
}
