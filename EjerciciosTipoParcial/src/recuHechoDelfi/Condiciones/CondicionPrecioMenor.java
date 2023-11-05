package recuHechoDelfi.Condiciones;

import recuHechoDelfi.Condiciones.Condicion;
import recuHechoDelfi.ElementoBZ;

public class CondicionPrecioMenor extends Condicion {

	private double precioMenor;
	
	
	public CondicionPrecioMenor(double precioMenor) {
		this.precioMenor = precioMenor;
	}


	@Override
	public boolean cumple(ElementoBZ elemB) {
		if(elemB.getPrecio() < precioMenor) {
			return true;
		}
		return false;
	}

}
