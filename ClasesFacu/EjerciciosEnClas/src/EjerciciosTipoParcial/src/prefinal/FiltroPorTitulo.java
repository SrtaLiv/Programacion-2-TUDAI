package prefinal;

public class FiltroPorTitulo implements Filtro {
	
	private String titulo;
	
	public FiltroPorTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return e.getTitulo().contains(this.titulo);
	}

}
