package EjerciciosTipoParcial.src.Parcial2021_Viajes;

/**
 * The type Filtro origen.
 */
public class FiltroOrigen extends Filtro {

	
	private String origen;

    /**
     * Cumple boolean.
     *
     * @param pp the pp
     * @return the boolean
     */
    @Override
	public boolean cumple(PaqueteViaje pp) {

		return origen.equals(pp.getOrigen());
	}

}
