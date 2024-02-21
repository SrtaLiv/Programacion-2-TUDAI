package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Condicion not.
 */
public class CondicionNot extends Condicion {

	private Condicion negada;

    /**
     * Instantiates a new Condicion not.
     *
     * @param cc the cc
     */
    public CondicionNot(Condicion cc) {
       negada = cc;
	}

    /**
     * Cumple boolean.
     *
     * @param ee the ee
     * @return the boolean
     */
    @Override
	public boolean cumple(Pieza3D ee) {
		return ! negada.cumple(ee);
	}

}
