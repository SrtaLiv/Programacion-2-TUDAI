package prefinal;

import java.util.ArrayList;

public abstract class ElementoPortal {
	
	private String editor;
	private String titulo;
	
	public ElementoPortal(String editor, String titulo) {
		this.editor = editor;
		this.titulo = titulo;
	}
	
	public abstract String getContenido();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract String getCategoria();
	public abstract int getCantidad(Filtro f);

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
