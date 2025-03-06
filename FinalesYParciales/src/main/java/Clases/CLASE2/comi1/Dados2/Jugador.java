package CLASES.CLASE2.comi1.Dados2;

public class Jugador {
	
	String nombre;
	int puntaje;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntaje = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void incrementarPuntaje() {
		this.puntaje++;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public int tomarTurno(Dado dado1, Dado dado2) {
		return dado1.tirar() + dado2.tirar();
	}

}
