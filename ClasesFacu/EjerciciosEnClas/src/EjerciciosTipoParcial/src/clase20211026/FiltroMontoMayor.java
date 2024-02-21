package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Filtro monto mayor.
 */
public class FiltroMontoMayor extends Filtro{
    private double montoMinimo;

    /**
     * Instantiates a new Filtro monto mayor.
     *
     * @param montoMinimo the monto minimo
     */
    public FiltroMontoMayor(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    /**
     * Cumple boolean.
     *
     * @param seguro the seguro
     * @return the boolean
     */
    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getMontoAsegurado()>montoMinimo;
    }
}
