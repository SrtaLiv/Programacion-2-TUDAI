package CLASES.CLASE4.dados;

public class DadoCargado6 extends Dado{
	//ESTA MAL esta clase no aprueba POO
	
	
	public DadoCargado6() {
		super();
	}
	public DadoCargado6(int cantidad) {
		super(cantidad);
	}
	
	
	public int tirar() {
	  double algo = Math.random();
	  if (algo>0.5) {
		  return 6;
	  } else {
		  return super.tirar();
	  }
	}
}
