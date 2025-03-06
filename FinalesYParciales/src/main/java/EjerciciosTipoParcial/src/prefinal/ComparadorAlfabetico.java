package EjerciciosTipoParcial.src.prefinal;

import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<String> {

	@Override
	public int compare(String s0, String s1) {
		return s0.compareTo(s1);
	}

}
