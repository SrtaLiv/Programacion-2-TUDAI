package EjerciciosTipoParcial.src.clase20211026;

/**
 * The type Filtro descripcion.
 */
public class FiltroDescripcion extends Filtro{
    private String subcadena;

    /**
     * Instantiates a new Filtro descripcion.
     *
     * @param subcadena the subcadena
     */
    public FiltroDescripcion(String subcadena) {
        this.subcadena = subcadena;
    }

    /**
     * Cumple boolean.
     *
     * @param seguro the seguro
     * @return the boolean
     */
    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDescripcion().contains(subcadena);
    }
}
