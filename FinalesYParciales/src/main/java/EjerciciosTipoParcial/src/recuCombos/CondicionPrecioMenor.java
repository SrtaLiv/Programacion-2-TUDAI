package EjerciciosTipoParcial.src.recuCombos;

public class CondicionPrecioMenor extends Condicion{

	private double precioMenor;
	
	
	public CondicionPrecioMenor(double precioMenor) {
		this.precioMenor = precioMenor;
	}


	@Override
	public boolean cumple(ElementoBazar elemB) {
		if(elemB.getPrecio() < precioMenor) {
			return true;
		}
		return false;
	}

}
