package EjerciciosTipoParcial.src.recuCombos;

public class CondicionNot extends Condicion {
	private Condicion atributo;
		
	public CondicionNot(Condicion atributo) {
		this.atributo = atributo;
	}

	@Override
	public boolean cumple(ElementoBazar elemB) {
		return (!this.atributo.cumple(elemB));
	}
}
