package EjerciciosTipoParcial.src.Parcial2023.src;

/**
 * The type Pieza diseno.
 */
public class PiezaDiseno extends PiezaCompuesta {

	private Condicion cc;

    /**
     * Instantiates a new Pieza diseno.
     *
     * @param c1          the c 1
     * @param nom         the nom
     * @param des         the des
     * @param extraPla    the extra pla
     * @param extraTiempo the extra tiempo
     */
    public PiezaDiseno(Condicion c1,String nom, String des, int extraPla, int extraTiempo) {
		super(nom, des, extraPla, extraTiempo);
		// TODO Auto-generated constructor stub
	   cc=c1;	
	}


    /**
     * Add elemento.
     *
     * @param pp the pp
     */
    public void addElemento(Pieza3D pp) {
		if (cc.cumple(pp)) {
			super.addElemento(pp);
		}
	}


	
	
	
}
