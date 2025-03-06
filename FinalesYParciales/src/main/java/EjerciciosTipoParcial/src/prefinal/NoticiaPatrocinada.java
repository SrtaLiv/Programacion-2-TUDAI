package EjerciciosTipoParcial.src.prefinal;

public class NoticiaPatrocinada extends Noticia {
	
	public NoticiaPatrocinada(String editor, String titulo, String contenido, String categoria) {
		super(editor, titulo, contenido, categoria);
	}

	@Override
	public int getCantidad(Filtro f) {
		return 1;
	}

}
