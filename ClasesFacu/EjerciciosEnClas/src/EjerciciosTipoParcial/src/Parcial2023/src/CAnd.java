package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type C and.
 */
public class CAnd extends Condicion {

	private Condicion c1,c2;

    /**
     * Instantiates a new C and.
     */
    public CAnd() {
		// TODO Auto-generated constructor stub
	}

    /**
     * Cumple boolean.
     *
     * @param pieza the pieza
     * @return the boolean
     */
    @Override
	public boolean cumple(Pieza3D pieza) {
		return c1.cumple(pieza) && c2.cumple(pieza);
	}

}
