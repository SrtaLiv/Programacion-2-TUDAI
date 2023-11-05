package Viajes.src;

public class FiltroOrigen extends Filtro {

	
	private String origen;
	@Override
	public boolean cumple(PaqueteViaje pp) {

		return origen.equals(pp.getOrigen());
	}

}
