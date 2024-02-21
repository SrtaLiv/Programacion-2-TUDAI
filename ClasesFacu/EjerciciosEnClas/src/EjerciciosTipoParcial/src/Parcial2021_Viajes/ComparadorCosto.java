package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.util.Comparator;

/**
 * The type Comparador costo.
 */
public class ComparadorCosto implements Comparator<PaqueteViaje> {

    /**
     * Compare int.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
	 double d1 = o1.getCosto();
	 double d2 = o2.getCosto();
	 
	 if (d1 > d2 ) {
		 return 1;
	 } else {
		 if (d2 > d1) {
			 return -1;
		 } else {
			 return 0;
		 }
	 }
	}

}
