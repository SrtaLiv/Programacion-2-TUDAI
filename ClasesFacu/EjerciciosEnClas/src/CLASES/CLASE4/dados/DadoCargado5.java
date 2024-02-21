package CLASES.CLASE4.dados;

public class DadoCargado5 extends Dado {
//ESTA MAL esta clase no aprueba POO
	
	public DadoCargado5() {
		super();
	}
	public DadoCargado5(int cantidad) {
		super(cantidad);
	}
	
	
	public int tirar() {
	  double algo = Math.random();
	  if (algo>0.5) {
		  return 5;
	  } else {
		  return super.tirar();
	  }
	}
}
