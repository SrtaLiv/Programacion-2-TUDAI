package EjerciciosTipoParcial.src.prefinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CalculadorPalSignOrdenada extends CalculadorPalSignPorPosicion {
	
	private Comparator<String> comparador;

	public CalculadorPalSignOrdenada(int pos, Comparator<String> comparador) {
		super(pos);
		this.comparador = comparador;
	}
	
	@Override
	public String getPalSignificativa(ArrayList<String> palabrasClaves) {
		Collections.sort(palabrasClaves, comparador);
		return super.getPalSignificativa(palabrasClaves);
	}

}
