package CLASES.CLASE2.comi2.src.ver2;

public class Jugador {
    private String nombre;
    private int puntos;
	
    public Jugador(String nombre) {
		this.nombre = nombre;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}
	
    public void sumarPuntos() {
    	puntos++;
    }
	
	public int tirarDados(Dado d1, Dado d2) {
		return d1.tirar()+d2.tirar();
	}
    
	public boolean soyIgual(Jugador jj) {
		return (nombre.equals(jj.getNombre()) && 
			 puntos == jj.getPuntos()	);
	}
	
	public static void main (String[] args) {
		Jugador j1 = new Jugador("CC");
		Jugador j2 = new Jugador("CC");
		
		//j1 = j2;
		System.out.println(j1);
		System.out.println(j2);
		if (j1== j2) {
			System.out.println("IGUALES");
			
		} else {
			System.out.println("Distintos");
		}
		
		if (j1.soyIgual(j2)) {
			System.out.println("IGUALES");
			
		} else {
			System.out.println("Distintos");
		}
	}
    
}
