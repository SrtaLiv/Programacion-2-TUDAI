package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Cond menor gramos.
 */
public class CondMenorGramos extends Condicion{
    private int gramos;

    /**
     * Instantiates a new Cond menor gramos.
     *
     * @param gr the gr
     */
    public CondMenorGramos(int gr) {
	    gramos = gr;
	}

    /**
     * Cumple boolean.
     *
     * @param ee the ee
     * @return the boolean
     */
    public boolean cumple(Pieza3D ee) {
		return ee.getPla()<gramos;
	}

}
