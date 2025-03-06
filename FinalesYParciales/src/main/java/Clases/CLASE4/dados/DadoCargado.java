package CLASES.CLASE4.dados;

public class DadoCargado extends Dado {

	private int ladoCargado;
	private double probabilidad;
	
	public DadoCargado(int lado) {
		super();
		ladoCargado = lado;
		probabilidad = 0.5;
	}
	
	public DadoCargado(int cantidad, int lado) {
		super(cantidad);
		ladoCargado = lado;
		probabilidad = 0.5;
		
	}
	
	

	public double getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}

	public int getLadoCargado() {
		return ladoCargado;
	}

	public void setLadoCargado(int ladoCargado) {
		this.ladoCargado = ladoCargado;
	}
	
	
	
	public int tirar() {
		  double algo = Math.random();
		  if (algo<probabilidad) {
			  return ladoCargado;
		  } else {
			  return super.tirar();
		  }
		}
}
