package EjerciciosTipoParcial.src.Parcial2021_Viajes;

/**
 * The type Filtro costo.
 */
public class FiltroCosto extends Filtro {

	private double costo;


    /**
     * Instantiates a new Filtro costo.
     *
     * @param costo the costo
     */
    public FiltroCosto(double costo) {
		super();
		this.costo = costo;
	}


    /**
     * Cumple boolean.
     *
     * @param pp the pp
     * @return the boolean
     */
    @Override
	public boolean cumple(PaqueteViaje pp) {

		return pp.getCosto()>costo;
	}

}
