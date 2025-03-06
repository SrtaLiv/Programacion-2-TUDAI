package CLASES.CLASE2.comi1.Dados2;

public class Juego {
	//ATRIBUTOS
	int cantRondas;
	int puntajeMinimo;
	Jugador j1;//int puntos1;
	Jugador j2;//int puntos2;
	Dado dado1;
	Dado dado2;

	//CONSTRUCTOR
	public Juego(Jugador j1, Jugador j2, int cantRondas, int puntajeMinimo) {
		//puntos1 = 0;
		//puntos2 = 0;
		this.cantRondas = cantRondas;
		this.puntajeMinimo = puntajeMinimo;
		this.j1 = j1;
		this.j2 = j2;
		dado1 = new Dado();
		dado2 = new Dado();
	}
	
	public void jugar() {
		// Desarrollo del juego
		for (int i = 0; i < 10; i++) {
			// Juega el jugador 1
			int r1 = j1.tomarTurno(dado1, dado2);
			int r2 = j2.tomarTurno(dado1, dado2);
			
			if (r1 >= 7 && r1 > r2)                 
				j1.incrementarPuntaje();
			else
				if (r2 >= 7 && r2 > r1)
					j2.incrementarPuntaje();
		}
		
		// Decidir quien gana
		int puntos1 = j1.getPuntaje();
		int puntos2 = j2.getPuntaje();
		if (puntos1 > puntos2)
			System.out.println("Gano " + j1.getNombre() + " " + puntos1 + " a " + puntos2);
		else
			if (puntos2 > puntos1)
				System.out.println("Gano " + j2.getNombre() + " " + puntos2 + " a " + puntos1);
			else
				System.out.println("Empate");
	}
	
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Pepe");
		Jugador j2 = new Jugador("Tito");
		Juego juego1 = new Juego(j1, j2, 10 , 7);
		juego1.jugar();
	}
	
	

}
