package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Cond mayor tiempo.
 */
public class CondMayorTiempo extends Condicion {

	private int tiempo;

    /**
     * Instantiates a new Cond mayor tiempo.
     *
     * @param tt the tt
     */
    public CondMayorTiempo(int tt) {
	    tiempo = tt;
	}

    /**
     * Cumple boolean.
     *
     * @param ee the ee
     * @return the boolean
     */
    @Override
	public boolean cumple(Pieza3D ee) {
	   return ee.getTiempo()>tiempo;	
	}

}
