package prefinal;

import java.util.ArrayList;

public class CalculadorPalSignPorPosicion extends CalculadorPalSignificativa {
	
	private int pos;

	public CalculadorPalSignPorPosicion(int pos) {
		super();
		this.pos = pos;
	}

	@Override
	public String getPalSignificativa(ArrayList<String> palabrasClaves) {
		if (this.pos < palabrasClaves.size())
			return palabrasClaves.get(pos);
		else
			return null;
	}

}
