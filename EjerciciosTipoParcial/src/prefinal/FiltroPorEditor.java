package prefinal;

public class FiltroPorEditor implements Filtro {

	private String editor;
	
	public FiltroPorEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public boolean cumple(ElementoPortal e) {
		return e.getEditor().equals(this.editor);
	}
}
