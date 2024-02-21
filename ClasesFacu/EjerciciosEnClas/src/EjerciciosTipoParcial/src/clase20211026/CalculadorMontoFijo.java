package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Calculador monto fijo.
 */
public class CalculadorMontoFijo extends CalculadorCosto{
    private double montoFijo;

    public CalculadorMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return montoFijo;
    }
}
