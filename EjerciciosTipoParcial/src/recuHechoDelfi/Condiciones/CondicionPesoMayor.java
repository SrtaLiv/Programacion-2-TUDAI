package recuHechoDelfi.Condiciones;

import recuHechoDelfi.Condiciones.Condicion;
import recuHechoDelfi.ElementoBZ;

public class CondicionPesoMayor extends Condicion {
	private double pesoMayor;
	
	
	public CondicionPesoMayor(double pesoMayor) {
		this.pesoMayor = pesoMayor;
	}


	@Override
	public boolean cumple(ElementoBZ elemB) {
		if(elemB.getPeso() < pesoMayor) {
			return true;
		}
		return false;
	}
}
