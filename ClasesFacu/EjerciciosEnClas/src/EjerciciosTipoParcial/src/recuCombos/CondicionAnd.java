package EjerciciosTipoParcial.src.recuCombos;


public class CondicionAnd extends Condicion{
	private Condicion atributo1;
	private Condicion atributo2;
		
	public CondicionAnd(Condicion atributo1, Condicion atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	@Override
	public boolean cumple(ElementoBazar elemB) {
		return this.atributo1.cumple(elemB) && this.atributo2.cumple(elemB);
	}
	
	
}
