package CLASES.CLASE2.comi1.Dados1;

public class Juego {
	
	int puntos1;
	int puntos2;
	
	public Juego() {
		puntos1 = 0;
		puntos2 = 0;
	}
	
	public void jugar() {
		// Desarrollo del juego
		for (int i = 0; i < 10; i++) {				 // PASAR VALORES A CONSTANTES
			// Juega el jugador 1
			int r1 = tirarDado() + tirarDado();
			int r2 = tirarDado() + tirarDado();
			
			if (r1 >= 7 && r1 > r2)
				puntos1++;
			else
				if (r2 >= 7 && r2 > r1)
					puntos2++;
		}
		
		// Decidir quien gana
		if (puntos1 > puntos2)
			System.out.println("Gano el Jugador 1: " + puntos1 + " a " + puntos2);
		else
			if (puntos2 > puntos1)
				System.out.println("Gano el Jugador 2: " + puntos2 + " a " + puntos1);
			else
				System.out.println("Empate");
	}

	private int tirarDado() {
		return (int)(Math.random() * 6) + 1;
	}
	
	public static void main(String[] args) {
		Juego juego1 = new Juego();
		juego1.jugar();
	}
	
	

}
