package prefinal;

public class FiltroPorFrase implements Filtro {

	private String frase;
	
	public FiltroPorFrase(String frase) {
		this.frase = frase;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return e.getContenido().contains(this.frase);
	}

}
