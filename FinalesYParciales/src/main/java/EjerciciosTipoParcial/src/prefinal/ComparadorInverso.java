package EjerciciosTipoParcial.src.prefinal;

import java.util.Comparator;

public class ComparadorInverso implements Comparator<String> {
	
	private Comparator<String> comparador;

	public ComparadorInverso(Comparator<String> comparador) {
		this.comparador = comparador;
	}

	@Override
	public int compare(String s0, String s1) {
		return -1 * comparador.compare(s0, s1);
	}

}
