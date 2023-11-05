package recuHechoDelfi.Condiciones;

import recuHechoDelfi.ElementoBZ;

public class CondicionNot extends Condicion {
	private Condicion atributo;
		
	public CondicionNot(Condicion atributo) {
		this.atributo = atributo;
	}

	@Override
	public boolean cumple(ElementoBZ elemB) {
		return (!this.atributo.cumple(elemB));
	}
}
