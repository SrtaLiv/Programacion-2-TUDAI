package prefinal;

public class Main {
	
	public static void main(String[] args) {
		Noticia n1 = new Noticia("Juan", "Qatar", "Este es el mundial", "Futbol");
		n1.addPalClave("qatar");
		n1.addPalClave("inauguracion");
		n1.addPalClave("mundial");
		Noticia n2 = new Noticia("Pedro", "Bariloche", "Nieve", "Turismo");
		n2.addPalClave("bariloche");
		n2.addPalClave("nieve");
		
		Noticia n3 = new Noticia("Juan", "Cuartos de final", "Arrancan los cuartos de final", "Futbol");
		n3.addPalClave("cuartos");
		n3.addPalClave("qatar");
		n3.addPalClave("mundial");
		
		Seccion sec1 = new Seccion("Juan", "Deportes", 1, new CalculadorPalSignOrdenada(0, new ComparadorTamanio()));
		Seccion sec2 = new Seccion("Ana", "Turismo", 0, new CalculadorPalSignOrdenada(0, new ComparadorAlfabetico()));
		
		Seccion secG = new Seccion("Lucia", "General", 2, new CalculadorPalSignOrdenada(0, new ComparadorInverso(new ComparadorTamanio())));
	
		sec1.addElemento(n1);
		sec1.addElemento(n3);
		
		sec2.addElemento(n2);
		
		secG.addElemento(sec1);
		secG.addElemento(sec2);
		
		System.out.println(sec1.getPalClaveSignificativa());
		System.out.println(sec2.getPalClaveSignificativa());
		System.out.println(secG.getPalClaveSignificativa());
		
		System.out.println(secG.getCantidad(new FiltroPorFrase("final")));
		System.out.println(secG.getCantidad(new FiltroPorEditor("Juan")));
	
	}

}
