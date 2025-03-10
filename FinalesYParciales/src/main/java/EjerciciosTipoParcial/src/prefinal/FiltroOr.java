package EjerciciosTipoParcial.src.prefinal;

public class FiltroOr implements Filtro {
	
	private Filtro f1, f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return f1.cumple(e) || f2.cumple(e);
	}

}
