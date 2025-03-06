package CLASES.CLASE4.dados;

public class PruebaDados {

	public static void imprimirTiradas(Dado dd) {
		for (int i =0;i<100;i++) {
			System.out.print(dd.tirar() + "-");
		}
	}
	
	public static void main(String[] args) {


		Dado d1 = new Dado(6);
		DadoCargado d2 = new DadoCargado(6,6);
		DadoCargado d3 = new DadoCargado(6,6);
		d3.setProbabilidad(0.99);
		System.out.println("d1");
		imprimirTiradas(d1);
		System.out.println();
		System.out.println("d2");
		imprimirTiradas(d2);
		System.out.println();
		System.out.println("d3");
		imprimirTiradas(d3);
	}

}
