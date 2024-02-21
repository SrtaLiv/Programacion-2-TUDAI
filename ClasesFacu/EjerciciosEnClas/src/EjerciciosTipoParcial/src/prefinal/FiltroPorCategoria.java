package prefinal;

public class FiltroPorCategoria implements Filtro {

	private String categoria;
	
	public FiltroPorCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return e.getCategoria().equals(this.categoria);
	}

}
