package CLASES.CLASE2.comi2.src.ver2;


public class Juego {

	Jugador j1, j2;
	private Dado d1,d2;
	private int rondas =10;
	private int minimo =7;
	
	public Juego() {
		j1 = new Jugador("Jugador 1");
		j2 = new Jugador("Jugador 2");
		d1 = new Dado();
		d2 = new Dado();
	}
	
	public Juego(int caras) {
        this();
		d1 = new Dado(caras);
		d2 = new Dado(caras);
	}
	
	public Juego(int caras1, int caras2) {
        this();
		d1 = new Dado(caras1);
		d2 = new Dado(caras2);
	}
	public Juego(Dado caras1, Dado caras2) {
        this();
		d1 = caras1;
		d2 = caras2;
	}
	public Juego(Dado caras1, Dado caras2, Jugador n1, Jugador n2) {
        j1 =n1;
        j2 = n2;
		d1 = caras1;
		d2 = caras2;
	}
	
	public Jugador jugar() {
		int dados1;
		int dados2;
		for(int i =0; i<rondas; i++) {
			dados1 = j1.tirarDados(d1, d2);
			dados2 = j2.tirarDados(d1, d2);
	//		System.out.println(dados1);
	//		System.out.println(dados2);
			if (dados1 > dados2 && dados1>minimo) {
				j1.sumarPuntos();
			} else {
				if (dados2 > dados1 && dados2>minimo) {
					j2.sumarPuntos();
				}
			}
					
		}
		
		Jugador ganador = getGanador();
		return ganador;
	}
	

	
	public Jugador getGanador() {
		if (j1.getPuntos()>j2.getPuntos()) {
			return j1;
			
		} else {
			if (j1.getPuntos()<j2.getPuntos()) {
				return j2;
			} else {
				return null;
			}
		}
	}
	
	
	
	
	
	
	public int getRondas() {
		return rondas;
	}

	public void setRondas(int rondas) {
		this.rondas = rondas;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Juana");
		Jugador j2 = new Jugador("Ricardo");
		Dado d1 = new Dado(6);
		Dado d2 = new Dado(6);
		Juego jj = new Juego(d1,d2,j1,j2);
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