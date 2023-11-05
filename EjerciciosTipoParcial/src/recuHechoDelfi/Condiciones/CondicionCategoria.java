package recuHechoDelfi.Condiciones;

import recuHechoDelfi.ElementoBZ;

public class CondicionCategoria extends Condicion{

	private String categoria;

	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(ElementoBZ elemB) {
		if(elemB.getCategorias().contains(this.categoria)) {
			return true;
		}
		return false;
	}

	
	
}
