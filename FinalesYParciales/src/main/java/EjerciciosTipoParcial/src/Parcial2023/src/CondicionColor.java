package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Condicion color.
 */
public class CondicionColor extends Condicion {

	private String color;

    /**
     * Instantiates a new Condicion color.
     */
    public CondicionColor() {
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
		// TODO Auto-generated method stub
		return pieza.getColores().contains(color);
	}

}
