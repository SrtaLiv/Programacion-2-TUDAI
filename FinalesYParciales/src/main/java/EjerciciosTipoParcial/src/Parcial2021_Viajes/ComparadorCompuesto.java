package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.util.Comparator;

/**
 * The type Comparador compuesto.
 */
public class ComparadorCompuesto implements Comparator<PaqueteViaje> {

	Comparator<PaqueteViaje> c1, c2;

	/**
	 * Compare int.
	 *
	 * @param o1 the o 1
	 * @param o2 the o 2
	 * @return the int
	 */
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
		int r1 = c1.compare(o1, o2);
		if (r1 == 0) {
			return c2.compare(o1, o2);
		}
		return r1;
	}

}
