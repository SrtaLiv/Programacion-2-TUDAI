package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Condicion or.
 */
public class CondicionOr extends Condicion {
	private Condicion c1,c2;

    /**
     * Instantiates a new Condicion or.
     *
     * @param ca the ca
     * @param cb the cb
     */
    public CondicionOr(Condicion ca,Condicion cb) {
		c1 = ca;
		c2=cb;
	}

    /**
     * Cumple boolean.
     *
     * @param ee the ee
     * @return the boolean
     */
    @Override
	public boolean cumple(Pieza3D ee) {
		return c1.cumple(ee) || c2.cumple(ee);
	}

}
