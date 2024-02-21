package CLASES.CLASE2.comi2.src.ver1;

public class Juego {

	private int puntos1;
	private int puntos2;
	
	public Juego() {
		puntos1=0;
		puntos2=0;
	}
	
	public void jugar() {
		int dados1;
		int dados2;
		for(int i =0; i<10; i++) {
			dados1 = tirar() + tirar();
			dados2 = tirar() + tirar();
			
			if (dados1 > dados2 && dados1>7) {
				puntos1++;
			} else {
				if (dados2 > dados1 && dados2>7) {
					puntos2++;
				}
			}
					
		}
		
		String ganador = getGanador();
		System.out.println(ganador);
	}
	
	public int tirar() {
		return (int) (Math.random()*6+1);
	}
	
	public String getGanador() {
		if (puntos1>puntos2) {
			return "Jugador 1";
			
		} else {
			if (puntos2> puntos1) {
				return "Jugador 2";
			} else {
				return "Empate";
			}
		}
	}
	
	
	public static void main(String[] args) {
		Juego jj = new Juego();
		jj.jugar();
	}
}
