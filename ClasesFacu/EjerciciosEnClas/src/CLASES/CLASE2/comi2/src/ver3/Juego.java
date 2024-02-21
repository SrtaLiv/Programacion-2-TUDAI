package CLASES.CLASE2.comi2.src.ver3;


public class Juego {

	Jugador j1, j2;
	private Cubilete c1;
	private int rondas =10;
	private int minimo =7;
	
	public Juego() {
		j1 = new Jugador("Jugador 1");
		j2 = new Jugador("Jugador 2");
		c1 = new Cubilete();
	}
	
	public Juego(int caras) {
        this();
		c1 = new Cubilete(2,caras);
		
	}
	


	public Juego( Jugador n1, Jugador n2) {
        j1 =n1;
        j2 = n2;
        c1 = new Cubilete();
	}
	public Juego( Jugador n1, Jugador n2, Cubilete cc) {
        j1 =n1;
        j2 = n2;
        c1 = cc;
	}
	public Jugador jugar() {
		int dados1;
		int dados2;
		for(int i =0; i<rondas; i++) {
			dados1 = j1.tirarDados(c1);
			dados2 = j2.tirarDados(c1);
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