package prefinal;

public class FiltroNot implements Filtro {

	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return !f1.cumple(e);
	}

}
