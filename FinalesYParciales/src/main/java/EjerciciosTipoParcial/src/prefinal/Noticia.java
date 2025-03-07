package EjerciciosTipoParcial.src.prefinal;


import java.util.ArrayList;

public class Noticia extends ElementoPortal {

	private String contenido;
	private String categoria;
	private ArrayList<String> palClaves;

	public Noticia(String editor, String titulo, String contenido, String categoria) {
		super(editor, titulo);
		this.contenido = contenido;
		this.categoria = categoria;
		this.palClaves = new ArrayList<>();
	}
	
	public void addPalClave(String p) {
		if (!this.palClaves.contains(p))
			this.palClaves.add(p);
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palClaves);
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getContenido() {
		return this.contenido;
	}

	@Override
	public String getCategoria() {
		return this.categoria;
	}

	@Override
	public int getCantidad(Filtro f) {
		if (f.cumple(this))
			return 1;
		else
			return 0;
	}

}
