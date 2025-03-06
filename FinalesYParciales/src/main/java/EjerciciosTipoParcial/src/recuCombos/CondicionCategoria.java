package EjerciciosTipoParcial.src.recuCombos;

public class CondicionCategoria extends Condicion{

	private String categoria;

	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(ElementoBazar elemB) {
		if(elemB.getCategorias().contains(this.categoria)) {
			return true;
		}
		return false;
	}

	
	
}
