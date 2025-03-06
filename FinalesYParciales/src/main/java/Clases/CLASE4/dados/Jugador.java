package CLASES.CLASE4.dados;

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
	
	public int tirarDados(Cubilete c1) {
		return c1.tirarDados();
	}
    
	public boolean equals(Object o1) {
		try {
			Jugador elOtro = (Jugador)o1;
		
			return nombre.equals(elOtro.getNombre()) &&
				 puntos == elOtro.getPuntos();
		} catch(Exception e) {
			return false;
		}
		
	}
	
	public String toString() {
		return nombre +":" +puntos;
	}
    
}
