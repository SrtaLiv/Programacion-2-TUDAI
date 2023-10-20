package prefinal;

import java.time.LocalDate;

public class NoticiaTemporal extends Noticia {
	
	private LocalDate f1, f2;
	
	public NoticiaTemporal(String editor, String titulo, String contenido, String categoria, LocalDate f1, LocalDate f2) {
		super(editor, titulo, contenido, categoria);
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public int getCantidad(Filtro f) {
		LocalDate hoy = LocalDate.now();
		if (hoy.isAfter(f1) && hoy.isBefore(f2))
			return super.getCantidad(f);
		else
			return 0;
	}


	
	

}
