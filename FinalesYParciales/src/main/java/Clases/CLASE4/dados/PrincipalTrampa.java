package CLASES.CLASE4.dados;

public class PrincipalTrampa {

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Juana");

		//CAMBIO LA PROBABILIDAD DE MIS DADOSCARGADOS Y SE LO AGREGO A J2
		DadoCargado[] dadosCargados = new DadoCargado[2];
		dadosCargados[0] = new DadoCargado(6,6);
		dadosCargados[0].setProbabilidad(0.3);
		dadosCargados[1] = new DadoCargado(6,5);
		dadosCargados[1].setProbabilidad(0.3);
		JugadorTramposo j2 = new JugadorTramposo("Ricardo",
				                                 dadosCargados);

		Juego jj = new Juego(j1,j2);
		jj.setRondas(100);
		Jugador gan = jj.jugar();

		if (gan!= null) {
			System.out.println("Gano :" + gan.getNombre());
		    System.out.println(j1.getNombre() + ":" + j1.getPuntos());
		    System.out.println(j2.getNombre() + ":" + j2.getPuntos());
		} else {
			System.out.println("Empate");
		}
	}
}
