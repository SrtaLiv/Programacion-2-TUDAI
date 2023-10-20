package prefinal;

import java.time.LocalDate;

public class SeccionCaducidad extends Seccion {

	private LocalDate fechaCaducidad;
	
	public SeccionCaducidad(String editor, String titulo, int posCat, CalculadorPalSignificativa calculador, LocalDate fechaCaducidad) {
		super(editor, titulo, posCat, calculador);
		this.fechaCaducidad = fechaCaducidad;
	}
	
	@Override
	public void addElemento(ElementoPortal e) {
		if (LocalDate.now().isBefore(fechaCaducidad))
			super.addElemento(e);
	}

}
