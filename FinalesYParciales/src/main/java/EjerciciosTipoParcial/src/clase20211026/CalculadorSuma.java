package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Calculador suma.
 */
public class CalculadorSuma extends CalculadorCosto{
    private CalculadorCosto calc1, calc2;

    public CalculadorSuma(CalculadorCosto calc1, CalculadorCosto calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    /**
     * Cuanto cuesta double.
     *
     * @param seguroSimple the seguro simple
     * @return the double
     */
    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return calc1.cuantoCuesta(seguroSimple) +
               calc2.cuantoCuesta(seguroSimple);
    }
}
