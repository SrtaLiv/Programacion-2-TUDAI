package Viajes.src;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<PaqueteViaje> {

	Comparator<PaqueteViaje> c1;
	Comparator<PaqueteViaje> c2;
	
	public int compare(PaqueteViaje o1, PaqueteViaje o2) {
		int r1 = c1.compare(o1, o2);
		if (r1 == 0) {
			return c2.compare(o1, o2);
		}
		return r1;
	}

}
