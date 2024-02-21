package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Calculador porcentaje.
 */
public class CalculadorPorcentaje extends CalculadorCosto{
    private double porcentaje;

    /**
     * Instantiates a new Calculador porcentaje.
     *
     * @param porcentaje the porcentaje
     */
    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * Cuanto cuesta double.
     *
     * @param seguroSimple the seguro simple
     * @return the double
     */
    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return seguroSimple.getMontoAsegurado() * porcentaje;
    }
}
