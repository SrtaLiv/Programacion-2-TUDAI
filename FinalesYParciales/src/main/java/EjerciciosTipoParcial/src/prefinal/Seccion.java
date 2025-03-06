package EjerciciosTipoParcial.src.prefinal;

import java.util.ArrayList;

public class Seccion extends ElementoPortal {
	
	private ArrayList<ElementoPortal> elementos;
	private int posCat;
	private CalculadorPalSignificativa calculador;

	public Seccion(String editor, String titulo, int posCat, CalculadorPalSignificativa calculador) {
		super(editor, titulo);
		this.posCat = posCat;
		this.calculador = calculador;
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoPortal e) {
		this.elementos.add(e);
	}

	@Override
	public String getContenido() {
		String contenido = "";
		for (ElementoPortal e: this.elementos)
			contenido = contenido + e.getContenido();
		return contenido;
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> resultado = new ArrayList<>();
		for (ElementoPortal e: this.elementos) {
			ArrayList<String> auxPal = e.getPalabrasClaves();
			for (String pal: auxPal)
				if (!resultado.contains(pal))
					resultado.add(pal);
		}
		return resultado;
	}

	@Override
	public String getCategoria() {
		if (this.posCat < this.elementos.size())
			return this.elementos.get(posCat).getCategoria();
		else
			return null;
	}

	@Override
	public int getCantidad(Filtro f) {
		if (f.cumple(this))
			return 1;
		else {
			int cant = 0;
			for (ElementoPortal e: this.elementos)
				cant += e.getCantidad(f);
			return cant;
		}
	}
	
	public String getPalClaveSignificativa() {
		return calculador.getPalSignificativa(this.getPalabrasClaves());
	}

}
