package EjerciciosTipoParcial.src.recuCombos;

public class CondicionPesoMayor extends Condicion{
	private double pesoMayor;
	
	
	public CondicionPesoMayor(double pesoMayor) {
		this.pesoMayor = pesoMayor;
	}


	@Override
	public boolean cumple(ElementoBazar elemB) {
		if(elemB.getPeso() < pesoMayor) {
			return true;
		}
		return false;
	}
}
