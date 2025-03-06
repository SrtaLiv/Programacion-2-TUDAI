package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * The type Comparador fecha.
 */
public class ComparadorFecha implements Comparator<PaqueteViaje> {

    /**
     * Compare int.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
	
		LocalDate f1 = o1.getFechaPago();
		LocalDate f2 = o2.getFechaPago();
		if (f1!=null) {
			return f1.compareTo(f2);
		}
		if (f2!=null) {
			return -1;
		}
		return 0;
		
	}
	
	

}
